package cn.aylives.ruoyi.admin.property.service.impl;

import java.util.List;

import cn.aylives.ruoyi.system.domain.SysDept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cn.aylives.ruoyi.admin.core.impl.AbstractService;
import cn.aylives.ruoyi.admin.property.mapper.ReversionsMapper;
import cn.aylives.ruoyi.admin.property.domain.Reversions;
import cn.aylives.ruoyi.admin.property.service.IReversionsService;
import cn.aylives.ruoyi.common.core.text.Convert;
/**
 * ReversionsService业务层处理
 *
 * @author flaty
 * @date 2019-10-15
 */
@Service
public class ReversionsServiceImpl extends AbstractService<Reversions> implements IReversionsService
{

	@Autowired
	private ReversionsMapper reversionsMapper;

	/**
	 * 查询Reversions
	 *
	 * @param id ReversionsID
	 * @return Reversions
	 */
	@Override
	public Reversions selectReversionsById(Integer id)
	{
		return reversionsMapper.selectReversionsById(id);
	}

	/**
	 * 查询Reversions列表
	 *
	 * @param reversions Reversions
	 * @return Reversions
	 */
	@Override
	public List<Reversions> selectReversionsList(Reversions reversions)
	{
		return reversionsMapper.selectReversionsList(reversions);
	}

	/**
	 * 新增Reversions
	 *
	 * @param reversions Reversions
	 * @return 结果
	 */
	@Override
	public int insertReversions(Reversions reversions , SysDept sysDept )
	{
		if(sysDept.isRoot()){
			reversions.setAgencyId(0);
		}else {
			reversions.setAgencyId( sysDept.getAgencyId());
		}
		return reversionsMapper.insertReversions(reversions);
	}

	/**
	 * 修改Reversions
	 *
	 * @param reversions Reversions
	 * @return 结果
	 */
	public int updateReversions(Reversions reversions , SysDept sysDept)

	{
		if(sysDept.isRoot()){
			reversions.setAgencyId(0);
		}else {
			reversions.setAgencyId( sysDept.getAgencyId());
		}
		return reversionsMapper.updateReversions(reversions);
	}

	/**
	 * 删除Reversions对象
	 *
	 * @param ids 需要删除的数据ID
	 * @return 结果
	 */
	@Override
	public int deleteReversionsByIds(String ids)
	{
		return reversionsMapper.deleteReversionsByIds(Convert.toStrArray(ids));
	}

	/**
	 * 删除Reversions信息
	 *
	 * @param id ReversionsID
	 * @return 结果
	 */
	public int deleteReversionsById(Integer id)
	{
		return reversionsMapper.deleteReversionsById(id);
	}

	
}
