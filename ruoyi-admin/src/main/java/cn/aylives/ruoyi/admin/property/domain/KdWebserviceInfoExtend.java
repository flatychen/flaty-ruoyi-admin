package cn.aylives.ruoyi.admin.property.domain;

import lombok.Data;


/**
 * 房屋认证结果对象 kd_webservice_info
 *
 * @author flaty
 * @date 2019-10-14
 */
@Data
public class KdWebserviceInfoExtend extends KdWebserviceInfo {

    private String name;
    private String appUserName;
}
