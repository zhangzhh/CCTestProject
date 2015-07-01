package com.entity;

/**
 * TCcBillpaymentcreate entity. @author MyEclipse Persistence Tools
 */

public class TCcBillpaymentcreate implements java.io.Serializable {

	// Fields

	private TCcBillpaymentcreateId id;

	// Constructors

	/** default constructor */
	public TCcBillpaymentcreate() {
	}

	/** full constructor */
	public TCcBillpaymentcreate(TCcBillpaymentcreateId id) {
		this.id = id;
	}

	// Property accessors

	public TCcBillpaymentcreateId getId() {
		return this.id;
	}

	public void setId(TCcBillpaymentcreateId id) {
		this.id = id;
	}

}