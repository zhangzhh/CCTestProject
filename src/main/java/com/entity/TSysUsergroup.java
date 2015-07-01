package com.entity;

/**
 * TSysUsergroup entity. @author MyEclipse Persistence Tools
 */

public class TSysUsergroup implements java.io.Serializable {

	// Fields

	private Long usergroupid;
	private String usergroupname;
	private String memo;
	private Long orgid;

	// Constructors

	/** default constructor */
	public TSysUsergroup() {
	}

	/** minimal constructor */
	public TSysUsergroup(Long usergroupid) {
		this.usergroupid = usergroupid;
	}

	/** full constructor */
	public TSysUsergroup(Long usergroupid, String usergroupname, String memo,
			Long orgid) {
		this.usergroupid = usergroupid;
		this.usergroupname = usergroupname;
		this.memo = memo;
		this.orgid = orgid;
	}

	// Property accessors

	public Long getUsergroupid() {
		return this.usergroupid;
	}

	public void setUsergroupid(Long usergroupid) {
		this.usergroupid = usergroupid;
	}

	public String getUsergroupname() {
		return this.usergroupname;
	}

	public void setUsergroupname(String usergroupname) {
		this.usergroupname = usergroupname;
	}

	public String getMemo() {
		return this.memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public Long getOrgid() {
		return this.orgid;
	}

	public void setOrgid(Long orgid) {
		this.orgid = orgid;
	}

}