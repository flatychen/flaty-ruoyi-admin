package cn.aylives.ruoyi.admin.auth;

import org.apache.shiro.authc.AuthenticationToken;

/**
 *
 * OA帐号token
 *
 */
public class AoyuanOaAuthToken implements AuthenticationToken {


    public AoyuanOaAuthToken(String oaAccount) {
        this.oaAccount = oaAccount;
    }

    private String oaAccount;

    @Override
    public Object getPrincipal() {
        return oaAccount;
    }

    @Override
    public Object getCredentials() {
        return oaAccount;
    }
}

