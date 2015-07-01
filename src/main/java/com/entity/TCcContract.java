package com.entity;

import java.sql.Timestamp;

/**
 * TCcContract entity. @author MyEclipse Persistence Tools
 */

public class TCcContract implements java.io.Serializable {

	// Fields

	private Long contractid;
	private Long contracttypeid;
	private String contractnumber;
	private String contractname;
	private Timestamp signeddate;
	private String oppositecompany;
	private Timestamp startdate;
	private Timestamp enddate;
	private Long departid;
	private Long handlinguserid;
	private Double contractgrandtotal;
	private Long paymentid;
	private Double paidamount;
	private Double unpaidamount;
	private String isoveramount;
	private String isclose;

	// Constructors

	/** default constructor */
	public TCcContract() {
	}

	/** minimal constructor */
	public TCcContract(Long contractid) {
		this.contractid = contractid;
	}

	/** full constructor */
	public TCcContract(Long contractid, Long contracttypeid,
			String contractnumber, String contractname, Timestamp signeddate,
			String oppositecompany, Timestamp startdate, Timestamp enddate,
			Long departid, Long handlinguserid, Double contractgrandtotal,
			Long paymentid, Double paidamount, Double unpaidamount,
			String isoveramount, String isclose) {
		this.contractid = contractid;
		this.contracttypeid = contracttypeid;
		this.contractnumber = contractnumber;
		this.contractname = contractname;
		this.signeddate = signeddate;
		this.oppositecompany = oppositecompany;
		this.startdate = startdate;
		this.enddate = enddate;
		this.departid = departid;
		this.handlinguserid = handlinguserid;
		this.contractgrandtotal = contractgrandtotal;
		this.paymentid = paymentid;
		this.paidamount = paidamount;
		this.unpaidamount = unpaidamount;
		this.isoveramount = isoveramount;
		this.isclose = isclose;
	}

	// Property accessors

	public Long getContractid() {
		return this.contractid;
	}

	public void setContractid(Long contractid) {
		this.contractid = contractid;
	}

	public Long getContracttypeid() {
		return this.contracttypeid;
	}

	public void setContracttypeid(Long contracttypeid) {
		this.contracttypeid = contracttypeid;
	}

	public String getContractnumber() {
		return this.contractnumber;
	}

	public void setContractnumber(String contractnumber) {
		this.contractnumber = contractnumber;
	}

	public String getContractname() {
		return this.contractname;
	}

	public void setContractname(String contractname) {
		this.contractname = contractname;
	}

	public Timestamp getSigneddate() {
		return this.signeddate;
	}

	public void setSigneddate(Timestamp signeddate) {
		this.signeddate = signeddate;
	}

	public String getOppositecompany() {
		return this.oppositecompany;
	}

	public void setOppositecompany(String oppositecompany) {
		this.oppositecompany = oppositecompany;
	}

	public Timestamp getStartdate() {
		return this.startdate;
	}

	public void setStartdate(Timestamp startdate) {
		this.startdate = startdate;
	}

	public Timestamp getEnddate() {
		return this.enddate;
	}

	public void setEnddate(Timestamp enddate) {
		this.enddate = enddate;
	}

	public Long getDepartid() {
		return this.departid;
	}

	public void setDepartid(Long departid) {
		this.departid = departid;
	}

	public Long getHandlinguserid() {
		return this.handlinguserid;
	}

	public void setHandlinguserid(Long handlinguserid) {
		this.handlinguserid = handlinguserid;
	}

	public Double getContractgrandtotal() {
		return this.contractgrandtotal;
	}

	public void setContractgrandtotal(Double contractgrandtotal) {
		this.contractgrandtotal = contractgrandtotal;
	}

	public Long getPaymentid() {
		return this.paymentid;
	}

	public void setPaymentid(Long paymentid) {
		this.paymentid = paymentid;
	}

	public Double getPaidamount() {
		return this.paidamount;
	}

	public void setPaidamount(Double paidamount) {
		this.paidamount = paidamount;
	}

	public Double getUnpaidamount() {
		return this.unpaidamount;
	}

	public void setUnpaidamount(Double unpaidamount) {
		this.unpaidamount = unpaidamount;
	}

	public String getIsoveramount() {
		return this.isoveramount;
	}

	public void setIsoveramount(String isoveramount) {
		this.isoveramount = isoveramount;
	}

	public String getIsclose() {
		return this.isclose;
	}

	public void setIsclose(String isclose) {
		this.isclose = isclose;
	}

}