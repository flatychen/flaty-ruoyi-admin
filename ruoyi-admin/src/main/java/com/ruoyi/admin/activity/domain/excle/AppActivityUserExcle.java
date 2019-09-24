package com.ruoyi.admin.activity.domain.excle;

import com.ruoyi.admin.activity.domain.AppActivityUser;
import com.ruoyi.common.annotation.Excel;
import lombok.Data;

/**
 * @author flaty
 */
@Data
public class AppActivityUserExcle extends AppActivityUser {


    @Excel(name = "小区名称")
    private String agencyName;

}

