package com.entity;

import java.math.BigDecimal;

/**
 * TCcMobilebillitem entity. @author MyEclipse Persistence Tools
 */

public class TCcMobilebillitem implements java.io.Serializable {

	// Fields

	private Long id;
	private String itemvarname;
	private String itemname;
	private BigDecimal itemdatatype;
	private Long billid;
	private BigDecimal display;
	private BigDecimal displayorder;
	private Byte areatype;
	private String sourcetype;

	// Constructors

	/** default constructor */
	public TCcMobilebillitem() {
	}

	/** minimal constructor */
	public TCcMobilebillitem(Long id) {
		this.id = id;
	}

	/** full constructor */
	public TCcMobilebillitem(Long id, String itemvarname, String itemname,
			BigDecimal itemdatatype, Long billid, BigDecimal display,
			BigDecimal displayorder, Byte areatype, String sourcetype) {
		this.id = id;
		this.itemvarname = itemvarname;
		this.itemname = itemname;
		this.itemdatatype = itemdatatype;
		this.billid = billid;
		this.display = display;
		this.displayorder = displayorder;
		this.areatype = areatype;
		this.sourcetype = sourcetype;
	}

	// Property accessors

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getItemvarname() {
		return this.itemvarname;
	}

	public void setItemvarname(String itemvarname) {
		this.itemvarname = itemvarname;
	}

	public String getItemname() {
		return this.itemname;
	}

	public void setItemname(String itemname) {
		this.itemname = itemname;
	}

	public BigDecimal getItemdatatype() {
		return this.itemdatatype;
	}

	public void setItemdatatype(BigDecimal itemdatatype) {
		this.itemdatatype = itemdatatype;
	}

	public Long getBillid() {
		return this.billid;
	}

	public void setBillid(Long billid) {
		this.billid = billid;
	}

	public BigDecimal getDisplay() {
		return this.display;
	}

	public void setDisplay(BigDecimal display) {
		this.display = display;
	}

	public BigDecimal getDisplayorder() {
		return this.displayorder;
	}

	public void setDisplayorder(BigDecimal displayorder) {
		this.displayorder = displayorder;
	}

	public Byte getAreatype() {
		return this.areatype;
	}

	public void setAreatype(Byte areatype) {
		this.areatype = areatype;
	}

	public String getSourcetype() {
		return this.sourcetype;
	}

	public void setSourcetype(String sourcetype) {
		this.sourcetype = sourcetype;
	}

}