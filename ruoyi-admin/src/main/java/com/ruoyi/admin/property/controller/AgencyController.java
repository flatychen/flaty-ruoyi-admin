package com.ruoyi.admin.property.controller;

import com.ruoyi.admin.property.domain.Agency;
import com.ruoyi.admin.property.service.IAgencyService;
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
 * 项目 信息操作处理
 * 
 * @author flaty
 * @date 2019-07-01
 */
@Controller
@RequestMapping("/property/agency")
public class AgencyController extends BaseController
{
    private String prefix = "property/agency";
	
	@Autowired
	private IAgencyService agencyService;
	
	@RequiresPermissions("property:agency:view")
	@GetMapping()
	public String agency()
	{
	    return prefix + "/agency";
	}
	
	/**
	 * 查询项目列表
	 */
	@RequiresPermissions("property:agency:list")
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(Agency agency)
	{
		startPage();
        List<Agency> list = agencyService.selectAgencyList(agency);
		return getDataTable(list);
	}
	
	
	/**
	 * 导出项目列表
	 */
	@RequiresPermissions("property:agency:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Agency agency)
    {
    	List<Agency> list = agencyService.selectAgencyList(agency);
        ExcelUtil<Agency> util = new ExcelUtil<Agency>(Agency.class);
        return util.exportExcel(list, "agency");
    }
	
	/**
	 * 新增项目
	 */
	@GetMapping("/add")
	public String add()
	{
	    return prefix + "/add";
	}
	
	/**
	 * 新增保存项目
	 */
	@RequiresPermissions("property:agency:add")
	@Log(title = "项目", businessType = BusinessType.INSERT)
	@PostMapping("/add")
	@ResponseBody
	public AjaxResult addSave(Agency agency)
	{		
		return toAjax(agencyService.insertAgency(agency));
	}

	/**
	 * 修改项目
	 */
	@GetMapping("/edit/{iD}")
	public String edit(@PathVariable("iD") Integer iD, ModelMap mmap)
	{
		Agency agency = agencyService.selectAgencyById(iD);
		mmap.put("agency", agency);
	    return prefix + "/edit";
	}
	
	/**
	 * 修改保存项目
	 */
	@RequiresPermissions("property:agency:edit")
	@Log(title = "项目", businessType = BusinessType.UPDATE)
	@PostMapping("/edit")
	@ResponseBody
	public AjaxResult editSave(Agency agency)
	{		
		return toAjax(agencyService.updateAgency(agency));
	}
	
	/**
	 * 删除项目
	 */
	@RequiresPermissions("property:agency:remove")
	@Log(title = "项目", businessType = BusinessType.DELETE)
	@PostMapping( "/remove")
	@ResponseBody
	public AjaxResult remove(String ids)
	{		
		return toAjax(agencyService.deleteAgencyByIds(ids));
	}
	
}
