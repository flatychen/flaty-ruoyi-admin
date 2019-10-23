package cn.aylives.ruoyi.admin.party.service;

import cn.aylives.ruoyi.admin.party.domain.PartyConfig;
import java.util.List;
import cn.aylives.ruoyi.admin.core.MyMapper;
import cn.aylives.ruoyi.admin.core.IService;

/**
 * 党建配置Service接口
 *
 * @author flaty
 * @date 2019-10-22
 */
public interface IPartyConfigService  extends IService<PartyConfig>
{
	/**
	 * 查询党建配置
	 *
	 * @param id 党建配置ID
	 * @return 党建配置
	 */
	public PartyConfig selectPartyConfigById(Integer id);

	/**
	 * 查询党建配置列表
	 *
	 * @param partyConfig 党建配置
	 * @return 党建配置集合
	 */
	public List<PartyConfig> selectPartyConfigList(PartyConfig partyConfig);

	/**
	 * 新增党建配置
	 *
	 * @param partyConfig 党建配置
	 * @return 结果
	 */
	public int insertPartyConfig(PartyConfig partyConfig);

	/**
	 * 修改党建配置
	 *
	 * @param partyConfig 党建配置
	 * @return 结果
	 */
	public int updatePartyConfig(PartyConfig partyConfig);

	/**
	 * 批量删除党建配置
	 *
	 * @param ids 需要删除的数据ID
	 * @return 结果
	 */
	public int deletePartyConfigByIds(String ids);

	/**
	 * 删除党建配置信息
	 *
	 * @param id 党建配置ID
	 * @return 结果
	 */
	public int deletePartyConfigById(Integer id);
	
}
