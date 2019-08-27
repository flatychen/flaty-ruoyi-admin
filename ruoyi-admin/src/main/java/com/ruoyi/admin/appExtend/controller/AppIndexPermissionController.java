package com.ruoyi.admin.appExtend.controller;

import com.ruoyi.admin.appExtend.domain.AppIndexPermission;
import com.ruoyi.admin.appExtend.service.IAppIndexButtonService;
import com.ruoyi.admin.appExtend.service.IAppIndexPermissionService;
import com.ruoyi.admin.core.dept.DeptData;
import com.ruoyi.admin.core.join.ServiceJoinHelper;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.utils.StringUtils;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.system.domain.SysDept;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;
/**
 * 权限分组Controller
 *
 * @author flaty
 * @date 2019-08-27
 */
@Controller
@RequestMapping("/appExtend/permission")
public class AppIndexPermissionController extends BaseController
{
	private String prefix = "appExtend/permission";

	@Autowired
	private IAppIndexPermissionService appIndexPermissionService;
	@Autowired
	IAppIndexButtonService iAppIndexButtonService;


	@RequiresPermissions("appExtend:permission:view")
	@GetMapping()
	public String appIndexPermission()
	{
	    return prefix + "/permission";
	}

	/**
	 * 选择列表
	 */
	@GetMapping("/select")
	public String appIndexPermissionSelect()
	{
		return prefix + "/select";
	}


	/**
	 * 选择列表数据
	 */
	@PostMapping("/select/list")
	@ResponseBody
	public TableDataInfo selectList(@DeptData SysDept sysDept,AppIndexPermission appIndexPermission)
	{
		startPage();
		List<AppIndexPermission> list = appIndexPermissionService.selectAppIndexPermissionList(appIndexPermission);
		return getDataTable(list);
	}


	/**
	 * 查询权限分组列表
	 */
	@RequiresPermissions("appExtend:permission:list")
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(AppIndexPermission appIndexPermission)
	{
		startPage();
		List<AppIndexPermission> list = appIndexPermissionService.selectAppIndexPermissionList(appIndexPermission);

		ServiceJoinHelper.join(AppIndexPermission.class, list, iAppIndexButtonService);

		return getDataTable(list);
	}



	/**
	 * 导出权限分组列表
	 */
	@RequiresPermissions("appExtend:permission:export")
	@PostMapping("/export")
	@ResponseBody
	public AjaxResult export(AppIndexPermission appIndexPermission)
	{
		List<AppIndexPermission> list = appIndexPermissionService.selectAppIndexPermissionList(appIndexPermission);
		ExcelUtil<AppIndexPermission> util = new ExcelUtil<AppIndexPermission>(AppIndexPermission.class);
		return util.exportExcel(list, "permission");
	}

	/**
	 * 新增权限分组
	 */
	@GetMapping(value = { "/add/{id}", "/add" })
	public String add(@PathVariable(value = "id", required = false) Long id, ModelMap mmap)
	{
		if (StringUtils.isNotNull(id))
		{
			mmap.put("appIndexPermission", appIndexPermissionService.selectAppIndexPermissionById(id));
		}
		return prefix + "/add";
	}

	/**
	 * 新增保存权限分组
	 */
	@RequiresPermissions("appExtend:permission:add")
	@Log(title = "权限分组", businessType = BusinessType.INSERT)
	@PostMapping("/add")
	@ResponseBody
	public AjaxResult addSave(AppIndexPermission appIndexPermission)
	{
		return toAjax(appIndexPermissionService.insertAppIndexPermission(appIndexPermission));
	}

	/**
	 * 修改权限分组
	 */
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable("id") Long id, ModelMap mmap)
	{
		AppIndexPermission appIndexPermission = appIndexPermissionService.selectAppIndexPermissionById(id);
		mmap.put("appIndexPermission", appIndexPermission);
		mmap.put("appIndexButton", iAppIndexButtonService.selectAppIndexButtonById(appIndexPermission.getButtonId()));
		return prefix + "/edit";
	}

	/**
	 * 修改保存权限分组
	 */
	@RequiresPermissions("appExtend:permission:edit")
	@Log(title = "权限分组", businessType = BusinessType.UPDATE)
	@PostMapping("/edit")
	@ResponseBody
	public AjaxResult editSave(AppIndexPermission appIndexPermission)
	{
		return toAjax(appIndexPermissionService.updateAppIndexPermission(appIndexPermission));
	}
	
	/**
	 * 删除权限分组
	 */
	@RequiresPermissions("appExtend:permission:remove")
	@Log(title = "${tableComment}", businessType = BusinessType.DELETE)
	@PostMapping( "/remove")
	@ResponseBody
	public AjaxResult remove(String ids)
	{		
		return toAjax(appIndexPermissionService.deleteAppIndexPermissionByIds(ids));
	}
	
}
