package com.entity;

/**
 * TSysFlowProcessAccountId entity. @author MyEclipse Persistence Tools
 */

public class TSysFlowProcessAccountId implements java.io.Serializable {

	// Fields

	private Long formid;
	private Long processid;
	private String status;
	private Long subjectid;

	// Constructors

	/** default constructor */
	public TSysFlowProcessAccountId() {
	}

	/** minimal constructor */
	public TSysFlowProcessAccountId(Long formid, Long processid) {
		this.formid = formid;
		this.processid = processid;
	}

	/** full constructor */
	public TSysFlowProcessAccountId(Long formid, Long processid, String status,
			Long subjectid) {
		this.formid = formid;
		this.processid = processid;
		this.status = status;
		this.subjectid = subjectid;
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

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Long getSubjectid() {
		return this.subjectid;
	}

	public void setSubjectid(Long subjectid) {
		this.subjectid = subjectid;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TSysFlowProcessAccountId))
			return false;
		TSysFlowProcessAccountId castOther = (TSysFlowProcessAccountId) other;

		return ((this.getFormid() == castOther.getFormid()) || (this
				.getFormid() != null && castOther.getFormid() != null && this
				.getFormid().equals(castOther.getFormid())))
				&& ((this.getProcessid() == castOther.getProcessid()) || (this
						.getProcessid() != null
						&& castOther.getProcessid() != null && this
						.getProcessid().equals(castOther.getProcessid())))
				&& ((this.getStatus() == castOther.getStatus()) || (this
						.getStatus() != null && castOther.getStatus() != null && this
						.getStatus().equals(castOther.getStatus())))
				&& ((this.getSubjectid() == castOther.getSubjectid()) || (this
						.getSubjectid() != null
						&& castOther.getSubjectid() != null && this
						.getSubjectid().equals(castOther.getSubjectid())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getFormid() == null ? 0 : this.getFormid().hashCode());
		result = 37 * result
				+ (getProcessid() == null ? 0 : this.getProcessid().hashCode());
		result = 37 * result
				+ (getStatus() == null ? 0 : this.getStatus().hashCode());
		result = 37 * result
				+ (getSubjectid() == null ? 0 : this.getSubjectid().hashCode());
		return result;
	}

}