package com.ruoyi.admin.oa.service.impl;

import com.alibaba.fastjson.JSON;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.ruoyi.admin.oa.model.OaUserResponse;
import com.ruoyi.admin.oa.model.OaUserResponse.DataBean;
import com.ruoyi.admin.oa.model.OaUserResponse.DataBean.DeptsBean;
import com.ruoyi.admin.oa.service.OaService;
import com.ruoyi.common.constant.UserConstants;
import com.ruoyi.system.domain.SysDept;
import com.ruoyi.system.domain.SysUser;
import com.ruoyi.system.service.ISysDeptService;
import com.ruoyi.system.service.ISysUserService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.Validate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
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
    public List<DataBean> queryUser(String userName) {
        if (StringUtils.isBlank(userName)) {
            return new ArrayList<>();
        }


        return Optional.ofNullable(fetchOaUser(userName)).orElse(Lists.newArrayList());
    }

    @Override
    public void saveUserAndDept(List<DataBean> queryUser) {
        Validate.notNull(queryUser);
        Validate.notEmpty(queryUser);
        Validate.isTrue(queryUser.size() == 1);
        DataBean user = queryUser.get(0);

        saveOaDepts(user.getDepts());
        saveOaUser(user);


    }

    private void saveOaUser(DataBean user) {

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

    private void saveOaDepts(List<DeptsBean> depts) {
        Map<Integer, DeptsBean> deptsBeanMap = depts.stream().collect(Collectors.toMap(DeptsBean::getDeptId, d -> d));
        List<SysDept> sysDepts = Lists.newArrayList();
        for (DeptsBean dept : depts) {

            if (iSysDeptService.selectDeptById(Long.valueOf((dept.getDeptId()))) != null) {
                log.warn("deptId:{} 已经存在", dept.getDeptId());
                continue;
            }

            SysDept sysDept = new SysDept();
            sysDept.setAgencyId(0);
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
            return  o1.getAncestors().length() - o2.getAncestors().length();
        });

        for (SysDept sysDept : sysDepts) {
            iSysDeptService.insertDept(sysDept);
        }


    }

    private void getAncestor(Integer deptId, Map<Integer, DeptsBean> deptsBeanMap, List<String> ancestors) {
        String _deptId = String.valueOf(deptId);
        if (adminUserCenterRootId.equalsIgnoreCase(_deptId) || !deptsBeanMap.containsKey(deptId)) {
            return;
        }
        Integer parentDeptId = (deptsBeanMap.get(deptId).getParentId());
        getAncestor(parentDeptId, deptsBeanMap, ancestors);
        ancestors.add(_deptId);
    }


    private List<DataBean> fetchOaUser(String userName) {
        String url = adminUserCenterPrefix + "/user/getUserInfoByUserName?userName={userName}&rootId={rootId}";
        Map<String, String> params = ImmutableMap.of("userName", userName, "rootId", adminUserCenterRootId);
        OaUserResponse oaUserResponse = restTemplate.getForObject(url, OaUserResponse.class, params);
        log.info("fetchOaUser url:{} , params:{},response:{}", url, params, JSON.toJSONString(oaUserResponse));
        if (oaUserResponse.success()) {
            return oaUserResponse.getData();
        } else {
            throw new FetchOaException();
        }
    }


    /**
     *
     */
    public class FetchOaException extends RuntimeException {

        public FetchOaException() {
            super("获取oa数据失败！");
        }
    }


}

