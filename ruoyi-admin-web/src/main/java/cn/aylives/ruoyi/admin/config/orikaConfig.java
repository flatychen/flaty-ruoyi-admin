package cn.aylives.ruoyi.admin.config;

import cn.aylives.ruoyi.admin.modules.activity.domain.AppActivityUser;
import cn.aylives.ruoyi.admin.modules.activity.domain.excle.AppActivityUserExcle;
import cn.aylives.ruoyi.admin.modules.party.domain.Checkin;
import cn.aylives.ruoyi.admin.modules.party.domain.Transfer;
import cn.aylives.ruoyi.admin.modules.party.domain.excle.CheckinExcle;
import cn.aylives.ruoyi.admin.modules.party.domain.excle.TransferExcle;
import ma.glasnost.orika.MapperFactory;
import net.rakugakibox.spring.boot.orika.OrikaMapperFactoryConfigurer;
import org.springframework.stereotype.Component;


@Component
public class orikaConfig implements OrikaMapperFactoryConfigurer {


    @Override
    public void configure(MapperFactory orikaMapperFactory) {
        this.buildAgencyMapper(orikaMapperFactory,AppActivityUser.class, AppActivityUserExcle.class);
        this.buildAgencyMapper(orikaMapperFactory,Checkin.class, CheckinExcle.class);
        this.buildAgencyMapper(orikaMapperFactory, Transfer.class, TransferExcle.class);
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

