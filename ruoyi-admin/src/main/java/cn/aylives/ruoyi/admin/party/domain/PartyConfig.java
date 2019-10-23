package cn.aylives.ruoyi.admin.party.domain;

import cn.aylives.ruoyi.common.annotation.Excel;

import javax.persistence.*;

import cn.aylives.ruoyi.common.core.domain.BaseEntity;
import lombok.Data;

import java.util.Date;


/**
 * 党建配置对象 sys_agency
 *
 * @author flaty
 * @date 2019-10-22
 */
@Data
@Table(name = "aomygod.sys_agency")
public class PartyConfig extends BaseEntity {
    private static final long serialVersionUID = 1L;


    /**
     * null
     */
    @Column(name = "ID")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Excel(name = "id", prompt = "id")
    private Integer id;


    /**
     * 名称
     */
    @Column(name = "NAME")
    @Excel(name = "名称", prompt = "名称")
    private String name;

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

}
