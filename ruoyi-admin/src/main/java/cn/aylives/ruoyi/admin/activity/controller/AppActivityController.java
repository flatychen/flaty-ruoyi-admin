package cn.aylives.ruoyi.admin.activity.controller;

import cn.aylives.ruoyi.admin.activity.domain.AppActivity;
import cn.aylives.ruoyi.admin.activity.service.IAppActivityService;
import cn.aylives.ruoyi.admin.core.dept.DeptData;
import cn.aylives.ruoyi.common.annotation.Log;
import cn.aylives.ruoyi.common.core.controller.BaseController;
import cn.aylives.ruoyi.common.core.domain.AjaxResult;
import cn.aylives.ruoyi.common.core.page.TableDataInfo;
import cn.aylives.ruoyi.common.enums.BusinessType;
import cn.aylives.ruoyi.common.utils.StringUtils;
import cn.aylives.ruoyi.common.utils.poi.ExcelUtil;
import cn.aylives.ruoyi.system.domain.SysDept;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * app活动Controller
 *
 * @author flaty
 * @date 2019-09-06
 */
@Controller
@RequestMapping("/activity/activity")
public class AppActivityController extends BaseController {
    private String prefix = "activity/appActivity";

    @Autowired
    private IAppActivityService activityService;

    @RequiresPermissions("activity:activity:view")
    @GetMapping()
    public String activity() {
        return prefix + "/activity";
    }

    /**
     * 选择列表
     */
    @GetMapping("/select")
    public String activitySelect() {
        return prefix + "/select";
    }


    /**
     * 选择列表数据
     */
    @PostMapping("/select/list")
    @ResponseBody
    public TableDataInfo selectList(@DeptData SysDept sysDept, AppActivity activity) {
        startPage();
        List<AppActivity> list = activityService.selectActivityList(activity);
        return getDataTable(list);
    }


    /**
     * 查询app活动列表
     */
    @RequiresPermissions("activity:activity:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(AppActivity activity) {
        startPage();
        List<AppActivity> list = activityService.selectActivityList(activity);
        return getDataTable(list);
    }


    /**
     * 导出app活动列表
     */
    @RequiresPermissions("activity:activity:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(AppActivity activity) {
        List<AppActivity> list = activityService.selectActivityList(activity);
        ExcelUtil<AppActivity> util = new ExcelUtil<AppActivity>(AppActivity.class);
        return util.exportExcel(list, "activity");
    }

    /**
     * 新增app活动
     */
    @GetMapping(value = {"/add/{id}", "/add"})
    public String add(@PathVariable(value = "id", required = false) Long id, ModelMap mmap) {
        if (StringUtils.isNotNull(id)) {
            mmap.put("activity", activityService.selectActivityById(id));
        }
        return prefix + "/add";
    }

    /**
     * 新增保存app活动
     */
    @RequiresPermissions("activity:activity:add")
    @Log(title = "app活动", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(AppActivity activity) {
        return toAjax(activityService.insertActivity(activity));
    }

    /**
     * 修改app活动
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap) {
        AppActivity activity = activityService.selectActivityById(id);
        mmap.put("activity", activity);
        return prefix + "/edit";
    }

    /**
     * 修改保存app活动
     */
    @RequiresPermissions("activity:activity:edit")
    @Log(title = "app活动", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(AppActivity activity) {
        return toAjax(activityService.updateActivity(activity));
    }

    /**
     * 删除app活动
     */
    @RequiresPermissions("activity:activity:remove")
    @Log(title = "${tableComment}", businessType = BusinessType.DELETE)
    @PostMapping("/remove")
    @ResponseBody
    public AjaxResult remove(String ids) {
        return toAjax(activityService.deleteActivityByIds(ids));
    }

}
