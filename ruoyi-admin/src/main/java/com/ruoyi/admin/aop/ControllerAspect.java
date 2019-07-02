package com.ruoyi.admin.aop;

import com.alibaba.fastjson.JSON;
import com.google.common.base.Stopwatch;
import com.ruoyi.common.utils.IpUtils;
import com.ruoyi.framework.util.ShiroUtils;
import org.apache.commons.lang3.StringUtils;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

@Aspect
@Component
public class ControllerAspect {


    private static final Logger log = LoggerFactory
            .getLogger(ControllerAspect.class);


    @Autowired(required = false)
    private HttpServletRequest request;

    @Around("@annotation(org.springframework.web.bind.annotation.ResponseBody))  ")
    public Object RequestPointCut(ProceedingJoinPoint pjp)
            throws Throwable {
        String requestIp = IpUtils.getIpAddr(request);
        logRequestLog(requestIp);
        Stopwatch watch = Stopwatch.createStarted();
        Object result = pjp.proceed();
        watch.stop();
        log.info("[{}:{}],response <= {},time:{}", requestIp, request.getServletPath(),
                 JSON.toJSONString(result), watch.toString());
        return result;
    }


    public Object parseRequest() {
        return request.getParameterMap();
    }


//    @Around("execution(* cn.aylives.wyapi.web.exception..*(..))" )
//    public Object exceptionPointCut(ProceedingJoinPoint pjp)
//            throws Throwable {
//        Object result = pjp.proceed();
//        log.error("error [{}:{}],request:{},response <= {} ", WebUtil.getRealIpAddr(request), request.getServletPath
//                (), JSON.toJSONString
//                (result), JSON.toJSONString(result));
//        return result;
//    }

    private void logRequestLog(String requestIp) {
        String requestId = MDC.get("requestId");
        if (StringUtils.isEmpty(requestId)) {
            MDC.put("requestId", ShiroUtils.getLoginName());
        }
        log.info("[{}:{}],request  => {}", requestIp, request.getServletPath(), parseRequest().toString());
    }


}
