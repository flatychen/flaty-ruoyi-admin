package cn.aylives.ruoyi.admin.appExtend.controller;

import java.util.List;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import cn.aylives.ruoyi.common.annotation.Log;
import cn.aylives.ruoyi.common.enums.BusinessType;
import cn.aylives.ruoyi.common.utils.StringUtils;
import cn.aylives.ruoyi.admin.appExtend.domain.AppVersion;
import cn.aylives.ruoyi.admin.appExtend.service.IAppVersionService;
import cn.aylives.ruoyi.common.core.controller.BaseController;
import cn.aylives.ruoyi.common.core.page.TableDataInfo;
import cn.aylives.ruoyi.common.core.domain.AjaxResult;
import cn.aylives.ruoyi.common.utils.poi.ExcelUtil;
import cn.aylives.ruoyi.system.domain.SysDept;
import cn.aylives.ruoyi.admin.core.dept.DeptData;
/**
 * AppversionController
 *
 * @author flaty
 * @date 2019-10-11
 */
@Controller
@RequestMapping("/appExtend/Appversion")
public class AppVersionController extends BaseController
{
	private String prefix = "appExtend/Appversion";

	@Autowired
	private IAppVersionService appVersionService;

	@RequiresPermissions("appExtend:Appversion:view")
	@GetMapping()
	public String appVersion()
	{
	    return prefix + "/Appversion";
	}

	/**
	 * 选择列表
	 */
	@GetMapping("/select")
	public String appVersionSelect()
	{
		return prefix + "/select";
	}


	/**
	 * 选择列表数据
	 */
	@PostMapping("/select/list")
	@ResponseBody
	public TableDataInfo selectList(@DeptData SysDept sysDept,AppVersion appVersion)
	{
		startPage();
		List<AppVersion> list = appVersionService.selectAppVersionList(appVersion);
		return getDataTable(list);
	}


	/**
	 * 查询Appversion列表
	 */
	@RequiresPermissions("appExtend:Appversion:list")
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(AppVersion appVersion)
	{
		startPage();
		List<AppVersion> list = appVersionService.selectAppVersionList(appVersion);
		return getDataTable(list);
	}



	/**
	 * 导出Appversion列表
	 */
	@RequiresPermissions("appExtend:Appversion:export")
	@PostMapping("/export")
	@ResponseBody
	public AjaxResult export(AppVersion appVersion)
	{
		List<AppVersion> list = appVersionService.selectAppVersionList(appVersion);
		ExcelUtil<AppVersion> util = new ExcelUtil<AppVersion>(AppVersion.class);
		return util.exportExcel(list, "Appversion");
	}

	/**
	 * 新增Appversion
	 */
	@GetMapping(value = { "/add/{id}", "/add" })
	public String add(@PathVariable(value = "id", required = false) Long id, ModelMap mmap)
	{
		if (StringUtils.isNotNull(id))
		{
			mmap.put("appVersion", appVersionService.selectAppVersionById(id));
		}
		return prefix + "/add";
	}

	/**
	 * 新增保存Appversion
	 */
	@RequiresPermissions("appExtend:Appversion:add")
	@Log(title = "Appversion", businessType = BusinessType.INSERT)
	@PostMapping("/add")
	@ResponseBody
	public AjaxResult addSave(AppVersion appVersion)
	{
		return toAjax(appVersionService.insertAppVersion(appVersion));
	}

	/**
	 * 修改Appversion
	 */
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable("id") Long id, ModelMap mmap)
	{
		AppVersion appVersion = appVersionService.selectAppVersionById(id);
		mmap.put("appVersion", appVersion);
		return prefix + "/edit";
	}

	/**
	 * 修改保存Appversion
	 */
	@RequiresPermissions("appExtend:Appversion:edit")
	@Log(title = "Appversion", businessType = BusinessType.UPDATE)
	@PostMapping("/edit")
	@ResponseBody
	public AjaxResult editSave(AppVersion appVersion)
	{
		return toAjax(appVersionService.updateAppVersion(appVersion));
	}
	
	/**
	 * 删除Appversion
	 */
	@RequiresPermissions("appExtend:Appversion:remove")
	@Log(title = "${tableComment}", businessType = BusinessType.DELETE)
	@PostMapping( "/remove")
	@ResponseBody
	public AjaxResult remove(String ids)
	{		
		return toAjax(appVersionService.deleteAppVersionByIds(ids));
	}
	
}
