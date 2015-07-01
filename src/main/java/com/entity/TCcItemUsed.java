package com.entity;

/**
 * TCcItemUsed entity. @author MyEclipse Persistence Tools
 */

public class TCcItemUsed implements java.io.Serializable {

	// Fields

	private TCcItemUsedId id;

	// Constructors

	/** default constructor */
	public TCcItemUsed() {
	}

	/** full constructor */
	public TCcItemUsed(TCcItemUsedId id) {
		this.id = id;
	}

	// Property accessors

	public TCcItemUsedId getId() {
		return this.id;
	}

	public void setId(TCcItemUsedId id) {
		this.id = id;
	}

}