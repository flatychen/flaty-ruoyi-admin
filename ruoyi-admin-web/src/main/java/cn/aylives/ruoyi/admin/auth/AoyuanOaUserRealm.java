package cn.aylives.ruoyi.admin.auth;

import cn.hutool.core.text.StrFormatter;
import cn.aylives.ruoyi.framework.shiro.realm.UserRealm;
import cn.aylives.ruoyi.system.domain.SysUser;
import cn.aylives.ruoyi.system.service.ISysRoleService;
import cn.aylives.ruoyi.system.service.ISysUserService;
import org.apache.shiro.authc.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;

/**
 * 自定义Realm 处理登录 权限
 *
 * @author ruoyi
 */
public class AoyuanOaUserRealm extends UserRealm {
    private static final Logger log = LoggerFactory.getLogger(AoyuanOaUserRealm.class);


    @Autowired
    private ISysUserService userService;

    @Autowired
    ISysRoleService iSysRoleService;

    /**
     * 登录认证
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        String oaUserName = token.getPrincipal().toString();
        // 查询用户信息
        SysUser user = userService.selectUserByLoginName(oaUserName);
        if (user == null) {
            log.warn(StrFormatter.format("用户名:{} 不存在",oaUserName));
            throw new AuthenticationException(StrFormatter.format("用户名:{} 不存在",oaUserName));
        }
        if (CollectionUtils.isEmpty(iSysRoleService.selectRoleKeys(user.getUserId()))) {
            log.warn(StrFormatter.format("用户名:{} 角色不存在 ",oaUserName));
            throw new AuthenticationException(StrFormatter.format("用户名:{} 角色不存在 ",oaUserName));
        }

        SimpleAuthenticationInfo info = new SimpleAuthenticationInfo(user, token.getCredentials(), getName());
        return info;
    }
}
