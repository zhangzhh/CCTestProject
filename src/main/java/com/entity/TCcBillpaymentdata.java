package com.entity;

/**
 * TCcBillpaymentdata entity. @author MyEclipse Persistence Tools
 */

public class TCcBillpaymentdata implements java.io.Serializable {

	// Fields

	private TCcBillpaymentdataId id;

	// Constructors

	/** default constructor */
	public TCcBillpaymentdata() {
	}

	/** full constructor */
	public TCcBillpaymentdata(TCcBillpaymentdataId id) {
		this.id = id;
	}

	// Property accessors

	public TCcBillpaymentdataId getId() {
		return this.id;
	}

	public void setId(TCcBillpaymentdataId id) {
		this.id = id;
	}

}