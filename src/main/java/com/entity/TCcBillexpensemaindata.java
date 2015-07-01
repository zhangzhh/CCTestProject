package com.entity;

/**
 * TCcBillexpensemaindata entity. @author MyEclipse Persistence Tools
 */

public class TCcBillexpensemaindata implements java.io.Serializable {

	// Fields

	private Long billexpensemaindataid;
	private Long billdetaildataid;
	private Long expenseid;
	private String summary;
	private Double expensesum;

	// Constructors

	/** default constructor */
	public TCcBillexpensemaindata() {
	}

	/** minimal constructor */
	public TCcBillexpensemaindata(Long billexpensemaindataid) {
		this.billexpensemaindataid = billexpensemaindataid;
	}

	/** full constructor */
	public TCcBillexpensemaindata(Long billexpensemaindataid,
			Long billdetaildataid, Long expenseid, String summary,
			Double expensesum) {
		this.billexpensemaindataid = billexpensemaindataid;
		this.billdetaildataid = billdetaildataid;
		this.expenseid = expenseid;
		this.summary = summary;
		this.expensesum = expensesum;
	}

	// Property accessors

	public Long getBillexpensemaindataid() {
		return this.billexpensemaindataid;
	}

	public void setBillexpensemaindataid(Long billexpensemaindataid) {
		this.billexpensemaindataid = billexpensemaindataid;
	}

	public Long getBilldetaildataid() {
		return this.billdetaildataid;
	}

	public void setBilldetaildataid(Long billdetaildataid) {
		this.billdetaildataid = billdetaildataid;
	}

	public Long getExpenseid() {
		return this.expenseid;
	}

	public void setExpenseid(Long expenseid) {
		this.expenseid = expenseid;
	}

	public String getSummary() {
		return this.summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public Double getExpensesum() {
		return this.expensesum;
	}

	public void setExpensesum(Double expensesum) {
		this.expensesum = expensesum;
	}

}