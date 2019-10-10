package cn.aylives.ruoyi.admin.party.mapper;

import cn.aylives.ruoyi.admin.core.MyMapper;
import cn.aylives.ruoyi.admin.party.domain.ActivityUser;

import java.util.List;

/**
 *  数据层
 * 
 * @author flaty
 * @date 2019-07-10
 */
public interface ActivityUserMapper extends MyMapper<ActivityUser>
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
     * 删除
     * 
     * @param id ID
     * @return 结果
     */
	public int deleteActivityUserById(Integer id);
	
	/**
     * 批量删除
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteActivityUserByIds(String[] ids);
	
}