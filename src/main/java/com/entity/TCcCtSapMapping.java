package com.entity;

/**
 * TCcCtSapMapping entity. @author MyEclipse Persistence Tools
 */

public class TCcCtSapMapping implements java.io.Serializable {

	// Fields

	private Long mapid;
	private String billname;
	private String billtype;
	private String accountcode;
	private String accountname;
	private String controlaccountcode;
	private String controlaccountname;
	private String paymenttype;
	private String sapsgl;
	private String iscreatepaymentinfo;
	private String paymentarea;
	private Long billid;
	private String paytypecode;

	// Constructors

	/** default constructor */
	public TCcCtSapMapping() {
	}

	/** minimal constructor */
	public TCcCtSapMapping(Long mapid) {
		this.mapid = mapid;
	}

	/** full constructor */
	public TCcCtSapMapping(Long mapid, String billname, String billtype,
			String accountcode, String accountname, String controlaccountcode,
			String controlaccountname, String paymenttype, String sapsgl,
			String iscreatepaymentinfo, String paymentarea, Long billid,
			String paytypecode) {
		this.mapid = mapid;
		this.billname = billname;
		this.billtype = billtype;
		this.accountcode = accountcode;
		this.accountname = accountname;
		this.controlaccountcode = controlaccountcode;
		this.controlaccountname = controlaccountname;
		this.paymenttype = paymenttype;
		this.sapsgl = sapsgl;
		this.iscreatepaymentinfo = iscreatepaymentinfo;
		this.paymentarea = paymentarea;
		this.billid = billid;
		this.paytypecode = paytypecode;
	}

	// Property accessors

	public Long getMapid() {
		return this.mapid;
	}

	public void setMapid(Long mapid) {
		this.mapid = mapid;
	}

	public String getBillname() {
		return this.billname;
	}

	public void setBillname(String billname) {
		this.billname = billname;
	}

	public String getBilltype() {
		return this.billtype;
	}

	public void setBilltype(String billtype) {
		this.billtype = billtype;
	}

	public String getAccountcode() {
		return this.accountcode;
	}

	public void setAccountcode(String accountcode) {
		this.accountcode = accountcode;
	}

	public String getAccountname() {
		return this.accountname;
	}

	public void setAccountname(String accountname) {
		this.accountname = accountname;
	}

	public String getControlaccountcode() {
		return this.controlaccountcode;
	}

	public void setControlaccountcode(String controlaccountcode) {
		this.controlaccountcode = controlaccountcode;
	}

	public String getControlaccountname() {
		return this.controlaccountname;
	}

	public void setControlaccountname(String controlaccountname) {
		this.controlaccountname = controlaccountname;
	}

	public String getPaymenttype() {
		return this.paymenttype;
	}

	public void setPaymenttype(String paymenttype) {
		this.paymenttype = paymenttype;
	}

	public String getSapsgl() {
		return this.sapsgl;
	}

	public void setSapsgl(String sapsgl) {
		this.sapsgl = sapsgl;
	}

	public String getIscreatepaymentinfo() {
		return this.iscreatepaymentinfo;
	}

	public void setIscreatepaymentinfo(String iscreatepaymentinfo) {
		this.iscreatepaymentinfo = iscreatepaymentinfo;
	}

	public String getPaymentarea() {
		return this.paymentarea;
	}

	public void setPaymentarea(String paymentarea) {
		this.paymentarea = paymentarea;
	}

	public Long getBillid() {
		return this.billid;
	}

	public void setBillid(Long billid) {
		this.billid = billid;
	}

	public String getPaytypecode() {
		return this.paytypecode;
	}

	public void setPaytypecode(String paytypecode) {
		this.paytypecode = paytypecode;
	}

}