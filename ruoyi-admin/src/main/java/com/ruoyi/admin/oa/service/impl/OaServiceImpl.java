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
import com.ruoyi.system.service.ISysDeptService;
import com.ruoyi.system.service.ISysUserService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.Validate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Optional;
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

    String url = adminUserCenterPrefix + "/user/getUserInfoByUserName";

    @Override
    public List<DataBean> queryUser(String userName) {
        return Optional.ofNullable(fetchOaUser(userName)).orElse(Lists.newArrayList());
    }

    @Override
    public void saveUserAndDept(List<DataBean> queryUser) {
        Validate.notNull(queryUser);
        Validate.notEmpty(queryUser);
        Validate.isTrue(queryUser.size() == 1);
        DataBean user = queryUser.get(0);

        String result = iSysUserService.checkLoginNameUnique(user.getUsername());
        if (UserConstants.USER_NAME_NOT_UNIQUE.equalsIgnoreCase(result)) {
            throw new IllegalArgumentException("用户已经存在");
        }

        saveOaDepts(user.getDepts());
        saveOaUser(user.getDepts());

//        iSysUserService.insertUser();


    }

    private void saveOaUser(List<DeptsBean> depts) {
    }

    private void saveOaDepts(List<DeptsBean> depts) {
        Map<Integer, DeptsBean> deptsBeanMap = depts.stream().collect(Collectors.toMap(DeptsBean::getDeptId, d -> d));
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
            log.info("deptId:{}", StringUtils.join(ancestors, ","));
//            sysDept.setAncestors();
            sysDept.setDeptName(dept.getDeptName());
            sysDept.setOrderNum("0");
            sysDept.setStatus("0");
            sysDept.setCreatedDate(new Date());
            sysDept.setUpdatedDate(new Date());

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

