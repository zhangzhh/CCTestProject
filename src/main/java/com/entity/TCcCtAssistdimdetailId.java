package com.entity;

/**
 * TCcCtAssistdimdetailId entity. @author MyEclipse Persistence Tools
 */

public class TCcCtAssistdimdetailId implements java.io.Serializable {

	// Fields

	private Long detailid;
	private Long certid;
	private String accountname;

	// Constructors

	/** default constructor */
	public TCcCtAssistdimdetailId() {
	}

	/** full constructor */
	public TCcCtAssistdimdetailId(Long detailid, Long certid, String accountname) {
		this.detailid = detailid;
		this.certid = certid;
		this.accountname = accountname;
	}

	// Property accessors

	public Long getDetailid() {
		return this.detailid;
	}

	public void setDetailid(Long detailid) {
		this.detailid = detailid;
	}

	public Long getCertid() {
		return this.certid;
	}

	public void setCertid(Long certid) {
		this.certid = certid;
	}

	public String getAccountname() {
		return this.accountname;
	}

	public void setAccountname(String accountname) {
		this.accountname = accountname;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TCcCtAssistdimdetailId))
			return false;
		TCcCtAssistdimdetailId castOther = (TCcCtAssistdimdetailId) other;

		return ((this.getDetailid() == castOther.getDetailid()) || (this
				.getDetailid() != null && castOther.getDetailid() != null && this
				.getDetailid().equals(castOther.getDetailid())))
				&& ((this.getCertid() == castOther.getCertid()) || (this
						.getCertid() != null && castOther.getCertid() != null && this
						.getCertid().equals(castOther.getCertid())))
				&& ((this.getAccountname() == castOther.getAccountname()) || (this
						.getAccountname() != null
						&& castOther.getAccountname() != null && this
						.getAccountname().equals(castOther.getAccountname())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getDetailid() == null ? 0 : this.getDetailid().hashCode());
		result = 37 * result
				+ (getCertid() == null ? 0 : this.getCertid().hashCode());
		result = 37
				* result
				+ (getAccountname() == null ? 0 : this.getAccountname()
						.hashCode());
		return result;
	}

}