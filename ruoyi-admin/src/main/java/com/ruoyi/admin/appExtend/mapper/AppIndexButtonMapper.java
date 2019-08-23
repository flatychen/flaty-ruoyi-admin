package com.ruoyi.admin.appExtend.mapper;
import com.ruoyi.admin.appExtend.domain.AppIndexButton;
import java.util.List;
import com.ruoyi.admin.core.MyMapper;
/**
 * 首页按钮Mapper接口
 *
 * @author flaty
 * @date 2019-08-23
 */
public interface AppIndexButtonMapper extends MyMapper<AppIndexButton>
{
	/**
	 * 查询首页按钮
	 *
	 * @param id 首页按钮ID
	 * @return 首页按钮
	 */
	public AppIndexButton selectAppIndexButtonById(Long id);

	/**
	 * 查询首页按钮列表
	 *
	 * @param appIndexButton 首页按钮
	 * @return 首页按钮集合
	 */
	public List<AppIndexButton> selectAppIndexButtonList(AppIndexButton appIndexButton);

	/**
	 * 新增首页按钮
	 *
	 * @param appIndexButton 首页按钮
	 * @return 结果
	 */
	public int insertAppIndexButton(AppIndexButton appIndexButton);

	/**
	 * 修改首页按钮
	 *
	 * @param appIndexButton 首页按钮
	 * @return 结果
	 */
	public int updateAppIndexButton(AppIndexButton appIndexButton);

	/**
	 * 删除首页按钮
	 *
	 * @param id 首页按钮ID
	 * @return 结果
	 */
	public int deleteAppIndexButtonById(Long id);

	/**
	 * 批量删除首页按钮
	 *
	 * @param ids 需要删除的数据ID
	 * @return 结果
	 */
	public int deleteAppIndexButtonByIds(String[] ids);
}
