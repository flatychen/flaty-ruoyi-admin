package cn.aylives.ruoyi.admin.modules.activity.service;

import cn.aylives.ruoyi.admin.modules.activity.domain.AppActivity;
import cn.aylives.ruoyi.admin.core.IService;

import java.util.List;

/**
 * app活动Service接口
 *
 * @author flaty
 * @date 2019-09-06
 */
public interface IAppActivityService extends IService<AppActivity> {
    /**
     * 查询app活动
     *
     * @param id app活动ID
     * @return app活动
     */
    public AppActivity selectActivityById(Long id);

    /**
     * 查询app活动列表
     *
     * @param activity app活动
     * @return app活动集合
     */
    public List<AppActivity> selectActivityList(AppActivity activity);

    /**
     * 新增app活动
     *
     * @param activity app活动
     * @return 结果
     */
    public int insertActivity(AppActivity activity);

    /**
     * 修改app活动
     *
     * @param activity app活动
     * @return 结果
     */
    public int updateActivity(AppActivity activity);

    /**
     * 批量删除app活动
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteActivityByIds(String ids);

    /**
     * 删除app活动信息
     *
     * @param id app活动ID
     * @return 结果
     */
    public int deleteActivityById(Long id);

}
