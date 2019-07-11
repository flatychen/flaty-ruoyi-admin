package com.ruoyi.admin.core;

import com.ruoyi.admin.property.service.ISysAgencyService;
import com.ruoyi.common.core.controller.BaseController;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 基础业务
 */
public  abstract  class BaseBusinessController extends BaseController {

    @Autowired
    protected ISysAgencyService iSysAgencyService;

}

