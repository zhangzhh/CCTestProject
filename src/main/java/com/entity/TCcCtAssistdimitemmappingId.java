package com.entity;

/**
 * TCcCtAssistdimitemmappingId entity. @author MyEclipse Persistence Tools
 */

public class TCcCtAssistdimitemmappingId implements java.io.Serializable {

	// Fields

	private Long id;
	private Long certid;
	private Long assistdimitemid;

	// Constructors

	/** default constructor */
	public TCcCtAssistdimitemmappingId() {
	}

	/** full constructor */
	public TCcCtAssistdimitemmappingId(Long id, Long certid,
			Long assistdimitemid) {
		this.id = id;
		this.certid = certid;
		this.assistdimitemid = assistdimitemid;
	}

	// Property accessors

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getCertid() {
		return this.certid;
	}

	public void setCertid(Long certid) {
		this.certid = certid;
	}

	public Long getAssistdimitemid() {
		return this.assistdimitemid;
	}

	public void setAssistdimitemid(Long assistdimitemid) {
		this.assistdimitemid = assistdimitemid;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TCcCtAssistdimitemmappingId))
			return false;
		TCcCtAssistdimitemmappingId castOther = (TCcCtAssistdimitemmappingId) other;

		return ((this.getId() == castOther.getId()) || (this.getId() != null
				&& castOther.getId() != null && this.getId().equals(
				castOther.getId())))
				&& ((this.getCertid() == castOther.getCertid()) || (this
						.getCertid() != null && castOther.getCertid() != null && this
						.getCertid().equals(castOther.getCertid())))
				&& ((this.getAssistdimitemid() == castOther
						.getAssistdimitemid()) || (this.getAssistdimitemid() != null
						&& castOther.getAssistdimitemid() != null && this
						.getAssistdimitemid().equals(
								castOther.getAssistdimitemid())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getId() == null ? 0 : this.getId().hashCode());
		result = 37 * result
				+ (getCertid() == null ? 0 : this.getCertid().hashCode());
		result = 37
				* result
				+ (getAssistdimitemid() == null ? 0 : this.getAssistdimitemid()
						.hashCode());
		return result;
	}

}