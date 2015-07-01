package com.entity;

/**
 * TCcBillreceipt entity. @author MyEclipse Persistence Tools
 */

public class TCcBillreceipt implements java.io.Serializable {

	// Fields

	private TCcBillreceiptId id;

	// Constructors

	/** default constructor */
	public TCcBillreceipt() {
	}

	/** full constructor */
	public TCcBillreceipt(TCcBillreceiptId id) {
		this.id = id;
	}

	// Property accessors

	public TCcBillreceiptId getId() {
		return this.id;
	}

	public void setId(TCcBillreceiptId id) {
		this.id = id;
	}

}