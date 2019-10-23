package cn.aylives.ruoyi.admin.party.service.impl;

import java.util.List;

import cn.aylives.ruoyi.admin.party.domain.PartyConfig;
import cn.aylives.ruoyi.admin.party.mapper.PartyConfigMapper;
import cn.aylives.ruoyi.admin.party.service.IPartyConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cn.aylives.ruoyi.admin.core.impl.AbstractService;
import cn.aylives.ruoyi.common.core.text.Convert;
/**
 * 党建配置Service业务层处理
 *
 * @author flaty
 * @date 2019-10-22
 */
@Service
public class PartyConfigServiceImpl extends AbstractService<PartyConfig> implements IPartyConfigService
{

	@Autowired
	private PartyConfigMapper partyConfigMapper;

	/**
	 * 查询党建配置
	 *
	 * @param id 党建配置ID
	 * @return 党建配置
	 */
	@Override
	public PartyConfig selectPartyConfigById(Integer id)
	{
		return partyConfigMapper.selectPartyConfigById(id);
	}

	/**
	 * 查询党建配置列表
	 *
	 * @param partyConfig 党建配置
	 * @return 党建配置
	 */
	@Override
	public List<PartyConfig> selectPartyConfigList(PartyConfig partyConfig)
	{
		return partyConfigMapper.selectPartyConfigList(partyConfig);
	}

	/**
	 * 新增党建配置
	 *
	 * @param partyConfig 党建配置
	 * @return 结果
	 */
	@Override
	public int insertPartyConfig(PartyConfig partyConfig)
	{
		return partyConfigMapper.insertPartyConfig(partyConfig);
	}

	/**
	 * 修改党建配置
	 *
	 * @param partyConfig 党建配置
	 * @return 结果
	 */
	@Override
	public int updatePartyConfig(PartyConfig partyConfig)
	{
		return partyConfigMapper.updatePartyConfig(partyConfig);
	}

	/**
	 * 删除党建配置对象
	 *
	 * @param ids 需要删除的数据ID
	 * @return 结果
	 */
	@Override
	public int deletePartyConfigByIds(String ids)
	{
		return partyConfigMapper.deletePartyConfigByIds(Convert.toStrArray(ids));
	}

	/**
	 * 删除党建配置信息
	 *
	 * @param id 党建配置ID
	 * @return 结果
	 */
	@Override
	public int deletePartyConfigById(Integer id)
	{
		return partyConfigMapper.deletePartyConfigById(id);
	}

	
}
