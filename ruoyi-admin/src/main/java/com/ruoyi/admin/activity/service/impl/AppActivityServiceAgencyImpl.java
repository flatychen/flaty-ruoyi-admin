package com.ruoyi.admin.activity.service.impl;

import com.ruoyi.admin.activity.domain.AppActivityAgency;
import com.ruoyi.admin.activity.mapper.AppActivityAgencyMapper;
import com.ruoyi.admin.activity.service.IAppActivityAgencyService;
import com.ruoyi.admin.core.impl.AbstractService;
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
