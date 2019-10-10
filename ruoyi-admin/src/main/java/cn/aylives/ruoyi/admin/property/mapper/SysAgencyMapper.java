package cn.aylives.ruoyi.admin.property.mapper;

import cn.aylives.ruoyi.admin.property.domain.Agency;
import cn.aylives.ruoyi.admin.core.MyMapper;

import java.util.List;

/**
 * 项目 数据层
 * 
 * @author flaty
 * @date 2019-07-05
 */
public interface SysAgencyMapper extends MyMapper<Agency>
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
     * 删除项目
     * 
     * @param iD 项目ID
     * @return 结果
     */
	public int deleteSysAgencyById(Integer iD);
	
	/**
     * 批量删除项目
     * 
     * @param iDs 需要删除的数据ID
     * @return 结果
     */
	public int deleteSysAgencyByIds(String[] iDs);
	
}