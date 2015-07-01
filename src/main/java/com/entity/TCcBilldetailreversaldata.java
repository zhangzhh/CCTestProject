package com.entity;

import java.sql.Timestamp;

/**
 * TCcBilldetailreversaldata entity. @author MyEclipse Persistence Tools
 */

public class TCcBilldetailreversaldata implements java.io.Serializable {

	// Fields

	private Long billdetaildataid;
	private Double avaliableamount;
	private Double totalamount;
	private String memo;
	private Short budgettype;
	private Short billtype;
	private Timestamp createtime;
	private Timestamp lastedittime;
	private Double useamount;
	private Double backamount;

	// Constructors

	/** default constructor */
	public TCcBilldetailreversaldata() {
	}

	/** minimal constructor */
	public TCcBilldetailreversaldata(Long billdetaildataid) {
		this.billdetaildataid = billdetaildataid;
	}

	/** full constructor */
	public TCcBilldetailreversaldata(Long billdetaildataid,
			Double avaliableamount, Double totalamount, String memo,
			Short budgettype, Short billtype, Timestamp createtime,
			Timestamp lastedittime, Double useamount, Double backamount) {
		this.billdetaildataid = billdetaildataid;
		this.avaliableamount = avaliableamount;
		this.totalamount = totalamount;
		this.memo = memo;
		this.budgettype = budgettype;
		this.billtype = billtype;
		this.createtime = createtime;
		this.lastedittime = lastedittime;
		this.useamount = useamount;
		this.backamount = backamount;
	}

	// Property accessors

	public Long getBilldetaildataid() {
		return this.billdetaildataid;
	}

	public void setBilldetaildataid(Long billdetaildataid) {
		this.billdetaildataid = billdetaildataid;
	}

	public Double getAvaliableamount() {
		return this.avaliableamount;
	}

	public void setAvaliableamount(Double avaliableamount) {
		this.avaliableamount = avaliableamount;
	}

	public Double getTotalamount() {
		return this.totalamount;
	}

	public void setTotalamount(Double totalamount) {
		this.totalamount = totalamount;
	}

	public String getMemo() {
		return this.memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public Short getBudgettype() {
		return this.budgettype;
	}

	public void setBudgettype(Short budgettype) {
		this.budgettype = budgettype;
	}

	public Short getBilltype() {
		return this.billtype;
	}

	public void setBilltype(Short billtype) {
		this.billtype = billtype;
	}

	public Timestamp getCreatetime() {
		return this.createtime;
	}

	public void setCreatetime(Timestamp createtime) {
		this.createtime = createtime;
	}

	public Timestamp getLastedittime() {
		return this.lastedittime;
	}

	public void setLastedittime(Timestamp lastedittime) {
		this.lastedittime = lastedittime;
	}

	public Double getUseamount() {
		return this.useamount;
	}

	public void setUseamount(Double useamount) {
		this.useamount = useamount;
	}

	public Double getBackamount() {
		return this.backamount;
	}

	public void setBackamount(Double backamount) {
		this.backamount = backamount;
	}

}