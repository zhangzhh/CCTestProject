package com.entity;

import java.math.BigDecimal;

/**
 * TSysRole entity. @author MyEclipse Persistence Tools
 */

public class TSysRole implements java.io.Serializable {

	// Fields

	private Long roleid;
	private BigDecimal roletype;
	private String rolename;
	private String memo;
	private String item01;
	private String code;

	// Constructors

	/** default constructor */
	public TSysRole() {
	}

	/** minimal constructor */
	public TSysRole(Long roleid) {
		this.roleid = roleid;
	}

	/** full constructor */
	public TSysRole(Long roleid, BigDecimal roletype, String rolename,
			String memo, String item01, String code) {
		this.roleid = roleid;
		this.roletype = roletype;
		this.rolename = rolename;
		this.memo = memo;
		this.item01 = item01;
		this.code = code;
	}

	// Property accessors

	public Long getRoleid() {
		return this.roleid;
	}

	public void setRoleid(Long roleid) {
		this.roleid = roleid;
	}

	public BigDecimal getRoletype() {
		return this.roletype;
	}

	public void setRoletype(BigDecimal roletype) {
		this.roletype = roletype;
	}

	public String getRolename() {
		return this.rolename;
	}

	public void setRolename(String rolename) {
		this.rolename = rolename;
	}

	public String getMemo() {
		return this.memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getItem01() {
		return this.item01;
	}

	public void setItem01(String item01) {
		this.item01 = item01;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

}