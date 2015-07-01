package com.entity;

/**
 * TSysUsergrouproleId entity. @author MyEclipse Persistence Tools
 */

public class TSysUsergrouproleId implements java.io.Serializable {

	// Fields

	private Long roleid;
	private Long usergroupid;

	// Constructors

	/** default constructor */
	public TSysUsergrouproleId() {
	}

	/** full constructor */
	public TSysUsergrouproleId(Long roleid, Long usergroupid) {
		this.roleid = roleid;
		this.usergroupid = usergroupid;
	}

	// Property accessors

	public Long getRoleid() {
		return this.roleid;
	}

	public void setRoleid(Long roleid) {
		this.roleid = roleid;
	}

	public Long getUsergroupid() {
		return this.usergroupid;
	}

	public void setUsergroupid(Long usergroupid) {
		this.usergroupid = usergroupid;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TSysUsergrouproleId))
			return false;
		TSysUsergrouproleId castOther = (TSysUsergrouproleId) other;

		return ((this.getRoleid() == castOther.getRoleid()) || (this
				.getRoleid() != null && castOther.getRoleid() != null && this
				.getRoleid().equals(castOther.getRoleid())))
				&& ((this.getUsergroupid() == castOther.getUsergroupid()) || (this
						.getUsergroupid() != null
						&& castOther.getUsergroupid() != null && this
						.getUsergroupid().equals(castOther.getUsergroupid())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getRoleid() == null ? 0 : this.getRoleid().hashCode());
		result = 37
				* result
				+ (getUsergroupid() == null ? 0 : this.getUsergroupid()
						.hashCode());
		return result;
	}

}