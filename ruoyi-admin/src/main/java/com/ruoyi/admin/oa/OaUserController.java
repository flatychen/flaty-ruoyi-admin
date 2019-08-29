package com.ruoyi.admin.oa;

import com.ruoyi.admin.oa.service.OaService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @author flaty
 * @date 2019-07-05
 */
@Controller
@RequestMapping("/oa/user")
public class OaUserController extends BaseController {
    private String prefix = "oa";

	@Autowired
	OaService oaService;

    @RequiresPermissions("oa:user:view")
    @GetMapping()
    public String view() {
        return prefix + "/user";
    }


    /**
     * 查询用户列表
     */
//    @RequiresPermissions("oa:user:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(@RequestParam(value = "userName") String  userName) {
        return getDataTable(oaService.queryUser(userName));
    }


    /**
     * 添加用户
     */
    @RequestMapping("/add")
//    @RequiresPermissions("oa:user:add")
    @ResponseBody
    public Object edit(@RequestParam("userName") String  userName) {
        if (StringUtils.isBlank(userName)) {
            throw new IllegalArgumentException("userName不能为空");
        }
        oaService.saveUserAndDept(oaService.queryUser(userName));
        return  AjaxResult.success();
    }


}
