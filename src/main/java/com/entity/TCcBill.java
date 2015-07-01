package com.entity;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * TCcBill entity. @author MyEclipse Persistence Tools
 */

public class TCcBill implements java.io.Serializable {

	// Fields

	private Long billid;
	private String billname;
	private Long formid;
	private Long typeid;
	private String billprefix;
	private BigDecimal billorder;
	private String billmemo;
	private byte[] formtemplate;
	private byte[] billtemplate;
	private byte[] sheettemplate;
	private Long classification;
	private byte[] itemtemplate;
	private String importtype;
	private String samedim;
	private String autoinput;
	private Long historyid;
	private String subevent;
	private String accounttoflow;
	private String billauth;
	private Set TCcBillitems = new HashSet(0);

	// Constructors

	/** default constructor */
	public TCcBill() {
	}

	/** minimal constructor */
	public TCcBill(Long billid) {
		this.billid = billid;
	}

	/** full constructor */
	public TCcBill(Long billid, String billname, Long formid, Long typeid,
			String billprefix, BigDecimal billorder, String billmemo,
			byte[] formtemplate, byte[] billtemplate, byte[] sheettemplate,
			Long classification, byte[] itemtemplate, String importtype,
			String samedim, String autoinput, Long historyid, String subevent,
			String accounttoflow, String billauth, Set TCcBillitems) {
		this.billid = billid;
		this.billname = billname;
		this.formid = formid;
		this.typeid = typeid;
		this.billprefix = billprefix;
		this.billorder = billorder;
		this.billmemo = billmemo;
		this.formtemplate = formtemplate;
		this.billtemplate = billtemplate;
		this.sheettemplate = sheettemplate;
		this.classification = classification;
		this.itemtemplate = itemtemplate;
		this.importtype = importtype;
		this.samedim = samedim;
		this.autoinput = autoinput;
		this.historyid = historyid;
		this.subevent = subevent;
		this.accounttoflow = accounttoflow;
		this.billauth = billauth;
		this.TCcBillitems = TCcBillitems;
	}

	// Property accessors

	public Long getBillid() {
		return this.billid;
	}

	public void setBillid(Long billid) {
		this.billid = billid;
	}

	public String getBillname() {
		return this.billname;
	}

	public void setBillname(String billname) {
		this.billname = billname;
	}

	public Long getFormid() {
		return this.formid;
	}

	public void setFormid(Long formid) {
		this.formid = formid;
	}

	public Long getTypeid() {
		return this.typeid;
	}

	public void setTypeid(Long typeid) {
		this.typeid = typeid;
	}

	public String getBillprefix() {
		return this.billprefix;
	}

	public void setBillprefix(String billprefix) {
		this.billprefix = billprefix;
	}

	public BigDecimal getBillorder() {
		return this.billorder;
	}

	public void setBillorder(BigDecimal billorder) {
		this.billorder = billorder;
	}

	public String getBillmemo() {
		return this.billmemo;
	}

	public void setBillmemo(String billmemo) {
		this.billmemo = billmemo;
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

	public Long getClassification() {
		return this.classification;
	}

	public void setClassification(Long classification) {
		this.classification = classification;
	}

	public byte[] getItemtemplate() {
		return this.itemtemplate;
	}

	public void setItemtemplate(byte[] itemtemplate) {
		this.itemtemplate = itemtemplate;
	}

	public String getImporttype() {
		return this.importtype;
	}

	public void setImporttype(String importtype) {
		this.importtype = importtype;
	}

	public String getSamedim() {
		return this.samedim;
	}

	public void setSamedim(String samedim) {
		this.samedim = samedim;
	}

	public String getAutoinput() {
		return this.autoinput;
	}

	public void setAutoinput(String autoinput) {
		this.autoinput = autoinput;
	}

	public Long getHistoryid() {
		return this.historyid;
	}

	public void setHistoryid(Long historyid) {
		this.historyid = historyid;
	}

	public String getSubevent() {
		return this.subevent;
	}

	public void setSubevent(String subevent) {
		this.subevent = subevent;
	}

	public String getAccounttoflow() {
		return this.accounttoflow;
	}

	public void setAccounttoflow(String accounttoflow) {
		this.accounttoflow = accounttoflow;
	}

	public String getBillauth() {
		return this.billauth;
	}

	public void setBillauth(String billauth) {
		this.billauth = billauth;
	}

	public Set getTCcBillitems() {
		return this.TCcBillitems;
	}

	public void setTCcBillitems(Set TCcBillitems) {
		this.TCcBillitems = TCcBillitems;
	}

}