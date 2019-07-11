package com.ruoyi.admin.party.controller;

import com.ruoyi.admin.extend.DeptData;
import com.ruoyi.admin.party.domain.Checkin;
import com.ruoyi.admin.party.service.ICheckinService;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.system.domain.SysDept;
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
 * @date 2019-07-10
 */
@Controller
@RequestMapping("/party/checkin")
public class CheckinController extends BaseController
{
    private String prefix = "party/checkin";
	
	@Autowired
	private ICheckinService checkinService;
	
	@RequiresPermissions("party:checkin:view")
	@GetMapping()
	public String checkin()
	{
	    return prefix + "/checkin";
	}

	/**
	 * 选择列表
	 */
	@GetMapping("/select")
	public String checkinSelect()
	{
		return prefix + "/select";
	}


	/**
	 * 选择列表数据
	 */
	@PostMapping("/select/list")
	@ResponseBody
	public TableDataInfo selectList(@DeptData SysDept sysDept,Checkin checkin)
	{
		startPage();
		List<Checkin> list = checkinService.selectCheckinList(checkin);
		return getDataTable(list);
	}


	/**
	 * 查询列表
	 */
	@RequiresPermissions("party:checkin:list")
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(@DeptData SysDept sysDept,Checkin checkin)
	{
		startPage();
		checkin.setAgencyId(sysDept.getAgencyId());
        List<Checkin> list = checkinService.selectCheckinList(checkin);
		return getDataTable(list);
	}
	
	
	/**
	 * 导出列表
	 */
	@RequiresPermissions("party:checkin:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Checkin checkin)
    {
    	List<Checkin> list = checkinService.selectCheckinList(checkin);
        ExcelUtil<Checkin> util = new ExcelUtil<Checkin>(Checkin.class);
        return util.exportExcel(list, "checkin");
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
	@RequiresPermissions("party:checkin:add")
	@Log(title = "", businessType = BusinessType.INSERT)
	@PostMapping("/add")
	@ResponseBody
	public AjaxResult addSave(Checkin checkin)
	{		
		return toAjax(checkinService.insertCheckin(checkin));
	}

	/**
	 * 修改
	 */
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable("id") Integer id, ModelMap mmap)
	{
		Checkin checkin = checkinService.selectCheckinById(id);
		mmap.put("checkin", checkin);
	    return prefix + "/edit";
	}
	
	/**
	 * 修改保存
	 */
	@RequiresPermissions("party:checkin:edit")
	@Log(title = "", businessType = BusinessType.UPDATE)
	@PostMapping("/edit")
	@ResponseBody
	public AjaxResult editSave(Checkin checkin)
	{		
		return toAjax(checkinService.updateCheckin(checkin));
	}
	
	/**
	 * 删除
	 */
	@RequiresPermissions("party:checkin:remove")
	@Log(title = "", businessType = BusinessType.DELETE)
	@PostMapping( "/remove")
	@ResponseBody
	public AjaxResult remove(String ids)
	{		
		return toAjax(checkinService.deleteCheckinByIds(ids));
	}
	
}
