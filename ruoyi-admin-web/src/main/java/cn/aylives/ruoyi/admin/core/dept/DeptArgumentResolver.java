package cn.aylives.ruoyi.admin.core.dept;

import cn.aylives.ruoyi.common.exception.BusinessException;
import cn.aylives.ruoyi.common.utils.CookieUtil;
import cn.aylives.ruoyi.common.utils.StringUtils;
import cn.aylives.ruoyi.common.utils.spring.SpringUtils;
import cn.aylives.ruoyi.system.domain.SysDept;
import cn.aylives.ruoyi.system.service.ISysDeptService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.MethodParameter;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.ModelAndViewContainer;

import javax.servlet.http.HttpServletRequest;

@Slf4j
public class DeptArgumentResolver implements HandlerMethodArgumentResolver {



    private ISysDeptService getISysDeptService() {
        return SpringUtils.getBean(ISysDeptService.class);
    }


    @Override
    public boolean supportsParameter(MethodParameter parameter) {
        boolean result = parameter.hasParameterAnnotation(DeptData.class);
        return result;
    }

    @Override
    public Object resolveArgument(MethodParameter parameter, ModelAndViewContainer mavContainer, NativeWebRequest webRequest, WebDataBinderFactory binderFactory) throws Exception {
        HttpServletRequest request = webRequest.getNativeRequest(HttpServletRequest.class);
        String deptId = CookieUtil.getCookieValue(request, "deptId");
        if (StringUtils.isEmpty(deptId)) {
//            log.warn("cookie:[deptId]不存在，请先在右上角【选择项目】");
            throw new BusinessException(StringUtils.format("请先在右上角【选择项目】"));
        }
        SysDept sysDept =getISysDeptService().selectDeptById(Long.parseLong(deptId));
        if (sysDept == null) {
            throw new BusinessException(StringUtils.format("deptId:[%s]不存在",deptId));
        }
        if (!sysDept.isValidDept()) {
            throw new BusinessException(("请先在右上角【选择项目】选择真实有效的项目"));
        }
        return sysDept;

    }
}

