package cn.aylives.ruoyi.admin.modules.activity.service.impl;

import java.util.List;

import cn.aylives.ruoyi.admin.modules.activity.mapper.ActivityExtendMapper;
import cn.aylives.ruoyi.admin.modules.activity.service.IActivityExtendService;
import cn.aylives.ruoyi.admin.modules.activity.domain.ActivityExtend;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cn.aylives.ruoyi.admin.core.impl.AbstractService;

import cn.aylives.ruoyi.common.core.text.Convert;
/**
 * ${functionName}Service业务层处理
 *
 * @author flaty
 * @date 2019-09-23
 */
@Service
public class ActivityExtendServiceImpl extends AbstractService<ActivityExtend> implements IActivityExtendService
{

	@Autowired
	private ActivityExtendMapper activityExtendMapper;

	/**
	 * 查询${functionName}
	 *
	 * @param id ${functionName}ID
	 * @return ${functionName}
	 */
	@Override
	public ActivityExtend selectActivityExtendById(Long id)
	{
		return activityExtendMapper.selectActivityExtendById(id);
	}

	/**
	 * 查询${functionName}列表
	 *
	 * @param activityExtend ${functionName}
	 * @return ${functionName}
	 */
	@Override
	public List<ActivityExtend> selectActivityExtendList(ActivityExtend activityExtend)
	{
		return activityExtendMapper.selectActivityExtendList(activityExtend);
	}

	/**
	 * 新增${functionName}
	 *
	 * @param activityExtend ${functionName}
	 * @return 结果
	 */
	@Override
	public int insertActivityExtend(ActivityExtend activityExtend)
	{
		return activityExtendMapper.insertActivityExtend(activityExtend);
	}

	/**
	 * 修改${functionName}
	 *
	 * @param activityExtend ${functionName}
	 * @return 结果
	 */
	@Override
	public int updateActivityExtend(ActivityExtend activityExtend)
	{
		return activityExtendMapper.updateActivityExtend(activityExtend);
	}

	/**
	 * 删除${functionName}对象
	 *
	 * @param ids 需要删除的数据ID
	 * @return 结果
	 */
	@Override
	public int deleteActivityExtendByIds(String ids)
	{
		return activityExtendMapper.deleteActivityExtendByIds(Convert.toStrArray(ids));
	}

	/**
	 * 删除${functionName}信息
	 *
	 * @param id ${functionName}ID
	 * @return 结果
	 */
	public int deleteActivityExtendById(Long id)
	{
		return activityExtendMapper.deleteActivityExtendById(id);
	}

	
}
