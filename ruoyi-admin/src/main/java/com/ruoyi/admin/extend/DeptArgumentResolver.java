package com.ruoyi.admin.extend;

import com.ruoyi.common.utils.CookieUtil;
import com.ruoyi.common.utils.StringUtils;
import com.ruoyi.system.domain.SysDept;
import com.ruoyi.system.service.ISysDeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.MethodParameter;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.ModelAndViewContainer;

import javax.servlet.http.HttpServletRequest;

@Component
public class DeptArgumentResolver implements HandlerMethodArgumentResolver {

    @Autowired
    ISysDeptService iSysDeptService;


    @Override
    public boolean supportsParameter(MethodParameter parameter) {
        return parameter.hasParameterAnnotation(DeptData.class);
    }

    @Override
    public Object resolveArgument(MethodParameter parameter, ModelAndViewContainer mavContainer, NativeWebRequest webRequest, WebDataBinderFactory binderFactory) throws Exception {
        HttpServletRequest request = webRequest.getNativeRequest(HttpServletRequest.class);
        String deptId = CookieUtil.getCookieValue(request, "");
        if (StringUtils.isEmpty(deptId)) {
            throw new RuntimeException(StringUtils.format("cookie:[deptId]不存在，请选择右上角项目"));
        }
        SysDept sysDept =iSysDeptService.selectDeptById(Long.parseLong(deptId));
        if (sysDept == null) {
            throw new RuntimeException(StringUtils.format("deptId:[%s]不存在",deptId));
        }
        return sysDept;

    }
}

