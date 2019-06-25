package com.ruoyi.admin.service.impl;

import com.ruoyi.admin.domain.SysAgency;
import com.ruoyi.admin.mapper.SysAgencyMapper;
import com.ruoyi.admin.service.ISysAgencyService;
import com.ruoyi.common.core.text.Convert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 项目 服务层实现
 * 
 * @author flaty
 * @date 2019-06-25
 */
@Service
public class SysAgencyServiceImpl implements ISysAgencyService 
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
	public SysAgency selectSysAgencyById(Integer iD)
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
	public List<SysAgency> selectSysAgencyList(SysAgency sysAgency)
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
	public int insertSysAgency(SysAgency sysAgency)
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
	public int updateSysAgency(SysAgency sysAgency)
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
