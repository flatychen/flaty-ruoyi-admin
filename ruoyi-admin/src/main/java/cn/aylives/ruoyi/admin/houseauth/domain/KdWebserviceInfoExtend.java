package cn.aylives.ruoyi.admin.houseauth.domain;

import cn.aylives.ruoyi.common.annotation.Excel;
import cn.aylives.ruoyi.common.core.domain.BaseEntity;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;


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
