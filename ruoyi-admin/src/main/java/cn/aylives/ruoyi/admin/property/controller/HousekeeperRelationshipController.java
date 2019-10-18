package cn.aylives.ruoyi.admin.property.controller;

import cn.aylives.ruoyi.admin.core.dept.DeptData;
import cn.aylives.ruoyi.admin.property.domain.HousekeeperRelationship;
import cn.aylives.ruoyi.admin.property.service.IHousekeeperRelationshipService;
import cn.aylives.ruoyi.common.annotation.Log;
import cn.aylives.ruoyi.common.core.controller.BaseController;
import cn.aylives.ruoyi.common.core.domain.AjaxResult;
import cn.aylives.ruoyi.common.core.page.TableDataInfo;
import cn.aylives.ruoyi.common.enums.BusinessType;
import cn.aylives.ruoyi.common.utils.StringUtils;
import cn.aylives.ruoyi.common.utils.poi.ExcelUtil;
import cn.aylives.ruoyi.system.domain.SysDept;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;
/**
 * 管家绑定Controller
 *
 * @author flaty
 * @date 2019-10-15
 */
@Controller
@RequestMapping("/property/HouseKeeperBind")
public class HousekeeperRelationshipController extends BaseController
{
	private String prefix = "property/HouseKeeperBind";

	@Autowired
	private IHousekeeperRelationshipService housekeeperRelationshipService;

	@RequiresPermissions("property:HouseKeeperBind:view")
	@GetMapping()
	public String housekeeperRelationship()
	{
	    return prefix + "/HouseKeeperBind";
	}

	/**
	 * 选择列表
	 */
	@GetMapping("/select")
	public String housekeeperRelationshipSelect()
	{
		return prefix + "/select";
	}


	/**
	 * 选择列表数据
	 */
	@PostMapping("/select/list")
	@ResponseBody
	public TableDataInfo selectList(@DeptData SysDept sysDept,HousekeeperRelationship housekeeperRelationship)
	{
		startPage();
		List<HousekeeperRelationship> list = housekeeperRelationshipService.selectHousekeeperRelationshipList(housekeeperRelationship);
		return getDataTable(list);
	}


	/**
	 * 查询管家绑定列表
	 */
	@RequiresPermissions("property:HouseKeeperBind:list")
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(HousekeeperRelationship housekeeperRelationship)
	{
		startPage();
		List<HousekeeperRelationship> list = housekeeperRelationshipService.selectHousekeeperRelationshipList(housekeeperRelationship);
		return getDataTable(list);
	}



	/**
	 * 导出管家绑定列表
	 */
	@RequiresPermissions("property:HouseKeeperBind:list")
	@PostMapping("/export")
	@ResponseBody
	public AjaxResult export(HousekeeperRelationship housekeeperRelationship)
	{
		List<HousekeeperRelationship> list = housekeeperRelationshipService.selectHousekeeperRelationshipList(housekeeperRelationship);
		ExcelUtil<HousekeeperRelationship> util = new ExcelUtil<HousekeeperRelationship>(HousekeeperRelationship.class);
		return util.exportExcel(list, "HouseKeeperBind");
	}

	/**
	 * 新增管家绑定
	 */
	@GetMapping(value = { "/add/{id}", "/add" })
	public String add(@PathVariable(value = "id", required = false) Integer id, ModelMap mmap)
	{
		if (StringUtils.isNotNull(id))
		{
			mmap.put("housekeeperRelationship", housekeeperRelationshipService.selectHousekeeperRelationshipById(id));
		}
		return prefix + "/add";
	}

	/**
	 * 新增保存管家绑定
	 */
	@RequiresPermissions("property:HouseKeeperBind:add")
	@Log(title = "管家绑定", businessType = BusinessType.INSERT)
	@PostMapping("/add")
	@ResponseBody
	public AjaxResult addSave(HousekeeperRelationship housekeeperRelationship)
	{
		return toAjax(housekeeperRelationshipService.insertHousekeeperRelationship(housekeeperRelationship));
	}

	/**
	 * 修改管家绑定
	 */
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable("id") Integer id, ModelMap mmap)
	{
		HousekeeperRelationship housekeeperRelationship = housekeeperRelationshipService.selectHousekeeperRelationshipById(id);
		mmap.put("housekeeperRelationship", housekeeperRelationship);
		return prefix + "/edit";
	}

	/**
	 * 修改保存管家绑定
	 */
	@RequiresPermissions("property:HouseKeeperBind:edit")
	@Log(title = "管家绑定", businessType = BusinessType.UPDATE)
	@PostMapping("/edit")
	@ResponseBody
	public AjaxResult editSave(HousekeeperRelationship housekeeperRelationship)
	{
		return toAjax(housekeeperRelationshipService.updateHousekeeperRelationship(housekeeperRelationship));
	}
	
	/**
	 * 删除管家绑定
	 */
	@RequiresPermissions("property:HouseKeeperBind:remove")
	@Log(title = "${tableComment}", businessType = BusinessType.DELETE)
	@PostMapping( "/remove")
	@ResponseBody
	public AjaxResult remove(String ids)
	{		
		return toAjax(housekeeperRelationshipService.deleteHousekeeperRelationshipByIds(ids));
	}
	
}
