package cn.aylives.ruoyi.admin.party.mapper;

import cn.aylives.ruoyi.admin.core.MyMapper;
import cn.aylives.ruoyi.admin.party.domain.Transfer;

import java.util.List;

/**
 *  数据层
 * 
 * @author flaty
 * @date 2019-07-10
 */
public interface TransferMapper extends MyMapper<Transfer>
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
     * 删除
     * 
     * @param id ID
     * @return 结果
     */
	public int deleteTransferById(Integer id);
	
	/**
     * 批量删除
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteTransferByIds(String[] ids);
	
}