package com.entity;

/**
 * TSysUserroleId entity. @author MyEclipse Persistence Tools
 */

public class TSysUserroleId implements java.io.Serializable {

	// Fields

	private Long roleid;
	private Long userid;

	// Constructors

	/** default constructor */
	public TSysUserroleId() {
	}

	/** full constructor */
	public TSysUserroleId(Long roleid, Long userid) {
		this.roleid = roleid;
		this.userid = userid;
	}

	// Property accessors

	public Long getRoleid() {
		return this.roleid;
	}

	public void setRoleid(Long roleid) {
		this.roleid = roleid;
	}

	public Long getUserid() {
		return this.userid;
	}

	public void setUserid(Long userid) {
		this.userid = userid;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TSysUserroleId))
			return false;
		TSysUserroleId castOther = (TSysUserroleId) other;

		return ((this.getRoleid() == castOther.getRoleid()) || (this
				.getRoleid() != null && castOther.getRoleid() != null && this
				.getRoleid().equals(castOther.getRoleid())))
				&& ((this.getUserid() == castOther.getUserid()) || (this
						.getUserid() != null && castOther.getUserid() != null && this
						.getUserid().equals(castOther.getUserid())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getRoleid() == null ? 0 : this.getRoleid().hashCode());
		result = 37 * result
				+ (getUserid() == null ? 0 : this.getUserid().hashCode());
		return result;
	}

}