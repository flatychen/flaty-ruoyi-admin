package com.ruoyi.admin.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.core.domain.BaseEntity;
import java.util.Date;

/**
 * 项目表 sys_agency
 * 
 * @author flaty
 * @date 2019-06-25
 */
public class SysAgency extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	
	/**  */
	private Integer iD;
	/**  */
	private String agencyCode;
	/** 组织主图 */
	private String imgUrl;
	/** 层次 */
	private String dEPTH;
	/** 类型 0:小区 1：商场 */
	private String tYPE;
	/** 是否有效 0:有效 1:无效 */
	private Integer isVerifi;
	/** 名称 */
	private String nAME;
	/** 地址 */
	private String aDDRESS;
	/** 联系方式 */
	private String cONTACT;
	/** 营业时间 */
	private String workTime;
	/** 简介 */
	private String iNTRODUCTION;
	/**  */
	private Integer pID;
	/** 路径 */
	private String pATH;
	/** 纬度 */
	private Double lATITUDE;
	/** 经度 */
	private Double lONGITUDE;
	/** 城市 */
	private Integer cITY;
	/** 省份 */
	private Integer pROVINCE;
	/** 是否删除：0 ：正常 1：删除 */
	private Integer isDeleted;
	/** 创建人 */
	private String createdBy;
	/** 创建时间 */
	private Date createdDate;
	/** 最后更新人 */
	private String lastUpdatedBy;
	/** 最后更新时间 */
	private Date lastUpdatedDate;
	/** 公司 */
	private String cOMPANY;
	/** 是否开业，0：待开业，1：已开业 */
	private Integer isOpened;
	/**  */
	private Integer managerHouse;
	/** 监控中心电话 */
	private String monitorPhone;
	/** 房屋数库项目ID */
	private Integer houseCommId;
	/** 党建-发展党员URL */
	private String partyDevUrl;
	/** 社区图标 */
	private String partyIconUrl;
	/** 项目H5 URL */
	private String partyAgencyUrl;
	/** 1开，0关 */
	private Integer partyEnable;

	public void setID(Integer iD) 
	{
		this.iD = iD;
	}

	public Integer getID() 
	{
		return iD;
	}
	public void setAgencyCode(String agencyCode) 
	{
		this.agencyCode = agencyCode;
	}

	public String getAgencyCode() 
	{
		return agencyCode;
	}
	public void setImgUrl(String imgUrl) 
	{
		this.imgUrl = imgUrl;
	}

	public String getImgUrl() 
	{
		return imgUrl;
	}
	public void setDEPTH(String dEPTH) 
	{
		this.dEPTH = dEPTH;
	}

	public String getDEPTH() 
	{
		return dEPTH;
	}
	public void setTYPE(String tYPE) 
	{
		this.tYPE = tYPE;
	}

	public String getTYPE() 
	{
		return tYPE;
	}
	public void setIsVerifi(Integer isVerifi) 
	{
		this.isVerifi = isVerifi;
	}

	public Integer getIsVerifi() 
	{
		return isVerifi;
	}
	public void setNAME(String nAME) 
	{
		this.nAME = nAME;
	}

	public String getNAME() 
	{
		return nAME;
	}
	public void setADDRESS(String aDDRESS) 
	{
		this.aDDRESS = aDDRESS;
	}

	public String getADDRESS() 
	{
		return aDDRESS;
	}
	public void setCONTACT(String cONTACT) 
	{
		this.cONTACT = cONTACT;
	}

	public String getCONTACT() 
	{
		return cONTACT;
	}
	public void setWorkTime(String workTime) 
	{
		this.workTime = workTime;
	}

	public String getWorkTime() 
	{
		return workTime;
	}
	public void setINTRODUCTION(String iNTRODUCTION) 
	{
		this.iNTRODUCTION = iNTRODUCTION;
	}

	public String getINTRODUCTION() 
	{
		return iNTRODUCTION;
	}
	public void setPID(Integer pID) 
	{
		this.pID = pID;
	}

	public Integer getPID() 
	{
		return pID;
	}
	public void setPATH(String pATH) 
	{
		this.pATH = pATH;
	}

	public String getPATH() 
	{
		return pATH;
	}
	public void setLATITUDE(Double lATITUDE) 
	{
		this.lATITUDE = lATITUDE;
	}

	public Double getLATITUDE() 
	{
		return lATITUDE;
	}
	public void setLONGITUDE(Double lONGITUDE) 
	{
		this.lONGITUDE = lONGITUDE;
	}

	public Double getLONGITUDE() 
	{
		return lONGITUDE;
	}
	public void setCITY(Integer cITY) 
	{
		this.cITY = cITY;
	}

	public Integer getCITY() 
	{
		return cITY;
	}
	public void setPROVINCE(Integer pROVINCE) 
	{
		this.pROVINCE = pROVINCE;
	}

	public Integer getPROVINCE() 
	{
		return pROVINCE;
	}
	public void setIsDeleted(Integer isDeleted) 
	{
		this.isDeleted = isDeleted;
	}

	public Integer getIsDeleted() 
	{
		return isDeleted;
	}
	public void setCreatedBy(String createdBy) 
	{
		this.createdBy = createdBy;
	}

	public String getCreatedBy() 
	{
		return createdBy;
	}
	public void setCreatedDate(Date createdDate) 
	{
		this.createdDate = createdDate;
	}

	public Date getCreatedDate() 
	{
		return createdDate;
	}
	public void setLastUpdatedBy(String lastUpdatedBy) 
	{
		this.lastUpdatedBy = lastUpdatedBy;
	}

	public String getLastUpdatedBy() 
	{
		return lastUpdatedBy;
	}
	public void setLastUpdatedDate(Date lastUpdatedDate) 
	{
		this.lastUpdatedDate = lastUpdatedDate;
	}

	public Date getLastUpdatedDate() 
	{
		return lastUpdatedDate;
	}
	public void setCOMPANY(String cOMPANY) 
	{
		this.cOMPANY = cOMPANY;
	}

	public String getCOMPANY() 
	{
		return cOMPANY;
	}
	public void setIsOpened(Integer isOpened) 
	{
		this.isOpened = isOpened;
	}

	public Integer getIsOpened() 
	{
		return isOpened;
	}
	public void setManagerHouse(Integer managerHouse) 
	{
		this.managerHouse = managerHouse;
	}

	public Integer getManagerHouse() 
	{
		return managerHouse;
	}
	public void setMonitorPhone(String monitorPhone) 
	{
		this.monitorPhone = monitorPhone;
	}

	public String getMonitorPhone() 
	{
		return monitorPhone;
	}
	public void setHouseCommId(Integer houseCommId) 
	{
		this.houseCommId = houseCommId;
	}

	public Integer getHouseCommId() 
	{
		return houseCommId;
	}
	public void setPartyDevUrl(String partyDevUrl) 
	{
		this.partyDevUrl = partyDevUrl;
	}

	public String getPartyDevUrl() 
	{
		return partyDevUrl;
	}
	public void setPartyIconUrl(String partyIconUrl) 
	{
		this.partyIconUrl = partyIconUrl;
	}

	public String getPartyIconUrl() 
	{
		return partyIconUrl;
	}
	public void setPartyAgencyUrl(String partyAgencyUrl) 
	{
		this.partyAgencyUrl = partyAgencyUrl;
	}

	public String getPartyAgencyUrl() 
	{
		return partyAgencyUrl;
	}
	public void setPartyEnable(Integer partyEnable) 
	{
		this.partyEnable = partyEnable;
	}

	public Integer getPartyEnable() 
	{
		return partyEnable;
	}

    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("iD", getID())
            .append("agencyCode", getAgencyCode())
            .append("imgUrl", getImgUrl())
            .append("dEPTH", getDEPTH())
            .append("tYPE", getTYPE())
            .append("isVerifi", getIsVerifi())
            .append("nAME", getNAME())
            .append("aDDRESS", getADDRESS())
            .append("cONTACT", getCONTACT())
            .append("workTime", getWorkTime())
            .append("iNTRODUCTION", getINTRODUCTION())
            .append("pID", getPID())
            .append("pATH", getPATH())
            .append("lATITUDE", getLATITUDE())
            .append("lONGITUDE", getLONGITUDE())
            .append("cITY", getCITY())
            .append("pROVINCE", getPROVINCE())
            .append("isDeleted", getIsDeleted())
            .append("createdBy", getCreatedBy())
            .append("createdDate", getCreatedDate())
            .append("lastUpdatedBy", getLastUpdatedBy())
            .append("lastUpdatedDate", getLastUpdatedDate())
            .append("cOMPANY", getCOMPANY())
            .append("isOpened", getIsOpened())
            .append("managerHouse", getManagerHouse())
            .append("monitorPhone", getMonitorPhone())
            .append("houseCommId", getHouseCommId())
            .append("partyDevUrl", getPartyDevUrl())
            .append("partyIconUrl", getPartyIconUrl())
            .append("partyAgencyUrl", getPartyAgencyUrl())
            .append("partyEnable", getPartyEnable())
            .toString();
    }
}
