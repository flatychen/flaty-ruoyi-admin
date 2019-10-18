package cn.aylives.ruoyi.admin.oa.service.impl;

import cn.aylives.ruoyi.admin.oa.model.LoginUserResult;
import cn.aylives.ruoyi.admin.oa.model.OaResult;
import cn.aylives.ruoyi.admin.oa.model.QueryUserResult;
import cn.aylives.ruoyi.admin.oa.service.OaService;
import cn.hutool.core.text.StrFormatter;
import com.alibaba.fastjson.JSON;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import cn.aylives.ruoyi.common.constant.UserConstants;
import cn.aylives.ruoyi.system.domain.SysDept;
import cn.aylives.ruoyi.system.domain.SysUser;
import cn.aylives.ruoyi.system.service.ISysDeptService;
import cn.aylives.ruoyi.system.service.ISysUserService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.Validate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.*;
import java.util.stream.Collectors;

/**
 *
 */
@Service
@Slf4j
public class OaServiceImpl implements OaService {
    @Autowired
    RestTemplate restTemplate;

    @Autowired
    ISysUserService iSysUserService;

    @Autowired
    ISysDeptService iSysDeptService;

    @Value("${user-center.url}")
    String adminUserCenterPrefix;
    @Value("${user-center.rootId}")
    String adminUserCenterRootId;


    @Override
    public List<QueryUserResult> queryUser(String userName) {
        if (StringUtils.isBlank(userName)) {
            return new ArrayList<>();
        }


        return Optional.ofNullable(fetchOaUser(userName)).orElse(Lists.newArrayList());
    }

    @Override
    public QueryUserResult authUser(String token) {
        return this.fetchOaUserByToken(token);
    }

    @Override
    public void saveUserAndDept(List<QueryUserResult> queryUser) {
        Validate.notNull(queryUser);
        Validate.notEmpty(queryUser);
        Validate.isTrue(queryUser.size() == 1);
        QueryUserResult user = queryUser.get(0);

        saveOaDepts(user.getDepts());
        saveOaUser(user);


    }

    private void saveOaUser(QueryUserResult user) {

        String result = iSysUserService.checkLoginNameUnique(user.getUsername());
        if (UserConstants.USER_NAME_NOT_UNIQUE.equalsIgnoreCase(result)) {
            log.warn("用户已经存在!不执行保存用户。");
            return;
        }

        SysUser sysUser = new SysUser();
        sysUser.setDeptId(Long.valueOf(user.getDeptId()));
        sysUser.setLoginName(user.getUsername());
        sysUser.setUserName(user.getUsername());
        sysUser.setEmail(user.getEmail());
        sysUser.setPhonenumber(user.getMobile());
        sysUser.setStatus("0");
        sysUser.setCreatedDate(new Date());
        sysUser.setUpdatedDate(new Date());

        iSysUserService.insertUser(sysUser);
    }

    private void saveOaDepts(List<QueryUserResult.OaDept> depts) {
        Map<Integer, QueryUserResult.OaDept> deptsBeanMap = depts.stream().collect(Collectors.toMap(QueryUserResult.OaDept::getDeptId, d -> d));
        List<SysDept> sysDepts = Lists.newArrayList();
        for (QueryUserResult.OaDept dept : depts) {

            if (iSysDeptService.selectDeptById(Long.valueOf((dept.getDeptId()))) != null) {
                log.warn("deptId:{} 已经存在", dept.getDeptId());
                continue;
            }

            SysDept sysDept = new SysDept();
            sysDept.setAgencyId(SysDept.AgencyId.NOVALID);
            sysDept.setDeptId(Long.valueOf(dept.getDeptId()));
            sysDept.setParentId(Long.valueOf(dept.getParentId()));
            List<String> ancestors = Lists.newArrayList();
            getAncestor((dept.getDeptId()), deptsBeanMap, ancestors);
            sysDept.setAncestors(StringUtils.join(ancestors, ","));
            sysDept.setDeptName(dept.getDeptName());
            sysDept.setOrderNum("0");
            sysDept.setStatus("0");
            sysDept.setCreatedDate(new Date());
            sysDept.setUpdatedDate(new Date());
            sysDepts.add(sysDept);

        }

        sysDepts.sort((o1, o2) -> {
            return o1.getAncestors().length() - o2.getAncestors().length();
        });

        for (SysDept sysDept : sysDepts) {
            iSysDeptService.insertDept(sysDept);
        }


    }

    private void getAncestor(Integer deptId, Map<Integer, QueryUserResult.OaDept> oaDeptMap, List<String> ancestors) {
        String _deptId = String.valueOf(deptId);
        if (adminUserCenterRootId.equalsIgnoreCase(_deptId) || !oaDeptMap.containsKey(deptId)) {
            return;
        }
        Integer parentDeptId = (oaDeptMap.get(deptId).getParentId());
        getAncestor(parentDeptId, oaDeptMap, ancestors);
        ancestors.add(_deptId);
    }


    private List<QueryUserResult> fetchOaUser(String userName) {
        String url = adminUserCenterPrefix + "/user/getUserInfoByUserName?userName={userName}&rootId={rootId}";
        Map<String, String> params = ImmutableMap.of("userName", userName, "rootId", adminUserCenterRootId);
        ResponseEntity<OaResult<List<QueryUserResult>>> response = restTemplate.exchange(url, HttpMethod.GET, null, new ParameterizedTypeReference<OaResult<List<QueryUserResult>>>() {
        }, params);
        log.info("fetchOaUser url:{} , params:{},response:{}", url, params, JSON.toJSONString(response.getBody()));

        if (response.getStatusCode().is2xxSuccessful()) {
            OaResult<List<QueryUserResult>> oaUserResponse = response.getBody();
            if (oaUserResponse.success()) {
                return oaUserResponse.getData();
            }
        }
        throw new FetchOaException(StrFormatter.format("userName:{} fetchOaUser error", userName));
    }

    private QueryUserResult fetchOaUserByToken(String token) {
        String url = adminUserCenterPrefix + "/user/getUserInfoByToken?loginToken={token}";
        Map<String, String> params = ImmutableMap.of("token", token);

        ResponseEntity<OaResult<LoginUserResult>> response = restTemplate.exchange(url, HttpMethod.GET, null, new ParameterizedTypeReference<OaResult<LoginUserResult>>() {
        }, params);
        log.info("fetchOaUser url:{} , params:{},response:{}", url, params, JSON.toJSONString(response.getBody()));
        if (response.getStatusCode().is2xxSuccessful()) {
            OaResult<LoginUserResult> oaUserResponse = response.getBody();
            if (oaUserResponse.success()) {
                return oaUserResponse.getData().getUserInfo();
            }else if(oaUserResponse.tokenNotValid()){
                throw new FetchOaException(StrFormatter.format("token:{} fetchOaUser 不合法或已过期", token));
            }
        }

        throw new FetchOaException(StrFormatter.format("token:{} fetchOaUser error", token));


    }


    /**
     *
     */
    public class FetchOaException extends RuntimeException {

        public FetchOaException(Throwable cause) {
            super(cause);
        }


        public FetchOaException(String message) {
            super(message);
        }
    }


}

