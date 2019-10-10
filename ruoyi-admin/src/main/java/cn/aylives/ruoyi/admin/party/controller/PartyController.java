package cn.aylives.ruoyi.admin.party.controller;

import cn.aylives.ruoyi.admin.property.domain.Agency;
import cn.aylives.ruoyi.admin.property.service.ISysAgencyService;
import cn.aylives.ruoyi.admin.core.dept.DeptData;
import cn.aylives.ruoyi.common.core.controller.BaseController;
import cn.aylives.ruoyi.common.core.domain.AjaxResult;
import cn.aylives.ruoyi.system.domain.SysDept;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 项目 信息操作处理
 *
 * @author flaty
 * @date 2019-07-01
 */
@Controller
@RequestMapping("/party/")
public class PartyController extends BaseController {
    private String prefix = "party/agency";

    @Autowired
    private ISysAgencyService agencyService;


    /**
     * 修改项目
     */
    @GetMapping("/edit")
    @RequiresPermissions("party:edit")
    public String edit(@DeptData SysDept sysDept, ModelMap mmap) {
        Agency agency = agencyService.selectSysAgencyById(sysDept.getAgencyId());
        mmap.put("agency", agency);
        System.out.println("xx");
        return prefix + "/edit";
    }

    /**
     * 修改保存项目
     */
    @RequiresPermissions("party:edit")
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Agency agency) {
        return toAjax(agencyService.updateSysAgency(agency));
    }


}