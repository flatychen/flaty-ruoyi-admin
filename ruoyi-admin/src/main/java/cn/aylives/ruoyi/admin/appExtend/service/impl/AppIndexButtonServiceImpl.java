package cn.aylives.ruoyi.admin.appExtend.service.impl;

import cn.aylives.ruoyi.admin.appExtend.domain.AppIndexButton;
import cn.aylives.ruoyi.admin.appExtend.mapper.AppIndexButtonMapper;
import cn.aylives.ruoyi.admin.appExtend.service.IAppIndexButtonService;
import cn.aylives.ruoyi.admin.core.impl.AbstractService;
import cn.aylives.ruoyi.common.core.text.Convert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 * 首页按钮Service业务层处理
 *
 * @author flaty
 * @date 2019-08-23
 */
@Service
public class AppIndexButtonServiceImpl extends AbstractService<AppIndexButton> implements IAppIndexButtonService
{

	@Autowired
	private AppIndexButtonMapper appIndexButtonMapper;

	/**
	 * 查询首页按钮
	 *
	 * @param id 首页按钮ID
	 * @return 首页按钮
	 */
	@Override
	public AppIndexButton selectAppIndexButtonById(Long id)
	{
		return appIndexButtonMapper.selectAppIndexButtonById(id);
	}

	/**
	 * 查询首页按钮列表
	 *
	 * @param appIndexButton 首页按钮
	 * @return 首页按钮
	 */
	@Override
	public List<AppIndexButton> selectAppIndexButtonList(AppIndexButton appIndexButton)
	{
		return appIndexButtonMapper.selectAppIndexButtonList(appIndexButton);
	}

	/**
	 * 新增首页按钮
	 *
	 * @param appIndexButton 首页按钮
	 * @return 结果
	 */
	@Override
	public int insertAppIndexButton(AppIndexButton appIndexButton)
	{
		return appIndexButtonMapper.insertAppIndexButton(appIndexButton);
	}

	/**
	 * 修改首页按钮
	 *
	 * @param appIndexButton 首页按钮
	 * @return 结果
	 */
	@Override
	public int updateAppIndexButton(AppIndexButton appIndexButton)
	{
		return appIndexButtonMapper.updateAppIndexButton(appIndexButton);
	}

	/**
	 * 删除首页按钮对象
	 *
	 * @param ids 需要删除的数据ID
	 * @return 结果
	 */
	@Override
	public int deleteAppIndexButtonByIds(String ids)
	{
		return appIndexButtonMapper.deleteAppIndexButtonByIds(Convert.toStrArray(ids));
	}

	/**
	 * 删除首页按钮信息
	 *
	 * @param id 首页按钮ID
	 * @return 结果
	 */
	public int deleteAppIndexButtonById(Long id)
	{
		return appIndexButtonMapper.deleteAppIndexButtonById(id);
	}

	
}
