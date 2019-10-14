package cn.aylives.ruoyi.admin.party.domain.excle;

import cn.aylives.ruoyi.admin.party.domain.Checkin;
import cn.aylives.ruoyi.common.annotation.Excel;
import lombok.Data;

/**
 * created by flaty
 * on 2019-10-14
 */
@Data
public class CheckinExcle extends Checkin {


    @Excel(name = "小区名称")
    private String agencyName;

    @Excel(name = "省")
    private String provinceName;
    @Excel(name = "市")
    private String cityName;
    @Excel(name = "区域")
    private String groupName;
}

