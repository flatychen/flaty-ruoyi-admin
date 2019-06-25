package com.ruoyi.admin.mapper;

import com.ruoyi.admin.domain.SysAgency;
import java.util.List;	

/**
 * 项目 数据层
 * 
 * @author flaty
 * @date 2019-06-25
 */
public interface SysAgencyMapper 
{
	/**
     * 查询项目信息
     * 
     * @param iD 项目ID
     * @return 项目信息
     */
	public SysAgency selectSysAgencyById(Integer iD);
	
	/**
     * 查询项目列表
     * 
     * @param sysAgency 项目信息
     * @return 项目集合
     */
	public List<SysAgency> selectSysAgencyList(SysAgency sysAgency);
	
	/**
     * 新增项目
     * 
     * @param sysAgency 项目信息
     * @return 结果
     */
	public int insertSysAgency(SysAgency sysAgency);
	
	/**
     * 修改项目
     * 
     * @param sysAgency 项目信息
     * @return 结果
     */
	public int updateSysAgency(SysAgency sysAgency);
	
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