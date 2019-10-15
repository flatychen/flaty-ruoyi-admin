package cn.aylives.ruoyi.admin.property.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cn.aylives.ruoyi.admin.core.impl.AbstractService;
import cn.aylives.ruoyi.admin.property.mapper.HousekeeperRelationshipMapper;
import cn.aylives.ruoyi.admin.property.domain.HousekeeperRelationship;
import cn.aylives.ruoyi.admin.property.service.IHousekeeperRelationshipService;
import cn.aylives.ruoyi.common.core.text.Convert;
/**
 * 管家绑定Service业务层处理
 *
 * @author flaty
 * @date 2019-10-15
 */
@Service
public class HousekeeperRelationshipServiceImpl extends AbstractService<HousekeeperRelationship> implements IHousekeeperRelationshipService
{

	@Autowired
	private HousekeeperRelationshipMapper housekeeperRelationshipMapper;

	/**
	 * 查询管家绑定
	 *
	 * @param id 管家绑定ID
	 * @return 管家绑定
	 */
	@Override
	public HousekeeperRelationship selectHousekeeperRelationshipById(Integer id)
	{
		return housekeeperRelationshipMapper.selectHousekeeperRelationshipById(id);
	}

	/**
	 * 查询管家绑定列表
	 *
	 * @param housekeeperRelationship 管家绑定
	 * @return 管家绑定
	 */
	@Override
	public List<HousekeeperRelationship> selectHousekeeperRelationshipList(HousekeeperRelationship housekeeperRelationship)
	{
		return housekeeperRelationshipMapper.selectHousekeeperRelationshipList(housekeeperRelationship);
	}

	/**
	 * 新增管家绑定
	 *
	 * @param housekeeperRelationship 管家绑定
	 * @return 结果
	 */
	@Override
	public int insertHousekeeperRelationship(HousekeeperRelationship housekeeperRelationship)
	{
		return housekeeperRelationshipMapper.insertHousekeeperRelationship(housekeeperRelationship);
	}

	/**
	 * 修改管家绑定
	 *
	 * @param housekeeperRelationship 管家绑定
	 * @return 结果
	 */
	@Override
	public int updateHousekeeperRelationship(HousekeeperRelationship housekeeperRelationship)
	{
		return housekeeperRelationshipMapper.updateHousekeeperRelationship(housekeeperRelationship);
	}

	/**
	 * 删除管家绑定对象
	 *
	 * @param ids 需要删除的数据ID
	 * @return 结果
	 */
	@Override
	public int deleteHousekeeperRelationshipByIds(String ids)
	{
		return housekeeperRelationshipMapper.deleteHousekeeperRelationshipByIds(Convert.toStrArray(ids));
	}

	/**
	 * 删除管家绑定信息
	 *
	 * @param id 管家绑定ID
	 * @return 结果
	 */
	public int deleteHousekeeperRelationshipById(Integer id)
	{
		return housekeeperRelationshipMapper.deleteHousekeeperRelationshipById(id);
	}

	
}
