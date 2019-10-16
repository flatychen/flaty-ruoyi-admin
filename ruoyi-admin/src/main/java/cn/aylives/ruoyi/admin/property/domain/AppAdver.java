package cn.aylives.ruoyi.admin.property.domain;

import cn.aylives.ruoyi.common.annotation.Excel;
import javax.persistence.*;

import cn.aylives.ruoyi.common.core.domain.BaseEntity;
import lombok.Data;
import java.util.Date;




/**
 * app广告对象 app_adver
 * 
 * @author flaty
 * @date 2019-10-14
 */
@Data
@Table(name = "aomygod.app_adver")
public class AppAdver extends BaseEntity
{
	private static final long serialVersionUID = 1L;


		/** id */
		@Column(name = "id")
				@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Excel(name = "id", prompt = "id")
		
	private Long id;
			/** 名称 */
		@Column(name = "name")
				@Excel(name = "名称", prompt = "名称")
		
	private String name;
			/** 链接内容 */
		@Column(name = "link")
				@Excel(name = "链接内容", prompt = "链接内容")
		
	private String link;
			/** 类型 */
		@Column(name = "type")
				@Excel(name = "类型", prompt = "类型")
		
	private Long type;
			/** 排序 */
		@Column(name = "sort")
				@Excel(name = "排序", prompt = "排序")
		
	private Long sort;
			/** 开始时间 */
		@Column(name = "begin_time")
				@Excel(name = "开始时间", prompt = "开始时间")
		
	private Date beginTime;
			/** 结束时间 */
		@Column(name = "end_time")
				@Excel(name = "结束时间", prompt = "结束时间")
		
	private Date endTime;
			/** 创建时间 */
		@Column(name = "created_date")
				@Excel(name = "创建时间", prompt = "创建时间")
		
	private Date createdDate;
			/** 轮播图图片地址 */
		@Column(name = "img_url")
				@Excel(name = "轮播图图片地址", prompt = "轮播图图片地址")
		
	private String imgUrl;
			/** 是否在显示 */
		@Column(name = "status")
				@Excel(name = "是否在显示", prompt = "是否在显示")
		
	private Integer status;
	










}
