package cn.aylives.ruoyi.admin.activity.service.impl;

import cn.aylives.ruoyi.admin.activity.domain.AppActivityAgency;
import cn.aylives.ruoyi.admin.activity.mapper.AppActivityAgencyMapper;
import cn.aylives.ruoyi.admin.activity.service.IAppActivityAgencyService;
import cn.aylives.ruoyi.admin.core.impl.AbstractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * app活动Service业务层处理
 *
 * @author flaty
 * @date 2019-09-06
 */
@Service
public class AppActivityServiceAgencyImpl extends AbstractService<AppActivityAgency> implements IAppActivityAgencyService {

    @Autowired
    private AppActivityAgencyMapper appActivityAgencyMapper;


}
