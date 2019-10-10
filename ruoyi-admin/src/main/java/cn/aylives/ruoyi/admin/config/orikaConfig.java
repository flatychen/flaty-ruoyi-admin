package cn.aylives.ruoyi.admin.config;

import cn.aylives.ruoyi.admin.activity.domain.AppActivityUser;
import cn.aylives.ruoyi.admin.activity.domain.excle.AppActivityUserExcle;
import ma.glasnost.orika.MapperFactory;
import net.rakugakibox.spring.boot.orika.OrikaMapperFactoryConfigurer;
import org.springframework.stereotype.Component;


@Component
public class orikaConfig implements OrikaMapperFactoryConfigurer {


    @Override
    public void configure(MapperFactory orikaMapperFactory) {
        orikaMapperFactory.classMap(AppActivityUser.class, AppActivityUserExcle.class).field("agency.name", "agencyName")
        .byDefault().register();
    }
}

