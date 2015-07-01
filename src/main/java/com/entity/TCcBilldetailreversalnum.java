package com.entity;

import java.sql.Timestamp;

/**
 * TCcBilldetailreversalnum entity. @author MyEclipse Persistence Tools
 */

public class TCcBilldetailreversalnum implements java.io.Serializable {

	// Fields

	private Long billdetaildataid;
	private Double avaliablenum;
	private Double totalnum;
	private Short billtype;
	private Timestamp createtime;
	private Timestamp lastedittime;
	private Double usenum;

	// Constructors

	/** default constructor */
	public TCcBilldetailreversalnum() {
	}

	/** minimal constructor */
	public TCcBilldetailreversalnum(Long billdetaildataid) {
		this.billdetaildataid = billdetaildataid;
	}

	/** full constructor */
	public TCcBilldetailreversalnum(Long billdetaildataid, Double avaliablenum,
			Double totalnum, Short billtype, Timestamp createtime,
			Timestamp lastedittime, Double usenum) {
		this.billdetaildataid = billdetaildataid;
		this.avaliablenum = avaliablenum;
		this.totalnum = totalnum;
		this.billtype = billtype;
		this.createtime = createtime;
		this.lastedittime = lastedittime;
		this.usenum = usenum;
	}

	// Property accessors

	public Long getBilldetaildataid() {
		return this.billdetaildataid;
	}

	public void setBilldetaildataid(Long billdetaildataid) {
		this.billdetaildataid = billdetaildataid;
	}

	public Double getAvaliablenum() {
		return this.avaliablenum;
	}

	public void setAvaliablenum(Double avaliablenum) {
		this.avaliablenum = avaliablenum;
	}

	public Double getTotalnum() {
		return this.totalnum;
	}

	public void setTotalnum(Double totalnum) {
		this.totalnum = totalnum;
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

	public Double getUsenum() {
		return this.usenum;
	}

	public void setUsenum(Double usenum) {
		this.usenum = usenum;
	}

}