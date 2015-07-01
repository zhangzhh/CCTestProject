package com.entity;

/**
 * TSysFlowProcessOrgId entity. @author MyEclipse Persistence Tools
 */

public class TSysFlowProcessOrgId implements java.io.Serializable {

	// Fields

	private Long formid;
	private Long processid;
	private Long orgid;

	// Constructors

	/** default constructor */
	public TSysFlowProcessOrgId() {
	}

	/** full constructor */
	public TSysFlowProcessOrgId(Long formid, Long processid, Long orgid) {
		this.formid = formid;
		this.processid = processid;
		this.orgid = orgid;
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

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TSysFlowProcessOrgId))
			return false;
		TSysFlowProcessOrgId castOther = (TSysFlowProcessOrgId) other;

		return ((this.getFormid() == castOther.getFormid()) || (this
				.getFormid() != null && castOther.getFormid() != null && this
				.getFormid().equals(castOther.getFormid())))
				&& ((this.getProcessid() == castOther.getProcessid()) || (this
						.getProcessid() != null
						&& castOther.getProcessid() != null && this
						.getProcessid().equals(castOther.getProcessid())))
				&& ((this.getOrgid() == castOther.getOrgid()) || (this
						.getOrgid() != null && castOther.getOrgid() != null && this
						.getOrgid().equals(castOther.getOrgid())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getFormid() == null ? 0 : this.getFormid().hashCode());
		result = 37 * result
				+ (getProcessid() == null ? 0 : this.getProcessid().hashCode());
		result = 37 * result
				+ (getOrgid() == null ? 0 : this.getOrgid().hashCode());
		return result;
	}

}