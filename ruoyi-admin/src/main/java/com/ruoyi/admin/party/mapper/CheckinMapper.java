package com.ruoyi.admin.party.mapper;

import com.ruoyi.admin.party.domain.Checkin;
import java.util.List;	

/**
 *  数据层
 * 
 * @author flaty
 * @date 2019-07-02
 */
public interface CheckinMapper 
{
	/**
     * 查询信息
     * 
     * @param id ID
     * @return 信息
     */
	public Checkin selectCheckinById(Integer id);
	
	/**
     * 查询列表
     * 
     * @param checkin 信息
     * @return 集合
     */
	public List<Checkin> selectCheckinList(Checkin checkin);
	
	/**
     * 新增
     * 
     * @param checkin 信息
     * @return 结果
     */
	public int insertCheckin(Checkin checkin);
	
	/**
     * 修改
     * 
     * @param checkin 信息
     * @return 结果
     */
	public int updateCheckin(Checkin checkin);
	
	/**
     * 删除
     * 
     * @param id ID
     * @return 结果
     */
	public int deleteCheckinById(Integer id);
	
	/**
     * 批量删除
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteCheckinByIds(String[] ids);
	
}