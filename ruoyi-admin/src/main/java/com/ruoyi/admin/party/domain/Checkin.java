package com.ruoyi.admin.party.domain;

import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;
import lombok.Data;

import javax.persistence.*;

/**
 * 表 party_checkin
 * 
 * @author flaty
 * @date 2019-07-10
 */
@Data
@Table(name = "party_checkin")
public class Checkin extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	
	/**  */
	@Column(name = "id")
		@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Excel(name = "", prompt = "")
	private Integer id;
	/**  */
	@Column(name = "name")
		@Excel(name = "", prompt = "")
	private String name;
	/**  */
	@Column(name = "phone")
		@Excel(name = "", prompt = "")
	private String phone;
	/**  */
	@Column(name = "sex")
		@Excel(name = "", prompt = "")
	private Integer sex;
	/**  */
	@Column(name = "home_address")
		@Excel(name = "", prompt = "")
	private String homeAddress;
	/**  */
	@Column(name = "current_identity")
		@Excel(name = "", prompt = "")
	private String currentIdentity;
	/**  */
	@Column(name = "current_party_branch")
		@Excel(name = "", prompt = "")
	private String currentPartyBranch;
	/**  */
	@Column(name = "checkin_img")
		@Excel(name = "", prompt = "")
	private String checkinImg;
	/**  */
	@Column(name = "agency_id")
		@Excel(name = "", prompt = "")
	private Integer agencyId;
	/**  */
	@Column(name = "app_user_id")
		@Excel(name = "", prompt = "")
	private Integer appUserId;


}
