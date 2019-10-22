package cn.aylives.ruoyi.admin.party.domain;

import cn.aylives.ruoyi.admin.core.join.JoinField;
import cn.aylives.ruoyi.admin.property.domain.AgencyView;
import cn.aylives.ruoyi.common.annotation.Excel;
import cn.aylives.ruoyi.common.core.domain.BaseEntity;
import lombok.Data;

import javax.persistence.*;

/**
 * 党建服务表 party_activity
 *
 * @author flaty
 * @date 2019-07-10
 */
@Data
@Table(name = "aomygod.party_activity")
public class Activity extends BaseEntity {
    private static final long serialVersionUID = 1L;

    /**
     *
     */
    @Column(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Excel(name = "", prompt = "")
    private Integer id;

    @Transient
    @JoinField(sourceField = "agencyId")
    private AgencyView agency;

    /**
     * 标题
     */
    @Column(name = "title")
    @Excel(name = "标题", prompt = "标题")
    private String title;
    /**
     * 内容
     */
    @Column(name = "desc")
    @Excel(name = "内容", prompt = "内容")
    private String desc;
    /**
     * 内容主图
     */
    @Column(name = "desc_url")
    @Excel(name = "内容主图", prompt = "内容主图")
    private String descUrl;
    /**
     * 列表图片
     */
    @Column(name = "img_url")
    @Excel(name = "列表图片", prompt = "列表图片")
    private String imgUrl;
    /**
     * 项目
     */
    @Column(name = "agency_id")
    @Excel(name = "项目", prompt = "项目")
    private Integer agencyId;


}
