package com.entity;

/**
 * TSysObjectlanguage entity. @author MyEclipse Persistence Tools
 */

public class TSysObjectlanguage implements java.io.Serializable {

	// Fields

	private TSysObjectlanguageId id;

	// Constructors

	/** default constructor */
	public TSysObjectlanguage() {
	}

	/** full constructor */
	public TSysObjectlanguage(TSysObjectlanguageId id) {
		this.id = id;
	}

	// Property accessors

	public TSysObjectlanguageId getId() {
		return this.id;
	}

	public void setId(TSysObjectlanguageId id) {
		this.id = id;
	}

}