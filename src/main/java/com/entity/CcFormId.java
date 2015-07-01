package com.entity;

import java.sql.Timestamp;
import java.util.Arrays;

/**
 * CcFormId entity. @author MyEclipse Persistence Tools
 */

public class CcFormId implements java.io.Serializable {

	// Fields

	private Long id;
	private String no;
	private String key;
	private String name;
	private String type;
	private String status;
	private String applicant;
	private String creator;
	private Timestamp createtime;
	private Long templeteid;
	private Long orgentityid;
	private String orgentityname;
	private Double formamount;
	private byte[] formdatas;
	private String remark;
	private Integer attachmentamount;
	private String overspendable;
	private String overstandard;
	private byte[] formtemplate;
	private String ebanktag;
	private String currentactivityname;
	private String jsondata;
	private Long historyid;
	private String formoverspenddisable;
	private String formoverstandarddisable;

	// Constructors

	/** default constructor */
	public CcFormId() {
	}

	/** minimal constructor */
	public CcFormId(Long id, String no, String key, String name, String type,
			String status) {
		this.id = id;
		this.no = no;
		this.key = key;
		this.name = name;
		this.type = type;
		this.status = status;
	}

	/** full constructor */
	public CcFormId(Long id, String no, String key, String name, String type,
			String status, String applicant, String creator,
			Timestamp createtime, Long templeteid, Long orgentityid,
			String orgentityname, Double formamount, byte[] formdatas,
			String remark, Integer attachmentamount, String overspendable,
			String overstandard, byte[] formtemplate, String ebanktag,
			String currentactivityname, String jsondata, Long historyid,
			String formoverspenddisable, String formoverstandarddisable) {
		this.id = id;
		this.no = no;
		this.key = key;
		this.name = name;
		this.type = type;
		this.status = status;
		this.applicant = applicant;
		this.creator = creator;
		this.createtime = createtime;
		this.templeteid = templeteid;
		this.orgentityid = orgentityid;
		this.orgentityname = orgentityname;
		this.formamount = formamount;
		this.formdatas = formdatas;
		this.remark = remark;
		this.attachmentamount = attachmentamount;
		this.overspendable = overspendable;
		this.overstandard = overstandard;
		this.formtemplate = formtemplate;
		this.ebanktag = ebanktag;
		this.currentactivityname = currentactivityname;
		this.jsondata = jsondata;
		this.historyid = historyid;
		this.formoverspenddisable = formoverspenddisable;
		this.formoverstandarddisable = formoverstandarddisable;
	}

