package com.ruoyi.admin.party.domain;

import com.ruoyi.admin.core.join.JoinField;
import com.ruoyi.admin.property.domain.Agency;
import com.ruoyi.common.core.domain.BaseEntity;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * 党建服务表 party_activity
 * 
 * @author flaty
 * @date 2019-07-05
 */
@Data
@Table(name = "aomygod.party_activity")
public class Activity extends BaseEntity
{
	private static final long serialVersionUID = 1L;

	@Transient
	@JoinField(sourceField = "agencyId")
	private Agency agency;

	/**  */
	@Column(name = "id")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Integer id;
	/** 标题 */
	@Column(name = "title")
		private String title;
	/** 内容 */
	@Column(name = "desc")
		private String desc;
	/** 内容主图 */
	@Column(name = "desc_url")
		private String descUrl;
	/** 列表图片 */
	@Column(name = "img_url")
		private String imgUrl;
	/**  */
	@Column(name = "created_date")
		private Date createdDate;
	/** 项目 */
	@Column(name = "agency_id")
		private Integer agencyId;


}
