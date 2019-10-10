package cn.aylives.ruoyi.admin.appExtend.domain;

import cn.aylives.ruoyi.common.annotation.Excel;
import cn.aylives.ruoyi.common.core.domain.BaseEntity;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;


/**
 * 首页按钮对象 app_index_button
 *
 * @author flaty
 * @date 2019-08-23
 */
@Data
@Table(name = "aomygod.app_index_button")
public class AppIndexButton extends BaseEntity {
    private static final long serialVersionUID = 1L;


    /**
     * null
     */
    @Column(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Excel(name = "id", prompt = "id")

    private Long id;
    /**
     * 首页功能区域
     */
    @Column(name = "region")
    @Excel(name = "首页功能区域", prompt = "首页功能区域")

    private String region;
    /**
     * 区域按钮分类
     */
    @Column(name = "classify")
    @Excel(name = "区域按钮分类", prompt = "区域按钮分类")
    private String classify;
    /**
     * 标题
     */
    @Column(name = "title")
    @Excel(name = "标题", prompt = "标题")

    private String title;
    /**
     * 图标
     */
    @Column(name = "icon")
    @Excel(name = "图标", prompt = "图标")

    private String icon;
    /**
     * android类型
     */
    @Column(name = "android_type")
    @Excel(name = "android类型", prompt = "android类型")

    private String androidType;
    /**
     * ios类型
     */
    @Column(name = "ios_type")
    @Excel(name = "ios类型", prompt = "ios类型")

    private String iosType;
    /**
     * 扩展字段
     */
    @Column(name = "extend")
    @Excel(name = "扩展字段", prompt = "扩展字段")
    private String extend;
    /**
     * H5/小程序地址
     */
    @Column(name = "url")
    @Excel(name = "H5/小程序地址", prompt = "H5/小程序地址")

    private String url;
    /**
     * 按钮类型
     */
    @Column(name = "type")
    @Excel(name = "按钮类型", prompt = "按钮类型")
    private String type;
    /**
     * 按钮类型
     */
    @Column(name = "order_num")
    @Excel(name = "按钮类型", prompt = "按钮类型")
    private String orderNum;
    /**
     * 创建时间
     */
    @Column(name = "created_date")
    @Excel(name = "创建时间", prompt = "创建时间")
    private Date createdDate;


}
