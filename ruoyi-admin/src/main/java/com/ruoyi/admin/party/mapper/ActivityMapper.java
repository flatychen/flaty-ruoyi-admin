package com.ruoyi.admin.party.mapper;

import com.ruoyi.admin.core.MyMapper;
import com.ruoyi.admin.party.domain.Activity;

import java.util.List;

/**
 * 党建服务 数据层
 * 
 * @author flaty
 * @date 2019-07-05
 */
public interface ActivityMapper extends MyMapper<Activity>
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
     * 删除党建服务
     * 
     * @param id 党建服务ID
     * @return 结果
     */
	public int deleteActivityById(Integer id);
	
	/**
     * 批量删除党建服务
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteActivityByIds(String[] ids);
	
}