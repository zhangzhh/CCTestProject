package com.entity;

/**
 * TSysAccredit entity. @author MyEclipse Persistence Tools
 */

public class TSysAccredit implements java.io.Serializable {

	// Fields

	private Long accreditid;
	private Long roleid;
	private Long orgid;

	// Constructors

	/** default constructor */
	public TSysAccredit() {
	}

	/** minimal constructor */
	public TSysAccredit(Long accreditid) {
		this.accreditid = accreditid;
	}

	/** full constructor */
	public TSysAccredit(Long accreditid, Long roleid, Long orgid) {
		this.accreditid = accreditid;
		this.roleid = roleid;
		this.orgid = orgid;
	}

	// Property accessors

	public Long getAccreditid() {
		return this.accreditid;
	}

	public void setAccreditid(Long accreditid) {
		this.accreditid = accreditid;
	}

	public Long getRoleid() {
		return this.roleid;
	}

	public void setRoleid(Long roleid) {
		this.roleid = roleid;
	}

	public Long getOrgid() {
		return this.orgid;
	}

	public void setOrgid(Long orgid) {
		this.orgid = orgid;
	}

}