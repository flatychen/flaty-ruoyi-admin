package com.ruoyi.admin.appExtend.domain;

import com.ruoyi.admin.core.join.JoinField;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;


/**
 * 权限分组对象 app_index_permission
 *
 * @author flaty
 * @date 2019-08-27
 */
@Data
@Table(name = "aomygod.app_index_permission")
public class AppIndexPermission extends BaseEntity {
    private static final long serialVersionUID = 1L;

	@JoinField(sourceField = "buttonId")
	@Transient
	private AppIndexButton appIndexButton;


    /**
     * id
     */
    @Column(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Excel(name = "id", prompt = "id")

    private Long id;
    /**
     * 权限按钮
     */
    @Column(name = "button_id")
    @Excel(name = "权限按钮", prompt = "权限按钮")

    private Long buttonId;
    /**
     * 权限类型
     */
    @Column(name = "type")
    @Excel(name = "权限类型", prompt = "权限类型")

    private String type;
    /**
     * 排序
     */
    @Column(name = "order_num")
    @Excel(name = "排序", prompt = "排序")

    private Long orderNum;
    /**
     * 创建时间
     */
    @Column(name = "created_date")
    @Excel(name = "创建时间", prompt = "创建时间")
    private Date createdDate;


}
