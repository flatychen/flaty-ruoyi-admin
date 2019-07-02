package com.ruoyi.admin.party.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.core.domain.BaseEntity;
import java.util.Date;

/**
 * 表 party_transfer
 * 
 * @author flaty
 * @date 2019-07-02
 */
public class Transfer extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	
	/**  */
	private Integer id;
	/**  */
	private String name;
	/**  */
	private Integer sex;
	/**  */
	private String birthday;
	/**  */
	private String nation;
	/**  */
	private String education;
	/**  */
	private String currentParty;
	/**  */
	private String addPartyDate;
	/**  */
	private String companyDuty;
	/**  */
	private String homeAddress;
	/**  */
	private String companyPartyPhone;
	/**  */
	private String phone;
	/**  */
	private String others;
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
	public void setSex(Integer sex) 
	{
		this.sex = sex;
	}

	public Integer getSex() 
	{
		return sex;
	}
	public void setBirthday(String birthday) 
	{
		this.birthday = birthday;
	}

	public String getBirthday() 
	{
		return birthday;
	}
	public void setNation(String nation) 
	{
		this.nation = nation;
	}

	public String getNation() 
	{
		return nation;
	}
	public void setEducation(String education) 
	{
		this.education = education;
	}

	public String getEducation() 
	{
		return education;
	}
	public void setCurrentParty(String currentParty) 
	{
		this.currentParty = currentParty;
	}

	public String getCurrentParty() 
	{
		return currentParty;
	}
	public void setAddPartyDate(String addPartyDate) 
	{
		this.addPartyDate = addPartyDate;
	}

	public String getAddPartyDate() 
	{
		return addPartyDate;
	}
	public void setCompanyDuty(String companyDuty) 
	{
		this.companyDuty = companyDuty;
	}

	public String getCompanyDuty() 
	{
		return companyDuty;
	}
	public void setHomeAddress(String homeAddress) 
	{
		this.homeAddress = homeAddress;
	}

	public String getHomeAddress() 
	{
		return homeAddress;
	}
	public void setCompanyPartyPhone(String companyPartyPhone) 
	{
		this.companyPartyPhone = companyPartyPhone;
	}

	public String getCompanyPartyPhone() 
	{
		return companyPartyPhone;
	}
	public void setPhone(String phone) 
	{
		this.phone = phone;
	}

	public String getPhone() 
	{
		return phone;
	}
	public void setOthers(String others) 
	{
		this.others = others;
	}

	public String getOthers() 
	{
		return others;
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
            .append("sex", getSex())
            .append("birthday", getBirthday())
            .append("nation", getNation())
            .append("education", getEducation())
            .append("currentParty", getCurrentParty())
            .append("addPartyDate", getAddPartyDate())
            .append("companyDuty", getCompanyDuty())
            .append("homeAddress", getHomeAddress())
            .append("companyPartyPhone", getCompanyPartyPhone())
            .append("phone", getPhone())
            .append("others", getOthers())
            .append("agencyId", getAgencyId())
            .append("createdDate", getCreatedDate())
            .append("appUserId", getAppUserId())
            .toString();
    }
}
