package cn.aylives.ruoyi.admin.party.controller;

import cn.aylives.ruoyi.admin.core.BaseBusinessController;
import cn.aylives.ruoyi.admin.core.dept.DeptData;
import cn.aylives.ruoyi.admin.core.join.ServiceJoinHelper;
import cn.aylives.ruoyi.admin.party.domain.ActivityUser;
import cn.aylives.ruoyi.admin.party.service.IActivityService;
import cn.aylives.ruoyi.admin.party.service.IActivityUserService;
import cn.aylives.ruoyi.admin.property.service.impl.AgencyViewServiceImpl;
import cn.aylives.ruoyi.common.annotation.Log;
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
 * 信息操作处理
 *
 * @author flaty
 * @date 2019-07-10
 */
@Controller
@RequestMapping("/party/activityUser" )
public class ActivityUserController extends BaseBusinessController {
    private String prefix = "party/activityUser" ;

    @Autowired
    private IActivityUserService activityUserService;

    @Autowired
    IActivityService iActivityService;



    @Autowired
    AgencyViewServiceImpl agencyViewService;

    @RequiresPermissions("party:activityUser:view" )
    @GetMapping()
    public String activityUser() {
        return prefix + "/activityUser" ;
    }

    /**
     * 选择列表
     */
    @GetMapping("/select" )
    public String activityUserSelect() {
        return prefix + "/select" ;
    }


    /**
     * 选择列表数据
     */
    @PostMapping("/select/list" )
    @ResponseBody
    public TableDataInfo selectList(@DeptData SysDept sysDept, ActivityUser activityUser) {
        startPage();
        List<ActivityUser> list = activityUserService.selectActivityUserList(activityUser);
        return getDataTable(list);
    }


    /**
     * 查询列表
     */
    @RequiresPermissions("party:activityUser:list" )
    @PostMapping("/list" )
    @ResponseBody
    public TableDataInfo list(@DeptData SysDept sysDept, ActivityUser activityUser) {
        startPage();
        activityUser.setAgencyId(sysDept.getAgencyId());
        List<ActivityUser> list = activityUserService.selectActivityUserList(activityUser);
        ServiceJoinHelper.join(ActivityUser.class, list, agencyViewService, iActivityService);
        return getDataTable(list);
    }


    /**
     * 导出列表
     */
    @RequiresPermissions("party:activityUser:list" )
    @PostMapping("/export" )
    @ResponseBody
    public AjaxResult export(ActivityUser activityUser) {
        List<ActivityUser> list = activityUserService.selectActivityUserList(activityUser);
        ExcelUtil<ActivityUser> util = new ExcelUtil<ActivityUser>(ActivityUser.class);
        return util.exportExcel(list, "activityUser" );
    }

    /**
     * 新增
     */
    @GetMapping("/add" )
    public String add() {
        return prefix + "/add" ;
    }

    /**
     * 新增保存
     */
    @RequiresPermissions("party:activityUser:add" )
    @Log(title = "", businessType = BusinessType.INSERT)
    @PostMapping("/add" )
    @ResponseBody
    public AjaxResult addSave(ActivityUser activityUser) {
        return toAjax(activityUserService.insertActivityUser(activityUser));
    }

    /**
     * 修改
     */
    @GetMapping("/edit/{id}" )
    public String edit(@PathVariable("id" ) Integer id, ModelMap mmap) {
        ActivityUser activityUser = activityUserService.selectActivityUserById(id);
        mmap.put("activityUser", activityUser);
        return prefix + "/edit" ;
    }

    /**
     * 修改保存
     */
    @RequiresPermissions("party:activityUser:edit" )
    @Log(title = "", businessType = BusinessType.UPDATE)
    @PostMapping("/edit" )
    @ResponseBody
    public AjaxResult editSave(ActivityUser activityUser) {
        return toAjax(activityUserService.updateActivityUser(activityUser));
    }

    /**
     * 删除
     */
    @RequiresPermissions("party:activityUser:remove" )
    @Log(title = "", businessType = BusinessType.DELETE)
    @PostMapping("/remove" )
    @ResponseBody
    public AjaxResult remove(String ids) {
        return toAjax(activityUserService.deleteActivityUserByIds(ids));
    }

}
