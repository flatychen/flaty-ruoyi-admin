package cn.aylives.ruoyi.admin.modules.activity.service.impl;

import cn.aylives.ruoyi.admin.modules.activity.domain.AppActivityUser;
import cn.aylives.ruoyi.admin.modules.activity.mapper.AppActivityUserMapper;
import cn.aylives.ruoyi.admin.modules.activity.service.IAppActivityUserService;
import cn.aylives.ruoyi.admin.core.impl.AbstractService;
import cn.aylives.ruoyi.common.core.text.Convert;
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
