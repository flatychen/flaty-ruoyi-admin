package com.ruoyi.admin.appExtend.controller;

import com.ruoyi.admin.appExtend.domain.AppIndexButton;
import com.ruoyi.admin.appExtend.service.IAppIndexButtonService;
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
 * 首页按钮Controller
 *
 * @author flaty
 * @date 2019-08-23
 */
@Controller
@RequestMapping("/appExtend/indexButton")
public class AppIndexButtonController extends BaseController
{
	private String prefix = "appExtend/indexButton";

	@Autowired
	private IAppIndexButtonService appIndexButtonService;

	@RequiresPermissions("appExtend:indexButton:view")
	@GetMapping()
	public String appIndexButton()
	{
	    return prefix + "/indexButton";
	}

	/**
	 * 选择列表
	 */
	@GetMapping("/select")
	public String appIndexButtonSelect()
	{
		return prefix + "/select";
	}


	/**
	 * 选择列表数据
	 */
	@PostMapping("/select/list")
	@ResponseBody
	public TableDataInfo selectList(SysDept sysDept,AppIndexButton appIndexButton)
	{
		startPage();
		List<AppIndexButton> list = appIndexButtonService.selectAppIndexButtonList(appIndexButton);
		return getDataTable(list);
	}


	/**
	 * 查询首页按钮列表
	 */
	@RequiresPermissions("appExtend:indexButton:list")
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(AppIndexButton appIndexButton)
	{
		startPage();
		List<AppIndexButton> list = appIndexButtonService.selectAppIndexButtonList(appIndexButton);
		return getDataTable(list);
	}



	/**
	 * 导出首页按钮列表
	 */
	@RequiresPermissions("appExtend:indexButton:export")
	@PostMapping("/export")
	@ResponseBody
	public AjaxResult export(AppIndexButton appIndexButton)
	{
		List<AppIndexButton> list = appIndexButtonService.selectAppIndexButtonList(appIndexButton);
		ExcelUtil<AppIndexButton> util = new ExcelUtil<AppIndexButton>(AppIndexButton.class);
		return util.exportExcel(list, "indexButton");
	}

	/**
	 * 新增首页按钮
	 */
	@GetMapping(value = { "/add/{id}", "/add" })
	public String add(@PathVariable(value = "id", required = false) Long id, ModelMap mmap)
	{
		if (StringUtils.isNotNull(id))
		{
			mmap.put("appIndexButton", appIndexButtonService.selectAppIndexButtonById(id));
		}
		return prefix + "/add";
	}

	/**
	 * 新增保存首页按钮
	 */
	@RequiresPermissions("appExtend:indexButton:add")
	@Log(title = "首页按钮", businessType = BusinessType.INSERT)
	@PostMapping("/add")
	@ResponseBody
	public AjaxResult addSave(AppIndexButton appIndexButton)
	{
		return toAjax(appIndexButtonService.insertAppIndexButton(appIndexButton));
	}

	/**
	 * 修改首页按钮
	 */
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable("id") Long id, ModelMap mmap)
	{
		AppIndexButton appIndexButton = appIndexButtonService.selectAppIndexButtonById(id);
		mmap.put("appIndexButton", appIndexButton);
		return prefix + "/edit";
	}

	/**
	 * 修改保存首页按钮
	 */
	@RequiresPermissions("appExtend:indexButton:edit")
	@Log(title = "首页按钮", businessType = BusinessType.UPDATE)
	@PostMapping("/edit")
	@ResponseBody
	public AjaxResult editSave(AppIndexButton appIndexButton)
	{
		return toAjax(appIndexButtonService.updateAppIndexButton(appIndexButton));
	}
	
	/**
	 * 删除首页按钮
	 */
	@RequiresPermissions("appExtend:indexButton:remove")
	@Log(title = "${tableComment}", businessType = BusinessType.DELETE)
	@PostMapping( "/remove")
	@ResponseBody
	public AjaxResult remove(String ids)
	{		
		return toAjax(appIndexButtonService.deleteAppIndexButtonByIds(ids));
	}
	
}
