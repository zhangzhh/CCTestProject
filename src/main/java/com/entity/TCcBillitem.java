package com.entity;

import java.math.BigDecimal;

/**
 * TCcBillitem entity. @author MyEclipse Persistence Tools
 */

public class TCcBillitem implements java.io.Serializable {

	// Fields

	private Long billitemid;
	private TCcBill TCcBill;
	private Long itemid;
	private Long associationbillitemid;
	private String isused;
	private String notnull;
	private String overbudget;
	private String editable;
	private String associationdim;
	private String itemformula;
	private Long dimid;
	private String controldimid;
	private String defaultlabel;
	private String defaultvalue;
	private Long length;
	private String eventtype;
	private String eventname;
	private String mark;
	private String memo;
	private BigDecimal itemdisplaytype;
	private BigDecimal itemdatatype;

	// Constructors

	/** default constructor */
	public TCcBillitem() {
	}

	/** minimal constructor */
	public TCcBillitem(Long billitemid) {
		this.billitemid = billitemid;
	}

	/** full constructor */
	public TCcBillitem(Long billitemid, TCcBill TCcBill, Long itemid,
			Long associationbillitemid, String isused, String notnull,
			String overbudget, String editable, String associationdim,
			String itemformula, Long dimid, String controldimid,
			String defaultlabel, String defaultvalue, Long length,
			String eventtype, String eventname, String mark, String memo,
			BigDecimal itemdisplaytype, BigDecimal itemdatatype) {
		this.billitemid = billitemid;
		this.TCcBill = TCcBill;
		this.itemid = itemid;
		this.associationbillitemid = associationbillitemid;
		this.isused = isused;
		this.notnull = notnull;
		this.overbudget = overbudget;
		this.editable = editable;
		this.associationdim = associationdim;
		this.itemformula = itemformula;
		this.dimid = dimid;
		this.controldimid = controldimid;
		this.defaultlabel = defaultlabel;
		this.defaultvalue = defaultvalue;
		this.length = length;
		this.eventtype = eventtype;
		this.eventname = eventname;
		this.mark = mark;
		this.memo = memo;
		this.itemdisplaytype = itemdisplaytype;
		this.itemdatatype = itemdatatype;
	}

	// Property accessors

	public Long getBillitemid() {
		return this.billitemid;
	}

	public void setBillitemid(Long billitemid) {
		this.billitemid = billitemid;
	}

	public TCcBill getTCcBill() {
		return this.TCcBill;
	}

	public void setTCcBill(TCcBill TCcBill) {
		this.TCcBill = TCcBill;
	}

	public Long getItemid() {
		return this.itemid;
	}

	public void setItemid(Long itemid) {
		this.itemid = itemid;
	}

	public Long getAssociationbillitemid() {
		return this.associationbillitemid;
	}

	public void setAssociationbillitemid(Long associationbillitemid) {
		this.associationbillitemid = associationbillitemid;
	}

	public String getIsused() {
		return this.isused;
	}

	public void setIsused(String isused) {
		this.isused = isused;
	}

	public String getNotnull() {
		return this.notnull;
	}

	public void setNotnull(String notnull) {
		this.notnull = notnull;
	}

	public String getOverbudget() {
		return this.overbudget;
	}

	public void setOverbudget(String overbudget) {
		this.overbudget = overbudget;
	}

	public String getEditable() {
		return this.editable;
	}

	public void setEditable(String editable) {
		this.editable = editable;
	}

	public String getAssociationdim() {
		return this.associationdim;
	}

	public void setAssociationdim(String associationdim) {
		this.associationdim = associationdim;
	}

	public String getItemformula() {
		return this.itemformula;
	}

	public void setItemformula(String itemformula) {
		this.itemformula = itemformula;
	}

	public Long getDimid() {
		return this.dimid;
	}

	public void setDimid(Long dimid) {
		this.dimid = dimid;
	}

	public String getControldimid() {
		return this.controldimid;
	}

	public void setControldimid(String controldimid) {
		this.controldimid = controldimid;
	}

	public String getDefaultlabel() {
		return this.defaultlabel;
	}

	public void setDefaultlabel(String defaultlabel) {
		this.defaultlabel = defaultlabel;
	}

	public String getDefaultvalue() {
		return this.defaultvalue;
	}

	public void setDefaultvalue(String defaultvalue) {
		this.defaultvalue = defaultvalue;
	}

	public Long getLength() {
		return this.length;
	}

	public void setLength(Long length) {
		this.length = length;
	}

	public String getEventtype() {
		return this.eventtype;
	}

	public void setEventtype(String eventtype) {
		this.eventtype = eventtype;
	}

	public String getEventname() {
		return this.eventname;
	}

	public void setEventname(String eventname) {
		this.eventname = eventname;
	}

	public String getMark() {
		return this.mark;
	}

	public void setMark(String mark) {
		this.mark = mark;
	}

	public String getMemo() {
		return this.memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public BigDecimal getItemdisplaytype() {
		return this.itemdisplaytype;
	}

	public void setItemdisplaytype(BigDecimal itemdisplaytype) {
		this.itemdisplaytype = itemdisplaytype;
	}

	public BigDecimal getItemdatatype() {
		return this.itemdatatype;
	}

	public void setItemdatatype(BigDecimal itemdatatype) {
		this.itemdatatype = itemdatatype;
	}

}