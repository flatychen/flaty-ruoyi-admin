package cn.aylives.ruoyi.admin.property.domain;

import cn.aylives.ruoyi.common.annotation.Excel;
import cn.aylives.ruoyi.common.core.domain.BaseEntity;
import lombok.Data;

import javax.persistence.*;


/**
 * AppUser对象 sys_app_user
 *
 * @author flaty
 * @date 2019-10-15
 */
@Data
@Table(name = "aomygod.sys_app_user")
public class AppUser extends BaseEntity {
    private static final long serialVersionUID = 1L;


    /**
     * null
     */
    @Column(name = "USER_ID")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Excel(name = "id", prompt = "id")
    private Integer userId;
    /**
     * null
     */
    @Column(name = "USERNAME")
    @Excel(name = "null", prompt = "null")

    private String username;
    /**
     * null
     */
    @Column(name = "PASSWORD")
    @Excel(name = "null", prompt = "null")

    private String password;
    /**
     * null
     */
    @Column(name = "NAME")
    @Excel(name = "null", prompt = "null")

    private String name;
    /**
     * null
     */
    @Column(name = "RIGHTS")
    @Excel(name = "null", prompt = "null")

    private String rights;
    /**
     * null
     */
    @Column(name = "ROLE_ID")
    @Excel(name = "null", prompt = "null")

    private String roleId;
    /**
     * null
     */
    @Column(name = "LAST_LOGIN")
    @Excel(name = "null", prompt = "null")

    private String lastLogin;
    /**
     * null
     */
    @Column(name = "IP")
    @Excel(name = "null", prompt = "null")

    private String ip;
    /**
     * null
     */
    @Column(name = "STATUS")
    @Excel(name = "null", prompt = "null")

    private String status;
    /**
     * null
     */
    @Column(name = "BZ")
    @Excel(name = "null", prompt = "null")

    private String bz;
    /**
     * null
     */
    @Column(name = "PHONE")
    @Excel(name = "null", prompt = "null")

    private String phone;
    /**
     * null
     */
    @Column(name = "SFID")
    @Excel(name = "null", prompt = "null")

    private String sfid;
    /**
     * null
     */
    @Column(name = "START_TIME")
    @Excel(name = "null", prompt = "null")

    private String startTime;
    /**
     * null
     */
    @Column(name = "END_TIME")
    @Excel(name = "null", prompt = "null")

    private String endTime;
    /**
     * null
     */
    @Column(name = "YEARS")
    @Excel(name = "null", prompt = "null")

    private Integer years;
    /**
     * null
     */
    @Column(name = "NUMBER")
    @Excel(name = "null", prompt = "null")

    private String number;
    /**
     * null
     */
    @Column(name = "EMAIL")
    @Excel(name = "null", prompt = "null")

    private String email;
    /**
     * null
     */
    @Column(name = "SOURCE")
    @Excel(name = "null", prompt = "null")

    private String source;
    /**
     * null
     */
    @Column(name = "BIRTHDAY")
    @Excel(name = "null", prompt = "null")

    private String birthday;
    /**
     * 性别
     */
    @Column(name = "SEX")
    @Excel(name = "性别", prompt = "性别")

    private Integer sex;
    /**
     * 头像
     */
    @Column(name = "AVATAR")
    @Excel(name = "头像", prompt = "头像")

    private String avatar;
    /**
     * 系统版本号
     */
    @Column(name = "VERSION")
    @Excel(name = "系统版本号", prompt = "系统版本号")

    private String version;
    /**
     * 版本号
     */
    @Column(name = "APP_VERSION")
    @Excel(name = "版本号", prompt = "版本号")

    private String appVersion;
    /**
     * 设备号
     */
    @Column(name = "DEVICE_ID")
    @Excel(name = "设备号", prompt = "设备号")

    private String deviceId;
    /**
     * 昵称
     */
    @Column(name = "NICKNAME")
    @Excel(name = "昵称", prompt = "昵称")

    private String nickname;
    /**
     * null
     */
    @Column(name = "TAG")
    @Excel(name = "null", prompt = "null")

    private String tag;
    /**
     * 注册小区
     */
    @Column(name = "REG_AGENCY_ID")
    @Excel(name = "注册小区", prompt = "注册小区")

    private Long regAgencyId;
    /**
     * 登录次数
     */
    @Column(name = "login_count")
    @Excel(name = "登录次数", prompt = "登录次数")

    private Long loginCount;
    /**
     * 来源
     */
    @Column(name = "origin")
    @Excel(name = "来源", prompt = "来源")

    private String origin;


}
