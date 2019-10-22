package cn.aylives.ruoyi.admin.property.domain;

import cn.aylives.ruoyi.common.annotation.Excel;

import javax.persistence.*;

import cn.aylives.ruoyi.common.core.domain.BaseEntity;
import lombok.Data;

import java.util.Date;


/**
 * 项目对象 sys_agency
 *
 * @author flaty
 * @date 2019-10-22
 */
@Data
@Table(name = "aomygod.sys_agency")
public class SysAgency extends BaseEntity {
    private static final long serialVersionUID = 1L;


    /**
     * id
     */
    @Column(name = "ID")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Excel(name = "id", prompt = "id")
    private Integer id;
    /**
     * 项目编码
     */
    @Column(name = "AGENCY_CODE")
    @Excel(name = "项目编码", prompt = "agencyCode")
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
    private String depth;

    /**
     * 类型
     */
    @Column(name = "TYPE")
    @Excel(name = "类型", prompt = "类型")
    private String type;

    /**
     * 是否有效
     */
    @Column(name = "IS_VERIFI")
    @Excel(name = "是否有效", prompt = "是否有效")
    private Long isVerifi;

    /**
     * 名称
     */
    @Column(name = "NAME")
    @Excel(name = "名称", prompt = "名称")
    private String name;

    /**
     * 地址
     */
    @Column(name = "ADDRESS")
    @Excel(name = "地址", prompt = "地址")
    private String address;

    /**
     * 联系方式
     */
    @Column(name = "CONTACT")
    @Excel(name = "联系方式", prompt = "联系方式")
    private String contact;

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
    private String introduction;

    /**
     * pid
     */
    @Column(name = "PID")
    private Long pid;
    /**
     * 路径
     */
    @Column(name = "PATH")
    @Excel(name = "路径", prompt = "路径")
    private String path;

    /**
     * 纬度
     */
    @Column(name = "LATITUDE")
    @Excel(name = "纬度", prompt = "纬度")
    private Long latitude;

    /**
     * 经度
     */
    @Column(name = "LONGITUDE")
    @Excel(name = "经度", prompt = "经度")
    private Long longitude;

    /**
     * 城市
     */
    @Column(name = "CITY")
    @Excel(name = "城市", prompt = "城市")
    private Long city;

    /**
     * 省份
     */
    @Column(name = "PROVINCE")
    @Excel(name = "省份", prompt = "省份")
    private Long province;

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
     * 创建时间
     */
    @Column(name = "CREATED_DATE")
    @Excel(name = "创建时间", prompt = "创建时间")
    private Date createdDate;

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
    private String company;

    /**
     * 是否开业
     */
    @Column(name = "is_opened")
    @Excel(name = "是否开业", prompt = "是否开业")
    private Integer isOpened;

    /**
     * 管理房屋
     */
    @Column(name = "manager_house")
    @Excel(name = "管理房屋", prompt = "管理房屋")
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
    private Long houseCommId;

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
    private Long partyEnable;

    /**
     * 更新时间
     */
    @Column(name = "updated_date")
    @Excel(name = "更新时间", prompt = "更新时间")
    private Date updatedDate;


}
