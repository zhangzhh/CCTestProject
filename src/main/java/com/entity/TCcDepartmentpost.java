package com.entity;

import java.math.BigDecimal;

/**
 * TCcDepartmentpost entity. @author MyEclipse Persistence Tools
 */

public class TCcDepartmentpost implements java.io.Serializable {

	// Fields

	private Long departmentpostid;
	private Long organizeid;
	private Long postid;
	private BigDecimal position;

	// Constructors

	/** default constructor */
	public TCcDepartmentpost() {
	}

	/** minimal constructor */
	public TCcDepartmentpost(Long departmentpostid) {
		this.departmentpostid = departmentpostid;
	}

	/** full constructor */
	public TCcDepartmentpost(Long departmentpostid, Long organizeid,
			Long postid, BigDecimal position) {
		this.departmentpostid = departmentpostid;
		this.organizeid = organizeid;
		this.postid = postid;
		this.position = position;
	}

	// Property accessors

	public Long getDepartmentpostid() {
		return this.departmentpostid;
	}

	public void setDepartmentpostid(Long departmentpostid) {
		this.departmentpostid = departmentpostid;
	}

	public Long getOrganizeid() {
		return this.organizeid;
	}

	public void setOrganizeid(Long organizeid) {
		this.organizeid = organizeid;
	}

	public Long getPostid() {
		return this.postid;
	}

	public void setPostid(Long postid) {
		this.postid = postid;
	}

	public BigDecimal getPosition() {
		return this.position;
	}

	public void setPosition(BigDecimal position) {
		this.position = position;
	}

}