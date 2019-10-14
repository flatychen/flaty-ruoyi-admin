package cn.aylives.ruoyi.admin.property.domain;

import lombok.Data;

/**
 * 项目表 sys_agency
 *
 * @author flaty
 * @date 2019-07-05
 */
@Data
public class AgencyView  {
    private static final long serialVersionUID = 1L;

    private Integer distAgencyId;
    private String agencyName;
    private String provinceName;
    private String cityName;
    private String groupName;

}
