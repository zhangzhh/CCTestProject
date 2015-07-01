package com.entity;

/**
 * TCcBilllogo entity. @author MyEclipse Persistence Tools
 */

public class TCcBilllogo implements java.io.Serializable {

	// Fields

	private TCcBilllogoId id;

	// Constructors

	/** default constructor */
	public TCcBilllogo() {
	}

	/** full constructor */
	public TCcBilllogo(TCcBilllogoId id) {
		this.id = id;
	}

	// Property accessors

	public TCcBilllogoId getId() {
		return this.id;
	}

	public void setId(TCcBilllogoId id) {
		this.id = id;
	}

}