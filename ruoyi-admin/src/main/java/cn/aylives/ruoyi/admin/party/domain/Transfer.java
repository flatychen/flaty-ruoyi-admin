package cn.aylives.ruoyi.admin.party.domain;

import cn.aylives.ruoyi.admin.core.join.JoinField;
import cn.aylives.ruoyi.admin.property.domain.AgencyView;
import cn.aylives.ruoyi.common.annotation.Excel;
import cn.aylives.ruoyi.common.core.domain.BaseEntity;
import lombok.Data;

import javax.persistence.*;

/**
 * 表 party_transfer
 *
 * @author flaty
 * @date 2019-07-10
 */
@Data
@Table(name = "party_transfer")
public class Transfer extends BaseEntity {
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
    private Integer id;
    /**
     *
     */
    @Column(name = "name")
    @Excel(name = "姓名")
    private String name;
    /**
     *
     */
    @Column(name = "sex")
    @Excel(name = "性别",readConverterExp ="0=女,1=男")
    private Integer sex;
    /**
     *
     */
    @Column(name = "birthday")
    @Excel(name = "生日")
    private String birthday;
    /**
     *
     */
    @Column(name = "nation")
    @Excel(name = "民族")
    private String nation;
    /**
     *
     */
    @Column(name = "education")
    @Excel(name = "最高学历")
    private String education;
    /**
     *
     */
    @Column(name = "current_party")
    @Excel(name = "当前党组织", prompt = "")
    private String currentParty;
    /**
     *
     */
    @Column(name = "add_party_date")
    @Excel(name = "入党时间", prompt = "")
    private String addPartyDate;
    /**
     *
     */
    @Column(name = "company_duty")
    @Excel(name = "公司职务", prompt = "")
    private String companyDuty;
    /**
     *
     */
    @Column(name = "home_address")
    @Excel(name = "家庭住址", prompt = "")
    private String homeAddress;
    /**
     *
     */
    @Column(name = "company_party_phone")
    @Excel(name = "公司电话", prompt = "")
    private String companyPartyPhone;
    /**
     *
     */
    @Column(name = "phone")
    @Excel(name = "本人电话", prompt = "")
    private String phone;
    /**
     *
     */
    @Column(name = "others")
    @Excel(name = "其它特长", prompt = "")
    private String others;
    /**
     *
     */
    @Column(name = "agency_id")
    private Integer agencyId;
    /**
     *
     */
    @Column(name = "app_user_id")
    private Integer appUserId;


}
