package cn.aylives.ruoyi.admin.property.controller;

import java.util.Date;
import java.util.List;

import cn.aylives.ruoyi.admin.core.join.ServiceJoinHelper;
import cn.aylives.ruoyi.admin.property.domain.Reversions;
import cn.aylives.ruoyi.admin.property.service.ISysAgencyService;
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
import cn.aylives.ruoyi.admin.property.domain.HousekeeperCommentTag;
import cn.aylives.ruoyi.admin.property.service.IHousekeeperCommentTagService;
import cn.aylives.ruoyi.common.core.controller.BaseController;
import cn.aylives.ruoyi.common.core.page.TableDataInfo;
import cn.aylives.ruoyi.common.core.domain.AjaxResult;
import cn.aylives.ruoyi.common.utils.poi.ExcelUtil;
import cn.aylives.ruoyi.system.domain.SysDept;
import cn.aylives.ruoyi.admin.core.dept.DeptData;
/**
 * CommentTagController
 *
 * @author flaty
 * @date 2019-10-15
 */
@Controller
@RequestMapping("/property/CommentTag")
public class HousekeeperCommentTagController extends BaseController
{
	private String prefix = "property/CommentTag";

	@Autowired
	private IHousekeeperCommentTagService housekeeperCommentTagService;


	@Autowired
	private ISysAgencyService iSysAgencyService;


	@RequiresPermissions("property:CommentTag:view")
	@GetMapping()
	public String housekeeperCommentTag()
	{
	    return prefix + "/CommentTag";
	}

	/**
	 * 选择列表
	 */
	@GetMapping("/select")
	public String housekeeperCommentTagSelect()
	{
		return prefix + "/select";
	}


	/**
	 * 选择列表数据
	 */
	@PostMapping("/select/list")
	@ResponseBody
	public TableDataInfo selectList(@DeptData SysDept sysDept,HousekeeperCommentTag housekeeperCommentTag)
	{
		startPage();
		List<HousekeeperCommentTag> list = housekeeperCommentTagService.selectHousekeeperCommentTagList(housekeeperCommentTag);
		return getDataTable(list);
	}


	/**
	 * 查询CommentTag列表
	 */
	@RequiresPermissions("property:CommentTag:list")
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(HousekeeperCommentTag housekeeperCommentTag)
	{
		startPage();
		List<HousekeeperCommentTag> list = housekeeperCommentTagService.selectHousekeeperCommentTagList(housekeeperCommentTag);
		ServiceJoinHelper.join(HousekeeperCommentTag.class, list, iSysAgencyService);

		return getDataTable(list);
	}



	/**
	 * 导出CommentTag列表
	 */
	@RequiresPermissions("property:CommentTag:export")
	@PostMapping("/export")
	@ResponseBody
	public AjaxResult export(HousekeeperCommentTag housekeeperCommentTag)
	{
		List<HousekeeperCommentTag> list = housekeeperCommentTagService.selectHousekeeperCommentTagList(housekeeperCommentTag);
		ExcelUtil<HousekeeperCommentTag> util = new ExcelUtil<HousekeeperCommentTag>(HousekeeperCommentTag.class);
		return util.exportExcel(list, "CommentTag");
	}

	/**
	 * 新增CommentTag
	 */
	@GetMapping(value = { "/add/{id}", "/add" })
	public String add(@PathVariable(value = "id", required = false) Long id, ModelMap mmap)
	{
		if (StringUtils.isNotNull(id))
		{
			mmap.put("housekeeperCommentTag", housekeeperCommentTagService.selectHousekeeperCommentTagById(id));
		}
		return prefix + "/add";
	}

	/**
	 * 新增保存CommentTag
	 */
	@RequiresPermissions("property:CommentTag:add")
	@Log(title = "CommentTag", businessType = BusinessType.INSERT)
	@PostMapping("/add")
	@ResponseBody
	public AjaxResult addSave(HousekeeperCommentTag housekeeperCommentTag)
	{

		housekeeperCommentTag.setCreatedDate( new Date());
		return toAjax(housekeeperCommentTagService.insertHousekeeperCommentTag(housekeeperCommentTag));
	}

	/**
	 * 修改CommentTag
	 */
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable("id") Long id, ModelMap mmap)
	{
		HousekeeperCommentTag housekeeperCommentTag = housekeeperCommentTagService.selectHousekeeperCommentTagById(id);
		mmap.put("housekeeperCommentTag", housekeeperCommentTag);
		return prefix + "/edit";
	}

	/**
	 * 修改保存CommentTag
	 */
	@RequiresPermissions("property:CommentTag:edit")
	@Log(title = "CommentTag", businessType = BusinessType.UPDATE)
	@PostMapping("/edit")
	@ResponseBody
	public AjaxResult editSave(HousekeeperCommentTag housekeeperCommentTag)
	{
		return toAjax(housekeeperCommentTagService.updateHousekeeperCommentTag(housekeeperCommentTag));
	}
	
	/**
	 * 删除CommentTag
	 */
	@RequiresPermissions("property:CommentTag:remove")
	@Log(title = "${tableComment}", businessType = BusinessType.DELETE)
	@PostMapping( "/remove")
	@ResponseBody
	public AjaxResult remove(String ids)
	{		
		return toAjax(housekeeperCommentTagService.deleteHousekeeperCommentTagByIds(ids));
	}
	
}
