package com.ruoyi.admin.oa.service;

import com.ruoyi.admin.oa.model.OaUserResponse.DataBean;

import java.util.List;

/**
 *
 */
public interface OaService {




    /**
     * 通过用户名查询
     *
     * @param userName
     * @return
     */
    List<DataBean> queryUser(String userName);

    /**
     * 保存OA用户信息
     *
     * @param queryUser
     */
    void saveUserAndDept(List<DataBean> queryUser);
}

