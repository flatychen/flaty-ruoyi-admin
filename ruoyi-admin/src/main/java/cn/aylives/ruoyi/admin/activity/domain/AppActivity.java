package cn.aylives.ruoyi.admin.activity.domain;

import cn.aylives.ruoyi.common.annotation.Excel;
import cn.aylives.ruoyi.common.core.domain.BaseEntity;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;


/**
 * app活动对象 activity
 *
 * @author flaty
 * @date 2019-09-06
 */
@Data
@Table(name = "aoyuejia_h5.activity")
public class AppActivity extends BaseEntity {
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
     * 背景图
     */
    @Column(name = "bg_img")
    @Excel(name = "背景图", prompt = "背景图")

    private String bgImg;
    /**
     * 标题
     */
    @Column(name = "title")
    @Excel(name = "标题", prompt = "标题")

    private String title;
    /**
     * 描述
     */
    @Column(name = "desp")
    @Excel(name = "描述", prompt = "描述")

    private String desp;
    /**
     * 开始时间
     */
    @Column(name = "begin_date")
    @Excel(name = "开始时间", prompt = "开始时间")

    private Date beginDate;
    /**
     * 结束时间
     */
    @Column(name = "end_date")
    @Excel(name = "结束时间", prompt = "结束时间")

    private Date endDate;
    /**
     * 创建时间
     */
    @Column(name = "created_date")
    @Excel(name = "创建时间", prompt = "创建时间")

    private Date createdDate;
    /**
     * 总参与人数
     */
    @Column(name = "total_people")
    @Excel(name = "总参与人数", prompt = "总参与人数")

    private Long totalPeople;
    /**
     * 活动类型，0，报名类活动，1重大活动
     */
    @Column(name = "type")
    @Excel(name = "活动类型，0，报名类活动，1重大活动", prompt = "活动类型，0，报名类活动，1重大活动")

    private Long type;
    /**
     * 活动详情链接，一般用于重要活动
     */
    @Column(name = "url")
    @Excel(name = "活动详情链接，一般用于重要活动", prompt = "活动详情链接，一般用于重要活动")
    private String url;


    private String place;


}
