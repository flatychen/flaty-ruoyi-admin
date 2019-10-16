package cn.aylives.ruoyi.admin.property.domain;

import cn.aylives.ruoyi.common.annotation.Excel;
import javax.persistence.*;

import cn.aylives.ruoyi.common.core.domain.BaseEntity;
import lombok.Data;
import java.util.Date;




/**
 * CommentTag对象 housekeeper_comment_tag
 * 
 * @author flaty
 * @date 2019-10-15
 */
@Data
@Table(name = "aomygod.housekeeper_comment_tag")
public class HousekeeperCommentTag extends BaseEntity
{
	private static final long serialVersionUID = 1L;


		/** id */
		@Column(name = "id")
				@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Excel(name = "id", prompt = "id")
		
	private Long id;
			/** 小区编号 */
		@Column(name = "agency_id")
				@Excel(name = "小区编号", prompt = "小区编号")
		
	private Long agencyId;
			/** 标签名称 */
		@Column(name = "tag_name")
				@Excel(name = "标签名称", prompt = "标签名称")
		
	private String tagName;
			/** 评价类型 */
		@Column(name = "like_type")
				@Excel(name = "评价类型", prompt = "评价类型")
		
	private Integer likeType;
			/** 创建时间 */
		@Column(name = "created_date")
				@Excel(name = "创建时间", prompt = "创建时间")
		
	private Date createdDate;
	










}
