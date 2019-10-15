package cn.aylives.ruoyi.admin.houseauth.domain;

import cn.aylives.ruoyi.common.annotation.Excel;

import javax.persistence.*;

import cn.aylives.ruoyi.common.core.domain.BaseEntity;
import lombok.Data;

import java.util.Date;


/**
 * 房屋认证结果对象 kd_webservice_info
 *
 * @author flaty
 * @date 2019-10-14
 */
@Data
@Table(name = "aomygod.kd_webservice_info")
public class KdWebserviceInfo extends BaseEntity {
    private static final long serialVersionUID = 1L;

    @Transient
    private Integer agencyId;

    /**
     * 主键id
     */
    @Column(name = "ID")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Excel(name = "id", prompt = "id")

    private Integer id;
    /**
     * 用户id
     */
    @Column(name = "USER_ID")
    @Excel(name = "用户id", prompt = "用户id")

    private Integer userId;
    /**
     * 身份证类型
     */
    @Column(name = "ID_CARD_TYPE")
    @Excel(name = "身份证类型", prompt = "身份证类型")

    private Integer idCardType;
    /**
     * 身份证号码
     */
    @Column(name = "ID_CARD_NO")
    @Excel(name = "身份证号码", prompt = "身份证号码")

    private String idCardNo;
    /**
     * 手机号码
     */
    @Column(name = "MOBILE_NO")
    @Excel(name = "手机号码", prompt = "手机号码")

    private String mobileNo;
    /**
     * 金蝶返回结果码：101（查询成功）201（查询失败，传输身份证数据异常）202（查询失败，传输电话数据异常）203（查询失败，身份证+电话未找到相应客户）204（查询失败，相应客房信息为空）
     */
    @Column(name = "RESULT_TYPE")
    @Excel(name = "金蝶返回结果码：101（查询成功）201（查询失败，传输身份证数据异常）202（查询失败，传输电话数据异常）203（查询失败，身份证+电话未找到相应客户）204（查询失败，相应客房信息为空）", prompt = "金蝶返回结果码：101（查询成功）201（查询失败，传输身份证数据异常）202（查询失败，传输电话数据异常）203（查询失败，身份证+电话未找到相应客户）204（查询失败，相应客房信息为空）")

    private String resultType;
    /**
     * 创建时间
     */
    @Column(name = "CREATE_TIME")
    @Excel(name = "创建时间", prompt = "创建时间")

    private Date createTime;
    /**
     * 房屋信息
     */
    @Column(name = "rooms")
    @Excel(name = "房屋信息", prompt = "房屋信息")

    private String rooms;
    /**
     * 是否可以发短信
     */
    @Column(name = "send_sms_count")
    @Excel(name = "是否可以发短信", prompt = "是否可以发短信")

    private Long sendSmsCount;


}
