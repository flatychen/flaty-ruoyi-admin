package cn.aylives.ruoyi.admin.config;

import cn.aylives.ruoyi.system.domain.SysDept;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;


@Configuration
@Slf4j
@Component
@ConfigurationProperties(prefix="aoyuejia")
@Data
public class AoyuejiaConfig {

    @Value("${ruoyi.rootDept:0}")
    private Integer rootDept;

    public Integer getRootDepts() {
        return rootDept;
    }

    public boolean isRootDept(SysDept dept) {
        if (dept == null || rootDept == null) {
            return false;
        } else {
            return rootDept.intValue() == dept.getAgencyId();
        }
    }

}

