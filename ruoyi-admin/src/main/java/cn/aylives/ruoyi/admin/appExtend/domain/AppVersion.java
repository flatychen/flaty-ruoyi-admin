package cn.aylives.ruoyi.admin.appExtend.domain;

import cn.aylives.ruoyi.common.annotation.Excel;
import javax.persistence.*;

import cn.aylives.ruoyi.common.core.domain.BaseEntity;
import lombok.Data;
import java.util.Date;




/**
 * Appversion对象 app_version
 * 
 * @author flaty
 * @date 2019-10-11
 */
@Data
@Table(name = "aomygod.app_version")
public class AppVersion extends BaseEntity
{
	private static final long serialVersionUID = 1L;


		/** null */
		@Column(name = "id")
				@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Excel(name = "id", prompt = "id")
		
	private Long id;
			/** 版本号 */
		@Column(name = "version")
				@Excel(name = "版本号", prompt = "版本号")
		
	private String version;
			/** 安装包地址 */
		@Column(name = "package_link")
				@Excel(name = "安装包地址", prompt = "安装包地址")
		
	private String packageLink;
			/** 市场地址 */
		@Column(name = "store_link")
				@Excel(name = "市场地址", prompt = "市场地址")
		
	private String storeLink;
			/** 是否强制更新。1是 */
		@Column(name = "is_force_update")
				@Excel(name = "是否强制更新。1是", prompt = "是否强制更新。1是")
		
	private Integer isForceUpdate;
			/** 是否选择更新 */
		@Column(name = "is_update")
				@Excel(name = "是否选择更新", prompt = "是否选择更新")
		
	private Integer isUpdate;
			/** 更新标题 */
		@Column(name = "update_title")
				@Excel(name = "更新标题", prompt = "更新标题")
		
	private String updateTitle;
			/** 更新内容 */
		@Column(name = "update_content")
				@Excel(name = "更新内容", prompt = "更新内容")
		
	private String updateContent;
			/** 创建时间 */
		@Column(name = "created_date")
				@Excel(name = "创建时间", prompt = "创建时间")
		
	private Date createdDate;
			/** 系统 */
		@Column(name = "type")
				@Excel(name = "系统", prompt = "系统")
		
	private Integer type;
			/** app类型 */
		@Column(name = "app_type")
				@Excel(name = "app类型", prompt = "app类型")
		
	private Integer appType;
	










}
