package com.entity;

/**
 * TSysBillfield entity. @author MyEclipse Persistence Tools
 */

public class TSysBillfield implements java.io.Serializable {

	// Fields

	private TSysBillfieldId id;

	// Constructors

	/** default constructor */
	public TSysBillfield() {
	}

	/** full constructor */
	public TSysBillfield(TSysBillfieldId id) {
		this.id = id;
	}

	// Property accessors

	public TSysBillfieldId getId() {
		return this.id;
	}

	public void setId(TSysBillfieldId id) {
		this.id = id;
	}

}