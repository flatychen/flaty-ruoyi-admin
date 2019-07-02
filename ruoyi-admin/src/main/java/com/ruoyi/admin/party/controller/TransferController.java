package com.ruoyi.admin.party.controller;

import java.util.List;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.admin.party.domain.Transfer;
import com.ruoyi.admin.party.service.ITransferService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;

/**
 *  信息操作处理
 * 
 * @author flaty
 * @date 2019-07-02
 */
@Controller
@RequestMapping("/party/transfer")
public class TransferController extends BaseController
{
    private String prefix = "party/transfer";
	
	@Autowired
	private ITransferService transferService;
	
	@RequiresPermissions("party:transfer:view")
	@GetMapping()
	public String transfer()
	{
	    return prefix + "/transfer";
	}
	
	/**
	 * 查询列表
	 */
	@RequiresPermissions("party:transfer:list")
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(Transfer transfer)
	{
		startPage();
        List<Transfer> list = transferService.selectTransferList(transfer);
		return getDataTable(list);
	}
	
	
	/**
	 * 导出列表
	 */
	@RequiresPermissions("party:transfer:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Transfer transfer)
    {
    	List<Transfer> list = transferService.selectTransferList(transfer);
        ExcelUtil<Transfer> util = new ExcelUtil<Transfer>(Transfer.class);
        return util.exportExcel(list, "transfer");
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
	@RequiresPermissions("party:transfer:add")
	@Log(title = "", businessType = BusinessType.INSERT)
	@PostMapping("/add")
	@ResponseBody
	public AjaxResult addSave(Transfer transfer)
	{		
		return toAjax(transferService.insertTransfer(transfer));
	}

	/**
	 * 修改
	 */
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable("id") Integer id, ModelMap mmap)
	{
		Transfer transfer = transferService.selectTransferById(id);
		mmap.put("transfer", transfer);
	    return prefix + "/edit";
	}
	
	/**
	 * 修改保存
	 */
	@RequiresPermissions("party:transfer:edit")
	@Log(title = "", businessType = BusinessType.UPDATE)
	@PostMapping("/edit")
	@ResponseBody
	public AjaxResult editSave(Transfer transfer)
	{		
		return toAjax(transferService.updateTransfer(transfer));
	}
	
	/**
	 * 删除
	 */
	@RequiresPermissions("party:transfer:remove")
	@Log(title = "", businessType = BusinessType.DELETE)
	@PostMapping( "/remove")
	@ResponseBody
	public AjaxResult remove(String ids)
	{		
		return toAjax(transferService.deleteTransferByIds(ids));
	}
	
}
