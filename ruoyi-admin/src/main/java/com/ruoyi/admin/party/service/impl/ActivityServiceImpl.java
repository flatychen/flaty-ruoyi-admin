package com.ruoyi.admin.party.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.admin.party.mapper.ActivityMapper;
import com.ruoyi.admin.party.domain.Activity;
import com.ruoyi.admin.party.service.IActivityService;
import com.ruoyi.common.core.text.Convert;

/**
 *  服务层实现
 * 
 * @author flaty
 * @date 2019-07-02
 */
@Service
public class ActivityServiceImpl implements IActivityService 
{
	@Autowired
	private ActivityMapper activityMapper;

	/**
     * 查询信息
     * 
     * @param id ID
     * @return 信息
     */
    @Override
	public Activity selectActivityById(Integer id)
	{
	    return activityMapper.selectActivityById(id);
	}
	
	/**
     * 查询列表
     * 
     * @param activity 信息
     * @return 集合
     */
	@Override
	public List<Activity> selectActivityList(Activity activity)
	{
	    return activityMapper.selectActivityList(activity);
	}
	
    /**
     * 新增
     * 
     * @param activity 信息
     * @return 结果
     */
	@Override
	public int insertActivity(Activity activity)
	{
	    return activityMapper.insertActivity(activity);
	}
	
	/**
     * 修改
     * 
     * @param activity 信息
     * @return 结果
     */
	@Override
	public int updateActivity(Activity activity)
	{
	    return activityMapper.updateActivity(activity);
	}

	/**
     * 删除对象
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
