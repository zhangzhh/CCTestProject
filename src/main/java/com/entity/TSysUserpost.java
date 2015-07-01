package com.entity;

import java.math.BigDecimal;

/**
 * TSysUserpost entity. @author MyEclipse Persistence Tools
 */

public class TSysUserpost implements java.io.Serializable {

	// Fields

	private Long userpostid;
	private Long userid;
	private Long departmentpostid;
	private BigDecimal position;

	// Constructors

	/** default constructor */
	public TSysUserpost() {
	}

	/** minimal constructor */
	public TSysUserpost(Long userpostid) {
		this.userpostid = userpostid;
	}

	/** full constructor */
	public TSysUserpost(Long userpostid, Long userid, Long departmentpostid,
			BigDecimal position) {
		this.userpostid = userpostid;
		this.userid = userid;
		this.departmentpostid = departmentpostid;
		this.position = position;
	}

	// Property accessors

	public Long getUserpostid() {
		return this.userpostid;
	}

	public void setUserpostid(Long userpostid) {
		this.userpostid = userpostid;
	}

	public Long getUserid() {
		return this.userid;
	}

	public void setUserid(Long userid) {
		this.userid = userid;
	}

	public Long getDepartmentpostid() {
		return this.departmentpostid;
	}

	public void setDepartmentpostid(Long departmentpostid) {
		this.departmentpostid = departmentpostid;
	}

	public BigDecimal getPosition() {
		return this.position;
	}

	public void setPosition(BigDecimal position) {
		this.position = position;
	}

}