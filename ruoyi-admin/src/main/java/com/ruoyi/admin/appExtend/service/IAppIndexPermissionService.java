package com.ruoyi.admin.appExtend.service;

import com.ruoyi.admin.appExtend.domain.AppIndexPermission;
import com.ruoyi.admin.core.IService;

import java.util.List;

/**
 * 权限分组Service接口
 *
 * @author flaty
 * @date 2019-08-27
 */
public interface IAppIndexPermissionService  extends IService<AppIndexPermission>
{
	/**
	 * 查询权限分组
	 *
	 * @param id 权限分组ID
	 * @return 权限分组
	 */
	public AppIndexPermission selectAppIndexPermissionById(Long id);

	/**
	 * 查询权限分组列表
	 *
	 * @param appIndexPermission 权限分组
	 * @return 权限分组集合
	 */
	public List<AppIndexPermission> selectAppIndexPermissionList(AppIndexPermission appIndexPermission);

	/**
	 * 新增权限分组
	 *
	 * @param appIndexPermission 权限分组
	 * @return 结果
	 */
	public int insertAppIndexPermission(AppIndexPermission appIndexPermission);

	/**
	 * 修改权限分组
	 *
	 * @param appIndexPermission 权限分组
	 * @return 结果
	 */
	public int updateAppIndexPermission(AppIndexPermission appIndexPermission);

	/**
	 * 批量删除权限分组
	 *
	 * @param ids 需要删除的数据ID
	 * @return 结果
	 */
	public int deleteAppIndexPermissionByIds(String ids);

	/**
	 * 删除权限分组信息
	 *
	 * @param id 权限分组ID
	 * @return 结果
	 */
	public int deleteAppIndexPermissionById(Long id);
	
}
