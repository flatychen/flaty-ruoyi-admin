package cn.aylives.ruoyi.admin.config;

import ma.glasnost.orika.MapperFactory;
import net.rakugakibox.spring.boot.orika.OrikaMapperFactoryConfigurer;
import org.springframework.stereotype.Component;


@Component
public class orikaConfig implements OrikaMapperFactoryConfigurer {


    @Override
    public void configure(MapperFactory orikaMapperFactory) {
//        this.buildAgencyMapper(orikaMapperFactory,AppActivityUser.class, AppActivityUserExcle.class);
    }


    private void buildAgencyMapper(MapperFactory orikaMapperFactory,Class aType, Class bType) {
        orikaMapperFactory.classMap(aType, bType)
                .field("agencyView.agencyName", "agencyName")
                .field("agencyView.provinceName", "provinceName")
                .field("agencyView.cityName", "cityName")
                .field("agencyView.groupName", "groupName")
                .byDefault().register();
    }

}

