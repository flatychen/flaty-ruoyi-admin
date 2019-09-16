package com.ruoyi.admin.activity.controller;

import com.ruoyi.admin.activity.domain.AppActivityUser;
import com.ruoyi.admin.activity.service.IAppActivityUserService;
import com.ruoyi.admin.core.join.ServiceJoinHelper;
import com.ruoyi.admin.property.service.ISysAgencyService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.utils.poi.ExcelUtil;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * app活动用户列表Controller
 *
 * @author flaty
 * @date 2019-09-06
 */
@Controller
@RequestMapping("/activity/AppActivityUser")
public class AppActivityUserController extends BaseController {
    private String prefix = "activity/AppActivityUser";

    @Autowired
    private IAppActivityUserService appActivityUserService;

    @Autowired
    ISysAgencyService iSysAgencyService;

    @RequiresPermissions("activity:AppActivityUser:view")
    @GetMapping("/{activityId}")
    public String appActivityUser(@PathVariable String activityId, ModelMap mmap) {
        mmap.put("activityId", activityId);
        return prefix + "/AppActivityUser";
    }


    /**
     * 查询app活动用户列表列表
     */
    @RequiresPermissions("activity:AppActivityUser:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(AppActivityUser appActivityUser) {
        startPage();
        List<AppActivityUser> list = appActivityUserService.selectAppActivityUserList(appActivityUser);
        ServiceJoinHelper.join(AppActivityUser.class,list,iSysAgencyService);
        return getDataTable(list);
    }


    /**
     * 导出app活动用户列表列表
     */
    @RequiresPermissions("activity:AppActivityUser:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(AppActivityUser appActivityUser) {
        List<AppActivityUser> list = appActivityUserService.selectAppActivityUserList(appActivityUser);
        ExcelUtil<AppActivityUser> util = new ExcelUtil<AppActivityUser>(AppActivityUser.class);
        return util.exportExcel(list, "AppActivityUser");
    }


}
