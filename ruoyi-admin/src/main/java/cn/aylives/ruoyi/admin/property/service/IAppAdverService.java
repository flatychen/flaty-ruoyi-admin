package cn.aylives.ruoyi.admin.property.service;

import cn.aylives.ruoyi.admin.property.domain.AppAdver;
import java.util.List;
import cn.aylives.ruoyi.admin.core.MyMapper;
import cn.aylives.ruoyi.admin.core.IService;

/**
 * app广告Service接口
 *
 * @author flaty
 * @date 2019-10-14
 */
public interface IAppAdverService  extends IService<AppAdver>
{
	/**
	 * 查询app广告
	 *
	 * @param id app广告ID
	 * @return app广告
	 */
	public AppAdver selectAppAdverById(Long id);

	/**
	 * 查询app广告列表
	 *
	 * @param appAdver app广告
	 * @return app广告集合
	 */
	public List<AppAdver> selectAppAdverList(AppAdver appAdver);

	/**
	 * 新增app广告
	 *
	 * @param appAdver app广告
	 * @return 结果
	 */
	public int insertAppAdver(AppAdver appAdver);

	/**
	 * 修改app广告
	 *
	 * @param appAdver app广告
	 * @return 结果
	 */
	public int updateAppAdver(AppAdver appAdver);

	/**
	 * 批量删除app广告
	 *
	 * @param ids 需要删除的数据ID
	 * @return 结果
	 */
	public int deleteAppAdverByIds(String ids);

	/**
	 * 删除app广告信息
	 *
	 * @param id app广告ID
	 * @return 结果
	 */
	public int deleteAppAdverById(Long id);
	
}
