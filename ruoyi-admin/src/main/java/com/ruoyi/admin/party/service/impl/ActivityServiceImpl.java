package com.ruoyi.admin.party.service.impl;

import com.ruoyi.admin.core.impl.AbstractService;
import com.ruoyi.admin.party.domain.Activity;
import com.ruoyi.admin.party.mapper.ActivityMapper;
import com.ruoyi.admin.party.service.IActivityService;
import com.ruoyi.common.core.text.Convert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 党建服务 服务层实现
 * 
 * @author flaty
 * @date 2019-07-05
 */
@Service
public class ActivityServiceImpl extends AbstractService<Activity> implements IActivityService
{
	@Autowired
	private ActivityMapper activityMapper;



	/**
     * 查询党建服务信息
     * 
     * @param id 党建服务ID
     * @return 党建服务信息
     */
    @Override
	public Activity selectActivityById(Integer id)
	{
	    return activityMapper.selectActivityById(id);
	}
	
	/**
     * 查询党建服务列表
     * 
     * @param activity 党建服务信息
     * @return 党建服务集合
     */
	@Override
	public List<Activity> selectActivityList(Activity activity)
	{
	    return activityMapper.selectActivityList(activity);
	}
	
    /**
     * 新增党建服务
     * 
     * @param activity 党建服务信息
     * @return 结果
     */
	@Override
	public int insertActivity(Activity activity)
	{
	    return activityMapper.insertActivity(activity);
	}
	
	/**
     * 修改党建服务
     * 
     * @param activity 党建服务信息
     * @return 结果
     */
	@Override
	public int updateActivity(Activity activity)
	{
	    return activityMapper.updateActivity(activity);
	}

	/**
     * 删除党建服务对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deleteActivityByIds(String ids)
	{
		return activityMapper.deleteActivityByIds(Convert.toStrArray(ids));
	}
	
}
