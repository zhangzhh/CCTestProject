package com.entity;

/**
 * TCcBillprocessApproveamount entity. @author MyEclipse Persistence Tools
 */

public class TCcBillprocessApproveamount implements java.io.Serializable {

	// Fields

	private Long approvedetailid;
	private Long billdetaildataid;
	private Long approvecommentid;
	private Double preapproveamount;
	private Double approveamount;

	// Constructors

	/** default constructor */
	public TCcBillprocessApproveamount() {
	}

	/** minimal constructor */
	public TCcBillprocessApproveamount(Long approvedetailid) {
		this.approvedetailid = approvedetailid;
	}

	/** full constructor */
	public TCcBillprocessApproveamount(Long approvedetailid,
			Long billdetaildataid, Long approvecommentid,
			Double preapproveamount, Double approveamount) {
		this.approvedetailid = approvedetailid;
		this.billdetaildataid = billdetaildataid;
		this.approvecommentid = approvecommentid;
		this.preapproveamount = preapproveamount;
		this.approveamount = approveamount;
	}

	// Property accessors

	public Long getApprovedetailid() {
		return this.approvedetailid;
	}

	public void setApprovedetailid(Long approvedetailid) {
		this.approvedetailid = approvedetailid;
	}

	public Long getBilldetaildataid() {
		return this.billdetaildataid;
	}

	public void setBilldetaildataid(Long billdetaildataid) {
		this.billdetaildataid = billdetaildataid;
	}

	public Long getApprovecommentid() {
		return this.approvecommentid;
	}

	public void setApprovecommentid(Long approvecommentid) {
		this.approvecommentid = approvecommentid;
	}

	public Double getPreapproveamount() {
		return this.preapproveamount;
	}

	public void setPreapproveamount(Double preapproveamount) {
		this.preapproveamount = preapproveamount;
	}

	public Double getApproveamount() {
		return this.approveamount;
	}

	public void setApproveamount(Double approveamount) {
		this.approveamount = approveamount;
	}

}