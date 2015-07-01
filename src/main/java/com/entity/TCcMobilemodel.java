package com.entity;

/**
 * TCcMobilemodel entity. @author MyEclipse Persistence Tools
 */

public class TCcMobilemodel implements java.io.Serializable {

	// Fields

	private TCcMobilemodelId id;

	// Constructors

	/** default constructor */
	public TCcMobilemodel() {
	}

	/** full constructor */
	public TCcMobilemodel(TCcMobilemodelId id) {
		this.id = id;
	}

	// Property accessors

	public TCcMobilemodelId getId() {
		return this.id;
	}

	public void setId(TCcMobilemodelId id) {
		this.id = id;
	}

}