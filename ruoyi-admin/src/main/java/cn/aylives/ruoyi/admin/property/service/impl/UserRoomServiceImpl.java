package cn.aylives.ruoyi.admin.property.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cn.aylives.ruoyi.admin.core.impl.AbstractService;
import cn.aylives.ruoyi.admin.property.mapper.UserRoomMapper;
import cn.aylives.ruoyi.admin.property.domain.UserRoom;
import cn.aylives.ruoyi.admin.property.service.IUserRoomService;
import cn.aylives.ruoyi.common.core.text.Convert;
/**
 * 房屋管理Service业务层处理
 *
 * @author flaty
 * @date 2019-10-15
 */
@Service
public class UserRoomServiceImpl extends AbstractService<UserRoom> implements IUserRoomService
{

	@Autowired
	private UserRoomMapper userRoomMapper;

	/**
	 * 查询房屋管理
	 *
	 * @param id 房屋管理ID
	 * @return 房屋管理
	 */
	@Override
	public UserRoom selectUserRoomById(Integer id)
	{
		return userRoomMapper.selectUserRoomById(id);
	}

	/**
	 * 查询房屋管理列表
	 *
	 * @param userRoom 房屋管理
	 * @return 房屋管理
	 */
	@Override
	public List<UserRoom> selectUserRoomList(UserRoom userRoom)
	{
		return userRoomMapper.selectUserRoomList(userRoom);
	}

	/**
	 * 新增房屋管理
	 *
	 * @param userRoom 房屋管理
	 * @return 结果
	 */
	@Override
	public int insertUserRoom(UserRoom userRoom)
	{
		return userRoomMapper.insertUserRoom(userRoom);
	}

	/**
	 * 修改房屋管理
	 *
	 * @param userRoom 房屋管理
	 * @return 结果
	 */
	@Override
	public int updateUserRoom(UserRoom userRoom)
	{
		return userRoomMapper.updateUserRoom(userRoom);
	}

	/**
	 * 删除房屋管理对象
	 *
	 * @param ids 需要删除的数据ID
	 * @return 结果
	 */
	@Override
	public int deleteUserRoomByIds(String ids)
	{
		return userRoomMapper.deleteUserRoomByIds(Convert.toStrArray(ids));
	}

	/**
	 * 删除房屋管理信息
	 *
	 * @param id 房屋管理ID
	 * @return 结果
	 */
	public int deleteUserRoomById(Integer id)
	{
		return userRoomMapper.deleteUserRoomById(id);
	}

	
}
