package com.entity;

/**
 * TCcFreeze entity. @author MyEclipse Persistence Tools
 */

public class TCcFreeze implements java.io.Serializable {

	// Fields

	private TCcFreezeId id;

	// Constructors

	/** default constructor */
	public TCcFreeze() {
	}

	/** full constructor */
	public TCcFreeze(TCcFreezeId id) {
		this.id = id;
	}

	// Property accessors

	public TCcFreezeId getId() {
		return this.id;
	}

	public void setId(TCcFreezeId id) {
		this.id = id;
	}

}