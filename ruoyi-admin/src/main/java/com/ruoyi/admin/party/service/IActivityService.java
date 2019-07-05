package com.ruoyi.admin.party.service;

import com.ruoyi.admin.core.IService;
import com.ruoyi.admin.party.domain.Activity;

import java.util.List;

/**
 * 党建服务 服务层
 * 
 * @author flaty
 * @date 2019-07-05
 */
public interface IActivityService  extends IService<Activity>
{
	/**
     * 查询党建服务信息
     * 
     * @param id 党建服务ID
     * @return 党建服务信息
     */
	public Activity selectActivityById(Integer id);
	
	/**
     * 查询党建服务列表
     * 
     * @param activity 党建服务信息
     * @return 党建服务集合
     */
	public List<Activity> selectActivityList(Activity activity);
	
	/**
     * 新增党建服务
     * 
     * @param activity 党建服务信息
     * @return 结果
     */
	public int insertActivity(Activity activity);
	
	/**
     * 修改党建服务
     * 
     * @param activity 党建服务信息
     * @return 结果
     */
	public int updateActivity(Activity activity);
		
	/**
     * 删除党建服务信息
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteActivityByIds(String ids);
	
}
