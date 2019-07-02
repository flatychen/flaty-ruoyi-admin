package com.ruoyi.admin.party.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.core.domain.BaseEntity;
import java.util.Date;

/**
 * 表 party_checkin
 * 
 * @author flaty
 * @date 2019-07-02
 */
public class Checkin extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	
	/**  */
	private Integer id;
	/**  */
	private String name;
	/**  */
	private String phone;
	/**  */
	private Integer sex;
	/**  */
	private String homeAddress;
	/**  */
	private String currentIdentity;
	/**  */
	private String currentPartyBranch;
	/**  */
	private String checkinImg;
	/**  */
	private Integer agencyId;
	/**  */
	private Date createdDate;
	/**  */
	private Integer appUserId;

	public void setId(Integer id) 
	{
		this.id = id;
	}

	public Integer getId() 
	{
		return id;
	}
	public void setName(String name) 
	{
		this.name = name;
	}

	public String getName() 
	{
		return name;
	}
	public void setPhone(String phone) 
	{
		this.phone = phone;
	}

	public String getPhone() 
	{
		return phone;
	}
	public void setSex(Integer sex) 
	{
		this.sex = sex;
	}

	public Integer getSex() 
	{
		return sex;
	}
	public void setHomeAddress(String homeAddress) 
	{
		this.homeAddress = homeAddress;
	}

	public String getHomeAddress() 
	{
		return homeAddress;
	}
	public void setCurrentIdentity(String currentIdentity) 
	{
		this.currentIdentity = currentIdentity;
	}

	public String getCurrentIdentity() 
	{
		return currentIdentity;
	}
	public void setCurrentPartyBranch(String currentPartyBranch) 
	{
		this.currentPartyBranch = currentPartyBranch;
	}

	public String getCurrentPartyBranch() 
	{
		return currentPartyBranch;
	}
	public void setCheckinImg(String checkinImg) 
	{
		this.checkinImg = checkinImg;
	}

	public String getCheckinImg() 
	{
		return checkinImg;
	}
	public void setAgencyId(Integer agencyId) 
	{
		this.agencyId = agencyId;
	}

	public Integer getAgencyId() 
	{
		return agencyId;
	}
	public void setCreatedDate(Date createdDate) 
	{
		this.createdDate = createdDate;
	}

	public Date getCreatedDate() 
	{
		return createdDate;
	}
	public void setAppUserId(Integer appUserId) 
	{
		this.appUserId = appUserId;
	}

	public Integer getAppUserId() 
	{
		return appUserId;
	}

    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("name", getName())
            .append("phone", getPhone())
            .append("sex", getSex())
            .append("homeAddress", getHomeAddress())
            .append("currentIdentity", getCurrentIdentity())
            .append("currentPartyBranch", getCurrentPartyBranch())
            .append("checkinImg", getCheckinImg())
            .append("agencyId", getAgencyId())
            .append("createdDate", getCreatedDate())
            .append("appUserId", getAppUserId())
            .toString();
    }
}
