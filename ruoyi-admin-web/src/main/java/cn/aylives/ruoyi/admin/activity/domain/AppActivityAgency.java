package cn.aylives.ruoyi.admin.activity.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * app活动对象 activity
 *
 * @author flaty
 * @date 2019-09-06
 */
@Data
@Table(name = "aoyuejia_h5.activity_agency")
public class AppActivityAgency  {
    private static final long serialVersionUID = 1L;

    @Column(name = "activity_id")
    @Id
    private Long activityId;
    /**
     * 背景图
     */
    @Column(name = "agency_id")
    @Id
    private Long agencyId;


}
