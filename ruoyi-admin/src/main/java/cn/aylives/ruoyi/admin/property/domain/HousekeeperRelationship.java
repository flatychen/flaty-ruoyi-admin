package cn.aylives.ruoyi.admin.property.domain;

import cn.aylives.ruoyi.common.annotation.Excel;
import cn.aylives.ruoyi.common.core.domain.BaseEntity;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;


/**
 * 管家绑定对象 housekeeper_relationship
 *
 * @author flaty
 * @date 2019-10-15
 */
@Data
@Table(name = "aomygod.housekeeper_relationship")
public class HousekeeperRelationship extends BaseEntity {
    private static final long serialVersionUID = 1L;


    /**
     * null
     */
    @Column(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Excel(name = "id", prompt = "id")

    private Integer id;
    /**
     * 区域表的ID
     */
    @Column(name = "agency_id")
    @Excel(name = "区域表的ID", prompt = "区域表的ID")

    private Integer agencyId;
    /**
     * 房屋ID
     */
    @Column(name = "room_id")
    @Excel(name = "房屋ID", prompt = "房屋ID")

    private Long roomId;
    /**
     * 员工表的ID
     */
    @Column(name = "sys_user_id")
    @Excel(name = "员工表的ID", prompt = "员工表的ID")

    private Integer sysUserId;
    /**
     * 业主表的ID
     */
    @Column(name = "app_user_id")
    @Excel(name = "业主表的ID", prompt = "业主表的ID")

    private Integer appUserId;
    /**
     * 业主联系方式
     */
    @Column(name = "app_user_phone")
    @Excel(name = "业主联系方式", prompt = "业主联系方式")

    private String appUserPhone;
    /**
     * 员工联系方式
     */
    @Column(name = "sys_user_phone")
    @Excel(name = "员工联系方式", prompt = "员工联系方式")

    private String sysUserPhone;
    /**
     * 创建时间
     */
    @Column(name = "created_date")
    @Excel(name = "创建时间", prompt = "创建时间")

    private Date createdDate;
    /**
     * 更新时间
     */
    @Column(name = "updated_date")
    @Excel(name = "更新时间", prompt = "更新时间")
    private Date updatedDate;


}
