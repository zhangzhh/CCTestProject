package com.entity;

/**
 * TCcExpenseaccountformula entity. @author MyEclipse Persistence Tools
 */

public class TCcExpenseaccountformula implements java.io.Serializable {

	// Fields

	private Long expenseaccountformulaid;
	private TCcExpenseaccount TCcExpenseaccount;
	private String fieldname;
	private String formula;
	private String formulalabel;

	// Constructors

	/** default constructor */
	public TCcExpenseaccountformula() {
	}

	/** minimal constructor */
	public TCcExpenseaccountformula(Long expenseaccountformulaid) {
		this.expenseaccountformulaid = expenseaccountformulaid;
	}

	/** full constructor */
	public TCcExpenseaccountformula(Long expenseaccountformulaid,
			TCcExpenseaccount TCcExpenseaccount, String fieldname,
			String formula, String formulalabel) {
		this.expenseaccountformulaid = expenseaccountformulaid;
		this.TCcExpenseaccount = TCcExpenseaccount;
		this.fieldname = fieldname;
		this.formula = formula;
		this.formulalabel = formulalabel;
	}

	// Property accessors

	public Long getExpenseaccountformulaid() {
		return this.expenseaccountformulaid;
	}

	public void setExpenseaccountformulaid(Long expenseaccountformulaid) {
		this.expenseaccountformulaid = expenseaccountformulaid;
	}

	public TCcExpenseaccount getTCcExpenseaccount() {
		return this.TCcExpenseaccount;
	}

	public void setTCcExpenseaccount(TCcExpenseaccount TCcExpenseaccount) {
		this.TCcExpenseaccount = TCcExpenseaccount;
	}

	public String getFieldname() {
		return this.fieldname;
	}

	public void setFieldname(String fieldname) {
		this.fieldname = fieldname;
	}

	public String getFormula() {
		return this.formula;
	}

	public void setFormula(String formula) {
		this.formula = formula;
	}

	public String getFormulalabel() {
		return this.formulalabel;
	}

	public void setFormulalabel(String formulalabel) {
		this.formulalabel = formulalabel;
	}

}