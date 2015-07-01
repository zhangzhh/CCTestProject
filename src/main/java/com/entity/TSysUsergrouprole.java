package com.entity;

/**
 * TSysUsergrouprole entity. @author MyEclipse Persistence Tools
 */

public class TSysUsergrouprole implements java.io.Serializable {

	// Fields

	private TSysUsergrouproleId id;

	// Constructors

	/** default constructor */
	public TSysUsergrouprole() {
	}

	/** full constructor */
	public TSysUsergrouprole(TSysUsergrouproleId id) {
		this.id = id;
	}

	// Property accessors

	public TSysUsergrouproleId getId() {
		return this.id;
	}

	public void setId(TSysUsergrouproleId id) {
		this.id = id;
	}

}