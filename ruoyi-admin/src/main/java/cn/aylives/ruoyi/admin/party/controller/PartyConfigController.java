package cn.aylives.ruoyi.admin.party.controller;

import java.util.List;

import cn.aylives.ruoyi.admin.party.domain.PartyConfig;
import cn.aylives.ruoyi.admin.party.service.IPartyConfigService;
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
import cn.aylives.ruoyi.common.core.controller.BaseController;
import cn.aylives.ruoyi.common.core.page.TableDataInfo;
import cn.aylives.ruoyi.common.core.domain.AjaxResult;
import cn.aylives.ruoyi.common.utils.poi.ExcelUtil;
import cn.aylives.ruoyi.system.domain.SysDept;
import cn.aylives.ruoyi.admin.core.dept.DeptData;
/**
 * 党建配置Controller
 *
 * @author flaty
 * @date 2019-10-22
 */
@Controller
@RequestMapping("/party/config")
public class PartyConfigController extends BaseController
{
	private String prefix = "party/config";

	@Autowired
	private IPartyConfigService partyConfigService;

	@RequiresPermissions("party:config:view")
	@GetMapping()
	public String partyConfig()
	{
	    return prefix + "/config";
	}

	/**
	 * 选择列表
	 */
	@GetMapping("/select")
	public String partyConfigSelect()
	{
		return prefix + "/select";
	}


	/**
	 * 选择列表数据
	 */
	@PostMapping("/select/list")
	@ResponseBody
	public TableDataInfo selectList(@DeptData SysDept sysDept, PartyConfig partyConfig)
	{
		startPage();
		List<PartyConfig> list = partyConfigService.selectPartyConfigList(partyConfig);
		return getDataTable(list);
	}


	/**
	 * 查询党建配置列表
	 */
	@RequiresPermissions("party:config:list")
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(PartyConfig partyConfig)
	{
		startPage();
		List<PartyConfig> list = partyConfigService.selectPartyConfigList(partyConfig);
		return getDataTable(list);
	}



	/**
	 * 导出党建配置列表
	 */
	@RequiresPermissions("party:config:list")
	@PostMapping("/export")
	@ResponseBody
	public AjaxResult export(PartyConfig partyConfig)
	{
		List<PartyConfig> list = partyConfigService.selectPartyConfigList(partyConfig);
		ExcelUtil<PartyConfig> util = new ExcelUtil<PartyConfig>(PartyConfig.class);
		return util.exportExcel(list, "config");
	}


	/**
	 * 修改党建配置
	 */
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable("id") Integer id, ModelMap mmap)
	{
		PartyConfig partyConfig = partyConfigService.selectPartyConfigById(id);
		mmap.put("partyConfig", partyConfig);
		return prefix + "/edit";
	}

	/**
	 * 修改保存党建配置
	 */
	@RequiresPermissions("party:config:edit")
	@Log(title = "党建配置", businessType = BusinessType.UPDATE)
	@PostMapping("/edit")
	@ResponseBody
	public AjaxResult editSave(PartyConfig partyConfig)
	{
		return toAjax(partyConfigService.updatePartyConfig(partyConfig));
	}

}
