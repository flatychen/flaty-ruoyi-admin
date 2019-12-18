package cn.aylives.ruoyi.admin.modules.activity.domain.excle;

import cn.aylives.ruoyi.admin.modules.activity.domain.AppActivityUser;
import cn.aylives.ruoyi.common.annotation.Excel;
import lombok.Data;

/**
 * @author flaty
 */
@Data
public class AppActivityUserExcle extends AppActivityUser {


    @Excel(name = "小区名称")
    private String agencyName;

    @Excel(name = "省")
    private String provinceName;
    @Excel(name = "市")
    private String cityName;
    @Excel(name = "区域")
    private String groupName;


}

