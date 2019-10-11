package cn.aylives.ruoyi.admin.oa;

import cn.hutool.core.text.StrFormatter;
import cn.aylives.ruoyi.admin.oa.model.QueryUserResult;
import cn.aylives.ruoyi.admin.oa.service.OaService;
import cn.aylives.ruoyi.common.core.controller.BaseController;
import cn.aylives.ruoyi.common.exception.BusinessException;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author flaty
 * @date 2019-07-05
 */
@Controller
@RequestMapping("/oa/")
public class OaUserLoginController extends BaseController {

    @Autowired
    OaService oaService;

    @RequestMapping("/auth")
    public String login(@RequestParam("loginToken") String token) {
        QueryUserResult queryUserResult = oaService.authUser(token);
        UsernamePasswordToken usernamePasswordToken = new UsernamePasswordToken(queryUserResult.getUsername(), "OaUserLoginController");
        try {
            Subject subject = SecurityUtils.getSubject();
            subject.login(usernamePasswordToken);
        } catch (AuthenticationException e) {
            logger.error("AuthenticationException {}", e.getMessage());
            throw new BusinessException(StrFormatter.format("oa登录失败!请检查用户:{}是否在管理后台添加和是否分配角色！", usernamePasswordToken.getUsername()));
        }
        return "redirect:/index";
    }


}
