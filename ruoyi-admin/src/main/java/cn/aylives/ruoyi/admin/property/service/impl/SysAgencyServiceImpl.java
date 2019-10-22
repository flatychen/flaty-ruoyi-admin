package cn.aylives.ruoyi.admin.property.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cn.aylives.ruoyi.admin.core.impl.AbstractService;
import cn.aylives.ruoyi.admin.property.mapper.SysAgencyMapper;
import cn.aylives.ruoyi.admin.property.domain.SysAgency;
import cn.aylives.ruoyi.admin.property.service.ISysAgencyService;
import cn.aylives.ruoyi.common.core.text.Convert;
/**
 * 项目Service业务层处理
 *
 * @author flaty
 * @date 2019-10-22
 */
@Service
public class SysAgencyServiceImpl extends AbstractService<SysAgency> implements ISysAgencyService
{

	@Autowired
	private SysAgencyMapper sysAgencyMapper;

	/**
	 * 查询项目
	 *
	 * @param id 项目ID
	 * @return 项目
	 */
	@Override
	public SysAgency selectSysAgencyById(Integer id)
	{
		return sysAgencyMapper.selectSysAgencyById(id);
	}

	/**
	 * 查询项目列表
	 *
	 * @param sysAgency 项目
	 * @return 项目
	 */
	@Override
	public List<SysAgency> selectSysAgencyList(SysAgency sysAgency)
	{
		return sysAgencyMapper.selectSysAgencyList(sysAgency);
	}

	/**
	 * 新增项目
	 *
	 * @param sysAgency 项目
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
	 * @param sysAgency 项目
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

	/**
	 * 删除项目信息
	 *
	 * @param id 项目ID
	 * @return 结果
	 */
	@Override
	public int deleteSysAgencyById(Integer id)
	{
		return sysAgencyMapper.deleteSysAgencyById(id);
	}

	
}
