package com.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * TCcBillassociatedbill entity. @author MyEclipse Persistence Tools
 */

public class TCcBillassociatedbill implements java.io.Serializable {

	// Fields

	private Long billassociatedbillid;
	private Long sourcebillid;
	private Long targetbillid;
	private Set TCcBillassociateditems = new HashSet(0);

	// Constructors

	/** default constructor */
	public TCcBillassociatedbill() {
	}

	/** minimal constructor */
	public TCcBillassociatedbill(Long billassociatedbillid) {
		this.billassociatedbillid = billassociatedbillid;
	}

	/** full constructor */
	public TCcBillassociatedbill(Long billassociatedbillid, Long sourcebillid,
			Long targetbillid, Set TCcBillassociateditems) {
		this.billassociatedbillid = billassociatedbillid;
		this.sourcebillid = sourcebillid;
		this.targetbillid = targetbillid;
		this.TCcBillassociateditems = TCcBillassociateditems;
	}

	// Property accessors

	public Long getBillassociatedbillid() {
		return this.billassociatedbillid;
	}

	public void setBillassociatedbillid(Long billassociatedbillid) {
		this.billassociatedbillid = billassociatedbillid;
	}

	public Long getSourcebillid() {
		return this.sourcebillid;
	}

	public void setSourcebillid(Long sourcebillid) {
		this.sourcebillid = sourcebillid;
	}

	public Long getTargetbillid() {
		return this.targetbillid;
	}

	public void setTargetbillid(Long targetbillid) {
		this.targetbillid = targetbillid;
	}

	public Set getTCcBillassociateditems() {
		return this.TCcBillassociateditems;
	}

	public void setTCcBillassociateditems(Set TCcBillassociateditems) {
		this.TCcBillassociateditems = TCcBillassociateditems;
	}

}