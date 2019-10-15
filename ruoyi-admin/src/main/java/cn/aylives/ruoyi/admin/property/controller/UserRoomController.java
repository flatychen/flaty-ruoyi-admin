package cn.aylives.ruoyi.admin.property.controller;

import cn.aylives.ruoyi.admin.core.dept.DeptData;
import cn.aylives.ruoyi.admin.property.domain.UserRoom;
import cn.aylives.ruoyi.admin.property.service.IUserRoomService;
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
 * 房屋管理Controller
 *
 * @author flaty
 * @date 2019-10-15
 */
@Controller
@RequestMapping("/property/UserRoom")
public class UserRoomController extends BaseController
{
	private String prefix = "property/UserRoom";

	@Autowired
	private IUserRoomService userRoomService;

	@RequiresPermissions("property:UserRoom:view")
	@GetMapping()
	public String userRoom()
	{
	    return prefix + "/UserRoom";
	}

	/**
	 * 选择列表
	 */
	@GetMapping("/select")
	public String userRoomSelect()
	{
		return prefix + "/select";
	}


	/**
	 * 选择列表数据
	 */
	@PostMapping("/select/list")
	@ResponseBody
	public TableDataInfo selectList(@DeptData SysDept sysDept,UserRoom userRoom)
	{
		startPage();
		List<UserRoom> list = userRoomService.selectUserRoomList(userRoom);
		return getDataTable(list);
	}


	/**
	 * 查询房屋管理列表
	 */
	@RequiresPermissions("property:UserRoom:list")
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(UserRoom userRoom)
	{
		startPage();
		List<UserRoom> list = userRoomService.selectUserRoomList(userRoom);
		return getDataTable(list);
	}



	/**
	 * 导出房屋管理列表
	 */
	@RequiresPermissions("property:UserRoom:export")
	@PostMapping("/export")
	@ResponseBody
	public AjaxResult export(UserRoom userRoom)
	{
		List<UserRoom> list = userRoomService.selectUserRoomList(userRoom);
		ExcelUtil<UserRoom> util = new ExcelUtil<UserRoom>(UserRoom.class);
		return util.exportExcel(list, "UserRoom");
	}

	/**
	 * 新增房屋管理
	 */
	@GetMapping(value = { "/add/{id}", "/add" })
	public String add(@PathVariable(value = "id", required = false) Integer id, ModelMap mmap)
	{
		if (StringUtils.isNotNull(id))
		{
			mmap.put("userRoom", userRoomService.selectUserRoomById(id));
		}
		return prefix + "/add";
	}

	/**
	 * 新增保存房屋管理
	 */
	@RequiresPermissions("property:UserRoom:add")
	@Log(title = "房屋管理", businessType = BusinessType.INSERT)
	@PostMapping("/add")
	@ResponseBody
	public AjaxResult addSave(UserRoom userRoom)
	{
		return toAjax(userRoomService.insertUserRoom(userRoom));
	}

	/**
	 * 修改房屋管理
	 */
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable("id") Integer id, ModelMap mmap)
	{
		UserRoom userRoom = userRoomService.selectUserRoomById(id);
		mmap.put("userRoom", userRoom);
		return prefix + "/edit";
	}

	/**
	 * 修改保存房屋管理
	 */
	@RequiresPermissions("property:UserRoom:edit")
	@Log(title = "房屋管理", businessType = BusinessType.UPDATE)
	@PostMapping("/edit")
	@ResponseBody
	public AjaxResult editSave(UserRoom userRoom)
	{
		return toAjax(userRoomService.updateUserRoom(userRoom));
	}
	
	/**
	 * 删除房屋管理
	 */
	@RequiresPermissions("property:UserRoom:remove")
	@Log(title = "${tableComment}", businessType = BusinessType.DELETE)
	@PostMapping( "/remove")
	@ResponseBody
	public AjaxResult remove(String ids)
	{		
		return toAjax(userRoomService.deleteUserRoomByIds(ids));
	}
	
}
