package com.entity;

/**
 * TSysDataaccesstemp entity. @author MyEclipse Persistence Tools
 */

public class TSysDataaccesstemp implements java.io.Serializable {

	// Fields

	private Long tempid;
	private Long userid;
	private Long groupid;
	private Long deptid;
	private Long billid;
	private Long dataaccessid;

	// Constructors

	/** default constructor */
	public TSysDataaccesstemp() {
	}

	/** minimal constructor */
	public TSysDataaccesstemp(Long tempid) {
		this.tempid = tempid;
	}

	/** full constructor */
	public TSysDataaccesstemp(Long tempid, Long userid, Long groupid,
			Long deptid, Long billid, Long dataaccessid) {
		this.tempid = tempid;
		this.userid = userid;
		this.groupid = groupid;
		this.deptid = deptid;
		this.billid = billid;
		this.dataaccessid = dataaccessid;
	}

	// Property accessors

	public Long getTempid() {
		return this.tempid;
	}

	public void setTempid(Long tempid) {
		this.tempid = tempid;
	}

	public Long getUserid() {
		return this.userid;
	}

	public void setUserid(Long userid) {
		this.userid = userid;
	}

	public Long getGroupid() {
		return this.groupid;
	}

	public void setGroupid(Long groupid) {
		this.groupid = groupid;
	}

	public Long getDeptid() {
		return this.deptid;
	}

	public void setDeptid(Long deptid) {
		this.deptid = deptid;
	}

	public Long getBillid() {
		return this.billid;
	}

	public void setBillid(Long billid) {
		this.billid = billid;
	}

	public Long getDataaccessid() {
		return this.dataaccessid;
	}

	public void setDataaccessid(Long dataaccessid) {
		this.dataaccessid = dataaccessid;
	}

}