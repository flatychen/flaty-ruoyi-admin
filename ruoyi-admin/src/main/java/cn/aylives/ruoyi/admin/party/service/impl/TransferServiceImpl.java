package cn.aylives.ruoyi.admin.party.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cn.aylives.ruoyi.admin.core.impl.AbstractService;
import cn.aylives.ruoyi.admin.party.mapper.TransferMapper;
import cn.aylives.ruoyi.admin.party.domain.Transfer;
import cn.aylives.ruoyi.admin.party.service.ITransferService;
import cn.aylives.ruoyi.common.core.text.Convert;

/**
 *  服务层实现
 * 
 * @author flaty
 * @date 2019-07-10
 */
@Service
public class TransferServiceImpl extends AbstractService<Transfer> implements ITransferService
{
	@Autowired
	private TransferMapper transferMapper;

	/**
     * 查询信息
     * 
     * @param id ID
     * @return 信息
     */
    @Override
	public Transfer selectTransferById(Integer id)
	{
	    return transferMapper.selectTransferById(id);
	}
	
	/**
     * 查询列表
     * 
     * @param transfer 信息
     * @return 集合
     */
	@Override
	public List<Transfer> selectTransferList(Transfer transfer)
	{
	    return transferMapper.selectTransferList(transfer);
	}
	
    /**
     * 新增
     * 
     * @param transfer 信息
     * @return 结果
     */
	@Override
	public int insertTransfer(Transfer transfer)
	{
	    return transferMapper.insertTransfer(transfer);
	}
	
	/**
     * 修改
     * 
     * @param transfer 信息
     * @return 结果
     */
	@Override
	public int updateTransfer(Transfer transfer)
	{
	    return transferMapper.updateTransfer(transfer);
	}

	/**
     * 删除对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deleteTransferByIds(String ids)
	{
		return transferMapper.deleteTransferByIds(Convert.toStrArray(ids));
	}
	
}
