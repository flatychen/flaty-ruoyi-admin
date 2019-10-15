package cn.aylives.ruoyi.admin.party.domain.excle;

import cn.aylives.ruoyi.admin.party.domain.Transfer;
import cn.aylives.ruoyi.common.annotation.Excel;
import lombok.Data;

/**
 * @author flaty
 */
@Data
public class TransferExcle extends Transfer {


    @Excel(name = "小区名称")
    private String agencyName;

    @Excel(name = "省")
    private String provinceName;
    @Excel(name = "市")
    private String cityName;
    @Excel(name = "区域")
    private String groupName;
}

