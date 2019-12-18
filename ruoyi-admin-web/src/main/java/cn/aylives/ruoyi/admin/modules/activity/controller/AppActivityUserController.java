package cn.aylives.ruoyi.admin.modules.activity.controller;

import cn.aylives.ruoyi.admin.modules.activity.domain.AppActivityUser;
import cn.aylives.ruoyi.admin.modules.activity.domain.excle.AppActivityUserExcle;
import cn.aylives.ruoyi.admin.modules.activity.service.IAppActivityService;
import cn.aylives.ruoyi.admin.modules.activity.service.IAppActivityUserService;
import cn.aylives.ruoyi.common.core.controller.BaseController;
import cn.aylives.ruoyi.common.core.domain.AjaxResult;
import cn.aylives.ruoyi.common.core.page.TableDataInfo;
import cn.aylives.ruoyi.common.utils.poi.ExcelUtil;
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
    IAppActivityService iAppActivityService;


    @RequiresPermissions("activity:activity:list")
    @GetMapping("/{activityId}")
    public String appActivityUser(@PathVariable Long activityId, ModelMap mmap) {
        mmap.put("activity", iAppActivityService.selectActivityById(activityId));
        return prefix + "/AppActivityUser";
    }


    /**
     * 查询app活动用户列表列表
     */
    @RequiresPermissions("activity:activity:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(AppActivityUser appActivityUser) {
        startPage();
        List<AppActivityUser> list = appActivityUserService.selectAppActivityUserList(appActivityUser);
        return getDataTable(list);
    }


    /**
     * 导出app活动用户列表列表
     */
//    @RequiresPermissions("activity:AppActivityUser:list")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(AppActivityUser appActivityUser) {
        List<AppActivityUser> list = appActivityUserService.selectAppActivityUserList(appActivityUser);
        List<AppActivityUserExcle> target = orikaMapperFacade.mapAsList(list, AppActivityUserExcle.class);
        ExcelUtil<AppActivityUserExcle> util = new ExcelUtil<AppActivityUserExcle>(AppActivityUserExcle.class);
        return util.exportExcel(target, "AppActivityUser");
    }




}
