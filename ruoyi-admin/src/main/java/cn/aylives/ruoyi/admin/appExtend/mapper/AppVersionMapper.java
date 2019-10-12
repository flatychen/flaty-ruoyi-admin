package cn.aylives.ruoyi.admin.appExtend.mapper;
import cn.aylives.ruoyi.admin.appExtend.domain.AppVersion;
import java.util.List;
import cn.aylives.ruoyi.admin.core.MyMapper;
/**
 * AppversionMapper接口
 *
 * @author flatyvm/java/mapper.java.vm
 * @date 2019-10-11
 */
public interface AppVersionMapper extends MyMapper<AppVersion>
{
	/**
	 * 查询Appversion
	 *
	 * @param id AppversionID
	 * @return Appversion
	 */
	public AppVersion selectAppVersionById(Long id);

	/**
	 * 查询Appversion列表
	 *
	 * @param appVersion Appversion
	 * @return Appversion集合
	 */
	public List<AppVersion> selectAppVersionList(AppVersion appVersion);

	/**
	 * 新增Appversion
	 *
	 * @param appVersion Appversion
	 * @return 结果
	 */
	public int insertAppVersion(AppVersion appVersion);

	/**
	 * 修改Appversion
	 *
	 * @param appVersion Appversion
	 * @return 结果
	 */
	public int updateAppVersion(AppVersion appVersion);

	/**
	 * 删除Appversion
	 *
	 * @param id AppversionID
	 * @return 结果
	 */
	public int deleteAppVersionById(Long id);

	/**
	 * 批量删除Appversion
	 *
	 * @param ids 需要删除的数据ID
	 * @return 结果
	 */
	public int deleteAppVersionByIds(String[] ids);
}
