package com.entity;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * TCcExpense entity. @author MyEclipse Persistence Tools
 */

public class TCcExpense implements java.io.Serializable {

	// Fields

	private Long expenseid;
	private String expensename;
	private BigDecimal currencytype;
	private String isused;
	private String memo;
	private Set TCcExpensedetailaccounts = new HashSet(0);

	// Constructors

	/** default constructor */
	public TCcExpense() {
	}

	/** minimal constructor */
	public TCcExpense(Long expenseid) {
		this.expenseid = expenseid;
	}

	/** full constructor */
	public TCcExpense(Long expenseid, String expensename,
			BigDecimal currencytype, String isused, String memo,
			Set TCcExpensedetailaccounts) {
		this.expenseid = expenseid;
		this.expensename = expensename;
		this.currencytype = currencytype;
		this.isused = isused;
		this.memo = memo;
		this.TCcExpensedetailaccounts = TCcExpensedetailaccounts;
	}

	// Property accessors

	public Long getExpenseid() {
		return this.expenseid;
	}

	public void setExpenseid(Long expenseid) {
		this.expenseid = expenseid;
	}

	public String getExpensename() {
		return this.expensename;
	}

	public void setExpensename(String expensename) {
		this.expensename = expensename;
	}

	public BigDecimal getCurrencytype() {
		return this.currencytype;
	}

	public void setCurrencytype(BigDecimal currencytype) {
		this.currencytype = currencytype;
	}

	public String getIsused() {
		return this.isused;
	}

	public void setIsused(String isused) {
		this.isused = isused;
	}

	public String getMemo() {
		return this.memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public Set getTCcExpensedetailaccounts() {
		return this.TCcExpensedetailaccounts;
	}

	public void setTCcExpensedetailaccounts(Set TCcExpensedetailaccounts) {
		this.TCcExpensedetailaccounts = TCcExpensedetailaccounts;
	}

}