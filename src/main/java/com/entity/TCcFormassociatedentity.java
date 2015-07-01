package com.entity;

/**
 * TCcFormassociatedentity entity. @author MyEclipse Persistence Tools
 */

public class TCcFormassociatedentity implements java.io.Serializable {

	// Fields

	private TCcFormassociatedentityId id;

	// Constructors

	/** default constructor */
	public TCcFormassociatedentity() {
	}

	/** full constructor */
	public TCcFormassociatedentity(TCcFormassociatedentityId id) {
		this.id = id;
	}

	// Property accessors

	public TCcFormassociatedentityId getId() {
		return this.id;
	}

	public void setId(TCcFormassociatedentityId id) {
		this.id = id;
	}

}