package com.entity;

/**
 * TCcCtCreateMode entity. @author MyEclipse Persistence Tools
 */

public class TCcCtCreateMode implements java.io.Serializable {

	// Fields

	private Long id;
	private Long billId;

	// Constructors

	/** default constructor */
	public TCcCtCreateMode() {
	}

	/** minimal constructor */
	public TCcCtCreateMode(Long id) {
		this.id = id;
	}

	/** full constructor */
	public TCcCtCreateMode(Long id, Long billId) {
		this.id = id;
		this.billId = billId;
	}

	// Property accessors

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getBillId() {
		return this.billId;
	}

	public void setBillId(Long billId) {
		this.billId = billId;
	}

}