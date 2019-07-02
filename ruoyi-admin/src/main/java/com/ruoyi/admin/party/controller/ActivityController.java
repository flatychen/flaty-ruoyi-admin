package com.ruoyi.admin.party.controller;

import com.ruoyi.admin.party.domain.Activity;
import com.ruoyi.admin.party.service.IActivityService;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.utils.poi.ExcelUtil;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 *  信息操作处理
 * 
 * @author flaty
 * @date 2019-07-02
 */
@Controller
@RequestMapping("/party/activity")
public class ActivityController extends BaseController
{
    private String prefix = "party/activity";
	
	@Autowired
	private IActivityService activityService;
	
	@RequiresPermissions("party:activity:view")
	@GetMapping()
	public String activity()
	{
	    return prefix + "/activity";
	}
	
	/**
	 * 查询列表
	 */
	@RequiresPermissions("party:activity:list")
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(Activity activity)
	{
		startPage();
        List<Activity> list = activityService.selectActivityList(activity);
		return getDataTable(list);
	}
	
	
	/**
	 * 导出列表
	 */
	@RequiresPermissions("party:activity:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Activity activity)
    {
    	List<Activity> list = activityService.selectActivityList(activity);
        ExcelUtil<Activity> util = new ExcelUtil<Activity>(Activity.class);
        return util.exportExcel(list, "activity");
    }
	
	/**
	 * 新增
	 */
	@GetMapping("/add")
	public String add()
	{
	    return prefix + "/add";
	}
	
	/**
	 * 新增保存
	 */
	@RequiresPermissions("party:activity:add")
	@Log(title = "", businessType = BusinessType.INSERT)
	@PostMapping("/add")
	@ResponseBody
	public AjaxResult addSave(Activity activity)
	{		
		return toAjax(activityService.insertActivity(activity));
	}

	/**
	 * 修改
	 */
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable("id") Integer id, ModelMap mmap)
	{
		Activity activity = activityService.selectActivityById(id);
		mmap.put("activity", activity);
	    return prefix + "/edit";
	}
	
	/**
	 * 修改保存
	 */
	@RequiresPermissions("party:activity:edit")
	@Log(title = "", businessType = BusinessType.UPDATE)
	@PostMapping("/edit")
	@ResponseBody
	public AjaxResult editSave(Activity activity)
	{		
		return toAjax(activityService.updateActivity(activity));
	}
	
	/**
	 * 删除
	 */
	@RequiresPermissions("party:activity:remove")
	@Log(title = "", businessType = BusinessType.DELETE)
	@PostMapping( "/remove")
	@ResponseBody
	public AjaxResult remove(String ids)
	{		
		return toAjax(activityService.deleteActivityByIds(ids));
	}
	
}
