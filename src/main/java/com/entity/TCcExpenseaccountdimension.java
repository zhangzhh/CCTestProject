package com.entity;

/**
 * TCcExpenseaccountdimension entity. @author MyEclipse Persistence Tools
 */

public class TCcExpenseaccountdimension implements java.io.Serializable {

	// Fields

	private Long expenseaccountdimensionid;
	private TCcExpenseaccount TCcExpenseaccount;
	private Long dimensionorattrdimid;
	private String columnname;

	// Constructors

	/** default constructor */
	public TCcExpenseaccountdimension() {
	}

	/** minimal constructor */
	public TCcExpenseaccountdimension(Long expenseaccountdimensionid) {
		this.expenseaccountdimensionid = expenseaccountdimensionid;
	}

	/** full constructor */
	public TCcExpenseaccountdimension(Long expenseaccountdimensionid,
			TCcExpenseaccount TCcExpenseaccount, Long dimensionorattrdimid,
			String columnname) {
		this.expenseaccountdimensionid = expenseaccountdimensionid;
		this.TCcExpenseaccount = TCcExpenseaccount;
		this.dimensionorattrdimid = dimensionorattrdimid;
		this.columnname = columnname;
	}

	// Property accessors

	public Long getExpenseaccountdimensionid() {
		return this.expenseaccountdimensionid;
	}

	public void setExpenseaccountdimensionid(Long expenseaccountdimensionid) {
		this.expenseaccountdimensionid = expenseaccountdimensionid;
	}

	public TCcExpenseaccount getTCcExpenseaccount() {
		return this.TCcExpenseaccount;
	}

	public void setTCcExpenseaccount(TCcExpenseaccount TCcExpenseaccount) {
		this.TCcExpenseaccount = TCcExpenseaccount;
	}

	public Long getDimensionorattrdimid() {
		return this.dimensionorattrdimid;
	}

	public void setDimensionorattrdimid(Long dimensionorattrdimid) {
		this.dimensionorattrdimid = dimensionorattrdimid;
	}

	public String getColumnname() {
		return this.columnname;
	}

	public void setColumnname(String columnname) {
		this.columnname = columnname;
	}

}