package com.entity;

/**
 * TSysBillfieldout entity. @author MyEclipse Persistence Tools
 */

public class TSysBillfieldout implements java.io.Serializable {

	// Fields

	private TSysBillfieldoutId id;

	// Constructors

	/** default constructor */
	public TSysBillfieldout() {
	}

	/** full constructor */
	public TSysBillfieldout(TSysBillfieldoutId id) {
		this.id = id;
	}

	// Property accessors

	public TSysBillfieldoutId getId() {
		return this.id;
	}

	public void setId(TSysBillfieldoutId id) {
		this.id = id;
	}

}