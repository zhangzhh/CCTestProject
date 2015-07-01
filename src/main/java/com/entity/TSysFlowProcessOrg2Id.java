package com.entity;

/**
 * TSysFlowProcessOrg2Id entity. @author MyEclipse Persistence Tools
 */

public class TSysFlowProcessOrg2Id implements java.io.Serializable {

	// Fields

	private Long formid;
	private Long processid;
	private Long orgid;
	private String status;

	// Constructors

	/** default constructor */
	public TSysFlowProcessOrg2Id() {
	}

	/** minimal constructor */
	public TSysFlowProcessOrg2Id(Long formid, Long processid) {
		this.formid = formid;
		this.processid = processid;
	}

	/** full constructor */
	public TSysFlowProcessOrg2Id(Long formid, Long processid, Long orgid,
			String status) {
		this.formid = formid;
		this.processid = processid;
		this.orgid = orgid;
		this.status = status;
	}

	// Property accessors

	public Long getFormid() {
		return this.formid;
	}

	public void setFormid(Long formid) {
		this.formid = formid;
	}

	public Long getProcessid() {
		return this.processid;
	}

	public void setProcessid(Long processid) {
		this.processid = processid;
	}

	public Long getOrgid() {
		return this.orgid;
	}

	public void setOrgid(Long orgid) {
		this.orgid = orgid;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TSysFlowProcessOrg2Id))
			return false;
		TSysFlowProcessOrg2Id castOther = (TSysFlowProcessOrg2Id) other;

		return ((this.getFormid() == castOther.getFormid()) || (this
				.getFormid() != null && castOther.getFormid() != null && this
				.getFormid().equals(castOther.getFormid())))
				&& ((this.getProcessid() == castOther.getProcessid()) || (this
						.getProcessid() != null
						&& castOther.getProcessid() != null && this
						.getProcessid().equals(castOther.getProcessid())))
				&& ((this.getOrgid() == castOther.getOrgid()) || (this
						.getOrgid() != null && castOther.getOrgid() != null && this
						.getOrgid().equals(castOther.getOrgid())))
				&& ((this.getStatus() == castOther.getStatus()) || (this
						.getStatus() != null && castOther.getStatus() != null && this
						.getStatus().equals(castOther.getStatus())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getFormid() == null ? 0 : this.getFormid().hashCode());
		result = 37 * result
				+ (getProcessid() == null ? 0 : this.getProcessid().hashCode());
		result = 37 * result
				+ (getOrgid() == null ? 0 : this.getOrgid().hashCode());
		result = 37 * result
				+ (getStatus() == null ? 0 : this.getStatus().hashCode());
		return result;
	}

}