package com.entity;

/**
 * TSysPostrank entity. @author MyEclipse Persistence Tools
 */

public class TSysPostrank implements java.io.Serializable {

	// Fields

	private TSysPostrankId id;

	// Constructors

	/** default constructor */
	public TSysPostrank() {
	}

	/** full constructor */
	public TSysPostrank(TSysPostrankId id) {
		this.id = id;
	}

	// Property accessors

	public TSysPostrankId getId() {
		return this.id;
	}

	public void setId(TSysPostrankId id) {
		this.id = id;
	}

}