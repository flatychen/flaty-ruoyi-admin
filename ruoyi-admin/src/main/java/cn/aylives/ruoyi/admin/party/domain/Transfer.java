package cn.aylives.ruoyi.admin.party.domain;

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

    /**
     *
     */
    @Column(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Excel(name = "", prompt = "")
    private Integer id;
    /**
     *
     */
    @Column(name = "name")
    @Excel(name = "", prompt = "")
    private String name;
    /**
     *
     */
    @Column(name = "sex")
    @Excel(name = "", prompt = "")
    private Integer sex;
    /**
     *
     */
    @Column(name = "birthday")
    @Excel(name = "", prompt = "")
    private String birthday;
    /**
     *
     */
    @Column(name = "nation")
    @Excel(name = "", prompt = "")
    private String nation;
    /**
     *
     */
    @Column(name = "education")
    @Excel(name = "", prompt = "")
    private String education;
    /**
     *
     */
    @Column(name = "current_party")
    @Excel(name = "", prompt = "")
    private String currentParty;
    /**
     *
     */
    @Column(name = "add_party_date")
    @Excel(name = "", prompt = "")
    private String addPartyDate;
    /**
     *
     */
    @Column(name = "company_duty")
    @Excel(name = "", prompt = "")
    private String companyDuty;
    /**
     *
     */
    @Column(name = "home_address")
    @Excel(name = "", prompt = "")
    private String homeAddress;
    /**
     *
     */
    @Column(name = "company_party_phone")
    @Excel(name = "", prompt = "")
    private String companyPartyPhone;
    /**
     *
     */
    @Column(name = "phone")
    @Excel(name = "", prompt = "")
    private String phone;
    /**
     *
     */
    @Column(name = "others")
    @Excel(name = "", prompt = "")
    private String others;
    /**
     *
     */
    @Column(name = "agency_id")
    @Excel(name = "", prompt = "")
    private Integer agencyId;
    /**
     *
     */
    @Column(name = "app_user_id")
    @Excel(name = "", prompt = "")
    private Integer appUserId;


}
