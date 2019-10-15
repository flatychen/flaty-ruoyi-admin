package cn.aylives.ruoyi.admin.houseauth.service.impl;

import java.util.List;

import cn.aylives.ruoyi.admin.houseauth.domain.KdWebserviceInfoExtend;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cn.aylives.ruoyi.admin.core.impl.AbstractService;
import cn.aylives.ruoyi.admin.houseauth.mapper.KdWebserviceInfoMapper;
import cn.aylives.ruoyi.admin.houseauth.domain.KdWebserviceInfo;
import cn.aylives.ruoyi.admin.houseauth.service.IKdWebserviceInfoService;
import cn.aylives.ruoyi.common.core.text.Convert;
/**
 * 房屋认证结果Service业务层处理
 *
 * @author flaty
 * @date 2019-10-14
 */
@Service
public class KdWebserviceInfoServiceImpl extends AbstractService<KdWebserviceInfo> implements IKdWebserviceInfoService
{

	@Autowired
	private KdWebserviceInfoMapper kdWebserviceInfoMapper;

	/**
	 * 查询房屋认证结果
	 *
	 * @param id 房屋认证结果ID
	 * @return 房屋认证结果
	 */
	@Override
	public KdWebserviceInfo selectKdWebserviceInfoById(Integer id)
	{
		return kdWebserviceInfoMapper.selectKdWebserviceInfoById(id);
	}

	/**
	 * 查询房屋认证结果列表
	 *
	 * @param kdWebserviceInfo 房屋认证结果
	 * @return 房屋认证结果
	 */
	@Override
	public List<KdWebserviceInfoExtend> selectKdWebserviceInfoList(KdWebserviceInfo kdWebserviceInfo)
	{
		return kdWebserviceInfoMapper.selectKdWebserviceInfoList(kdWebserviceInfo);
	}

	/**
	 * 新增房屋认证结果
	 *
	 * @param kdWebserviceInfo 房屋认证结果
	 * @return 结果
	 */
	@Override
	public int insertKdWebserviceInfo(KdWebserviceInfo kdWebserviceInfo)
	{
		return kdWebserviceInfoMapper.insertKdWebserviceInfo(kdWebserviceInfo);
	}

	/**
	 * 修改房屋认证结果
	 *
	 * @param kdWebserviceInfo 房屋认证结果
	 * @return 结果
	 */
	@Override
	public int updateKdWebserviceInfo(KdWebserviceInfo kdWebserviceInfo)
	{
		return kdWebserviceInfoMapper.updateKdWebserviceInfo(kdWebserviceInfo);
	}

	/**
	 * 删除房屋认证结果对象
	 *
	 * @param ids 需要删除的数据ID
	 * @return 结果
	 */
	@Override
	public int deleteKdWebserviceInfoByIds(String ids)
	{
		return kdWebserviceInfoMapper.deleteKdWebserviceInfoByIds(Convert.toStrArray(ids));
	}

	/**
	 * 删除房屋认证结果信息
	 *
	 * @param id 房屋认证结果ID
	 * @return 结果
	 */
	public int deleteKdWebserviceInfoById(Integer id)
	{
		return kdWebserviceInfoMapper.deleteKdWebserviceInfoById(id);
	}

	
}
