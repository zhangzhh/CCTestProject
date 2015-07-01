package com.entity;

import java.sql.Timestamp;

/**
 * TCcUsershare entity. @author MyEclipse Persistence Tools
 */

public class TCcUsershare implements java.io.Serializable {

	// Fields

	private Long id;
	private Long userid;
	private String username;
	private String sharelocal;
	private String realfilename;
	private Timestamp shareddate;
	private String remark;

	// Constructors

	/** default constructor */
	public TCcUsershare() {
	}

	/** minimal constructor */
	public TCcUsershare(Long id) {
		this.id = id;
	}

	/** full constructor */
	public TCcUsershare(Long id, Long userid, String username,
			String sharelocal, String realfilename, Timestamp shareddate,
			String remark) {
		this.id = id;
		this.userid = userid;
		this.username = username;
		this.sharelocal = sharelocal;
		this.realfilename = realfilename;
		this.shareddate = shareddate;
		this.remark = remark;
	}

	// Property accessors

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getUserid() {
		return this.userid;
	}

	public void setUserid(Long userid) {
		this.userid = userid;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getSharelocal() {
		return this.sharelocal;
	}

	public void setSharelocal(String sharelocal) {
		this.sharelocal = sharelocal;
	}

	public String getRealfilename() {
		return this.realfilename;
	}

	public void setRealfilename(String realfilename) {
		this.realfilename = realfilename;
	}

	public Timestamp getShareddate() {
		return this.shareddate;
	}

	public void setShareddate(Timestamp shareddate) {
		this.shareddate = shareddate;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}