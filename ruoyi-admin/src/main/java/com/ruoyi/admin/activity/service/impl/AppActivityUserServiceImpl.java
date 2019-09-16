package com.ruoyi.admin.activity.service.impl;

import com.ruoyi.admin.activity.domain.AppActivityUser;
import com.ruoyi.admin.activity.mapper.AppActivityUserMapper;
import com.ruoyi.admin.activity.service.IAppActivityUserService;
import com.ruoyi.admin.core.impl.AbstractService;
import com.ruoyi.common.core.text.Convert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 * app活动用户列表Service业务层处理
 *
 * @author flaty
 * @date 2019-09-06
 */
@Service
public class AppActivityUserServiceImpl extends AbstractService<AppActivityUser> implements IAppActivityUserService
{

	@Autowired
	private AppActivityUserMapper appActivityUserMapper;

	/**
	 * 查询app活动用户列表
	 *
	 * @param id app活动用户列表ID
	 * @return app活动用户列表
	 */
	@Override
	public AppActivityUser selectAppActivityUserById(Long id)
	{
		return appActivityUserMapper.selectAppActivityUserById(id);
	}

	/**
	 * 查询app活动用户列表列表
	 *
	 * @param appActivityUser app活动用户列表
	 * @return app活动用户列表
	 */
	@Override
	public List<AppActivityUser> selectAppActivityUserList(AppActivityUser appActivityUser)
	{
		return appActivityUserMapper.selectAppActivityUserList(appActivityUser);
	}

	/**
	 * 新增app活动用户列表
	 *
	 * @param appActivityUser app活动用户列表
	 * @return 结果
	 */
	@Override
	public int insertAppActivityUser(AppActivityUser appActivityUser)
	{
		return appActivityUserMapper.insertAppActivityUser(appActivityUser);
	}

	/**
	 * 修改app活动用户列表
	 *
	 * @param appActivityUser app活动用户列表
	 * @return 结果
	 */
	@Override
	public int updateAppActivityUser(AppActivityUser appActivityUser)
	{
		return appActivityUserMapper.updateAppActivityUser(appActivityUser);
	}

	/**
	 * 删除app活动用户列表对象
	 *
	 * @param ids 需要删除的数据ID
	 * @return 结果
	 */
	@Override
	public int deleteAppActivityUserByIds(String ids)
	{
		return appActivityUserMapper.deleteAppActivityUserByIds(Convert.toStrArray(ids));
	}

	/**
	 * 删除app活动用户列表信息
	 *
	 * @param id app活动用户列表ID
	 * @return 结果
	 */
	public int deleteAppActivityUserById(Long id)
	{
		return appActivityUserMapper.deleteAppActivityUserById(id);
	}

	
}
