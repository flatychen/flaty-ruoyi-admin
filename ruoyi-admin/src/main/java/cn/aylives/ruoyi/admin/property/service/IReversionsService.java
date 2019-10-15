package cn.aylives.ruoyi.admin.property.service;

import cn.aylives.ruoyi.admin.property.domain.Reversions;
import java.util.List;
import cn.aylives.ruoyi.admin.core.MyMapper;
import cn.aylives.ruoyi.admin.core.IService;
import cn.aylives.ruoyi.system.domain.SysDept;

/**
 * ReversionsService接口
 *
 * @author flaty
 * @date 2019-10-15
 */
public interface IReversionsService  extends IService<Reversions>
{
	/**
	 * 查询Reversions
	 *
	 * @param id ReversionsID
	 * @return Reversions
	 */
	public Reversions selectReversionsById(Integer id);

	/**
	 * 查询Reversions列表
	 *
	 * @param reversions Reversions
	 * @return Reversions集合
	 */
	public List<Reversions> selectReversionsList(Reversions reversions);

	/**
	 * 新增Reversions
	 *
	 * @param reversions Reversions
	 * @return 结果
	 */
	public int insertReversions(Reversions reversions, SysDept sysDept);

	/**
	 * 修改Reversions
	 *
	 * @param reversions Reversions
	 * @return 结果
	 */
	public int updateReversions(Reversions reversions , SysDept sysDept);

	/**
	 * 批量删除Reversions
	 *
	 * @param ids 需要删除的数据ID
	 * @return 结果
	 */
	public int deleteReversionsByIds(String ids);

	/**
	 * 删除Reversions信息
	 *
	 * @param id ReversionsID
	 * @return 结果
	 */
	public int deleteReversionsById(Integer id);
	
}
