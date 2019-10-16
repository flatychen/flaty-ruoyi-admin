package cn.aylives.ruoyi.admin.property.controller;

import java.util.Date;
import java.util.List;

import cn.aylives.ruoyi.admin.core.join.ServiceJoinHelper;
import cn.aylives.ruoyi.admin.party.domain.ActivityUser;
import cn.aylives.ruoyi.admin.property.service.ISysAgencyService;
import cn.aylives.ruoyi.admin.property.service.impl.AgencyViewServiceImpl;
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
import cn.aylives.ruoyi.admin.property.domain.Reversions;
import cn.aylives.ruoyi.admin.property.service.IReversionsService;
import cn.aylives.ruoyi.common.core.controller.BaseController;
import cn.aylives.ruoyi.common.core.page.TableDataInfo;
import cn.aylives.ruoyi.common.core.domain.AjaxResult;
import cn.aylives.ruoyi.common.utils.poi.ExcelUtil;
import cn.aylives.ruoyi.system.domain.SysDept;
import cn.aylives.ruoyi.admin.core.dept.DeptData;
/**
 * ReversionsController
 *
 * @author flaty
 * @date 2019-10-15
 */
@Controller
@RequestMapping("/property/Reversions")
public class ReversionsController extends BaseController
{
	private String prefix = "property/Reversions";

	@Autowired
	private IReversionsService reversionsService;

	@Autowired
	private ISysAgencyService iSysAgencyService;

	@RequiresPermissions("property:Reversions:view")
	@GetMapping()
	public String reversions()
	{
	    return prefix + "/Reversions";
	}

	/**
	 * 选择列表
	 */
	@GetMapping("/select")
	public String reversionsSelect()
	{
		return prefix + "/select";
	}


	/**
	 * 选择列表数据
	 */
	@PostMapping("/select/list")
	@ResponseBody
	public TableDataInfo selectList(@DeptData SysDept sysDept,Reversions reversions)
	{
		startPage();
		List<Reversions> list = reversionsService.selectReversionsList(reversions);
		return getDataTable(list);
	}


	/**
	 * 查询Reversions列表
	 */
	@RequiresPermissions("property:Reversions:list")
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(Reversions reversions)
	{
		startPage();
		List<Reversions> list = reversionsService.selectReversionsList(reversions);

		ServiceJoinHelper.join(Reversions.class, list, iSysAgencyService);
		return getDataTable(list);
	}



	/**
	 * 导出Reversions列表
	 */
	@RequiresPermissions("property:Reversions:export")
	@PostMapping("/export")
	@ResponseBody
	public AjaxResult export(Reversions reversions)
	{
		List<Reversions> list = reversionsService.selectReversionsList(reversions);
		ExcelUtil<Reversions> util = new ExcelUtil<Reversions>(Reversions.class);
		return util.exportExcel(list, "Reversions");
	}

	/**
	 * 新增Reversions
	 */
	@GetMapping(value = { "/add/{id}", "/add" })
	public String add(@PathVariable(value = "id", required = false) Integer id, ModelMap mmap)
	{
		if (StringUtils.isNotNull(id))
		{
			mmap.put("reversions", reversionsService.selectReversionsById(id));
		}
		return prefix + "/add";
	}

	/**
	 * 新增保存Reversions
	 */
	@RequiresPermissions("property:Reversions:add")
	@Log(title = "Reversions", businessType = BusinessType.INSERT)
	@PostMapping("/add")
	@ResponseBody
	public AjaxResult addSave(Reversions reversions, @DeptData  SysDept sysDept)
	{

        reversions.setCreatedTime(new Date());
		return toAjax(reversionsService.insertReversions(reversions , sysDept ));
	}

	/**
	 * 修改Reversions
	 */
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable("id") Integer id, ModelMap mmap)
	{


		Reversions reversions = reversionsService.selectReversionsById(id);
		mmap.put("reversions", reversions);
		return prefix + "/edit";
	}

	/**
	 * 修改保存Reversions
	 */
	@RequiresPermissions("property:Reversions:edit")
	@Log(title = "Reversions", businessType = BusinessType.UPDATE)
	@PostMapping("/edit")
	@ResponseBody
	public AjaxResult editSave(  @DeptData  SysDept sysDept,  Reversions reversions)
	{
        reversions.setUpdatedTime(new Date());
		return toAjax(reversionsService.updateReversions(reversions ,sysDept));
	}
	
	/**
	 * 删除Reversions
	 */
	@RequiresPermissions("property:Reversions:remove")
	@Log(title = "${tableComment}", businessType = BusinessType.DELETE)
	@PostMapping( "/remove")
	@ResponseBody
	public AjaxResult remove(String ids)
	{		
		return toAjax(reversionsService.deleteReversionsByIds(ids));
	}
	
}
