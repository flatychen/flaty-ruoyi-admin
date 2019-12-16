package cn.aylives.ruoyi.admin.auth;

import cn.aylives.ruoyi.framework.shiro.realm.UserRealm;
import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authc.pam.AbstractAuthenticationStrategy;
import org.apache.shiro.realm.Realm;

/**
 * 奥悦家统一认证策略。用于区分OA帐号和个人帐号登录
 *
 */
@Slf4j
public class AoyuejiaAuthenticationStrategy extends AbstractAuthenticationStrategy {

    @Override
    public AuthenticationInfo afterAttempt(Realm realm, AuthenticationToken token, AuthenticationInfo singleRealmInfo,
                                           AuthenticationInfo aggregateInfo, Throwable t) throws AuthenticationException {

        if (token instanceof AoyuanOaAuthToken && realm instanceof AoyuanOaUserRealm && t != null) {
            log.info("oa认证失败!oauser:{}",token.getPrincipal());
            throw new AuthenticationException(t.getMessage());
        }


        if (token instanceof UsernamePasswordToken && realm instanceof UserRealm && t != null) {
            log.info("常规认证失败!username:{}",token.getPrincipal());
            throw new AuthenticationException(t.getMessage());
        }

        return super.merge(singleRealmInfo,aggregateInfo);
    }
}

