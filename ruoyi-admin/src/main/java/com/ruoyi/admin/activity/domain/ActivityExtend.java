package com.ruoyi.admin.activity.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.core.domain.BaseEntity;
import com.ruoyi.common.annotation.Excel;
import javax.persistence.*;

import lombok.Data;
import java.util.Date;




/**
 * ${functionName}对象 activity_extend
 * 
 * @author flaty
 * @date 2019-09-23
 */
@Data
@Table(name = "aomygod.activity_extend")
public class ActivityExtend extends BaseEntity
{
	private static final long serialVersionUID = 1L;


		/** $column.columnComment */
		@Column(name = "id")
				@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Excel(name = "id", prompt = "id")
		
	private Long id;
			/** $column.columnComment */
		@Column(name = "activity_id")
				@Excel(name = "$column.columnComment", prompt = "$column.columnComment")
		
	private Long activityId;
			/** $column.columnComment */
		@Column(name = "key")
				@Excel(name = "$column.columnComment", prompt = "$column.columnComment")
		
	private String key;
			/** $column.columnComment */
		@Column(name = "value")
				@Excel(name = "$column.columnComment", prompt = "$column.columnComment")
		
	private String value;
	










}
