package cn.aylives.ruoyi.admin.property.service.impl;

import cn.aylives.ruoyi.admin.core.join.ServiceJoinable;
import cn.aylives.ruoyi.admin.property.domain.AgencyView;
import cn.aylives.ruoyi.admin.property.mapper.SysAgencyMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 * 项目视图扩展服务
 *
 * @author flaty
 */
@Service
public class AgencyViewServiceImpl implements ServiceJoinable<AgencyView> {
    @Autowired
    private SysAgencyMapper sysAgencyMapper;

    @Override
    public List<AgencyView> findByIds(List<Integer> ids) {
        return sysAgencyMapper.selectViewByIds(ids);
    }
}

