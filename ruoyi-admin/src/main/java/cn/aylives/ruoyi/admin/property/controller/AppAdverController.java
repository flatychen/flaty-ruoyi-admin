package cn.aylives.ruoyi.admin.property.controller;

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
import cn.aylives.ruoyi.admin.property.domain.AppAdver;
import cn.aylives.ruoyi.admin.property.service.IAppAdverService;
import cn.aylives.ruoyi.common.core.controller.BaseController;
import cn.aylives.ruoyi.common.core.page.TableDataInfo;
import cn.aylives.ruoyi.common.core.domain.AjaxResult;
import cn.aylives.ruoyi.common.utils.poi.ExcelUtil;
import cn.aylives.ruoyi.system.domain.SysDept;
import cn.aylives.ruoyi.admin.core.dept.DeptData;
/**
 * app广告Controller
 *
 * @author flaty
 * @date 2019-10-14
 */
@Controller
@RequestMapping("/property/adver")
public class AppAdverController extends BaseController
{
	private String prefix = "property/adver";

	@Autowired
	private IAppAdverService appAdverService;

	@RequiresPermissions("property:adver:view")
	@GetMapping()
	public String appAdver()
	{
	    return prefix + "/adver";
	}

	/**
	 * 选择列表
	 */
	@GetMapping("/select")
	public String appAdverSelect()
	{
		return prefix + "/select";
	}


	/**
	 * 选择列表数据
	 */
	@PostMapping("/select/list")
	@ResponseBody
	public TableDataInfo selectList(@DeptData SysDept sysDept,AppAdver appAdver)
	{
		startPage();
		List<AppAdver> list = appAdverService.selectAppAdverList(appAdver);
		return getDataTable(list);
	}


	/**
	 * 查询app广告列表
	 */
	@RequiresPermissions("property:adver:list")
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(AppAdver appAdver)
	{
		startPage();
		List<AppAdver> list = appAdverService.selectAppAdverList(appAdver);
		return getDataTable(list);
	}



	/**
	 * 导出app广告列表
	 */
	@RequiresPermissions("property:adver:list")
	@PostMapping("/export")
	@ResponseBody
	public AjaxResult export(AppAdver appAdver)
	{
		List<AppAdver> list = appAdverService.selectAppAdverList(appAdver);
		ExcelUtil<AppAdver> util = new ExcelUtil<AppAdver>(AppAdver.class);
		return util.exportExcel(list, "adver");
	}

	/**
	 * 新增app广告
	 */
	@GetMapping(value = { "/add/{id}", "/add" })
	public String add(@PathVariable(value = "id", required = false) Long id, ModelMap mmap)
	{
		if (StringUtils.isNotNull(id))
		{
			mmap.put("appAdver", appAdverService.selectAppAdverById(id));
		}
		return prefix + "/add";
	}

	/**
	 * 新增保存app广告
	 */
	@RequiresPermissions("property:adver:add")
	@Log(title = "app广告", businessType = BusinessType.INSERT)
	@PostMapping("/add")
	@ResponseBody
	public AjaxResult addSave(AppAdver appAdver)
	{
		return toAjax(appAdverService.insertAppAdver(appAdver));
	}

	/**
	 * 修改app广告
	 */
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable("id") Long id, ModelMap mmap)
	{
		AppAdver appAdver = appAdverService.selectAppAdverById(id);
		mmap.put("appAdver", appAdver);
		return prefix + "/edit";
	}

	/**
	 * 修改保存app广告
	 */
	@RequiresPermissions("property:adver:edit")
	@Log(title = "app广告", businessType = BusinessType.UPDATE)
	@PostMapping("/edit")
	@ResponseBody
	public AjaxResult editSave(AppAdver appAdver)
	{
		return toAjax(appAdverService.updateAppAdver(appAdver));
	}
	
	/**
	 * 删除app广告
	 */
	@RequiresPermissions("property:adver:remove")
	@Log(title = "${tableComment}", businessType = BusinessType.DELETE)
	@PostMapping( "/remove")
	@ResponseBody
	public AjaxResult remove(String ids)
	{		
		return toAjax(appAdverService.deleteAppAdverByIds(ids));
	}
	
}
