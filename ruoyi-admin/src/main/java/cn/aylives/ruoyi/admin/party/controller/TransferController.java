package cn.aylives.ruoyi.admin.party.controller;

import cn.aylives.ruoyi.admin.core.dept.DeptData;
import cn.aylives.ruoyi.admin.core.join.ServiceJoinHelper;
import cn.aylives.ruoyi.admin.party.domain.Transfer;
import cn.aylives.ruoyi.admin.party.domain.excle.TransferExcle;
import cn.aylives.ruoyi.admin.party.service.ITransferService;
import cn.aylives.ruoyi.admin.property.service.impl.AgencyViewServiceImpl;
import cn.aylives.ruoyi.common.annotation.Log;
import cn.aylives.ruoyi.common.core.controller.BaseController;
import cn.aylives.ruoyi.common.core.domain.AjaxResult;
import cn.aylives.ruoyi.common.core.page.TableDataInfo;
import cn.aylives.ruoyi.common.enums.BusinessType;
import cn.aylives.ruoyi.common.utils.poi.ExcelUtil;
import cn.aylives.ruoyi.system.domain.SysDept;
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
@RequestMapping("/party/transfer")
public class TransferController extends BaseController
{
    private String prefix = "party/transfer";
	
	@Autowired
	private ITransferService transferService;



	@Autowired
	AgencyViewServiceImpl agencyViewService;

	
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
	public TableDataInfo list(@DeptData SysDept sysDept, Transfer transfer)
	{
		startPage();
		transfer.setAgencyId(sysDept.getAgencyId());
        List<Transfer> list = transferService.selectTransferList(transfer);
		ServiceJoinHelper.join(Transfer.class, list, agencyViewService);
		return getDataTable(list);
	}
	
	
	/**
	 * 导出列表
	 */
	@RequiresPermissions("party:transfer:list")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Transfer transfer)
    {
    	List<Transfer> list = transferService.selectTransferList(transfer);
		ServiceJoinHelper.join(Transfer.class, list, agencyViewService);
        ExcelUtil<TransferExcle> util = new ExcelUtil<TransferExcle>(TransferExcle.class);
		List<TransferExcle> target = orikaMapperFacade.mapAsList(list, TransferExcle.class);
        return util.exportExcel(target, "transfer");
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
