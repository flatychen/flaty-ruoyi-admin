package cn.aylives.ruoyi.admin.activity.domain.excle;

import cn.aylives.ruoyi.admin.activity.domain.AppActivityUser;
import cn.aylives.ruoyi.common.annotation.Excel;
import lombok.Data;

/**
 * @author flaty
 */
@Data
public class AppActivityUserExcle extends AppActivityUser {


    @Excel(name = "小区名称")
    private String agencyName;

}

