package com.entity;

/**
 * TSysUsergroupassociatedId entity. @author MyEclipse Persistence Tools
 */

public class TSysUsergroupassociatedId implements java.io.Serializable {

	// Fields

	private Long usergroupid;
	private Long userid;

	// Constructors

	/** default constructor */
	public TSysUsergroupassociatedId() {
	}

	/** full constructor */
	public TSysUsergroupassociatedId(Long usergroupid, Long userid) {
		this.usergroupid = usergroupid;
		this.userid = userid;
	}

	// Property accessors

	public Long getUsergroupid() {
		return this.usergroupid;
	}

	public void setUsergroupid(Long usergroupid) {
		this.usergroupid = usergroupid;
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
		if (!(other instanceof TSysUsergroupassociatedId))
			return false;
		TSysUsergroupassociatedId castOther = (TSysUsergroupassociatedId) other;

		return ((this.getUsergroupid() == castOther.getUsergroupid()) || (this
				.getUsergroupid() != null && castOther.getUsergroupid() != null && this
				.getUsergroupid().equals(castOther.getUsergroupid())))
				&& ((this.getUserid() == castOther.getUserid()) || (this
						.getUserid() != null && castOther.getUserid() != null && this
						.getUserid().equals(castOther.getUserid())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getUsergroupid() == null ? 0 : this.getUsergroupid()
						.hashCode());
		result = 37 * result
				+ (getUserid() == null ? 0 : this.getUserid().hashCode());
		return result;
	}

}