package cn.aylives.ruoyi.admin.property.service;

import cn.aylives.ruoyi.admin.property.domain.HousekeeperRelationship;
import java.util.List;
import cn.aylives.ruoyi.admin.core.MyMapper;
import cn.aylives.ruoyi.admin.core.IService;

/**
 * 管家绑定Service接口
 *
 * @author flaty
 * @date 2019-10-15
 */
public interface IHousekeeperRelationshipService  extends IService<HousekeeperRelationship>
{
	/**
	 * 查询管家绑定
	 *
	 * @param id 管家绑定ID
	 * @return 管家绑定
	 */
	public HousekeeperRelationship selectHousekeeperRelationshipById(Integer id);

	/**
	 * 查询管家绑定列表
	 *
	 * @param housekeeperRelationship 管家绑定
	 * @return 管家绑定集合
	 */
	public List<HousekeeperRelationship> selectHousekeeperRelationshipList(HousekeeperRelationship housekeeperRelationship);

	/**
	 * 新增管家绑定
	 *
	 * @param housekeeperRelationship 管家绑定
	 * @return 结果
	 */
	public int insertHousekeeperRelationship(HousekeeperRelationship housekeeperRelationship);

	/**
	 * 修改管家绑定
	 *
	 * @param housekeeperRelationship 管家绑定
	 * @return 结果
	 */
	public int updateHousekeeperRelationship(HousekeeperRelationship housekeeperRelationship);

	/**
	 * 批量删除管家绑定
	 *
	 * @param ids 需要删除的数据ID
	 * @return 结果
	 */
	public int deleteHousekeeperRelationshipByIds(String ids);

	/**
	 * 删除管家绑定信息
	 *
	 * @param id 管家绑定ID
	 * @return 结果
	 */
	public int deleteHousekeeperRelationshipById(Integer id);
	
}
