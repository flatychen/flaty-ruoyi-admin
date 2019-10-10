package cn.aylives.ruoyi.admin.property.service;

import cn.aylives.ruoyi.admin.core.IService;
import cn.aylives.ruoyi.admin.property.domain.Agency;

import java.util.List;

/**
 * 项目 服务层
 * 
 * @author flaty
 * @date 2019-07-05
 */
public interface ISysAgencyService  extends IService<Agency>
{
	/**
     * 查询项目信息
     * 
     * @param iD 项目ID
     * @return 项目信息
     */
	public Agency selectSysAgencyById(Integer iD);
	
	/**
     * 查询项目列表
     * 
     * @param sysAgency 项目信息
     * @return 项目集合
     */
	public List<Agency> selectSysAgencyList(Agency sysAgency);
	
	/**
     * 新增项目
     * 
     * @param sysAgency 项目信息
     * @return 结果
     */
	public int insertSysAgency(Agency sysAgency);
	
	/**
     * 修改项目
     * 
     * @param sysAgency 项目信息
     * @return 结果
     */
	public int updateSysAgency(Agency sysAgency);
		
	/**
     * 删除项目信息
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteSysAgencyByIds(String ids);
	
}
