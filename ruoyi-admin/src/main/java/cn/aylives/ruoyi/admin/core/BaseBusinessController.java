package cn.aylives.ruoyi.admin.core;

import cn.aylives.ruoyi.admin.property.service.ISysAgencyService;
import cn.aylives.ruoyi.common.core.controller.BaseController;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 基础业务
 */
public  abstract  class BaseBusinessController extends BaseController {

    @Autowired
    protected ISysAgencyService iSysAgencyService;

}

