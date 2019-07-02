package com.ruoyi.admin.party.mapper;

import com.ruoyi.admin.party.domain.Activity;
import java.util.List;	

/**
 *  数据层
 * 
 * @author flaty
 * @date 2019-07-02
 */
public interface ActivityMapper 
{
	/**
     * 查询信息
     * 
     * @param id ID
     * @return 信息
     */
	public Activity selectActivityById(Integer id);
	
	/**
     * 查询列表
     * 
     * @param activity 信息
     * @return 集合
     */
	public List<Activity> selectActivityList(Activity activity);
	
	/**
     * 新增
     * 
     * @param activity 信息
     * @return 结果
     */
	public int insertActivity(Activity activity);
	
	/**
     * 修改
     * 
     * @param activity 信息
     * @return 结果
     */
	public int updateActivity(Activity activity);
	
	/**
     * 删除
     * 
     * @param id ID
     * @return 结果
     */
	public int deleteActivityById(Integer id);
	
	/**
     * 批量删除
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteActivityByIds(String[] ids);
	
}