package com.ruoyi.admin.party.service;

import com.ruoyi.admin.party.domain.Transfer;
import java.util.List;

/**
 *  服务层
 * 
 * @author flaty
 * @date 2019-07-02
 */
public interface ITransferService 
{
	/**
     * 查询信息
     * 
     * @param id ID
     * @return 信息
     */
	public Transfer selectTransferById(Integer id);
	
	/**
     * 查询列表
     * 
     * @param transfer 信息
     * @return 集合
     */
	public List<Transfer> selectTransferList(Transfer transfer);
	
	/**
     * 新增
     * 
     * @param transfer 信息
     * @return 结果
     */
	public int insertTransfer(Transfer transfer);
	
	/**
     * 修改
     * 
     * @param transfer 信息
     * @return 结果
     */
	public int updateTransfer(Transfer transfer);
		
	/**
     * 删除信息
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteTransferByIds(String ids);
	
}
