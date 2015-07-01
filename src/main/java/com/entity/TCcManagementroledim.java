package com.entity;

import java.math.BigDecimal;

/**
 * TCcManagementroledim entity. @author MyEclipse Persistence Tools
 */

public class TCcManagementroledim implements java.io.Serializable {

	// Fields

	private Long managementroledimid;
	private TCcManagementrole TCcManagementrole;
	private Long dimid;
	private BigDecimal displayorder;

	// Constructors

	/** default constructor */
	public TCcManagementroledim() {
	}

	/** minimal constructor */
	public TCcManagementroledim(Long managementroledimid) {
		this.managementroledimid = managementroledimid;
	}

	/** full constructor */
	public TCcManagementroledim(Long managementroledimid,
			TCcManagementrole TCcManagementrole, Long dimid,
			BigDecimal displayorder) {
		this.managementroledimid = managementroledimid;
		this.TCcManagementrole = TCcManagementrole;
		this.dimid = dimid;
		this.displayorder = displayorder;
	}

	// Property accessors

	public Long getManagementroledimid() {
		return this.managementroledimid;
	}

	public void setManagementroledimid(Long managementroledimid) {
		this.managementroledimid = managementroledimid;
	}

	public TCcManagementrole getTCcManagementrole() {
		return this.TCcManagementrole;
	}

	public void setTCcManagementrole(TCcManagementrole TCcManagementrole) {
		this.TCcManagementrole = TCcManagementrole;
	}

	public Long getDimid() {
		return this.dimid;
	}

	public void setDimid(Long dimid) {
		this.dimid = dimid;
	}

	public BigDecimal getDisplayorder() {
		return this.displayorder;
	}

	public void setDisplayorder(BigDecimal displayorder) {
		this.displayorder = displayorder;
	}

}