package com.ruoyi.admin.property.domain;

import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * 项目表 sys_agency
 *
 * @author flaty
 * @date 2019-07-05
 */
@Data
@Table(name = "aomygod.sys_agency")
public class Agency extends BaseEntity {
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
    @Column(name = "AGENCY_CODE")
    @Excel(name = "", prompt = "")
    private String agencyCode;
    /**
     * 组织主图
     */
    @Column(name = "IMG_URL")
    @Excel(name = "组织主图", prompt = "组织主图")
    private String imgUrl;
    /**
     * 层次
     */
    @Column(name = "DEPTH")
    @Excel(name = "层次", prompt = "层次")
    private String dEPTH;
    /**
     * 类型 0:小区 1：商场
     */
    @Column(name = "TYPE")
    @Excel(name = "类型 0:小区 1：商场", prompt = "类型 0:小区 1：商场")
    private String tYPE;
    /**
     * 是否有效 0:有效 1:无效
     */
    @Column(name = "IS_VERIFI")
    @Excel(name = "是否有效 0:有效 1:无效", prompt = "是否有效 0:有效 1:无效")
    private Integer isVerifi;
    /**
     * 名称
     */
    @Column(name = "NAME")
    @Excel(name = "名称", prompt = "名称")
    private String nAME;
    /**
     * 地址
     */
    @Column(name = "ADDRESS")
    @Excel(name = "地址", prompt = "地址")
    private String aDDRESS;
    /**
     * 联系方式
     */
    @Column(name = "CONTACT")
    @Excel(name = "联系方式", prompt = "联系方式")
    private String cONTACT;
    /**
     * 营业时间
     */
    @Column(name = "WORK_TIME")
    @Excel(name = "营业时间", prompt = "营业时间")
    private String workTime;
    /**
     * 简介
     */
    @Column(name = "INTRODUCTION")
    @Excel(name = "简介", prompt = "简介")
    private String iNTRODUCTION;
    /**
     *
     */
    @Column(name = "PID")
    @Excel(name = "", prompt = "")
    private Integer pID;
    /**
     * 路径
     */
    @Column(name = "PATH")
    @Excel(name = "路径", prompt = "路径")
    private String pATH;
    /**
     * 纬度
     */
    @Column(name = "LATITUDE")
    @Excel(name = "纬度", prompt = "纬度")
    private Double lATITUDE;
    /**
     * 经度
     */
    @Column(name = "LONGITUDE")
    @Excel(name = "经度", prompt = "经度")
    private Double lONGITUDE;
    /**
     * 城市
     */
    @Column(name = "CITY")
    @Excel(name = "城市", prompt = "城市")
    private Integer cITY;
    /**
     * 省份
     */
    @Column(name = "PROVINCE")
    @Excel(name = "省份", prompt = "省份")
    private Integer pROVINCE;
    /**
     * 是否删除：0 ：正常 1：删除
     */
    @Column(name = "IS_DELETED")
    @Excel(name = "是否删除：0 ：正常 1：删除", prompt = "是否删除：0 ：正常 1：删除")
    private Integer isDeleted;
    /**
     * 创建人
     */
    @Column(name = "CREATED_BY")
    @Excel(name = "创建人", prompt = "创建人")
    private String createdBy;
    /**
     * 最后更新人
     */
    @Column(name = "LAST_UPDATED_BY")
    @Excel(name = "最后更新人", prompt = "最后更新人")
    private String lastUpdatedBy;
    /**
     * 最后更新时间
     */
    @Column(name = "LAST_UPDATED_DATE")
    @Excel(name = "最后更新时间", prompt = "最后更新时间")
    private Date lastUpdatedDate;
    /**
     * 公司
     */
    @Column(name = "COMPANY")
    @Excel(name = "公司", prompt = "公司")
    private String cOMPANY;
    /**
     * 是否开业，0：待开业，1：已开业
     */
    @Column(name = "is_opened")
    @Excel(name = "是否开业，0：待开业，1：已开业", prompt = "是否开业，0：待开业，1：已开业")
    private Integer isOpened;
    /**
     *
     */
    @Column(name = "manager_house")
    @Excel(name = "", prompt = "")
    private Integer managerHouse;
    /**
     * 监控中心电话
     */
    @Column(name = "monitor_phone")
    @Excel(name = "监控中心电话", prompt = "监控中心电话")
    private String monitorPhone;
    /**
     * 房屋数库项目ID
     */
    @Column(name = "house_comm_id")
    @Excel(name = "房屋数库项目ID", prompt = "房屋数库项目ID")
    private Integer houseCommId;
    /**
     * 党建-发展党员URL
     */
    @Column(name = "party_dev_url")
    @Excel(name = "党建-发展党员URL", prompt = "党建-发展党员URL")
    private String partyDevUrl;
    /**
     * 社区图标
     */
    @Column(name = "party_icon_url")
    @Excel(name = "社区图标", prompt = "社区图标")
    private String partyIconUrl;
    /**
     * 项目H5 URL
     */
    @Column(name = "party_agency_url")
    @Excel(name = "项目H5 URL", prompt = "项目H5 URL")
    private String partyAgencyUrl;
    /**
     * 1开，0关
     */
    @Column(name = "party_enable")
    @Excel(name = "1开，0关", prompt = "1开，0关")
    private Integer partyEnable;


}
