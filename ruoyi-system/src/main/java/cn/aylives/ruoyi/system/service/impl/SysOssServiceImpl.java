package cn.aylives.ruoyi.system.service.impl;

import java.util.List;

import cn.aylives.ruoyi.system.mapper.SysOssMapper;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.aylives.ruoyi.system.domain.SysOss;
import cn.aylives.ruoyi.system.service.ISysOssService;

import tk.mybatis.mapper.entity.Example;
import tk.mybatis.mapper.entity.Example.Criteria;

@Service("sysOssService")
public class SysOssServiceImpl implements ISysOssService
{
    @Autowired
    private SysOssMapper sysOssMapper;

    /*
     * (non-Javadoc)
     * 
     * @see
     * com.zmr.wind.modules.sys.service.ISysOssService#getList(com.zmr.wind.
     * modules.sys.entity.SysOss)
     */
    @Override
    public List<SysOss> getList(SysOss sysOss)
    {
        Example example = new Example(SysOss.class);
        Criteria criteria = example.createCriteria();
        if (StringUtils.isNotBlank(sysOss.getFileName()))
        {
            criteria.andLike("fileName", "%" + sysOss.getFileName() + "%");
        }
        if (StringUtils.isNotBlank(sysOss.getFileSuffix()))
        {
            criteria.andEqualTo("fileSuffix", sysOss.getFileSuffix());
        }
        if (StringUtils.isNotBlank(sysOss.getCreateBy()))
        {
            criteria.andLike("createBy", sysOss.getCreateBy());
        }
        return sysOssMapper.selectByExample(example);
    }

    /* (non-Javadoc)
     * @see ISysOssService#save(SysOss)
     */
    @Override
    public int save(SysOss ossEntity)
    {
        return sysOssMapper.insertSelective(ossEntity);
    }

    /* (non-Javadoc)
     * @see ISysOssService#findById(java.lang.Long)
     */
    @Override
    public SysOss findById(Long ossId)
    {
        return sysOssMapper.selectByPrimaryKey(ossId);
    }

    /* (non-Javadoc)
     * @see ISysOssService#update(SysOss)
     */
    @Override
    public int update(SysOss sysOss)
    {
        return sysOssMapper.updateByPrimaryKeySelective(sysOss);
    }

    /* (non-Javadoc)
     * @see ISysOssService#deleteByIds(java.lang.String)
     */
    @Override
    public int deleteByIds(String ids)
    {
        return sysOssMapper.deleteByIds(ids);
    }
}
