package shiro;

import cn.aylives.ruoyi.framework.shiro.service.SysPasswordService;
import org.junit.Test;

public class SysPwdServiceTest {

    @Test
    public void pwdGen() {
        SysPasswordService sysPasswordService = new SysPasswordService();
        String pwd = sysPasswordService.encryptPassword("root", "baiwjgg", "57fd69");
        System.out.println(pwd);
    }
}

