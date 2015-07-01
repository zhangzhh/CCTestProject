package com.entity;

import java.sql.Timestamp;

/**
 * TCcBillforsign entity. @author MyEclipse Persistence Tools
 */

public class TCcBillforsign implements java.io.Serializable {

	// Fields

	private Long scanningid;
	private Long billmaindataid;
	private String billnumber;
	private String billname;
	private Double naturalamount;
	private String department;
	private String dealuser;
	private String status;
	private String remarks;
	private Long taskid;
	private String batchnum;
	private Timestamp scanningtime;
	private Long scanninguser;

	// Constructors

	/** default constructor */
	public TCcBillforsign() {
	}

	/** minimal constructor */
	public TCcBillforsign(Long scanningid) {
		this.scanningid = scanningid;
	}

	/** full constructor */
	public TCcBillforsign(Long scanningid, Long billmaindataid,
			String billnumber, String billname, Double naturalamount,
			String department, String dealuser, String status, String remarks,
			Long taskid, String batchnum, Timestamp scanningtime,
			Long scanninguser) {
		this.scanningid = scanningid;
		this.billmaindataid = billmaindataid;
		this.billnumber = billnumber;
		this.billname = billname;
		this.naturalamount = naturalamount;
		this.department = department;
		this.dealuser = dealuser;
		this.status = status;
		this.remarks = remarks;
		this.taskid = taskid;
		this.batchnum = batchnum;
		this.scanningtime = scanningtime;
		this.scanninguser = scanninguser;
	}

	// Property accessors

	public Long getScanningid() {
		return this.scanningid;
	}

	public void setScanningid(Long scanningid) {
		this.scanningid = scanningid;
	}

	public Long getBillmaindataid() {
		return this.billmaindataid;
	}

	public void setBillmaindataid(Long billmaindataid) {
		this.billmaindataid = billmaindataid;
	}

	public String getBillnumber() {
		return this.billnumber;
	}

	public void setBillnumber(String billnumber) {
		this.billnumber = billnumber;
	}

	public String getBillname() {
		return this.billname;
	}

	public void setBillname(String billname) {
		this.billname = billname;
	}

	public Double getNaturalamount() {
		return this.naturalamount;
	}

	public void setNaturalamount(Double naturalamount) {
		this.naturalamount = naturalamount;
	}

	public String getDepartment() {
		return this.department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getDealuser() {
		return this.dealuser;
	}

	public void setDealuser(String dealuser) {
		this.dealuser = dealuser;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public Long getTaskid() {
		return this.taskid;
	}

	public void setTaskid(Long taskid) {
		this.taskid = taskid;
	}

	public String getBatchnum() {
		return this.batchnum;
	}

	public void setBatchnum(String batchnum) {
		this.batchnum = batchnum;
	}

	public Timestamp getScanningtime() {
		return this.scanningtime;
	}

	public void setScanningtime(Timestamp scanningtime) {
		this.scanningtime = scanningtime;
	}

	public Long getScanninguser() {
		return this.scanninguser;
	}

	public void setScanninguser(Long scanninguser) {
		this.scanninguser = scanninguser;
	}

}