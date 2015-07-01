package com.entity;

import java.math.BigDecimal;

/**
 * TCcExpenseaccountitem entity. @author MyEclipse Persistence Tools
 */

public class TCcExpenseaccountitem implements java.io.Serializable {

	// Fields

	private Long expenseaccountitemid;
	private TCcExpenseaccount TCcExpenseaccount;
	private String columnname;
	private String itemname;
	private BigDecimal displayorder;
	private BigDecimal itemdatatype;
	private BigDecimal itemdisplaytype;
	private Long itemdatasource;
	private BigDecimal itemlength;
	private String mustfillln;
	private String memo;

	// Constructors

	/** default constructor */
	public TCcExpenseaccountitem() {
	}

	/** minimal constructor */
	public TCcExpenseaccountitem(Long expenseaccountitemid) {
		this.expenseaccountitemid = expenseaccountitemid;
	}

	/** full constructor */
	public TCcExpenseaccountitem(Long expenseaccountitemid,
			TCcExpenseaccount TCcExpenseaccount, String columnname,
			String itemname, BigDecimal displayorder, BigDecimal itemdatatype,
			BigDecimal itemdisplaytype, Long itemdatasource,
			BigDecimal itemlength, String mustfillln, String memo) {
		this.expenseaccountitemid = expenseaccountitemid;
		this.TCcExpenseaccount = TCcExpenseaccount;
		this.columnname = columnname;
		this.itemname = itemname;
		this.displayorder = displayorder;
		this.itemdatatype = itemdatatype;
		this.itemdisplaytype = itemdisplaytype;
		this.itemdatasource = itemdatasource;
		this.itemlength = itemlength;
		this.mustfillln = mustfillln;
		this.memo = memo;
	}

	// Property accessors

	public Long getExpenseaccountitemid() {
		return this.expenseaccountitemid;
	}

	public void setExpenseaccountitemid(Long expenseaccountitemid) {
		this.expenseaccountitemid = expenseaccountitemid;
	}

	public TCcExpenseaccount getTCcExpenseaccount() {
		return this.TCcExpenseaccount;
	}

	public void setTCcExpenseaccount(TCcExpenseaccount TCcExpenseaccount) {
		this.TCcExpenseaccount = TCcExpenseaccount;
	}

	public String getColumnname() {
		return this.columnname;
	}

	public void setColumnname(String columnname) {
		this.columnname = columnname;
	}

	public String getItemname() {
		return this.itemname;
	}

	public void setItemname(String itemname) {
		this.itemname = itemname;
	}

	public BigDecimal getDisplayorder() {
		return this.displayorder;
	}

	public void setDisplayorder(BigDecimal displayorder) {
		this.displayorder = displayorder;
	}

	public BigDecimal getItemdatatype() {
		return this.itemdatatype;
	}

	public void setItemdatatype(BigDecimal itemdatatype) {
		this.itemdatatype = itemdatatype;
	}

	public BigDecimal getItemdisplaytype() {
		return this.itemdisplaytype;
	}

	public void setItemdisplaytype(BigDecimal itemdisplaytype) {
		this.itemdisplaytype = itemdisplaytype;
	}

	public Long getItemdatasource() {
		return this.itemdatasource;
	}

	public void setItemdatasource(Long itemdatasource) {
		this.itemdatasource = itemdatasource;
	}

	public BigDecimal getItemlength() {
		return this.itemlength;
	}

	public void setItemlength(BigDecimal itemlength) {
		this.itemlength = itemlength;
	}

	public String getMustfillln() {
		return this.mustfillln;
	}

	public void setMustfillln(String mustfillln) {
		this.mustfillln = mustfillln;
	}

	public String getMemo() {
		return this.memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

}