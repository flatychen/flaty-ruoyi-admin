package com.ruoyi.admin.party.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.admin.party.mapper.ActivityUserMapper;
import com.ruoyi.admin.party.domain.ActivityUser;
import com.ruoyi.admin.party.service.IActivityUserService;
import com.ruoyi.common.core.text.Convert;

/**
 *  服务层实现
 * 
 * @author flaty
 * @date 2019-07-02
 */
@Service
public class ActivityUserServiceImpl implements IActivityUserService 
{
	@Autowired
	private ActivityUserMapper activityUserMapper;

	/**
     * 查询信息
     * 
     * @param id ID
     * @return 信息
     */
    @Override
	public ActivityUser selectActivityUserById(Integer id)
	{
	    return activityUserMapper.selectActivityUserById(id);
	}
	
	/**
     * 查询列表
     * 
     * @param activityUser 信息
     * @return 集合
     */
	@Override
	public List<ActivityUser> selectActivityUserList(ActivityUser activityUser)
	{
	    return activityUserMapper.selectActivityUserList(activityUser);
	}
	
    /**
     * 新增
     * 
     * @param activityUser 信息
     * @return 结果
     */
	@Override
	public int insertActivityUser(ActivityUser activityUser)
	{
	    return activityUserMapper.insertActivityUser(activityUser);
	}
	
	/**
     * 修改
     * 
     * @param activityUser 信息
     * @return 结果
     */
	@Override
	public int updateActivityUser(ActivityUser activityUser)
	{
	    return activityUserMapper.updateActivityUser(activityUser);
	}

	/**
     * 删除对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deleteActivityUserByIds(String ids)
	{
		return activityUserMapper.deleteActivityUserByIds(Convert.toStrArray(ids));
	}
	
}
