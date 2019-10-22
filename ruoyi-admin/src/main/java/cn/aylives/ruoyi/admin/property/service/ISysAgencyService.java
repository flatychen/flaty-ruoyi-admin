package cn.aylives.ruoyi.admin.property.service;

import cn.aylives.ruoyi.admin.property.domain.SysAgency;
import java.util.List;
import cn.aylives.ruoyi.admin.core.MyMapper;
import cn.aylives.ruoyi.admin.core.IService;

/**
 * 项目Service接口
 *
 * @author flaty
 * @date 2019-10-22
 */
public interface ISysAgencyService  extends IService<SysAgency>
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
	 * 批量删除项目
	 *
	 * @param ids 需要删除的数据ID
	 * @return 结果
	 */
	public int deleteSysAgencyByIds(String ids);

	/**
	 * 删除项目信息
	 *
	 * @param id 项目ID
	 * @return 结果
	 */
	public int deleteSysAgencyById(Integer id);
	
}
