package cn.aylives.ruoyi.admin.property.domain;

import com.github.dozermapper.core.Mapping;
import cn.aylives.ruoyi.common.annotation.Excel;
import cn.aylives.ruoyi.common.core.domain.BaseEntity;
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
    private Integer id;
    /**
     *
     */
    @Column(name = "AGENCY_CODE")
    private String agencyCode;
    /**
     * 组织主图
     */
    @Column(name = "IMG_URL")
    private String imgUrl;
    /**
     * 层次
     */
    @Column(name = "DEPTH")
    private String dEPTH;
    /**
     * 类型 0:小区 1：商场
     */
    @Column(name = "TYPE")
    private String tYPE;
    /**
     * 是否有效 0:有效 1:无效
     */
    @Column(name = "IS_VERIFI")
    private Integer isVerifi;
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
    private String aDDRESS;
    /**
     * 联系方式
     */
    @Column(name = "CONTACT")
    private String cONTACT;
    /**
     * 营业时间
     */
    @Column(name = "WORK_TIME")
    private String workTime;
    /**
     * 简介
     */
    @Column(name = "INTRODUCTION")
    private String iNTRODUCTION;
    /**
     *
     */
    @Column(name = "PID")
    private Integer pID;
    /**
     * 路径
     */
    @Column(name = "PATH")
    private String pATH;
    /**
     * 纬度
     */
    @Column(name = "LATITUDE")
    private Double lATITUDE;
    /**
     * 经度
     */
    @Column(name = "LONGITUDE")
    private Double lONGITUDE;
    /**
     * 城市
     */
    @Column(name = "CITY")
    private Integer cITY;
    /**
     * 省份
     */
    @Column(name = "PROVINCE")
    private Integer pROVINCE;
    /**
     * 是否删除：0 ：正常 1：删除
     */
    @Column(name = "IS_DELETED")
    private Integer isDeleted;
    /**
     * 创建人
     */
    @Column(name = "CREATED_BY")
    private String createdBy;
    /**
     * 最后更新人
     */
    @Column(name = "LAST_UPDATED_BY")
    private String lastUpdatedBy;
    /**
     * 最后更新时间
     */
    @Column(name = "LAST_UPDATED_DATE")
    private Date lastUpdatedDate;
    /**
     * 公司
     */
    @Column(name = "COMPANY")
    private String cOMPANY;
    /**
     * 是否开业，0：待开业，1：已开业
     */
    @Column(name = "is_opened")
    private Integer isOpened;
    /**
     *
     */
    @Column(name = "manager_house")
    private Integer managerHouse;
    /**
     * 监控中心电话
     */
    @Column(name = "monitor_phone")
    private String monitorPhone;
    /**
     * 房屋数库项目ID
     */
    @Column(name = "house_comm_id")
    private Integer houseCommId;
    /**
     * 党建-发展党员URL
     */
    @Column(name = "party_dev_url")
    private String partyDevUrl;
    /**
     * 社区图标
     */
    @Column(name = "party_icon_url")
    private String partyIconUrl;
    /**
     * 项目H5 URL
     */
    @Mapping
    @Column(name = "party_agency_url")
    private String partyAgencyUrl;
    /**
     * 1开，0关
     */
    @Column(name = "party_enable")
    private Integer partyEnable;

}
