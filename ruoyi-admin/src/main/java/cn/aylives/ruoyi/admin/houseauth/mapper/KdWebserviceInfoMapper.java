package cn.aylives.ruoyi.admin.houseauth.mapper;
import cn.aylives.ruoyi.admin.houseauth.domain.KdWebserviceInfo;
import java.util.List;
import cn.aylives.ruoyi.admin.core.MyMapper;
import cn.aylives.ruoyi.admin.houseauth.domain.KdWebserviceInfoExtend;

/**
 * 房屋认证结果Mapper接口
 *
 * @author flatyvm/java/mapper.java.vm
 * @date 2019-10-14
 */
public interface KdWebserviceInfoMapper extends MyMapper<KdWebserviceInfo>
{
	/**
	 * 查询房屋认证结果
	 *
	 * @param id 房屋认证结果ID
	 * @return 房屋认证结果
	 */
	public KdWebserviceInfo selectKdWebserviceInfoById(Integer id);

	/**
	 * 查询房屋认证结果列表
	 *
	 * @param kdWebserviceInfo 房屋认证结果
	 * @return 房屋认证结果集合
	 */
	public List<KdWebserviceInfoExtend> selectKdWebserviceInfoList(KdWebserviceInfo kdWebserviceInfo);

	/**
	 * 新增房屋认证结果
	 *
	 * @param kdWebserviceInfo 房屋认证结果
	 * @return 结果
	 */
	public int insertKdWebserviceInfo(KdWebserviceInfo kdWebserviceInfo);

	/**
	 * 修改房屋认证结果
	 *
	 * @param kdWebserviceInfo 房屋认证结果
	 * @return 结果
	 */
	public int updateKdWebserviceInfo(KdWebserviceInfo kdWebserviceInfo);

	/**
	 * 删除房屋认证结果
	 *
	 * @param id 房屋认证结果ID
	 * @return 结果
	 */
	public int deleteKdWebserviceInfoById(Integer id);

	/**
	 * 批量删除房屋认证结果
	 *
	 * @param ids 需要删除的数据ID
	 * @return 结果
	 */
	public int deleteKdWebserviceInfoByIds(String[] ids);
}