	// Property accessors

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNo() {
		return this.no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public String getKey() {
		return this.key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getApplicant() {
		return this.applicant;
	}

	public void setApplicant(String applicant) {
		this.applicant = applicant;
	}

	public String getCreator() {
		return this.creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public Timestamp getCreatetime() {
		return this.createtime;
	}

	public void setCreatetime(Timestamp createtime) {
		this.createtime = createtime;
	}

	public Long getTempleteid() {
		return this.templeteid;
	}

	public void setTempleteid(Long templeteid) {
		this.templeteid = templeteid;
	}

	public Long getOrgentityid() {
		return this.orgentityid;
	}

	public void setOrgentityid(Long orgentityid) {
		this.orgentityid = orgentityid;
	}

	public String getOrgentityname() {
		return this.orgentityname;
	}

	public void setOrgentityname(String orgentityname) {
		this.orgentityname = orgentityname;
	}

	public Double getFormamount() {
		return this.formamount;
	}

	public void setFormamount(Double formamount) {
		this.formamount = formamount;
	}

	public byte[] getFormdatas() {
		return this.formdatas;
	}

	public void setFormdatas(byte[] formdatas) {
		this.formdatas = formdatas;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Integer getAttachmentamount() {
		return this.attachmentamount;
	}

	public void setAttachmentamount(Integer attachmentamount) {
		this.attachmentamount = attachmentamount;
	}

	public String getOverspendable() {
		return this.overspendable;
	}

	public void setOverspendable(String overspendable) {
		this.overspendable = overspendable;
	}

	public String getOverstandard() {
		return this.overstandard;
	}

	public void setOverstandard(String overstandard) {
		this.overstandard = overstandard;
	}

	public byte[] getFormtemplate() {
		return this.formtemplate;
	}

	public void setFormtemplate(byte[] formtemplate) {
		this.formtemplate = formtemplate;
	}

	public String getEbanktag() {
		return this.ebanktag;
	}

	public void setEbanktag(String ebanktag) {
		this.ebanktag = ebanktag;
	}

	public String getCurrentactivityname() {
		return this.currentactivityname;
	}

	public void setCurrentactivityname(String currentactivityname) {
		this.currentactivityname = currentactivityname;
	}

	public String getJsondata() {
		return this.jsondata;
	}

	public void setJsondata(String jsondata) {
		this.jsondata = jsondata;
	}

	public Long getHistoryid() {
		return this.historyid;
	}

	public void setHistoryid(Long historyid) {
		this.historyid = historyid;
	}

	public String getFormoverspenddisable() {
		return this.formoverspenddisable;
	}

	public void setFormoverspenddisable(String formoverspenddisable) {
		this.formoverspenddisable = formoverspenddisable;
	}

	public String getFormoverstandarddisable() {
		return this.formoverstandarddisable;
	}

	public void setFormoverstandarddisable(String formoverstandarddisable) {
		this.formoverstandarddisable = formoverstandarddisable;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof CcFormId))
			return false;
		CcFormId castOther = (CcFormId) other;

		return ((this.getId() == castOther.getId()) || (this.getId() != null
				&& castOther.getId() != null && this.getId().equals(
				castOther.getId())))
				&& ((this.getNo() == castOther.getNo()) || (this.getNo() != null
						&& castOther.getNo() != null && this.getNo().equals(
						castOther.getNo())))
				&& ((this.getKey() == castOther.getKey()) || (this.getKey() != null
						&& castOther.getKey() != null && this.getKey().equals(
						castOther.getKey())))
				&& ((this.getName() == castOther.getName()) || (this.getName() != null
						&& castOther.getName() != null && this.getName()
						.equals(castOther.getName())))
				&& ((this.getType() == castOther.getType()) || (this.getType() != null
						&& castOther.getType() != null && this.getType()
						.equals(castOther.getType())))
				&& ((this.getStatus() == castOther.getStatus()) || (this
						.getStatus() != null && castOther.getStatus() != null && this
						.getStatus().equals(castOther.getStatus())))
				&& ((this.getApplicant() == castOther.getApplicant()) || (this
						.getApplicant() != null
						&& castOther.getApplicant() != null && this
						.getApplicant().equals(castOther.getApplicant())))
				&& ((this.getCreator() == castOther.getCreator()) || (this
						.getCreator() != null && castOther.getCreator() != null && this
						.getCreator().equals(castOther.getCreator())))
				&& ((this.getCreatetime() == castOther.getCreatetime()) || (this
						.getCreatetime() != null
						&& castOther.getCreatetime() != null && this
						.getCreatetime().equals(castOther.getCreatetime())))
				&& ((this.getTempleteid() == castOther.getTempleteid()) || (this
						.getTempleteid() != null
						&& castOther.getTempleteid() != null && this
						.getTempleteid().equals(castOther.getTempleteid())))
				&& ((this.getOrgentityid() == castOther.getOrgentityid()) || (this
						.getOrgentityid() != null
						&& castOther.getOrgentityid() != null && this
						.getOrgentityid().equals(castOther.getOrgentityid())))
				&& ((this.getOrgentityname() == castOther.getOrgentityname()) || (this
						.getOrgentityname() != null
						&& castOther.getOrgentityname() != null && this
						.getOrgentityname()
						.equals(castOther.getOrgentityname())))
				&& ((this.getFormamount() == castOther.getFormamount()) || (this
						.getFormamount() != null
						&& castOther.getFormamount() != null && this
						.getFormamount().equals(castOther.getFormamount())))
				&& ((this.getFormdatas() == castOther.getFormdatas()) || (this
						.getFormdatas() != null
						&& castOther.getFormdatas() != null && Arrays.equals(
						this.getFormdatas(), castOther.getFormdatas())))
				&& ((this.getRemark() == castOther.getRemark()) || (this
						.getRemark() != null && castOther.getRemark() != null && this
						.getRemark().equals(castOther.getRemark())))
				&& ((this.getAttachmentamount() == castOther
						.getAttachmentamount()) || (this.getAttachmentamount() != null
						&& castOther.getAttachmentamount() != null && this
						.getAttachmentamount().equals(
								castOther.getAttachmentamount())))
				&& ((this.getOverspendable() == castOther.getOverspendable()) || (this
						.getOverspendable() != null
						&& castOther.getOverspendable() != null && this
						.getOverspendable()
						.equals(castOther.getOverspendable())))
				&& ((this.getOverstandard() == castOther.getOverstandard()) || (this
						.getOverstandard() != null
						&& castOther.getOverstandard() != null && this
						.getOverstandard().equals(castOther.getOverstandard())))
				&& ((this.getFormtemplate() == castOther.getFormtemplate()) || (this
						.getFormtemplate() != null
						&& castOther.getFormtemplate() != null && Arrays
							.equals(this.getFormtemplate(),
									castOther.getFormtemplate())))
				&& ((this.getEbanktag() == castOther.getEbanktag()) || (this
						.getEbanktag() != null
						&& castOther.getEbanktag() != null && this
						.getEbanktag().equals(castOther.getEbanktag())))
				&& ((this.getCurrentactivityname() == castOther
						.getCurrentactivityname()) || (this
						.getCurrentactivityname() != null
						&& castOther.getCurrentactivityname() != null && this
						.getCurrentactivityname().equals(
								castOther.getCurrentactivityname())))
				&& ((this.getJsondata() == castOther.getJsondata()) || (this
						.getJsondata() != null
						&& castOther.getJsondata() != null && this
						.getJsondata().equals(castOther.getJsondata())))
				&& ((this.getHistoryid() == castOther.getHistoryid()) || (this
						.getHistoryid() != null
						&& castOther.getHistoryid() != null && this
						.getHistoryid().equals(castOther.getHistoryid())))
				&& ((this.getFormoverspenddisable() == castOther
						.getFormoverspenddisable()) || (this
						.getFormoverspenddisable() != null
						&& castOther.getFormoverspenddisable() != null && this
						.getFormoverspenddisable().equals(
								castOther.getFormoverspenddisable())))
				&& ((this.getFormoverstandarddisable() == castOther
						.getFormoverstandarddisable()) || (this
						.getFormoverstandarddisable() != null
						&& castOther.getFormoverstandarddisable() != null && this
						.getFormoverstandarddisable().equals(
								castOther.getFormoverstandarddisable())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getId() == null ? 0 : this.getId().hashCode());
		result = 37 * result + (getNo() == null ? 0 : this.getNo().hashCode());
		result = 37 * result
				+ (getKey() == null ? 0 : this.getKey().hashCode());
		result = 37 * result
				+ (getName() == null ? 0 : this.getName().hashCode());
		result = 37 * result
				+ (getType() == null ? 0 : this.getType().hashCode());
		result = 37 * result
				+ (getStatus() == null ? 0 : this.getStatus().hashCode());
		result = 37 * result
				+ (getApplicant() == null ? 0 : this.getApplicant().hashCode());
		result = 37 * result
				+ (getCreator() == null ? 0 : this.getCreator().hashCode());
		result = 37
				* result
				+ (getCreatetime() == null ? 0 : this.getCreatetime()
						.hashCode());
		result = 37
				* result
				+ (getTempleteid() == null ? 0 : this.getTempleteid()
						.hashCode());
		result = 37
				* result
				+ (getOrgentityid() == null ? 0 : this.getOrgentityid()
						.hashCode());
		result = 37
				* result
				+ (getOrgentityname() == null ? 0 : this.getOrgentityname()
						.hashCode());
		result = 37
				* result
				+ (getFormamount() == null ? 0 : this.getFormamount()
						.hashCode());
		int formdatasHashcode = 0;
		byte[] formdatasProperty = this.getFormdatas();
		if (formdatasProperty != null) {
			formdatasHashcode = 1;
			for (int i = 0; i < formdatasProperty.length; i++) {
				formdatasHashcode = 37 * formdatasHashcode
						+ formdatasProperty[i];
			}
		}

		result = 37 * result + formdatasHashcode;

		result = 37 * result
				+ (getRemark() == null ? 0 : this.getRemark().hashCode());
		result = 37
				* result
				+ (getAttachmentamount() == null ? 0 : this
						.getAttachmentamount().hashCode());
		result = 37
				* result
				+ (getOverspendable() == null ? 0 : this.getOverspendable()
						.hashCode());
		result = 37
				* result
				+ (getOverstandard() == null ? 0 : this.getOverstandard()
						.hashCode());
		int formtemplateHashcode = 0;
		byte[] formtemplateProperty = this.getFormtemplate();
		if (formtemplateProperty != null) {
			formtemplateHashcode = 1;
			for (int i = 0; i < formtemplateProperty.length; i++) {
				formtemplateHashcode = 37 * formtemplateHashcode
						+ formtemplateProperty[i];
			}
		}

		result = 37 * result + formtemplateHashcode;

		result = 37 * result
				+ (getEbanktag() == null ? 0 : this.getEbanktag().hashCode());
		result = 37
				* result
				+ (getCurrentactivityname() == null ? 0 : this
						.getCurrentactivityname().hashCode());
		result = 37 * result
				+ (getJsondata() == null ? 0 : this.getJsondata().hashCode());
		result = 37 * result
				+ (getHistoryid() == null ? 0 : this.getHistoryid().hashCode());
		result = 37
				* result
				+ (getFormoverspenddisable() == null ? 0 : this
						.getFormoverspenddisable().hashCode());
		result = 37
				* result
				+ (getFormoverstandarddisable() == null ? 0 : this
						.getFormoverstandarddisable().hashCode());
		return result;
	}

}