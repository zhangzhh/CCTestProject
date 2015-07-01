package com.entity;

/**
 * TCcDimensionitem entity. @author MyEclipse Persistence Tools
 */

public class TCcDimensionitem implements java.io.Serializable {

	// Fields

	private TCcDimensionitemId id;

	// Constructors

	/** default constructor */
	public TCcDimensionitem() {
	}

	/** full constructor */
	public TCcDimensionitem(TCcDimensionitemId id) {
		this.id = id;
	}

	// Property accessors

	public TCcDimensionitemId getId() {
		return this.id;
	}

	public void setId(TCcDimensionitemId id) {
		this.id = id;
	}

}