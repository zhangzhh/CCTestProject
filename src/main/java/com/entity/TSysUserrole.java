package com.entity;

/**
 * TSysUserrole entity. @author MyEclipse Persistence Tools
 */

public class TSysUserrole implements java.io.Serializable {

	// Fields

	private TSysUserroleId id;

	// Constructors

	/** default constructor */
	public TSysUserrole() {
	}

	/** full constructor */
	public TSysUserrole(TSysUserroleId id) {
		this.id = id;
	}

	// Property accessors

	public TSysUserroleId getId() {
		return this.id;
	}

	public void setId(TSysUserroleId id) {
		this.id = id;
	}

}