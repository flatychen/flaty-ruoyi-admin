package com.ruoyi.admin.party.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.admin.core.impl.AbstractService;
import com.ruoyi.admin.party.mapper.CheckinMapper;
import com.ruoyi.admin.party.domain.Checkin;
import com.ruoyi.admin.party.service.ICheckinService;
import com.ruoyi.common.core.text.Convert;

/**
 *  服务层实现
 * 
 * @author flaty
 * @date 2019-07-10
 */
@Service
public class CheckinServiceImpl extends AbstractService<Checkin> implements ICheckinService
{
	@Autowired
	private CheckinMapper checkinMapper;

	/**
     * 查询信息
     * 
     * @param id ID
     * @return 信息
     */
    @Override
	public Checkin selectCheckinById(Integer id)
	{
	    return checkinMapper.selectCheckinById(id);
	}
	
	/**
     * 查询列表
     * 
     * @param checkin 信息
     * @return 集合
     */
	@Override
	public List<Checkin> selectCheckinList(Checkin checkin)
	{
	    return checkinMapper.selectCheckinList(checkin);
	}
	
    /**
     * 新增
     * 
     * @param checkin 信息
     * @return 结果
     */
	@Override
	public int insertCheckin(Checkin checkin)
	{
	    return checkinMapper.insertCheckin(checkin);
	}
	
	/**
     * 修改
     * 
     * @param checkin 信息
     * @return 结果
     */
	@Override
	public int updateCheckin(Checkin checkin)
	{
	    return checkinMapper.updateCheckin(checkin);
	}

	/**
     * 删除对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deleteCheckinByIds(String ids)
	{
		return checkinMapper.deleteCheckinByIds(Convert.toStrArray(ids));
	}
	
}
