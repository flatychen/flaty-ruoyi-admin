package cn.aylives.ruoyi.admin.property.controller;

import cn.aylives.ruoyi.admin.core.dept.DeptData;
import cn.aylives.ruoyi.admin.property.domain.KdWebserviceInfo;
import cn.aylives.ruoyi.admin.property.domain.KdWebserviceInfoExtend;
import cn.aylives.ruoyi.admin.property.service.IKdWebserviceInfoService;
import cn.aylives.ruoyi.common.core.controller.BaseController;
import cn.aylives.ruoyi.common.core.domain.AjaxResult;
import cn.aylives.ruoyi.common.core.page.TableDataInfo;
import cn.aylives.ruoyi.common.utils.poi.ExcelUtil;
import cn.aylives.ruoyi.system.domain.SysDept;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * 房屋认证结果Controller
 *
 * @author flaty
 * @date 2019-10-14
 */
@Controller
@RequestMapping("/house/auth")
public class KdWebserviceInfoController extends BaseController {

	@Autowired
	private HttpServletRequest request;

    private String prefix = "property/houseAuth/";

    @Autowired
    private IKdWebserviceInfoService kdWebserviceInfoService;

    @RequiresPermissions("house:auth:view")
    @GetMapping()
    public String kdWebserviceInfo() {
        return prefix + "/auth";
    }

    /**
     * 查询房屋认证结果列表
     */
    @RequiresPermissions("house:auth:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(@DeptData SysDept sysDept,KdWebserviceInfo kdWebserviceInfo) {

        startPage();
        kdWebserviceInfo.setAgencyId(sysDept.getAgencyId());
        List<KdWebserviceInfoExtend> list = kdWebserviceInfoService.selectKdWebserviceInfoList(kdWebserviceInfo);
        return getDataTable(list);
    }


    /**
     * 导出房屋认证结果列表
     */
    @RequiresPermissions("house:auth:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(KdWebserviceInfo kdWebserviceInfo) {
        List<KdWebserviceInfoExtend> list = kdWebserviceInfoService.selectKdWebserviceInfoList(kdWebserviceInfo);
        ExcelUtil<KdWebserviceInfoExtend> util = new ExcelUtil<KdWebserviceInfoExtend>(KdWebserviceInfoExtend.class);
        return util.exportExcel(list, "auth");
    }


}
