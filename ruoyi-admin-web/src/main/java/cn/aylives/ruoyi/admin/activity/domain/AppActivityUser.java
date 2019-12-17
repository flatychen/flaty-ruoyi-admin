package cn.aylives.ruoyi.admin.activity.domain;

import cn.aylives.ruoyi.common.annotation.Excel;
import cn.aylives.ruoyi.common.core.domain.BaseEntity;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;


/**
 * app活动用户列表对象 activity_user
 *
 * @author flaty
 * @date 2019-09-06
 */
@Data
@Table(name = "aoyuejia_h5.activity_user")
public class AppActivityUser extends BaseEntity {
    private static final long serialVersionUID = 1L;


    @Column(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


/*    @Column(name = "agency_id")
    @Excel(name = "项目id", prompt = "id")
    private Integer agencyId;*/

    /**
     * null
     */
    @Column(name = "user_id")
    @Excel(name = "用户id")
    private Integer userId;


    @Column(name = "activity_id")
    private Integer activityId;
    /**
     * null
     */
    @Column(name = "phone")
    @Excel(name = "手机号")
    private String phone;
    /**
     * null
     */
    @Column(name = "room_id")
    @Excel(name = "房屋id")
    private Integer roomId;
    /**
     * null
     */
    @Column(name = "room_name")
    @Excel(name = "房屋地址")
    private String roomName;
    /**
     * null
     */
    @Column(name = "created_date")
    @Excel(name = "参与时间",dateFormat = "yyyy-MM-dd")
    private Date createdDate;


}
