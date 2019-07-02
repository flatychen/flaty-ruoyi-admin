package com.ruoyi.admin.party.controller;

import com.ruoyi.admin.party.domain.ActivityUser;
import com.ruoyi.admin.party.service.IActivityUserService;
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
@RequestMapping("/party/activityUser")
public class ActivityUserController extends BaseController
{
    private String prefix = "party/activityUser";
	
	@Autowired
	private IActivityUserService activityUserService;
	
	@RequiresPermissions("party:activityUser:view")
	@GetMapping()
	public String activityUser()
	{
	    return prefix + "/activityUser";
	}
	
	/**
	 * 查询列表
	 */
	@RequiresPermissions("party:activityUser:list")
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(ActivityUser activityUser)
	{
		startPage();
        List<ActivityUser> list = activityUserService.selectActivityUserList(activityUser);
		return getDataTable(list);
	}
	
	
	/**
	 * 导出列表
	 */
	@RequiresPermissions("party:activityUser:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(ActivityUser activityUser)
    {
    	List<ActivityUser> list = activityUserService.selectActivityUserList(activityUser);
        ExcelUtil<ActivityUser> util = new ExcelUtil<ActivityUser>(ActivityUser.class);
        return util.exportExcel(list, "activityUser");
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
	@RequiresPermissions("party:activityUser:add")
	@Log(title = "", businessType = BusinessType.INSERT)
	@PostMapping("/add")
	@ResponseBody
	public AjaxResult addSave(ActivityUser activityUser)
	{		
		return toAjax(activityUserService.insertActivityUser(activityUser));
	}

	/**
	 * 修改
	 */
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable("id") Integer id, ModelMap mmap)
	{
		ActivityUser activityUser = activityUserService.selectActivityUserById(id);
		mmap.put("activityUser", activityUser);
	    return prefix + "/edit";
	}
	
	/**
	 * 修改保存
	 */
	@RequiresPermissions("party:activityUser:edit")
	@Log(title = "", businessType = BusinessType.UPDATE)
	@PostMapping("/edit")
	@ResponseBody
	public AjaxResult editSave(ActivityUser activityUser)
	{		
		return toAjax(activityUserService.updateActivityUser(activityUser));
	}
	
	/**
	 * 删除
	 */
	@RequiresPermissions("party:activityUser:remove")
	@Log(title = "", businessType = BusinessType.DELETE)
	@PostMapping( "/remove")
	@ResponseBody
	public AjaxResult remove(String ids)
	{		
		return toAjax(activityUserService.deleteActivityUserByIds(ids));
	}
	
}
