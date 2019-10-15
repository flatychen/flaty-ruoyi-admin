package cn.aylives.ruoyi.admin.property.controller;

import cn.aylives.ruoyi.admin.core.dept.DeptData;
import cn.aylives.ruoyi.admin.property.domain.AppUser;
import cn.aylives.ruoyi.admin.property.service.IAppUserService;
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
 * AppUserController
 *
 * @author flaty
 * @date 2019-10-15
 */
@Controller
@RequestMapping("/property/AppUser")
public class AppUserController extends BaseController
{
	private String prefix = "property/AppUser";

	@Autowired
	private IAppUserService appUserService;

	@RequiresPermissions("property:AppUser:view")
	@GetMapping()
	public String appUser()
	{
	    return prefix + "/AppUser";
	}

	/**
	 * 选择列表
	 */
	@GetMapping("/select")
	public String appUserSelect()
	{
		return prefix + "/select";
	}


	/**
	 * 选择列表数据
	 */
	@PostMapping("/select/list")
	@ResponseBody
	public TableDataInfo selectList(@DeptData SysDept sysDept,AppUser appUser)
	{
		startPage();
		List<AppUser> list = appUserService.selectAppUserList(appUser);
		return getDataTable(list);
	}


	/**
	 * 查询AppUser列表
	 */
	@RequiresPermissions("property:AppUser:list")
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(AppUser appUser)
	{
		startPage();
		List<AppUser> list = appUserService.selectAppUserList(appUser);
		return getDataTable(list);
	}



	/**
	 * 导出AppUser列表
	 */
	@RequiresPermissions("property:AppUser:export")
	@PostMapping("/export")
	@ResponseBody
	public AjaxResult export(AppUser appUser)
	{
		List<AppUser> list = appUserService.selectAppUserList(appUser);
		ExcelUtil<AppUser> util = new ExcelUtil<AppUser>(AppUser.class);
		return util.exportExcel(list, "AppUser");
	}

	/**
	 * 新增AppUser
	 */
	@GetMapping(value = { "/add/{userId}", "/add" })
	public String add(@PathVariable(value = "userId", required = false) Long userId, ModelMap mmap)
	{
		if (StringUtils.isNotNull(userId))
		{
			mmap.put("appUser", appUserService.selectAppUserById(userId));
		}
		return prefix + "/add";
	}

	/**
	 * 新增保存AppUser
	 */
	@RequiresPermissions("property:AppUser:add")
	@Log(title = "AppUser", businessType = BusinessType.INSERT)
	@PostMapping("/add")
	@ResponseBody
	public AjaxResult addSave(AppUser appUser)
	{
		return toAjax(appUserService.insertAppUser(appUser));
	}

	/**
	 * 修改AppUser
	 */
	@GetMapping("/edit/{userId}")
	public String edit(@PathVariable("userId") Long userId, ModelMap mmap)
	{
		AppUser appUser = appUserService.selectAppUserById(userId);
		mmap.put("appUser", appUser);
		return prefix + "/edit";
	}

	/**
	 * 修改保存AppUser
	 */
	@RequiresPermissions("property:AppUser:edit")
	@Log(title = "AppUser", businessType = BusinessType.UPDATE)
	@PostMapping("/edit")
	@ResponseBody
	public AjaxResult editSave(AppUser appUser)
	{
		return toAjax(appUserService.updateAppUser(appUser));
	}
	
	/**
	 * 删除AppUser
	 */
	@RequiresPermissions("property:AppUser:remove")
	@Log(title = "${tableComment}", businessType = BusinessType.DELETE)
	@PostMapping( "/remove")
	@ResponseBody
	public AjaxResult remove(String ids)
	{		
		return toAjax(appUserService.deleteAppUserByIds(ids));
	}
	
}
