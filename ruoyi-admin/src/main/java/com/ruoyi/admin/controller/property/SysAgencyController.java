package com.ruoyi.admin.controller.property;

import com.ruoyi.admin.domain.SysAgency;
import com.ruoyi.admin.service.ISysAgencyService;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

/**
 * 项目 信息操作处理
 * 
 * @author flaty
 * @date 2019-06-25
 */
@Controller
@RequestMapping("/perperty/sysAgency")
public class SysAgencyController extends BaseController
{
    private String prefix = "perperty/sysAgency";
	
	@Autowired
	private ISysAgencyService sysAgencyService;
	
	@RequiresPermissions("admin:sysAgency:view")
	@GetMapping()
	public String sysAgency()
	{
	    return prefix + "/sysAgency";
	}



	/**
	 * 修改项目
	 */
	@GetMapping("/edit/{iD}")
	public String edit(@PathVariable("iD") Integer iD, ModelMap mmap)
	{
		SysAgency sysAgency = sysAgencyService.selectSysAgencyById(iD);
		mmap.put("sysAgency", sysAgency);
	    return prefix + "/edit";
	}
	
	/**
	 * 修改保存项目
	 */
	@RequiresPermissions("admin:sysAgency:edit")
	@Log(title = "项目", businessType = BusinessType.UPDATE)
	@PostMapping("/edit")
	@ResponseBody
	public AjaxResult editSave(SysAgency sysAgency)
	{		
		return toAjax(sysAgencyService.updateSysAgency(sysAgency));
	}
	

	
}
