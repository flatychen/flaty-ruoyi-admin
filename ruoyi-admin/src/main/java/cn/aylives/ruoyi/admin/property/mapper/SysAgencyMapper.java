package cn.aylives.ruoyi.admin.property.mapper;
import cn.aylives.ruoyi.admin.property.domain.AgencyView;
import cn.aylives.ruoyi.admin.property.domain.SysAgency;
import java.util.List;
import cn.aylives.ruoyi.admin.core.MyMapper;
/**
 * 项目Mapper接口
 *
 * @author flatyvm/java/mapper.java.vm
 * @date 2019-10-22
 */
public interface SysAgencyMapper extends MyMapper<SysAgency>
{
	/**
	 * 查询项目
	 *
	 * @param id 项目ID
	 * @return 项目
	 */
	public SysAgency selectSysAgencyById(Integer id);

	/**
	 * 查询项目列表
	 *
	 * @param sysAgency 项目
	 * @return 项目集合
	 */
	public List<SysAgency> selectSysAgencyList(SysAgency sysAgency);

	/**
	 * 新增项目
	 *
	 * @param sysAgency 项目
	 * @return 结果
	 */
	public int insertSysAgency(SysAgency sysAgency);

	/**
	 * 修改项目
	 *
	 * @param sysAgency 项目
	 * @return 结果
	 */
	public int updateSysAgency(SysAgency sysAgency);

	/**
	 * 删除项目
	 *
	 * @param id 项目ID
	 * @return 结果
	 */
	public int deleteSysAgencyById(Integer id);

	/**
	 * 批量删除项目
	 *
	 * @param ids 需要删除的数据ID
	 * @return 结果
	 */
	public int deleteSysAgencyByIds(String[] ids);

	/**
	 *
	 * 查询视图
	 * @param ids
	 * @return
	 */
	public List<AgencyView> selectViewByIds(List<Integer> ids);
}
