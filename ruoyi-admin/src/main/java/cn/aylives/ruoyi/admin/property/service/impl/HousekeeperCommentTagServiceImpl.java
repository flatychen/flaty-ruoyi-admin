package cn.aylives.ruoyi.admin.property.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cn.aylives.ruoyi.admin.core.impl.AbstractService;
import cn.aylives.ruoyi.admin.property.mapper.HousekeeperCommentTagMapper;
import cn.aylives.ruoyi.admin.property.domain.HousekeeperCommentTag;
import cn.aylives.ruoyi.admin.property.service.IHousekeeperCommentTagService;
import cn.aylives.ruoyi.common.core.text.Convert;
/**
 * CommentTagService业务层处理
 *
 * @author flaty
 * @date 2019-10-15
 */
@Service
public class HousekeeperCommentTagServiceImpl extends AbstractService<HousekeeperCommentTag> implements IHousekeeperCommentTagService
{

	@Autowired
	private HousekeeperCommentTagMapper housekeeperCommentTagMapper;

	/**
	 * 查询CommentTag
	 *
	 * @param id CommentTagID
	 * @return CommentTag
	 */
	@Override
	public HousekeeperCommentTag selectHousekeeperCommentTagById(Long id)
	{
		return housekeeperCommentTagMapper.selectHousekeeperCommentTagById(id);
	}

	/**
	 * 查询CommentTag列表
	 *
	 * @param housekeeperCommentTag CommentTag
	 * @return CommentTag
	 */
	@Override
	public List<HousekeeperCommentTag> selectHousekeeperCommentTagList(HousekeeperCommentTag housekeeperCommentTag)
	{
		return housekeeperCommentTagMapper.selectHousekeeperCommentTagList(housekeeperCommentTag);
	}

	/**
	 * 新增CommentTag
	 *
	 * @param housekeeperCommentTag CommentTag
	 * @return 结果
	 */
	@Override
	public int insertHousekeeperCommentTag(HousekeeperCommentTag housekeeperCommentTag)
	{
		return housekeeperCommentTagMapper.insertHousekeeperCommentTag(housekeeperCommentTag);
	}

	/**
	 * 修改CommentTag
	 *
	 * @param housekeeperCommentTag CommentTag
	 * @return 结果
	 */
	@Override
	public int updateHousekeeperCommentTag(HousekeeperCommentTag housekeeperCommentTag)
	{
		return housekeeperCommentTagMapper.updateHousekeeperCommentTag(housekeeperCommentTag);
	}

	/**
	 * 删除CommentTag对象
	 *
	 * @param ids 需要删除的数据ID
	 * @return 结果
	 */
	@Override
	public int deleteHousekeeperCommentTagByIds(String ids)
	{
		return housekeeperCommentTagMapper.deleteHousekeeperCommentTagByIds(Convert.toStrArray(ids));
	}

	/**
	 * 删除CommentTag信息
	 *
	 * @param id CommentTagID
	 * @return 结果
	 */
	public int deleteHousekeeperCommentTagById(Long id)
	{
		return housekeeperCommentTagMapper.deleteHousekeeperCommentTagById(id);
	}

	
}
