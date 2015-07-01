package com.entity;

/**
 * TCcBalancedepartment entity. @author MyEclipse Persistence Tools
 */

public class TCcBalancedepartment implements java.io.Serializable {

	// Fields

	private Long id;
	private Long balancemodeid;
	private Long departmentid;

	// Constructors

	/** default constructor */
	public TCcBalancedepartment() {
	}

	/** minimal constructor */
	public TCcBalancedepartment(Long id) {
		this.id = id;
	}

	/** full constructor */
	public TCcBalancedepartment(Long id, Long balancemodeid, Long departmentid) {
		this.id = id;
		this.balancemodeid = balancemodeid;
		this.departmentid = departmentid;
	}

	// Property accessors

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getBalancemodeid() {
		return this.balancemodeid;
	}

	public void setBalancemodeid(Long balancemodeid) {
		this.balancemodeid = balancemodeid;
	}

	public Long getDepartmentid() {
		return this.departmentid;
	}

	public void setDepartmentid(Long departmentid) {
		this.departmentid = departmentid;
	}

}