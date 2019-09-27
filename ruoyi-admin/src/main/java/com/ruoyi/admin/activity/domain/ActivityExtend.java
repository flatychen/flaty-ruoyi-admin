package com.ruoyi.admin.activity.domain;

import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;
import lombok.Data;

import javax.persistence.*;


/**
 * ${functionName}对象 activity_extend
 *
 * @author flaty
 * @date 2019-09-23
 */
@Data
@Table(name = "aoyuejia_h5.activity_extend")
public class ActivityExtend extends BaseEntity {
    private static final long serialVersionUID = 1L;


    /**
     * $column.columnComment
     */
    @Column(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Excel(name = "id", prompt = "id")

    private Long id;
    /**
     * $column.columnComment
     */
    @Column(name = "activity_id")
    @Excel(name = "$column.columnComment", prompt = "$column.columnComment")

    private Long activityId;
    /**
     * $column.columnComment
     */
    @Column(name = "key")
    @Excel(name = "$column.columnComment", prompt = "$column.columnComment")

    private String key;
    /**
     * $column.columnComment
     */
    @Column(name = "value")
    @Excel(name = "$column.columnComment", prompt = "$column.columnComment")

    private String value;

    /** $column.columnComment */
    @Column(name = "order_num")
    @Excel(name = "$column.columnComment", prompt = "$column.columnComment")

    private Integer orderNum;

}
