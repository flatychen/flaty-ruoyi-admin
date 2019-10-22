package cn.aylives.ruoyi.admin.party.domain;

import cn.aylives.ruoyi.admin.core.join.JoinField;
import cn.aylives.ruoyi.admin.property.domain.AgencyView;
import cn.aylives.ruoyi.common.annotation.Excel;
import cn.aylives.ruoyi.common.core.domain.BaseEntity;
import lombok.Data;

import javax.persistence.*;

/**
 * 表 party_activity_user
 *
 * @author flaty
 * @date 2019-07-10
 */
@Data
@Table(name = "party_activity_user")
public class ActivityUser extends BaseEntity {
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

    @Transient
    @JoinField(sourceField = "activityId")
    private Activity activity;


    /**
     * 项目ID
     */
    @Column(name = "agency_id")
    @Excel(name = "项目ID", prompt = "项目ID")
    private Integer agencyId;
    /**
     * 服务
     */
    @Column(name = "activity_id")
    @Excel(name = "服务", prompt = "服务")
    private Integer activityId;
    /**
     * 用户ID
     */
    @Column(name = "app_user_id")
    @Excel(name = "用户ID", prompt = "用户ID")
    private Integer appUserId;
    /**
     * 用户上传图片
     */
    @Column(name = "pics")
    @Excel(name = "用户上传图片", prompt = "用户上传图片")
    private String pics;


}
