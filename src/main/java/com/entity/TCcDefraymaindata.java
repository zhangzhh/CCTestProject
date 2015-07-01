package com.entity;

import java.sql.Timestamp;

/**
 * TCcDefraymaindata entity. @author MyEclipse Persistence Tools
 */

public class TCcDefraymaindata implements java.io.Serializable {

	// Fields

	private Long defraydataid;
	private Long fileid;
	private Long paymentdataid;
	private String checksheetdataid;
	private String defraynumber;
	private String defraytype;
	private String inceptaccount;
	private Double payamount;
	private Byte exportstate;
	private Timestamp exportdate;
	private Byte checkstate;
	private Timestamp checkdate;
	private Byte defraystate;
	private Byte voucherstate;
	private Double payaccount;
	private Timestamp paydate;
	private String memo;
	private Timestamp createtime;

	// Constructors

	/** default constructor */
	public TCcDefraymaindata() {
	}

	/** minimal constructor */
	public TCcDefraymaindata(Long defraydataid) {
		this.defraydataid = defraydataid;
	}

	/** full constructor */
	public TCcDefraymaindata(Long defraydataid, Long fileid,
			Long paymentdataid, String checksheetdataid, String defraynumber,
			String defraytype, String inceptaccount, Double payamount,
			Byte exportstate, Timestamp exportdate, Byte checkstate,
			Timestamp checkdate, Byte defraystate, Byte voucherstate,
			Double payaccount, Timestamp paydate, String memo,
			Timestamp createtime) {
		this.defraydataid = defraydataid;
		this.fileid = fileid;
		this.paymentdataid = paymentdataid;
		this.checksheetdataid = checksheetdataid;
		this.defraynumber = defraynumber;
		this.defraytype = defraytype;
		this.inceptaccount = inceptaccount;
		this.payamount = payamount;
		this.exportstate = exportstate;
		this.exportdate = exportdate;
		this.checkstate = checkstate;
		this.checkdate = checkdate;
		this.defraystate = defraystate;
		this.voucherstate = voucherstate;
		this.payaccount = payaccount;
		this.paydate = paydate;
		this.memo = memo;
		this.createtime = createtime;
	}

	// Property accessors

	public Long getDefraydataid() {
		return this.defraydataid;
	}

	public void setDefraydataid(Long defraydataid) {
		this.defraydataid = defraydataid;
	}

	public Long getFileid() {
		return this.fileid;
	}

	public void setFileid(Long fileid) {
		this.fileid = fileid;
	}

	public Long getPaymentdataid() {
		return this.paymentdataid;
	}

	public void setPaymentdataid(Long paymentdataid) {
		this.paymentdataid = paymentdataid;
	}

	public String getChecksheetdataid() {
		return this.checksheetdataid;
	}

	public void setChecksheetdataid(String checksheetdataid) {
		this.checksheetdataid = checksheetdataid;
	}

	public String getDefraynumber() {
		return this.defraynumber;
	}

	public void setDefraynumber(String defraynumber) {
		this.defraynumber = defraynumber;
	}

	public String getDefraytype() {
		return this.defraytype;
	}

	public void setDefraytype(String defraytype) {
		this.defraytype = defraytype;
	}

	public String getInceptaccount() {
		return this.inceptaccount;
	}

	public void setInceptaccount(String inceptaccount) {
		this.inceptaccount = inceptaccount;
	}

	public Double getPayamount() {
		return this.payamount;
	}

	public void setPayamount(Double payamount) {
		this.payamount = payamount;
	}

	public Byte getExportstate() {
		return this.exportstate;
	}

	public void setExportstate(Byte exportstate) {
		this.exportstate = exportstate;
	}

	public Timestamp getExportdate() {
		return this.exportdate;
	}

	public void setExportdate(Timestamp exportdate) {
		this.exportdate = exportdate;
	}

	public Byte getCheckstate() {
		return this.checkstate;
	}

	public void setCheckstate(Byte checkstate) {
		this.checkstate = checkstate;
	}

	public Timestamp getCheckdate() {
		return this.checkdate;
	}

	public void setCheckdate(Timestamp checkdate) {
		this.checkdate = checkdate;
	}

	public Byte getDefraystate() {
		return this.defraystate;
	}

	public void setDefraystate(Byte defraystate) {
		this.defraystate = defraystate;
	}

	public Byte getVoucherstate() {
		return this.voucherstate;
	}

	public void setVoucherstate(Byte voucherstate) {
		this.voucherstate = voucherstate;
	}

	public Double getPayaccount() {
		return this.payaccount;
	}

	public void setPayaccount(Double payaccount) {
		this.payaccount = payaccount;
	}

	public Timestamp getPaydate() {
		return this.paydate;
	}

	public void setPaydate(Timestamp paydate) {
		this.paydate = paydate;
	}

	public String getMemo() {
		return this.memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public Timestamp getCreatetime() {
		return this.createtime;
	}

	public void setCreatetime(Timestamp createtime) {
		this.createtime = createtime;
	}

}