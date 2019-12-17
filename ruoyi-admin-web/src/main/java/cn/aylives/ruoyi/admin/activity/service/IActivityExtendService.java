package cn.aylives.ruoyi.admin.activity.service;

import java.util.List;

import cn.aylives.ruoyi.admin.activity.domain.ActivityExtend;
import cn.aylives.ruoyi.admin.core.IService;

/**
 * ${functionName}Service接口
 *
 * @author flaty
 * @date 2019-09-23
 */
public interface IActivityExtendService  extends IService<ActivityExtend>
{
	/**
	 * 查询${functionName}
	 *
	 * @param id ${functionName}ID
	 * @return ${functionName}
	 */
	public ActivityExtend selectActivityExtendById(Long id);

	/**
	 * 查询${functionName}列表
	 *
	 * @param activityExtend ${functionName}
	 * @return ${functionName}集合
	 */
	public List<ActivityExtend> selectActivityExtendList(ActivityExtend activityExtend);

	/**
	 * 新增${functionName}
	 *
	 * @param activityExtend ${functionName}
	 * @return 结果
	 */
	public int insertActivityExtend(ActivityExtend activityExtend);

	/**
	 * 修改${functionName}
	 *
	 * @param activityExtend ${functionName}
	 * @return 结果
	 */
	public int updateActivityExtend(ActivityExtend activityExtend);

	/**
	 * 批量删除${functionName}
	 *
	 * @param ids 需要删除的数据ID
	 * @return 结果
	 */
	public int deleteActivityExtendByIds(String ids);

	/**
	 * 删除${functionName}信息
	 *
	 * @param id ${functionName}ID
	 * @return 结果
	 */
	public int deleteActivityExtendById(Long id);
	
}
