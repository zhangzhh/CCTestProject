package com.entity;

/**
 * TSysRolerankId entity. @author MyEclipse Persistence Tools
 */

public class TSysRolerankId implements java.io.Serializable {

	// Fields

	private Long roleid;
	private Long rank;

	// Constructors

	/** default constructor */
	public TSysRolerankId() {
	}

	/** minimal constructor */
	public TSysRolerankId(Long roleid) {
		this.roleid = roleid;
	}

	/** full constructor */
	public TSysRolerankId(Long roleid, Long rank) {
		this.roleid = roleid;
		this.rank = rank;
	}

	// Property accessors

	public Long getRoleid() {
		return this.roleid;
	}

	public void setRoleid(Long roleid) {
		this.roleid = roleid;
	}

	public Long getRank() {
		return this.rank;
	}

	public void setRank(Long rank) {
		this.rank = rank;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TSysRolerankId))
			return false;
		TSysRolerankId castOther = (TSysRolerankId) other;

		return ((this.getRoleid() == castOther.getRoleid()) || (this
				.getRoleid() != null && castOther.getRoleid() != null && this
				.getRoleid().equals(castOther.getRoleid())))
				&& ((this.getRank() == castOther.getRank()) || (this.getRank() != null
						&& castOther.getRank() != null && this.getRank()
						.equals(castOther.getRank())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getRoleid() == null ? 0 : this.getRoleid().hashCode());
		result = 37 * result
				+ (getRank() == null ? 0 : this.getRank().hashCode());
		return result;
	}

}