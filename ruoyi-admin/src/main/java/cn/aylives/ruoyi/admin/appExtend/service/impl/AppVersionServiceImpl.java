package cn.aylives.ruoyi.admin.appExtend.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cn.aylives.ruoyi.admin.core.impl.AbstractService;
import cn.aylives.ruoyi.admin.appExtend.mapper.AppVersionMapper;
import cn.aylives.ruoyi.admin.appExtend.domain.AppVersion;
import cn.aylives.ruoyi.admin.appExtend.service.IAppVersionService;
import cn.aylives.ruoyi.common.core.text.Convert;
/**
 * AppversionService业务层处理
 *
 * @author flaty
 * @date 2019-10-11
 */
@Service
public class AppVersionServiceImpl extends AbstractService<AppVersion> implements IAppVersionService
{

	@Autowired
	private AppVersionMapper appVersionMapper;

	/**
	 * 查询Appversion
	 *
	 * @param id AppversionID
	 * @return Appversion
	 */
	@Override
	public AppVersion selectAppVersionById(Long id)
	{
		return appVersionMapper.selectAppVersionById(id);
	}

	/**
	 * 查询Appversion列表
	 *
	 * @param appVersion Appversion
	 * @return Appversion
	 */
	@Override
	public List<AppVersion> selectAppVersionList(AppVersion appVersion)
	{
		return appVersionMapper.selectAppVersionList(appVersion);
	}

	/**
	 * 新增Appversion
	 *
	 * @param appVersion Appversion
	 * @return 结果
	 */
	@Override
	public int insertAppVersion(AppVersion appVersion)
	{
		return appVersionMapper.insertAppVersion(appVersion);
	}

	/**
	 * 修改Appversion
	 *
	 * @param appVersion Appversion
	 * @return 结果
	 */
	@Override
	public int updateAppVersion(AppVersion appVersion)
	{
		return appVersionMapper.updateAppVersion(appVersion);
	}

	/**
	 * 删除Appversion对象
	 *
	 * @param ids 需要删除的数据ID
	 * @return 结果
	 */
	@Override
	public int deleteAppVersionByIds(String ids)
	{
		return appVersionMapper.deleteAppVersionByIds(Convert.toStrArray(ids));
	}

	/**
	 * 删除Appversion信息
	 *
	 * @param id AppversionID
	 * @return 结果
	 */
	public int deleteAppVersionById(Long id)
	{
		return appVersionMapper.deleteAppVersionById(id);
	}

	
}
