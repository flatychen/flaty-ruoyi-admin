package cn.aylives.ruoyi.admin.property.service;

import cn.aylives.ruoyi.admin.property.domain.HousekeeperCommentTag;
import java.util.List;
import cn.aylives.ruoyi.admin.core.MyMapper;
import cn.aylives.ruoyi.admin.core.IService;

/**
 * CommentTagService接口
 *
 * @author flaty
 * @date 2019-10-15
 */
public interface IHousekeeperCommentTagService  extends IService<HousekeeperCommentTag>
{
	/**
	 * 查询CommentTag
	 *
	 * @param id CommentTagID
	 * @return CommentTag
	 */
	public HousekeeperCommentTag selectHousekeeperCommentTagById(Long id);

	/**
	 * 查询CommentTag列表
	 *
	 * @param housekeeperCommentTag CommentTag
	 * @return CommentTag集合
	 */
	public List<HousekeeperCommentTag> selectHousekeeperCommentTagList(HousekeeperCommentTag housekeeperCommentTag);

	/**
	 * 新增CommentTag
	 *
	 * @param housekeeperCommentTag CommentTag
	 * @return 结果
	 */
	public int insertHousekeeperCommentTag(HousekeeperCommentTag housekeeperCommentTag);

	/**
	 * 修改CommentTag
	 *
	 * @param housekeeperCommentTag CommentTag
	 * @return 结果
	 */
	public int updateHousekeeperCommentTag(HousekeeperCommentTag housekeeperCommentTag);

	/**
	 * 批量删除CommentTag
	 *
	 * @param ids 需要删除的数据ID
	 * @return 结果
	 */
	public int deleteHousekeeperCommentTagByIds(String ids);

	/**
	 * 删除CommentTag信息
	 *
	 * @param id CommentTagID
	 * @return 结果
	 */
	public int deleteHousekeeperCommentTagById(Long id);
	
}
