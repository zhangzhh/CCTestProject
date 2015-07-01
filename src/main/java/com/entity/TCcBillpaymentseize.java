package com.entity;

import java.sql.Timestamp;

/**
 * TCcBillpaymentseize entity. @author MyEclipse Persistence Tools
 */

public class TCcBillpaymentseize implements java.io.Serializable {

	// Fields

	private Long billsizeid;
	private String billholdid;
	private Timestamp billholdtime;
	private String billstatus;
	private String sizeholeid;
	private String sizeholename;
	private String sizeholedept;
	private Timestamp freetime;
	private String billid;
	private String requisitionuser;
	private String paymentdataid;
	private String paymentaccount;
	private String inceptbank;
	private String inceptname;
	private String inceptaccount;
	private String inceptaccounttype;
	private String inceptaccountname;
	private String settlement;
	private String billnumber;
	private String requisitionusername;
	private String sizeholetwoid;
	private String sizeholtwoedept;

	// Constructors

	/** default constructor */
	public TCcBillpaymentseize() {
	}

	/** minimal constructor */
	public TCcBillpaymentseize(Long billsizeid) {
		this.billsizeid = billsizeid;
	}

	/** full constructor */
	public TCcBillpaymentseize(Long billsizeid, String billholdid,
			Timestamp billholdtime, String billstatus, String sizeholeid,
			String sizeholename, String sizeholedept, Timestamp freetime,
			String billid, String requisitionuser, String paymentdataid,
			String paymentaccount, String inceptbank, String inceptname,
			String inceptaccount, String inceptaccounttype,
			String inceptaccountname, String settlement, String billnumber,
			String requisitionusername, String sizeholetwoid,
			String sizeholtwoedept) {
		this.billsizeid = billsizeid;
		this.billholdid = billholdid;
		this.billholdtime = billholdtime;
		this.billstatus = billstatus;
		this.sizeholeid = sizeholeid;
		this.sizeholename = sizeholename;
		this.sizeholedept = sizeholedept;
		this.freetime = freetime;
		this.billid = billid;
		this.requisitionuser = requisitionuser;
		this.paymentdataid = paymentdataid;
		this.paymentaccount = paymentaccount;
		this.inceptbank = inceptbank;
		this.inceptname = inceptname;
		this.inceptaccount = inceptaccount;
		this.inceptaccounttype = inceptaccounttype;
		this.inceptaccountname = inceptaccountname;
		this.settlement = settlement;
		this.billnumber = billnumber;
		this.requisitionusername = requisitionusername;
		this.sizeholetwoid = sizeholetwoid;
		this.sizeholtwoedept = sizeholtwoedept;
	}

	// Property accessors

	public Long getBillsizeid() {
		return this.billsizeid;
	}

	public void setBillsizeid(Long billsizeid) {
		this.billsizeid = billsizeid;
	}

	public String getBillholdid() {
		return this.billholdid;
	}

	public void setBillholdid(String billholdid) {
		this.billholdid = billholdid;
	}

	public Timestamp getBillholdtime() {
		return this.billholdtime;
	}

	public void setBillholdtime(Timestamp billholdtime) {
		this.billholdtime = billholdtime;
	}

	public String getBillstatus() {
		return this.billstatus;
	}

	public void setBillstatus(String billstatus) {
		this.billstatus = billstatus;
	}

	public String getSizeholeid() {
		return this.sizeholeid;
	}

	public void setSizeholeid(String sizeholeid) {
		this.sizeholeid = sizeholeid;
	}

	public String getSizeholename() {
		return this.sizeholename;
	}

	public void setSizeholename(String sizeholename) {
		this.sizeholename = sizeholename;
	}

	public String getSizeholedept() {
		return this.sizeholedept;
	}

	public void setSizeholedept(String sizeholedept) {
		this.sizeholedept = sizeholedept;
	}

	public Timestamp getFreetime() {
		return this.freetime;
	}

	public void setFreetime(Timestamp freetime) {
		this.freetime = freetime;
	}

	public String getBillid() {
		return this.billid;
	}

	public void setBillid(String billid) {
		this.billid = billid;
	}

	public String getRequisitionuser() {
		return this.requisitionuser;
	}

	public void setRequisitionuser(String requisitionuser) {
		this.requisitionuser = requisitionuser;
	}

	public String getPaymentdataid() {
		return this.paymentdataid;
	}

	public void setPaymentdataid(String paymentdataid) {
		this.paymentdataid = paymentdataid;
	}

	public String getPaymentaccount() {
		return this.paymentaccount;
	}

	public void setPaymentaccount(String paymentaccount) {
		this.paymentaccount = paymentaccount;
	}

	public String getInceptbank() {
		return this.inceptbank;
	}

	public void setInceptbank(String inceptbank) {
		this.inceptbank = inceptbank;
	}

	public String getInceptname() {
		return this.inceptname;
	}

	public void setInceptname(String inceptname) {
		this.inceptname = inceptname;
	}

	public String getInceptaccount() {
		return this.inceptaccount;
	}

	public void setInceptaccount(String inceptaccount) {
		this.inceptaccount = inceptaccount;
	}

	public String getInceptaccounttype() {
		return this.inceptaccounttype;
	}

	public void setInceptaccounttype(String inceptaccounttype) {
		this.inceptaccounttype = inceptaccounttype;
	}

	public String getInceptaccountname() {
		return this.inceptaccountname;
	}

	public void setInceptaccountname(String inceptaccountname) {
		this.inceptaccountname = inceptaccountname;
	}

	public String getSettlement() {
		return this.settlement;
	}

	public void setSettlement(String settlement) {
		this.settlement = settlement;
	}

	public String getBillnumber() {
		return this.billnumber;
	}

	public void setBillnumber(String billnumber) {
		this.billnumber = billnumber;
	}

	public String getRequisitionusername() {
		return this.requisitionusername;
	}

	public void setRequisitionusername(String requisitionusername) {
		this.requisitionusername = requisitionusername;
	}

	public String getSizeholetwoid() {
		return this.sizeholetwoid;
	}

	public void setSizeholetwoid(String sizeholetwoid) {
		this.sizeholetwoid = sizeholetwoid;
	}

	public String getSizeholtwoedept() {
		return this.sizeholtwoedept;
	}

	public void setSizeholtwoedept(String sizeholtwoedept) {
		this.sizeholtwoedept = sizeholtwoedept;
	}

}