package cn.aylives.ruoyi.admin.activity.mapper;
import cn.aylives.ruoyi.admin.activity.domain.AppActivityUser;
import cn.aylives.ruoyi.admin.core.MyMapper;

import java.util.List;
/**
 * app活动用户列表Mapper接口
 *
 * @author flaty
 * @date 2019-09-06
 */
public interface AppActivityUserMapper extends MyMapper<AppActivityUser>
{
	/**
	 * 查询app活动用户列表
	 *
	 * @param id app活动用户列表ID
	 * @return app活动用户列表
	 */
	public AppActivityUser selectAppActivityUserById(Long id);

	/**
	 * 查询app活动用户列表列表
	 *
	 * @param appActivityUser app活动用户列表
	 * @return app活动用户列表集合
	 */
	public List<AppActivityUser> selectAppActivityUserList(AppActivityUser appActivityUser);

	/**
	 * 新增app活动用户列表
	 *
	 * @param appActivityUser app活动用户列表
	 * @return 结果
	 */
	public int insertAppActivityUser(AppActivityUser appActivityUser);

	/**
	 * 修改app活动用户列表
	 *
	 * @param appActivityUser app活动用户列表
	 * @return 结果
	 */
	public int updateAppActivityUser(AppActivityUser appActivityUser);

	/**
	 * 删除app活动用户列表
	 *
	 * @param id app活动用户列表ID
	 * @return 结果
	 */
	public int deleteAppActivityUserById(Long id);

	/**
	 * 批量删除app活动用户列表
	 *
	 * @param ids 需要删除的数据ID
	 * @return 结果
	 */
	public int deleteAppActivityUserByIds(String[] ids);
}
