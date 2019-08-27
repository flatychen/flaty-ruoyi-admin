package com.ruoyi.admin.appExtend.service.impl;

import com.ruoyi.admin.appExtend.domain.AppIndexPermission;
import com.ruoyi.admin.appExtend.mapper.AppIndexPermissionMapper;
import com.ruoyi.admin.appExtend.service.IAppIndexPermissionService;
import com.ruoyi.admin.core.impl.AbstractService;
import com.ruoyi.common.core.text.Convert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 * 权限分组Service业务层处理
 *
 * @author flaty
 * @date 2019-08-27
 */
@Service
public class AppIndexPermissionServiceImpl extends AbstractService<AppIndexPermission> implements IAppIndexPermissionService
{




	@Autowired
	private AppIndexPermissionMapper appIndexPermissionMapper;

	/**
	 * 查询权限分组
	 *
	 * @param id 权限分组ID
	 * @return 权限分组
	 */
	@Override
	public AppIndexPermission selectAppIndexPermissionById(Long id)
	{
		return appIndexPermissionMapper.selectAppIndexPermissionById(id);
	}

	/**
	 * 查询权限分组列表
	 *
	 * @param appIndexPermission 权限分组
	 * @return 权限分组
	 */
	@Override
	public List<AppIndexPermission> selectAppIndexPermissionList(AppIndexPermission appIndexPermission)
	{
		List<AppIndexPermission>  appIndexPermissions = appIndexPermissionMapper.selectAppIndexPermissionList(appIndexPermission);

		return appIndexPermissions;
	}

	/**
	 * 新增权限分组
	 *
	 * @param appIndexPermission 权限分组
	 * @return 结果
	 */
	@Override
	public int insertAppIndexPermission(AppIndexPermission appIndexPermission)
	{
		return appIndexPermissionMapper.insertAppIndexPermission(appIndexPermission);
	}

	/**
	 * 修改权限分组
	 *
	 * @param appIndexPermission 权限分组
	 * @return 结果
	 */
	@Override
	public int updateAppIndexPermission(AppIndexPermission appIndexPermission)
	{
		return appIndexPermissionMapper.updateAppIndexPermission(appIndexPermission);
	}

	/**
	 * 删除权限分组对象
	 *
	 * @param ids 需要删除的数据ID
	 * @return 结果
	 */
	@Override
	public int deleteAppIndexPermissionByIds(String ids)
	{
		return appIndexPermissionMapper.deleteAppIndexPermissionByIds(Convert.toStrArray(ids));
	}

	/**
	 * 删除权限分组信息
	 *
	 * @param id 权限分组ID
	 * @return 结果
	 */
	public int deleteAppIndexPermissionById(Long id)
	{
		return appIndexPermissionMapper.deleteAppIndexPermissionById(id);
	}

	
}
