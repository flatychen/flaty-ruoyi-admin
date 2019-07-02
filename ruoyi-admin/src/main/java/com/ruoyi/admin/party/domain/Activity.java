package com.ruoyi.admin.party.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.core.domain.BaseEntity;
import java.util.Date;

/**
 * 表 party_activity
 * 
 * @author flaty
 * @date 2019-07-02
 */
public class Activity extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	
	/**  */
	private Integer id;
	/**  */
	private String title;
	/**  */
	private String desc;
	/**  */
	private String descUrl;
	/**  */
	private String imgUrl;
	/**  */
	private Date createdDate;
	/**  */
	private Integer agencyId;

	public void setId(Integer id) 
	{
		this.id = id;
	}

	public Integer getId() 
	{
		return id;
	}
	public void setTitle(String title) 
	{
		this.title = title;
	}

	public String getTitle() 
	{
		return title;
	}
	public void setDesc(String desc) 
	{
		this.desc = desc;
	}

	public String getDesc() 
	{
		return desc;
	}
	public void setDescUrl(String descUrl) 
	{
		this.descUrl = descUrl;
	}

	public String getDescUrl() 
	{
		return descUrl;
	}
	public void setImgUrl(String imgUrl) 
	{
		this.imgUrl = imgUrl;
	}

	public String getImgUrl() 
	{
		return imgUrl;
	}
	public void setCreatedDate(Date createdDate) 
	{
		this.createdDate = createdDate;
	}

	public Date getCreatedDate() 
	{
		return createdDate;
	}
	public void setAgencyId(Integer agencyId) 
	{
		this.agencyId = agencyId;
	}

	public Integer getAgencyId() 
	{
		return agencyId;
	}

    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("title", getTitle())
            .append("desc", getDesc())
            .append("descUrl", getDescUrl())
            .append("imgUrl", getImgUrl())
            .append("createdDate", getCreatedDate())
            .append("agencyId", getAgencyId())
            .toString();
    }
}
