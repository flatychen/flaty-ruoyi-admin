package cn.aylives.ruoyi.admin.property.service;

import cn.aylives.ruoyi.admin.property.domain.UserRoom;
import java.util.List;
import cn.aylives.ruoyi.admin.core.MyMapper;
import cn.aylives.ruoyi.admin.core.IService;

/**
 * 房屋管理Service接口
 *
 * @author flaty
 * @date 2019-10-15
 */
public interface IUserRoomService  extends IService<UserRoom>
{
	/**
	 * 查询房屋管理
	 *
	 * @param id 房屋管理ID
	 * @return 房屋管理
	 */
	public UserRoom selectUserRoomById(Integer id);

	/**
	 * 查询房屋管理列表
	 *
	 * @param userRoom 房屋管理
	 * @return 房屋管理集合
	 */
	public List<UserRoom> selectUserRoomList(UserRoom userRoom);

	/**
	 * 新增房屋管理
	 *
	 * @param userRoom 房屋管理
	 * @return 结果
	 */
	public int insertUserRoom(UserRoom userRoom);

	/**
	 * 修改房屋管理
	 *
	 * @param userRoom 房屋管理
	 * @return 结果
	 */
	public int updateUserRoom(UserRoom userRoom);

	/**
	 * 批量删除房屋管理
	 *
	 * @param ids 需要删除的数据ID
	 * @return 结果
	 */
	public int deleteUserRoomByIds(String ids);

	/**
	 * 删除房屋管理信息
	 *
	 * @param id 房屋管理ID
	 * @return 结果
	 */
	public int deleteUserRoomById(Integer id);
	
}
