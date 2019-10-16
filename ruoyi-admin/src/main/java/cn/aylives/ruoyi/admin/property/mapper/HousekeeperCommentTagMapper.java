package cn.aylives.ruoyi.admin.property.mapper;
import cn.aylives.ruoyi.admin.property.domain.HousekeeperCommentTag;
import java.util.List;
import cn.aylives.ruoyi.admin.core.MyMapper;
/**
 * CommentTagMapper接口
 *
 * @author flatyvm/java/mapper.java.vm
 * @date 2019-10-15
 */
public interface HousekeeperCommentTagMapper extends MyMapper<HousekeeperCommentTag>
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
	 * 删除CommentTag
	 *
	 * @param id CommentTagID
	 * @return 结果
	 */
	public int deleteHousekeeperCommentTagById(Long id);

	/**
	 * 批量删除CommentTag
	 *
	 * @param ids 需要删除的数据ID
	 * @return 结果
	 */
	public int deleteHousekeeperCommentTagByIds(String[] ids);
}
