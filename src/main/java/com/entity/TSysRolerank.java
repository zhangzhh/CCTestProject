package com.entity;

/**
 * TSysRolerank entity. @author MyEclipse Persistence Tools
 */

public class TSysRolerank implements java.io.Serializable {

	// Fields

	private TSysRolerankId id;

	// Constructors

	/** default constructor */
	public TSysRolerank() {
	}

	/** full constructor */
	public TSysRolerank(TSysRolerankId id) {
		this.id = id;
	}

	// Property accessors

	public TSysRolerankId getId() {
		return this.id;
	}

	public void setId(TSysRolerankId id) {
		this.id = id;
	}

}