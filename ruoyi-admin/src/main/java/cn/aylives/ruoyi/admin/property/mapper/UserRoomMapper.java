package cn.aylives.ruoyi.admin.property.mapper;
import cn.aylives.ruoyi.admin.property.domain.UserRoom;
import java.util.List;
import cn.aylives.ruoyi.admin.core.MyMapper;
/**
 * 房屋管理Mapper接口
 *
 * @author flatyvm/java/mapper.java.vm
 * @date 2019-10-15
 */
public interface UserRoomMapper extends MyMapper<UserRoom>
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
	 * 删除房屋管理
	 *
	 * @param id 房屋管理ID
	 * @return 结果
	 */
	public int deleteUserRoomById(Integer id);

	/**
	 * 批量删除房屋管理
	 *
	 * @param ids 需要删除的数据ID
	 * @return 结果
	 */
	public int deleteUserRoomByIds(String[] ids);
}
