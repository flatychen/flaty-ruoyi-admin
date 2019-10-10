package cn.aylives.ruoyi.admin.property.controller;

import cn.aylives.ruoyi.admin.property.domain.Agency;
import cn.aylives.ruoyi.admin.property.service.ISysAgencyService;
import cn.aylives.ruoyi.common.annotation.Log;
import cn.aylives.ruoyi.common.core.controller.BaseController;
import cn.aylives.ruoyi.common.core.domain.AjaxResult;
import cn.aylives.ruoyi.common.core.page.TableDataInfo;
import cn.aylives.ruoyi.common.enums.BusinessType;
import cn.aylives.ruoyi.common.utils.poi.ExcelUtil;
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
 * @date 2019-07-05
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
	 * 查询项目列表
	 */
	@RequiresPermissions("property:sysAgency:list")
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(Agency sysAgency)
	{
		startPage();
        List<Agency> list = sysAgencyService.selectSysAgencyList(sysAgency);
		return getDataTable(list);
	}
	
	
	/**
	 * 导出项目列表
	 */
	@RequiresPermissions("property:sysAgency:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Agency sysAgency)
    {
    	List<Agency> list = sysAgencyService.selectSysAgencyList(sysAgency);
        ExcelUtil<Agency> util = new ExcelUtil<Agency>(Agency.class);
        return util.exportExcel(list, "sysAgency");
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
	@RequiresPermissions("property:sysAgency:add")
	@Log(title = "项目", businessType = BusinessType.INSERT)
	@PostMapping("/add")
	@ResponseBody
	public AjaxResult addSave(Agency sysAgency)
	{		
		return toAjax(sysAgencyService.insertSysAgency(sysAgency));
	}

	/**
	 * 修改项目
	 */
	@GetMapping("/edit/{iD}")
	public String edit(@PathVariable("iD") Integer iD, ModelMap mmap)
	{
		Agency sysAgency = sysAgencyService.selectSysAgencyById(iD);
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
	public AjaxResult editSave(Agency sysAgency)
	{		
		return toAjax(sysAgencyService.updateSysAgency(sysAgency));
	}
	
	/**
	 * 删除项目
	 */
	@RequiresPermissions("property:sysAgency:remove")
	@Log(title = "项目", businessType = BusinessType.DELETE)
	@PostMapping( "/remove")
	@ResponseBody
	public AjaxResult remove(String ids)
	{		
		return toAjax(sysAgencyService.deleteSysAgencyByIds(ids));
	}
	
}
