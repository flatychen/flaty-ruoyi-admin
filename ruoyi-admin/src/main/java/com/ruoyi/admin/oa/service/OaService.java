package com.ruoyi.admin.oa.service;

import com.ruoyi.admin.oa.model.QueryUserResult;

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
    List<QueryUserResult> queryUser(String userName);

    /**
     * 通过用户名查询
     *
     * @param token
     * @return
     */
    QueryUserResult authUser(String token);

    /**
     * 保存OA用户信息
     *
     * @param queryUser
     */
    void saveUserAndDept(List<QueryUserResult> queryUser);
}

