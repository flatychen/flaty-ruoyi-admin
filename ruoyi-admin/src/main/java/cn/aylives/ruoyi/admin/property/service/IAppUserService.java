package cn.aylives.ruoyi.admin.property.service;

import cn.aylives.ruoyi.admin.property.domain.AppUser;
import java.util.List;
import cn.aylives.ruoyi.admin.core.MyMapper;
import cn.aylives.ruoyi.admin.core.IService;

/**
 * AppUserService接口
 *
 * @author flaty
 * @date 2019-10-15
 */
public interface IAppUserService  extends IService<AppUser>
{
	/**
	 * 查询AppUser
	 *
	 * @param userId AppUserID
	 * @return AppUser
	 */
	public AppUser selectAppUserById(Long userId);

	/**
	 * 查询AppUser列表
	 *
	 * @param appUser AppUser
	 * @return AppUser集合
	 */
	public List<AppUser> selectAppUserList(AppUser appUser);

	/**
	 * 新增AppUser
	 *
	 * @param appUser AppUser
	 * @return 结果
	 */
	public int insertAppUser(AppUser appUser);

	/**
	 * 修改AppUser
	 *
	 * @param appUser AppUser
	 * @return 结果
	 */
	public int updateAppUser(AppUser appUser);

	/**
	 * 批量删除AppUser
	 *
	 * @param ids 需要删除的数据ID
	 * @return 结果
	 */
	public int deleteAppUserByIds(String ids);

	/**
	 * 删除AppUser信息
	 *
	 * @param userId AppUserID
	 * @return 结果
	 */
	public int deleteAppUserById(Long userId);
	
}
