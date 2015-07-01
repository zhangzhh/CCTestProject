package com.entity;

import java.math.BigDecimal;

/**
 * TCcItem entity. @author MyEclipse Persistence Tools
 */

public class TCcItem implements java.io.Serializable {

	// Fields

	private Long itemid;
	private BigDecimal flag;
	private BigDecimal itembilltype;
	private BigDecimal itemdisplaytype;
	private BigDecimal itemdatatype;
	private String itemname;
	private String itemvarname;
	private BigDecimal displayorder;
	private String enableautodata;
	private BigDecimal associationtype;
	private Long associationbillid;
	private String editable;
	private String memo;
	private String associationformid;

	// Constructors

	/** default constructor */
	public TCcItem() {
	}

	/** minimal constructor */
	public TCcItem(Long itemid) {
		this.itemid = itemid;
	}

	/** full constructor */
	public TCcItem(Long itemid, BigDecimal flag, BigDecimal itembilltype,
			BigDecimal itemdisplaytype, BigDecimal itemdatatype,
			String itemname, String itemvarname, BigDecimal displayorder,
			String enableautodata, BigDecimal associationtype,
			Long associationbillid, String editable, String memo,
			String associationformid) {
		this.itemid = itemid;
		this.flag = flag;
		this.itembilltype = itembilltype;
		this.itemdisplaytype = itemdisplaytype;
		this.itemdatatype = itemdatatype;
		this.itemname = itemname;
		this.itemvarname = itemvarname;
		this.displayorder = displayorder;
		this.enableautodata = enableautodata;
		this.associationtype = associationtype;
		this.associationbillid = associationbillid;
		this.editable = editable;
		this.memo = memo;
		this.associationformid = associationformid;
	}

	// Property accessors

	public Long getItemid() {
		return this.itemid;
	}

	public void setItemid(Long itemid) {
		this.itemid = itemid;
	}

	public BigDecimal getFlag() {
		return this.flag;
	}

	public void setFlag(BigDecimal flag) {
		this.flag = flag;
	}

	public BigDecimal getItembilltype() {
		return this.itembilltype;
	}

	public void setItembilltype(BigDecimal itembilltype) {
		this.itembilltype = itembilltype;
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

	public String getItemname() {
		return this.itemname;
	}

	public void setItemname(String itemname) {
		this.itemname = itemname;
	}

	public String getItemvarname() {
		return this.itemvarname;
	}

	public void setItemvarname(String itemvarname) {
		this.itemvarname = itemvarname;
	}

	public BigDecimal getDisplayorder() {
		return this.displayorder;
	}

	public void setDisplayorder(BigDecimal displayorder) {
		this.displayorder = displayorder;
	}

	public String getEnableautodata() {
		return this.enableautodata;
	}

	public void setEnableautodata(String enableautodata) {
		this.enableautodata = enableautodata;
	}

	public BigDecimal getAssociationtype() {
		return this.associationtype;
	}

	public void setAssociationtype(BigDecimal associationtype) {
		this.associationtype = associationtype;
	}

	public Long getAssociationbillid() {
		return this.associationbillid;
	}

	public void setAssociationbillid(Long associationbillid) {
		this.associationbillid = associationbillid;
	}

	public String getEditable() {
		return this.editable;
	}

	public void setEditable(String editable) {
		this.editable = editable;
	}

	public String getMemo() {
		return this.memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getAssociationformid() {
		return this.associationformid;
	}

	public void setAssociationformid(String associationformid) {
		this.associationformid = associationformid;
	}

}