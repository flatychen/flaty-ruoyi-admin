package cn.aylives.ruoyi.admin.property.mapper;
import cn.aylives.ruoyi.admin.property.domain.Reversions;
import java.util.List;
import cn.aylives.ruoyi.admin.core.MyMapper;
/**
 * ReversionsMapper接口
 *
 * @author flatyvm/java/mapper.java.vm
 * @date 2019-10-15
 */
public interface ReversionsMapper extends MyMapper<Reversions>
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
	public int insertReversions(Reversions reversions);

	/**
	 * 修改Reversions
	 *
	 * @param reversions Reversions
	 * @return 结果
	 */
	public int updateReversions(Reversions reversions);

	/**
	 * 删除Reversions
	 *
	 * @param id ReversionsID
	 * @return 结果
	 */
	public int deleteReversionsById(Integer id);

	/**
	 * 批量删除Reversions
	 *
	 * @param ids 需要删除的数据ID
	 * @return 结果
	 */
	public int deleteReversionsByIds(String[] ids);
}
