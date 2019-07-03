package com.ruoyi.admin.property.mapper;

import com.ruoyi.admin.property.domain.Agency;

import java.util.List;

/**
 * 项目 数据层
 * 
 * @author flaty
 * @date 2019-07-01
 */
public interface AgencyMapper
{
	/**
     * 查询项目信息
     * 
     * @param iD 项目ID
     * @return 项目信息
     */
	public Agency selectAgencyById(Integer iD);
	
	/**
     * 查询项目列表
     * 
     * @param agency 项目信息
     * @return 项目集合
     */
	public List<Agency> selectAgencyList(Agency agency);
	
	/**
     * 新增项目
     * 
     * @param agency 项目信息
     * @return 结果
     */
	public int insertAgency(Agency agency);
	
	/**
     * 修改项目
     * 
     * @param agency 项目信息
     * @return 结果
     */
	public int updateAgency(Agency agency);
	
	/**
     * 删除项目
     * 
     * @param iD 项目ID
     * @return 结果
     */
	public int deleteAgencyById(Integer iD);
	
	/**
     * 批量删除项目
     * 
     * @param iDs 需要删除的数据ID
     * @return 结果
     */
	public int deleteAgencyByIds(String[] iDs);
	
}