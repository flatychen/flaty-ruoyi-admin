package cn.aylives.ruoyi.admin.property.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cn.aylives.ruoyi.admin.core.impl.AbstractService;
import cn.aylives.ruoyi.admin.property.mapper.AppAdverMapper;
import cn.aylives.ruoyi.admin.property.domain.AppAdver;
import cn.aylives.ruoyi.admin.property.service.IAppAdverService;
import cn.aylives.ruoyi.common.core.text.Convert;
/**
 * app广告Service业务层处理
 *
 * @author flaty
 * @date 2019-10-14
 */
@Service
public class AppAdverServiceImpl extends AbstractService<AppAdver> implements IAppAdverService
{

	@Autowired
	private AppAdverMapper appAdverMapper;

	/**
	 * 查询app广告
	 *
	 * @param id app广告ID
	 * @return app广告
	 */
	@Override
	public AppAdver selectAppAdverById(Long id)
	{
		return appAdverMapper.selectAppAdverById(id);
	}

	/**
	 * 查询app广告列表
	 *
	 * @param appAdver app广告
	 * @return app广告
	 */
	@Override
	public List<AppAdver> selectAppAdverList(AppAdver appAdver)
	{
		return appAdverMapper.selectAppAdverList(appAdver);
	}

	/**
	 * 新增app广告
	 *
	 * @param appAdver app广告
	 * @return 结果
	 */
	@Override
	public int insertAppAdver(AppAdver appAdver)
	{
		return appAdverMapper.insertAppAdver(appAdver);
	}

	/**
	 * 修改app广告
	 *
	 * @param appAdver app广告
	 * @return 结果
	 */
	@Override
	public int updateAppAdver(AppAdver appAdver)
	{
		return appAdverMapper.updateAppAdver(appAdver);
	}

	/**
	 * 删除app广告对象
	 *
	 * @param ids 需要删除的数据ID
	 * @return 结果
	 */
	@Override
	public int deleteAppAdverByIds(String ids)
	{
		return appAdverMapper.deleteAppAdverByIds(Convert.toStrArray(ids));
	}

	/**
	 * 删除app广告信息
	 *
	 * @param id app广告ID
	 * @return 结果
	 */
	public int deleteAppAdverById(Long id)
	{
		return appAdverMapper.deleteAppAdverById(id);
	}

	
}
