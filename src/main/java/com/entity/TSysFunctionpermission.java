package com.entity;

import java.math.BigDecimal;

/**
 * TSysFunctionpermission entity. @author MyEclipse Persistence Tools
 */

public class TSysFunctionpermission implements java.io.Serializable {

	// Fields

	private Long functionpermissionid;
	private Long roleid;
	private Long funcitionid;
	private BigDecimal functiontype;

	// Constructors

	/** default constructor */
	public TSysFunctionpermission() {
	}

	/** minimal constructor */
	public TSysFunctionpermission(Long functionpermissionid) {
		this.functionpermissionid = functionpermissionid;
	}

	/** full constructor */
	public TSysFunctionpermission(Long functionpermissionid, Long roleid,
			Long funcitionid, BigDecimal functiontype) {
		this.functionpermissionid = functionpermissionid;
		this.roleid = roleid;
		this.funcitionid = funcitionid;
		this.functiontype = functiontype;
	}

	// Property accessors

	public Long getFunctionpermissionid() {
		return this.functionpermissionid;
	}

	public void setFunctionpermissionid(Long functionpermissionid) {
		this.functionpermissionid = functionpermissionid;
	}

	public Long getRoleid() {
		return this.roleid;
	}

	public void setRoleid(Long roleid) {
		this.roleid = roleid;
	}

	public Long getFuncitionid() {
		return this.funcitionid;
	}

	public void setFuncitionid(Long funcitionid) {
		this.funcitionid = funcitionid;
	}

	public BigDecimal getFunctiontype() {
		return this.functiontype;
	}

	public void setFunctiontype(BigDecimal functiontype) {
		this.functiontype = functiontype;
	}

}