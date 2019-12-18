package cn.aylives.ruoyi.admin.modules.activity.controller;

import cn.aylives.ruoyi.admin.core.dept.DeptData;
import cn.aylives.ruoyi.admin.modules.activity.domain.ActivityExtend;
import cn.aylives.ruoyi.admin.modules.activity.service.IActivityExtendService;
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

import java.util.ArrayList;
import java.util.List;
/**
 * ${functionName}Controller
 *
 * @author flaty
 * @date 2019-09-23
 */
@Controller
@RequestMapping("/activity/extend")
public class ActivityExtendController extends BaseController
{
	private String prefix = "activity/appActivityExtend";

	@Autowired
	private IActivityExtendService activityExtendService;

	//@RequiresPermissions("activity:extend:view")
	@GetMapping()
	public String activityExtend( Long activityId, ModelMap mmap)
	{
		mmap.put("activityId" , activityId) ;
	    return prefix + "/extend";
	}

	/**
	 * 选择列表
	 */
	@GetMapping("/select")
	public String activityExtendSelect()
	{
		return prefix + "/select";
	}


	/**
	 * 选择列表数据
	 */
	@PostMapping("/select/list")
	@ResponseBody
	public TableDataInfo selectList(@DeptData SysDept sysDept, ActivityExtend activityExtend,@ModelAttribute Long activityId)
	{
		//startPage();
		List<ActivityExtend> list ;
		if(activityId == null){
			activityExtend.setActivityId(activityId);
			list = activityExtendService.selectActivityExtendList(activityExtend);

		}else {
			list = new ArrayList<>();
		}
		return getDataTable(list);
	}


	/**
	 * 查询${functionName}列表
	 */
	//@RequiresPermissions("activity:extend:list")
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(ActivityExtend activityExtend)
	{
		startPage();
		List<ActivityExtend> list = activityExtendService.selectActivityExtendList(activityExtend);
		return getDataTable(list);
	}



	/**
	 * 导出${functionName}列表
	 */
	@RequiresPermissions("activity:extend:list")
	@PostMapping("/export")
	@ResponseBody
	public AjaxResult export(ActivityExtend activityExtend)
	{
		List<ActivityExtend> list = activityExtendService.selectActivityExtendList(activityExtend);
		ExcelUtil<ActivityExtend> util = new ExcelUtil<ActivityExtend>(ActivityExtend.class);
		return util.exportExcel(list, "extend");
	}

	/**
	 * 新增${functionName}
	 */
	@GetMapping(value = { "/add/{id}", "/add" })
	public String add(@PathVariable(value = "id", required = false) Long id, ModelMap mmap, Long activityId )
	{

		mmap.put("activityId" , activityId) ;
		if (StringUtils.isNotNull(id))
		{
			mmap.put("activityExtend", activityExtendService.selectActivityExtendById(id));
		}
		return prefix + "/add";
	}

	/**
	 * 新增保存${functionName}
	 */
	//@RequiresPermissions("activity:extend:add")
	@Log(title = "${functionName}", businessType = BusinessType.INSERT)
	@PostMapping("/add")
	@ResponseBody
	public AjaxResult addSave(ActivityExtend activityExtend)
	{
		return toAjax(activityExtendService.insertActivityExtend(activityExtend));
	}

	/**
	 * 修改${functionName}
	 */
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable("id") Long id, ModelMap mmap)
	{
		ActivityExtend activityExtend = activityExtendService.selectActivityExtendById(id);
		mmap.put("activityExtend", activityExtend);
		return prefix + "/edit";
	}

	/**
	 * 修改保存${functionName}
	 */
	@RequiresPermissions("activity:extend:edit")
	@Log(title = "${functionName}", businessType = BusinessType.UPDATE)
	@PostMapping("/edit")
	@ResponseBody
	public AjaxResult editSave(ActivityExtend activityExtend)
	{
		return toAjax(activityExtendService.updateActivityExtend(activityExtend));
	}
	
	/**
	 * 删除${functionName}
	 */
	@RequiresPermissions("activity:extend:remove")
	@Log(title = "${tableComment}", businessType = BusinessType.DELETE)
	@PostMapping( "/remove")
	@ResponseBody
	public AjaxResult remove(String ids)
	{		
		return toAjax(activityExtendService.deleteActivityExtendByIds(ids));
	}
	
}
