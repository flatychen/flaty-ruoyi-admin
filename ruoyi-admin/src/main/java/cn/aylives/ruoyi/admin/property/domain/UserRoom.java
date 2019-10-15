package cn.aylives.ruoyi.admin.property.domain;

import cn.aylives.ruoyi.common.annotation.Excel;
import cn.aylives.ruoyi.common.core.domain.BaseEntity;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;


/**
 * 房屋管理对象 sys_room
 *
 * @author flaty
 * @date 2019-10-15
 */
@Data
@Table(name = "aomygod.sys_room")
public class UserRoom extends BaseEntity {
    private static final long serialVersionUID = 1L;


    /**
     * 主键id
     */
    @Column(name = "ID")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Excel(name = "id", prompt = "id")

    private Integer id;
    /**
     * 小区id
     */
    @Column(name = "AG_ID")
    @Excel(name = "小区id", prompt = "小区id")

    private Integer agId;
    /**
     * 区域id
     */
    @Column(name = "RE_ID")
    @Excel(name = "区域id", prompt = "区域id")

    private Integer reId;
    /**
     * 楼栋id
     */
    @Column(name = "BA_ID")
    @Excel(name = "楼栋id", prompt = "楼栋id")

    private Integer baId;
    /**
     * 楼层id
     */
    @Column(name = "FL_ID")
    @Excel(name = "楼层id", prompt = "楼层id")

    private Integer flId;
    /**
     * 房号
     */
    @Column(name = "ROOM_NAME")
    @Excel(name = "房号", prompt = "房号")

    private String roomName;
    /**
     * 冗余信息
     */
    @Column(name = "REDUNDANCY_INFO")
    @Excel(name = "冗余信息", prompt = "冗余信息")

    private String redundancyInfo;
    /**
     * 业主id
     */
    @Column(name = "USER_ID")
    @Excel(name = "业主id", prompt = "业主id")

    private Integer userId;
    /**
     * 朝向id
     */
    @Column(name = "OR_ID")
    @Excel(name = "朝向id", prompt = "朝向id")

    private Integer orId;
    /**
     * 房屋面积
     */
    @Column(name = "ACREAGE")
    @Excel(name = "房屋面积", prompt = "房屋面积")

    private Long acreage;
    /**
     * 房型id
     */
    @Column(name = "HT_ID")
    @Excel(name = "房型id", prompt = "房型id")

    private Integer htId;
    /**
     * 建筑类型，001房屋，002车子
     */
    @Column(name = "BUILDING_TYPE")
    @Excel(name = "建筑类型，001房屋，002车子", prompt = "建筑类型，001房屋，002车子")

    private String buildingType;
    /**
     * null
     */
    @Column(name = "JD_ROOM_ID")
    @Excel(name = "null", prompt = "null")

    private String jdRoomId;
    /**
     * 客户内码
     */
    @Column(name = "CUSTOMER_ID")
    @Excel(name = "客户内码", prompt = "客户内码")

    private String customerId;
    /**
     * 客户房屋内码
     */
    @Column(name = "CUSROOM_ID")
    @Excel(name = "客户房屋内码", prompt = "客户房屋内码")

    private String cusroomId;
    /**
     * 是否删除
     */
    @Column(name = "is_del")
    @Excel(name = "是否删除", prompt = "是否删除")

    private Long isDel;
    /**
     * null
     */
    @Column(name = "created_time")
    @Excel(name = "null", prompt = "null")

    private Date createdTime;
    /**
     * 楼栋ID
     */
    @Column(name = "tw_building_id")
    @Excel(name = "楼栋ID", prompt = "楼栋ID")

    private Long twBuildingId;
    /**
     * 项目id
     */
    @Column(name = "tw_comm_id")
    @Excel(name = "项目id", prompt = "项目id")

    private Long twCommId;
    /**
     * 客户id
     */
    @Column(name = "tw_cust_id")
    @Excel(name = "客户id", prompt = "客户id")

    private Long twCustId;
    /**
     * 房屋id
     */
    @Column(name = "tw_room_id")
    @Excel(name = "房屋id", prompt = "房屋id")

    private Long twRoomId;
    /**
     * 单元id
     */
    @Column(name = "tw_unit_id")
    @Excel(name = "单元id", prompt = "单元id")

    private Long twUnitId;
    /**
     * 房屋类型业主权限
     */
    @Column(name = "app_user_type")
    @Excel(name = "房屋类型业主权限", prompt = "房屋类型业主权限")

    private String appUserType;
    /**
     * 原始房屋ID，用于租客分配等
     */
    @Column(name = "source_room_id")
    @Excel(name = "原始房屋ID，用于租客分配等", prompt = "原始房屋ID，用于租客分配等")

    private Long sourceRoomId;


}
