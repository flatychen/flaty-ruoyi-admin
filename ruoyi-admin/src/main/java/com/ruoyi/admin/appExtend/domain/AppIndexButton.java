package com.ruoyi.admin.appExtend.domain;

import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;


/**
 * 首页按钮对象 app_index_button
 *
 * @author flaty
 * @date 2019-08-20
 */
@Data
@Table(name = "app_index_button")
public class AppIndexButton extends BaseEntity {
    private static final long serialVersionUID = 1L;


    /**
     * null
     */
    @Column(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Excel(name = "id" , prompt = "id")

    private Long id;
    /**
     * 标题
     */
    @Column(name = "title")
    @Excel(name = "标题" , prompt = "标题")

    private String title;
    /**
     * 图标URL
     */
    @Column(name = "icon")
    @Excel(name = "图标URL" , prompt = "图标URL")

    private String icon;
    /**
     * android包名
     */
    @Column(name = "android_package_name")
    @Excel(name = "android包名" , prompt = "android包名")

    private String androidPackageName;
    /**
     * ios类型
     */
    @Column(name = "ios_type")
    @Excel(name = "ios类型" , prompt = "ios类型")

    private String iosType;
    /**
     * 创建时间
     */
    @Column(name = "created_date")
    @Excel(name = "创建时间" , prompt = "创建时间")

    private Date createdDate;
    /**
     * 扩展
     */
    @Column(name = "extend")
    @Excel(name = "扩展" , prompt = "扩展")

    private String extend;
    /**
     * 分类
     */
    @Column(name = "classify")
    @Excel(name = "分类" , prompt = "分类")

    private String classify;


}
