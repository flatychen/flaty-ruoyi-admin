package com.ruoyi.admin.property.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.admin.core.impl.AbstractService;
import com.ruoyi.admin.property.mapper.SysAgencyMapper;
import com.ruoyi.admin.property.domain.Agency;
import com.ruoyi.admin.property.service.ISysAgencyService;
import com.ruoyi.common.core.text.Convert;

/**
 * 项目 服务层实现
 * 
 * @author flaty
 * @date 2019-07-05
 */
@Service
public class SysAgencyServiceImpl extends AbstractService<Agency> implements ISysAgencyService
{
	@Autowired
	private SysAgencyMapper sysAgencyMapper;

	/**
     * 查询项目信息
     * 
     * @param iD 项目ID
     * @return 项目信息
     */
    @Override
	public Agency selectSysAgencyById(Integer iD)
	{
	    return sysAgencyMapper.selectSysAgencyById(iD);
	}
	
	/**
     * 查询项目列表
     * 
     * @param sysAgency 项目信息
     * @return 项目集合
     */
	@Override
	public List<Agency> selectSysAgencyList(Agency sysAgency)
	{
	    return sysAgencyMapper.selectSysAgencyList(sysAgency);
	}
	
    /**
     * 新增项目
     * 
     * @param sysAgency 项目信息
     * @return 结果
     */
	@Override
	public int insertSysAgency(Agency sysAgency)
	{
	    return sysAgencyMapper.insertSysAgency(sysAgency);
	}
	
	/**
     * 修改项目
     * 
     * @param sysAgency 项目信息
     * @return 结果
     */
	@Override
	public int updateSysAgency(Agency sysAgency)
	{
	    return sysAgencyMapper.updateSysAgency(sysAgency);
	}

	/**
     * 删除项目对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deleteSysAgencyByIds(String ids)
	{
		return sysAgencyMapper.deleteSysAgencyByIds(Convert.toStrArray(ids));
	}
	
}
