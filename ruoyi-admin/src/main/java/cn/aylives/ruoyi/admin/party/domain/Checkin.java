package cn.aylives.ruoyi.admin.party.domain;

import cn.aylives.ruoyi.admin.core.join.JoinField;
import cn.aylives.ruoyi.admin.property.domain.AgencyView;
import cn.aylives.ruoyi.common.annotation.Excel;
import cn.aylives.ruoyi.common.core.domain.BaseEntity;
import lombok.Data;

import javax.persistence.*;

/**
 * 表 party_checkin
 *
 * @author flaty
 * @date 2019-07-10
 */
@Data
@Table(name = "party_checkin")
public class Checkin extends BaseEntity {
    private static final long serialVersionUID = 1L;



    @JoinField(sourceField = "agencyId",customOuterField = "distAgencyId")
    @Transient
    private AgencyView agencyView;


    /**
     *
     */
    @Column(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Excel(name = "id", prompt = "id")
    private Integer id;
    /**
     *
     */
    @Column(name = "name")
    @Excel(name = "姓名", prompt = "姓名")
    private String name;
    /**
     *
     */
    @Column(name = "phone")
    @Excel(name = "手机号", prompt = "手机号")
    private String phone;
    /**
     *
     */
    @Column(name = "sex")
    @Excel(name = "姓别", prompt = "",readConverterExp ="0=女,1=男")
    private Integer sex;
    /**
     *
     */
    @Column(name = "home_address")
    @Excel(name = "家庭住址", prompt = "家庭住址")
    private String homeAddress;
    /**
     *
     */
    @Column(name = "current_identity")
    @Excel(name = "当前身份", prompt = "当前身份")
    private String currentIdentity;
    /**
     *
     */
    @Column(name = "current_party_branch")
    @Excel(name = "现党关系所在党支部", prompt = "现党关系所在党支部")
    private String currentPartyBranch;
    /**
     *
     */
    @Column(name = "checkin_img")
    @Excel(name = "报道卡", prompt = "报道卡")
    private String checkinImg;
    /**
     *
     */
    @Column(name = "agency_id")
    private Integer agencyId;

    @Column(name = "app_user_id")
    private Integer appUserId;


    @Column(name = "add_party_date")
    @Excel(name = "入党时间", prompt = "入党时间")
    private String addPartyDate;

    @Column(name = "company_duty")
    @Excel(name = "党内职务", prompt = "党内职务")
    private String companyDuty;

    @Column(name = "formal")
    @Excel(name = "党员类型", prompt = "党员类型",readConverterExp="0=预备党员,1=党员")
    private Integer formal;

    @Column(name = "status")
    @Excel(name = "审核状态", prompt = "入党时间",readConverterExp="0=未审核,1=已审核,2=未通过")
    private Integer status;

    @Column(name = "reason")
    @Excel(name = "未通过原因", prompt = "未通过原因")
    private String  reason;


}
