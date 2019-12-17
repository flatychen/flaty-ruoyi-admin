package cn.aylives.ruoyi.admin.activity.service.impl;
import cn.aylives.ruoyi.admin.activity.domain.AppActivity;
import cn.aylives.ruoyi.admin.activity.domain.AppActivityAgency;
import cn.aylives.ruoyi.admin.activity.mapper.AppActivityAgencyMapper;
import cn.aylives.ruoyi.admin.activity.mapper.AppActivityMapper;
import cn.aylives.ruoyi.admin.activity.service.IAppActivityService;
import cn.aylives.ruoyi.admin.core.impl.AbstractService;
import cn.aylives.ruoyi.common.core.text.Convert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * app活动Service业务层处理
 *
 * @author flaty
 * @date 2019-09-06
 */
@Service
public class AppActivityServiceImpl extends AbstractService<AppActivity> implements IAppActivityService {

    @Autowired
    private AppActivityMapper activityMapper;

    @Autowired
    AppActivityAgencyMapper appActivityAgencyMapper;

    /**
     * 查询app活动
     *
     * @param id app活动ID
     * @return app活动
     */
    @Override
    public AppActivity selectActivityById(Long id) {
        return activityMapper.selectActivityById(id);
    }

    /**
     * 查询app活动列表
     *
     * @param activity app活动
     * @return app活动
     */
    @Override
    public List<AppActivity> selectActivityList(AppActivity activity) {
        return activityMapper.selectActivityList(activity);
    }

    /**
     * 新增app活动
     *
     * @param activity app活动
     * @return 结果
     */
    @Override
    public int insertActivity(AppActivity activity) {
        activity.setCreatedDate(new Date());


        int result = activityMapper.insertActivity(activity);


        AppActivityAgency appActivityAgency = new AppActivityAgency();
        appActivityAgency.setActivityId(activity.getId());
        appActivityAgency.setAgencyId(0L);

        appActivityAgencyMapper.insert(appActivityAgency);

        return result;
    }

    /**
     * 修改app活动
     *
     * @param activity app活动
     * @return 结果
     */
    @Override
    public int updateActivity(AppActivity activity) {
        return activityMapper.updateActivity(activity);
    }

    /**
     * 删除app活动对象
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteActivityByIds(String ids) {
        return activityMapper.deleteActivityByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除app活动信息
     *
     * @param id app活动ID
     * @return 结果
     */
    @Override
	public int deleteActivityById(Long id) {
        return activityMapper.deleteActivityById(id);
    }


}
