package com.ruoyi.admin.property.service.impl;

import com.ruoyi.admin.property.domain.Agency;
import com.ruoyi.admin.property.mapper.AgencyMapper;
import com.ruoyi.admin.property.service.IAgencyService;
import com.ruoyi.common.core.text.Convert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 项目 服务层实现
 * 
 * @author flaty
 * @date 2019-07-01
 */
@Service
public class AgencyServiceImpl implements IAgencyService 
{
	@Autowired
	private AgencyMapper agencyMapper;

	/**
     * 查询项目信息
     * 
     * @param iD 项目ID
     * @return 项目信息
     */
    @Override
	public Agency selectAgencyById(Integer iD)
	{
	    return agencyMapper.selectAgencyById(iD);
	}
	
	/**
     * 查询项目列表
     * 
     * @param agency 项目信息
     * @return 项目集合
     */
	@Override
	public List<Agency> selectAgencyList(Agency agency)
	{
	    return agencyMapper.selectAgencyList(agency);
	}
	
    /**
     * 新增项目
     * 
     * @param agency 项目信息
     * @return 结果
     */
	@Override
	public int insertAgency(Agency agency)
	{
	    return agencyMapper.insertAgency(agency);
	}
	
	/**
     * 修改项目
     * 
     * @param agency 项目信息
     * @return 结果
     */
	@Override
	public int updateAgency(Agency agency)
	{
	    return agencyMapper.updateAgency(agency);
	}

	/**
     * 删除项目对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deleteAgencyByIds(String ids)
	{
		return agencyMapper.deleteAgencyByIds(Convert.toStrArray(ids));
	}
	
}
