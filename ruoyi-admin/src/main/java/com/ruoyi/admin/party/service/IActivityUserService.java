package com.ruoyi.admin.party.service;

import com.ruoyi.admin.party.domain.ActivityUser;
import java.util.List;

/**
 *  服务层
 * 
 * @author flaty
 * @date 2019-07-02
 */
public interface IActivityUserService 
{
	/**
     * 查询信息
     * 
     * @param id ID
     * @return 信息
     */
	public ActivityUser selectActivityUserById(Integer id);
	
	/**
     * 查询列表
     * 
     * @param activityUser 信息
     * @return 集合
     */
	public List<ActivityUser> selectActivityUserList(ActivityUser activityUser);
	
	/**
     * 新增
     * 
     * @param activityUser 信息
     * @return 结果
     */
	public int insertActivityUser(ActivityUser activityUser);
	
	/**
     * 修改
     * 
     * @param activityUser 信息
     * @return 结果
     */
	public int updateActivityUser(ActivityUser activityUser);
		
	/**
     * 删除信息
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteActivityUserByIds(String ids);
	
}
