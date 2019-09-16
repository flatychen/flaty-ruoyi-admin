package com.ruoyi.admin.activity.domain;

import com.ruoyi.admin.core.join.JoinField;
import com.ruoyi.admin.property.domain.Agency;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;
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
@Table(name = "aomygod.activity_user")
public class AppActivityUser extends BaseEntity {
    private static final long serialVersionUID = 1L;

	@JoinField(sourceField = "agencyId")
	private Agency agency;


    /**
     * null
     */
    @Column(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Excel(name = "id", prompt = "id")

    private Long id;
    /**
     * null
     */
    @Column(name = "agency_id")
    @Excel(name = "null", prompt = "null")

    private Long agencyId;
    /**
     * null
     */
    @Column(name = "user_id")
    @Excel(name = "null", prompt = "null")

    private Long userId;
    /**
     * null
     */
    @Column(name = "phone")
    @Excel(name = "null", prompt = "null")

    private String phone;
    /**
     * null
     */
    @Column(name = "room_id")
    @Excel(name = "null", prompt = "null")

    private Long roomId;
    /**
     * null
     */
    @Column(name = "room_name")
    @Excel(name = "null", prompt = "null")

    private String roomName;
    /**
     * null
     */
    @Column(name = "created_date")
    @Excel(name = "null", prompt = "null")

    private Date createdDate;


}
