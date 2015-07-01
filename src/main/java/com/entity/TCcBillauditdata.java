package com.entity;

/**
 * TCcBillauditdata entity. @author MyEclipse Persistence Tools
 */

public class TCcBillauditdata implements java.io.Serializable {

	// Fields

	private TCcBillauditdataId id;

	// Constructors

	/** default constructor */
	public TCcBillauditdata() {
	}

	/** full constructor */
	public TCcBillauditdata(TCcBillauditdataId id) {
		this.id = id;
	}

	// Property accessors

	public TCcBillauditdataId getId() {
		return this.id;
	}

	public void setId(TCcBillauditdataId id) {
		this.id = id;
	}

}