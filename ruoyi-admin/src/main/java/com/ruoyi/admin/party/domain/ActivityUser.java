package com.ruoyi.admin.party.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.core.domain.BaseEntity;
import java.util.Date;

/**
 * 表 party_activity_user
 * 
 * @author flaty
 * @date 2019-07-02
 */
public class ActivityUser extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	
	/**  */
	private Integer id;
	/**  */
	private Integer agencyId;
	/**  */
	private Integer activityId;
	/**  */
	private Integer appUserId;
	/**  */
	private String pics;
	/**  */
	private Date createdDate;

	public void setId(Integer id) 
	{
		this.id = id;
	}

	public Integer getId() 
	{
		return id;
	}
	public void setAgencyId(Integer agencyId) 
	{
		this.agencyId = agencyId;
	}

	public Integer getAgencyId() 
	{
		return agencyId;
	}
	public void setActivityId(Integer activityId) 
	{
		this.activityId = activityId;
	}

	public Integer getActivityId() 
	{
		return activityId;
	}
	public void setAppUserId(Integer appUserId) 
	{
		this.appUserId = appUserId;
	}

	public Integer getAppUserId() 
	{
		return appUserId;
	}
	public void setPics(String pics) 
	{
		this.pics = pics;
	}

	public String getPics() 
	{
		return pics;
	}
	public void setCreatedDate(Date createdDate) 
	{
		this.createdDate = createdDate;
	}

	public Date getCreatedDate() 
	{
		return createdDate;
	}

    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("agencyId", getAgencyId())
            .append("activityId", getActivityId())
            .append("appUserId", getAppUserId())
            .append("pics", getPics())
            .append("createdDate", getCreatedDate())
            .toString();
    }
}
