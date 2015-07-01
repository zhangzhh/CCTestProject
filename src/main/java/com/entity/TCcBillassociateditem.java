package com.entity;

/**
 * TCcBillassociateditem entity. @author MyEclipse Persistence Tools
 */

public class TCcBillassociateditem implements java.io.Serializable {

	// Fields

	private Long billassociateditemid;
	private TCcBillassociatedbill TCcBillassociatedbill;
	private Long sourcebillitemid;
	private Long targetbillitemid;

	// Constructors

	/** default constructor */
	public TCcBillassociateditem() {
	}

	/** minimal constructor */
	public TCcBillassociateditem(Long billassociateditemid) {
		this.billassociateditemid = billassociateditemid;
	}

	/** full constructor */
	public TCcBillassociateditem(Long billassociateditemid,
			TCcBillassociatedbill TCcBillassociatedbill, Long sourcebillitemid,
			Long targetbillitemid) {
		this.billassociateditemid = billassociateditemid;
		this.TCcBillassociatedbill = TCcBillassociatedbill;
		this.sourcebillitemid = sourcebillitemid;
		this.targetbillitemid = targetbillitemid;
	}

	// Property accessors

	public Long getBillassociateditemid() {
		return this.billassociateditemid;
	}

	public void setBillassociateditemid(Long billassociateditemid) {
		this.billassociateditemid = billassociateditemid;
	}

	public TCcBillassociatedbill getTCcBillassociatedbill() {
		return this.TCcBillassociatedbill;
	}

	public void setTCcBillassociatedbill(
			TCcBillassociatedbill TCcBillassociatedbill) {
		this.TCcBillassociatedbill = TCcBillassociatedbill;
	}

	public Long getSourcebillitemid() {
		return this.sourcebillitemid;
	}

	public void setSourcebillitemid(Long sourcebillitemid) {
		this.sourcebillitemid = sourcebillitemid;
	}

	public Long getTargetbillitemid() {
		return this.targetbillitemid;
	}

	public void setTargetbillitemid(Long targetbillitemid) {
		this.targetbillitemid = targetbillitemid;
	}

}