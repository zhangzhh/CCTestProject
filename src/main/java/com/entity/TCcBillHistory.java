package com.entity;

import java.sql.Timestamp;

/**
 * TCcBillHistory entity. @author MyEclipse Persistence Tools
 */

public class TCcBillHistory implements java.io.Serializable {

	// Fields

	private Long historyid;
	private Long billid;
	private byte[] formtemplate;
	private byte[] billtemplate;
	private byte[] sheettemplate;
	private byte[] itemtemplate;
	private Timestamp createdate;

	// Constructors

	/** default constructor */
	public TCcBillHistory() {
	}

	/** minimal constructor */
	public TCcBillHistory(Long historyid, Long billid) {
		this.historyid = historyid;
		this.billid = billid;
	}

	/** full constructor */
	public TCcBillHistory(Long historyid, Long billid, byte[] formtemplate,
			byte[] billtemplate, byte[] sheettemplate, byte[] itemtemplate,
			Timestamp createdate) {
		this.historyid = historyid;
		this.billid = billid;
		this.formtemplate = formtemplate;
		this.billtemplate = billtemplate;
		this.sheettemplate = sheettemplate;
		this.itemtemplate = itemtemplate;
		this.createdate = createdate;
	}

	// Property accessors

	public Long getHistoryid() {
		return this.historyid;
	}

	public void setHistoryid(Long historyid) {
		this.historyid = historyid;
	}

	public Long getBillid() {
		return this.billid;
	}

	public void setBillid(Long billid) {
		this.billid = billid;
	}

	public byte[] getFormtemplate() {
		return this.formtemplate;
	}

	public void setFormtemplate(byte[] formtemplate) {
		this.formtemplate = formtemplate;
	}

	public byte[] getBilltemplate() {
		return this.billtemplate;
	}

	public void setBilltemplate(byte[] billtemplate) {
		this.billtemplate = billtemplate;
	}

	public byte[] getSheettemplate() {
		return this.sheettemplate;
	}

	public void setSheettemplate(byte[] sheettemplate) {
		this.sheettemplate = sheettemplate;
	}

	public byte[] getItemtemplate() {
		return this.itemtemplate;
	}

	public void setItemtemplate(byte[] itemtemplate) {
		this.itemtemplate = itemtemplate;
	}

	public Timestamp getCreatedate() {
		return this.createdate;
	}

	public void setCreatedate(Timestamp createdate) {
		this.createdate = createdate;
	}

}