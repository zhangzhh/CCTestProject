package com.entity;

import java.math.BigDecimal;

/**
 * TCcDepartmentpersonnel entity. @author MyEclipse Persistence Tools
 */

public class TCcDepartmentpersonnel implements java.io.Serializable {

	// Fields

	private Long departmentpersonnelid;
	private Long organizeid;
	private Long personnelid;
	private BigDecimal position;

	// Constructors

	/** default constructor */
	public TCcDepartmentpersonnel() {
	}

	/** minimal constructor */
	public TCcDepartmentpersonnel(Long departmentpersonnelid) {
		this.departmentpersonnelid = departmentpersonnelid;
	}

	/** full constructor */
	public TCcDepartmentpersonnel(Long departmentpersonnelid, Long organizeid,
			Long personnelid, BigDecimal position) {
		this.departmentpersonnelid = departmentpersonnelid;
		this.organizeid = organizeid;
		this.personnelid = personnelid;
		this.position = position;
	}

	// Property accessors

	public Long getDepartmentpersonnelid() {
		return this.departmentpersonnelid;
	}

	public void setDepartmentpersonnelid(Long departmentpersonnelid) {
		this.departmentpersonnelid = departmentpersonnelid;
	}

	public Long getOrganizeid() {
		return this.organizeid;
	}

	public void setOrganizeid(Long organizeid) {
		this.organizeid = organizeid;
	}

	public Long getPersonnelid() {
		return this.personnelid;
	}

	public void setPersonnelid(Long personnelid) {
		this.personnelid = personnelid;
	}

	public BigDecimal getPosition() {
		return this.position;
	}

	public void setPosition(BigDecimal position) {
		this.position = position;
	}

}