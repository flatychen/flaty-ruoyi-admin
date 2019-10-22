package cn.aylives.ruoyi.admin.property.controller;

import java.util.Date;
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
import cn.aylives.ruoyi.admin.property.domain.SysAgency;
import cn.aylives.ruoyi.admin.property.service.ISysAgencyService;
import cn.aylives.ruoyi.common.core.controller.BaseController;
import cn.aylives.ruoyi.common.core.page.TableDataInfo;
import cn.aylives.ruoyi.common.core.domain.AjaxResult;
import cn.aylives.ruoyi.common.utils.poi.ExcelUtil;
import cn.aylives.ruoyi.system.domain.SysDept;
import cn.aylives.ruoyi.admin.core.dept.DeptData;
/**
 * 项目Controller
 *
 * @author flaty
 * @date 2019-10-22
 */
@Controller
@RequestMapping("/property/sysAgency")
public class SysAgencyController extends BaseController
{
	private String prefix = "property/sysAgency";

	@Autowired
	private ISysAgencyService sysAgencyService;

	@RequiresPermissions("property:sysAgency:view")
	@GetMapping()
	public String sysAgency()
	{
	    return prefix + "/sysAgency";
	}

	/**
	 * 选择列表
	 */
	@GetMapping("/select")
	public String sysAgencySelect()
	{
		return prefix + "/select";
	}


	/**
	 * 选择列表数据
	 */
	@PostMapping("/select/list")
	@ResponseBody
	public TableDataInfo selectList(@DeptData SysDept sysDept,SysAgency sysAgency)
	{
		startPage();
		List<SysAgency> list = sysAgencyService.selectSysAgencyList(sysAgency);
		return getDataTable(list);
	}


	/**
	 * 查询项目列表
	 */
	@RequiresPermissions("property:sysAgency:list")
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(SysAgency sysAgency)
	{
		startPage();
		List<SysAgency> list = sysAgencyService.selectSysAgencyList(sysAgency);
		return getDataTable(list);
	}



	/**
	 * 导出项目列表
	 */
	@RequiresPermissions("property:sysAgency:list")
	@PostMapping("/export")
	@ResponseBody
	public AjaxResult export(SysAgency sysAgency)
	{
		List<SysAgency> list = sysAgencyService.selectSysAgencyList(sysAgency);
		ExcelUtil<SysAgency> util = new ExcelUtil<SysAgency>(SysAgency.class);
		return util.exportExcel(list, "sysAgency");
	}

	/**
	 * 新增项目
	 */
	@GetMapping(value = { "/add/{id}", "/add" })
	public String add(@PathVariable(value = "id", required = false) Integer id, ModelMap mmap)
	{
		if (StringUtils.isNotNull(id))
		{
			mmap.put("sysAgency", sysAgencyService.selectSysAgencyById(id));
		}
		return prefix + "/add";
	}

	/**
	 * 新增保存项目
	 */
	@RequiresPermissions("property:sysAgency:add")
	@Log(title = "项目", businessType = BusinessType.INSERT)
	@PostMapping("/add")
	@ResponseBody
	public AjaxResult addSave(SysAgency sysAgency) {
		sysAgency.setCity(0L);
		sysAgency.setProvince(0L);
		return toAjax(sysAgencyService.insertSysAgency(sysAgency));
	}

	/**
	 * 修改项目
	 */
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable("id") Integer id, ModelMap mmap)
	{
		SysAgency sysAgency = sysAgencyService.selectSysAgencyById(id);
		mmap.put("sysAgency", sysAgency);
		return prefix + "/edit";
	}

	/**
	 * 修改保存项目
	 */
	@RequiresPermissions("property:sysAgency:edit")
	@Log(title = "项目", businessType = BusinessType.UPDATE)
	@PostMapping("/edit")
	@ResponseBody
	public AjaxResult editSave(SysAgency sysAgency) {
		sysAgency.setUpdatedDate(new Date());
		return toAjax(sysAgencyService.updateSysAgency(sysAgency));
	}
	
	/**
	 * 删除项目
	 */
	@RequiresPermissions("property:sysAgency:remove")
	@Log(title = "${tableComment}", businessType = BusinessType.DELETE)
	@PostMapping( "/remove")
	@ResponseBody
	public AjaxResult remove(String ids)
	{		
		return toAjax(sysAgencyService.deleteSysAgencyByIds(ids));
	}
	
}
