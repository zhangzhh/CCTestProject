package com.entity;

/**
 * TSysPostrankId entity. @author MyEclipse Persistence Tools
 */

public class TSysPostrankId implements java.io.Serializable {

	// Fields

	private Long postid;
	private Long rank;
	private String postcode;

	// Constructors

	/** default constructor */
	public TSysPostrankId() {
	}

	/** minimal constructor */
	public TSysPostrankId(Long postid) {
		this.postid = postid;
	}

	/** full constructor */
	public TSysPostrankId(Long postid, Long rank, String postcode) {
		this.postid = postid;
		this.rank = rank;
		this.postcode = postcode;
	}

	// Property accessors

	public Long getPostid() {
		return this.postid;
	}

	public void setPostid(Long postid) {
		this.postid = postid;
	}

	public Long getRank() {
		return this.rank;
	}

	public void setRank(Long rank) {
		this.rank = rank;
	}

	public String getPostcode() {
		return this.postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TSysPostrankId))
			return false;
		TSysPostrankId castOther = (TSysPostrankId) other;

		return ((this.getPostid() == castOther.getPostid()) || (this
				.getPostid() != null && castOther.getPostid() != null && this
				.getPostid().equals(castOther.getPostid())))
				&& ((this.getRank() == castOther.getRank()) || (this.getRank() != null
						&& castOther.getRank() != null && this.getRank()
						.equals(castOther.getRank())))
				&& ((this.getPostcode() == castOther.getPostcode()) || (this
						.getPostcode() != null
						&& castOther.getPostcode() != null && this
						.getPostcode().equals(castOther.getPostcode())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getPostid() == null ? 0 : this.getPostid().hashCode());
		result = 37 * result
				+ (getRank() == null ? 0 : this.getRank().hashCode());
		result = 37 * result
				+ (getPostcode() == null ? 0 : this.getPostcode().hashCode());
		return result;
	}

}