package com.entity;

/**
 * TCcExpensedetailaccount entity. @author MyEclipse Persistence Tools
 */

public class TCcExpensedetailaccount implements java.io.Serializable {

	// Fields

	private Long expensedetailaccountid;
	private TCcExpenseaccount TCcExpenseaccount;
	private TCcExpense TCcExpense;

	// Constructors

	/** default constructor */
	public TCcExpensedetailaccount() {
	}

	/** minimal constructor */
	public TCcExpensedetailaccount(Long expensedetailaccountid) {
		this.expensedetailaccountid = expensedetailaccountid;
	}

	/** full constructor */
	public TCcExpensedetailaccount(Long expensedetailaccountid,
			TCcExpenseaccount TCcExpenseaccount, TCcExpense TCcExpense) {
		this.expensedetailaccountid = expensedetailaccountid;
		this.TCcExpenseaccount = TCcExpenseaccount;
		this.TCcExpense = TCcExpense;
	}

	// Property accessors

	public Long getExpensedetailaccountid() {
		return this.expensedetailaccountid;
	}

	public void setExpensedetailaccountid(Long expensedetailaccountid) {
		this.expensedetailaccountid = expensedetailaccountid;
	}

	public TCcExpenseaccount getTCcExpenseaccount() {
		return this.TCcExpenseaccount;
	}

	public void setTCcExpenseaccount(TCcExpenseaccount TCcExpenseaccount) {
		this.TCcExpenseaccount = TCcExpenseaccount;
	}

	public TCcExpense getTCcExpense() {
		return this.TCcExpense;
	}

	public void setTCcExpense(TCcExpense TCcExpense) {
		this.TCcExpense = TCcExpense;
	}

}