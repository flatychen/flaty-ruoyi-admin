package cn.aylives.ruoyi.admin.party.controller;

import cn.aylives.ruoyi.admin.core.dept.DeptData;
import cn.aylives.ruoyi.admin.core.join.ServiceJoinHelper;
import cn.aylives.ruoyi.admin.party.domain.Activity;
import cn.aylives.ruoyi.admin.party.service.IActivityService;
import cn.aylives.ruoyi.admin.property.service.impl.AgencyViewServiceImpl;
import cn.aylives.ruoyi.common.annotation.Log;
import cn.aylives.ruoyi.common.core.controller.BaseController;
import cn.aylives.ruoyi.common.core.domain.AjaxResult;
import cn.aylives.ruoyi.common.core.page.TableDataInfo;
import cn.aylives.ruoyi.common.enums.BusinessType;
import cn.aylives.ruoyi.common.utils.poi.ExcelUtil;
import cn.aylives.ruoyi.system.domain.SysDept;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 党建服务 信息操作处理
 *
 * @author flaty
 * @date 2019-07-10
 */
@Controller
@RequestMapping("/party/activity")
public class ActivityController extends BaseController {
    private String prefix = "party/activity";

    @Autowired
    private IActivityService activityService;


    @Autowired
    AgencyViewServiceImpl agencyViewService;


    @RequiresPermissions("party:activity:view")
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
    public TableDataInfo selectList(@DeptData SysDept sysDept, Activity activity) {
        startPage();
        List<Activity> list = activityService.selectActivityList(activity);
        return getDataTable(list);
    }


    /**
     * 查询党建服务列表
     */
    @RequiresPermissions("party:activity:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Activity activity) {
        startPage();
        List<Activity> list = activityService.selectActivityList(activity);
        ServiceJoinHelper.join(Activity.class, list, agencyViewService);
        return getDataTable(list);
    }


    /**
     * 导出党建服务列表
     */
    @RequiresPermissions("party:activity:list")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Activity activity) {
        List<Activity> list = activityService.selectActivityList(activity);
        ExcelUtil<Activity> util = new ExcelUtil<Activity>(Activity.class);
        return util.exportExcel(list, "activity");
    }

    /**
     * 新增党建服务
     */
    @GetMapping("/add")
    public String add() {
        return prefix + "/add";
    }

    /**
     * 新增保存党建服务
     */
    @RequiresPermissions("party:activity:add")
    @Log(title = "党建服务", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(Activity activity) {
        return toAjax(activityService.insertActivity(activity));
    }

    /**
     * 修改党建服务
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Integer id, ModelMap mmap) {
        Activity activity = activityService.selectActivityById(id);
        mmap.put("activity", activity);
        return prefix + "/edit";
    }

    /**
     * 修改保存党建服务
     */
    @RequiresPermissions("party:activity:edit")
    @Log(title = "党建服务", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Activity activity) {
        return toAjax(activityService.updateActivity(activity));
    }

    /**
     * 删除党建服务
     */
    @RequiresPermissions("party:activity:remove")
    @Log(title = "党建服务", businessType = BusinessType.DELETE)
    @PostMapping("/remove")
    @ResponseBody
    public AjaxResult remove(String ids) {
        return toAjax(activityService.deleteActivityByIds(ids));
    }

}
