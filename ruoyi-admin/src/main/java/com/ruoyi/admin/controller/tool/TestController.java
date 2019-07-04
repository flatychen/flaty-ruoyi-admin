package com.ruoyi.admin.controller.tool;

import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * build 表单构建
 * 
 * @author ruoyi
 */
@RestController
@RequestMapping("/tool/test")
public class TestController extends BaseController
{

    @RequestMapping()
    public Object build()
    {
        return AjaxResult.success();
    }
}
