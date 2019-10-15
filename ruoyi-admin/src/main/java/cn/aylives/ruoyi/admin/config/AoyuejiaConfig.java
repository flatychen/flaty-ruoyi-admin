package cn.aylives.ruoyi.admin.config;

import cn.aylives.ruoyi.system.domain.SysDept;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.util.List;


@Configuration
@Slf4j
@Component
@ConfigurationProperties(prefix="aoyuejia")
@Data
public class AoyuejiaConfig {

    private List<Integer> rootDepts;


    public boolean isRootDept(SysDept dept) {
        if (dept == null || CollectionUtils.isEmpty(rootDepts)) {
            return false;
        } else {
            return rootDepts.contains(dept.getAgencyId());
        }
    }

}

