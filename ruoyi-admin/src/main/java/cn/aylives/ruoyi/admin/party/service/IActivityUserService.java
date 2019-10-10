package cn.aylives.ruoyi.admin.party.service;

import cn.aylives.ruoyi.admin.party.domain.ActivityUser;
import java.util.List;

import cn.aylives.ruoyi.admin.core.IService;

/**
 *  服务层
 * 
 * @author flaty
 * @date 2019-07-10
 */
public interface IActivityUserService  extends IService<ActivityUser>
{
	/**
     * 查询信息
     * 
     * @param id ID
     * @return 信息
     */
	public ActivityUser selectActivityUserById(Integer id);
	
	/**
     * 查询列表
     * 
     * @param activityUser 信息
     * @return 集合
     */
	public List<ActivityUser> selectActivityUserList(ActivityUser activityUser);
	
	/**
     * 新增
     * 
     * @param activityUser 信息
     * @return 结果
     */
	public int insertActivityUser(ActivityUser activityUser);
	
	/**
     * 修改
     * 
     * @param activityUser 信息
     * @return 结果
     */
	public int updateActivityUser(ActivityUser activityUser);
		
	/**
     * 删除信息
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteActivityUserByIds(String ids);
	
}
