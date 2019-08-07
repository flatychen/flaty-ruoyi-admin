package com.ruoyi.admin.oa;

import com.ruoyi.admin.oa.service.OaService;
import com.ruoyi.common.core.controller.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author flaty
 * @date 2019-07-05
 */
@Controller
@RequestMapping("/oa/user/login")
public class OaUserLoginController extends BaseController {

	@Autowired
	OaService oaService;

    @RequestMapping()
    public String login() {

        return null;

    }



}
