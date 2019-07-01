package com.ruoyi.admin.property.service;

import com.ruoyi.admin.property.domain.Agency;
import java.util.List;

/**
 * 项目 服务层
 * 
 * @author flaty
 * @date 2019-07-01
 */
public interface IAgencyService 
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
     * 删除项目信息
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteAgencyByIds(String ids);
	
}
