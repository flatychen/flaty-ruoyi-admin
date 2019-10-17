package cn.aylives.ruoyi.admin.property.service.impl;

import cn.aylives.ruoyi.admin.core.impl.AbstractService;
import cn.aylives.ruoyi.admin.property.domain.AppUser;
import cn.aylives.ruoyi.admin.property.mapper.AppUserMapper;
import cn.aylives.ruoyi.admin.property.service.IAppUserService;
import cn.aylives.ruoyi.common.core.text.Convert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 * AppUserService业务层处理
 *
 * @author flaty
 * @date 2019-10-15
 */
@Service
public class AppUserServiceImpl extends AbstractService<AppUser> implements IAppUserService
{

	@Autowired
	private AppUserMapper appUserMapper;

	@Override
	public List<AppUser> findByIds(List<Integer> ids){
		List<AppUser> appUsers = appUserMapper.selectAppUserByUserIds(ids);
		return appUsers;
	}


	/**
	 * 查询AppUser
	 *
	 * @param userId AppUserID
	 * @return AppUser
	 */
	@Override
	public AppUser selectAppUserById(Long userId)
	{
		return appUserMapper.selectAppUserById(userId);
	}

	/**
	 * 查询AppUser列表
	 *
	 * @param appUser AppUser
	 * @return AppUser
	 */
	@Override
	public List<AppUser> selectAppUserList(AppUser appUser)
	{
		return appUserMapper.selectAppUserList(appUser);
	}

	/**
	 * 新增AppUser
	 *
	 * @param appUser AppUser
	 * @return 结果
	 */
	@Override
	public int insertAppUser(AppUser appUser)
	{
		return appUserMapper.insertAppUser(appUser);
	}

	/**
	 * 修改AppUser
	 *
	 * @param appUser AppUser
	 * @return 结果
	 */
	@Override
	public int updateAppUser(AppUser appUser)
	{
		return appUserMapper.updateAppUser(appUser);
	}

	/**
	 * 删除AppUser对象
	 *
	 * @param ids 需要删除的数据ID
	 * @return 结果
	 */
	@Override
	public int deleteAppUserByIds(String ids)
	{
		return appUserMapper.deleteAppUserByIds(Convert.toStrArray(ids));
	}

	/**
	 * 删除AppUser信息
	 *
	 * @param userId AppUserID
	 * @return 结果
	 */
	public int deleteAppUserById(Long userId)
	{
		return appUserMapper.deleteAppUserById(userId);
	}

	
}
