package cn.aylives.ruoyi.admin.property.mapper;
import cn.aylives.ruoyi.admin.property.domain.AppUser;
import java.util.List;
import cn.aylives.ruoyi.admin.core.MyMapper;
/**
 * AppUserMapper接口
 *
 * @author flatyvm/java/mapper.java.vm
 * @date 2019-10-15
 */
public interface AppUserMapper extends MyMapper<AppUser>
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
	 * 删除AppUser
	 *
	 * @param userId AppUserID
	 * @return 结果
	 */
	public int deleteAppUserById(Long userId);

	/**
	 * 批量删除AppUser
	 *
	 * @param userIds 需要删除的数据ID
	 * @return 结果
	 */
	public int deleteAppUserByIds(String[] userIds);
}
