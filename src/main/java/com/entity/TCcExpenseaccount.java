package com.entity;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * TCcExpenseaccount entity. @author MyEclipse Persistence Tools
 */

public class TCcExpenseaccount implements java.io.Serializable {

	// Fields

	private Long expenseaccountid;
	private String accountcode;
	private String accountname;
	private BigDecimal displayorder;
	private BigDecimal controltype;
	private BigDecimal inputmethod;
	private String controlitemname;
	private String numbername;
	private String unitpricename;
	private String amountname;
	private String warningtitle;
	private Long controlitemsource;
	private String isused;
	private String memo;
	private Set TCcExpensedetailaccounts = new HashSet(0);
	private Set TCcExpenseaccountitems = new HashSet(0);
	private Set TCcExpenseaccountformulas = new HashSet(0);
	private Set TCcExpenseaccountdimensions = new HashSet(0);
	private Set TCcExpensestructures = new HashSet(0);

	// Constructors

	/** default constructor */
	public TCcExpenseaccount() {
	}

	/** minimal constructor */
	public TCcExpenseaccount(Long expenseaccountid) {
		this.expenseaccountid = expenseaccountid;
	}

	/** full constructor */
	public TCcExpenseaccount(Long expenseaccountid, String accountcode,
			String accountname, BigDecimal displayorder,
			BigDecimal controltype, BigDecimal inputmethod,
			String controlitemname, String numbername, String unitpricename,
			String amountname, String warningtitle, Long controlitemsource,
			String isused, String memo, Set TCcExpensedetailaccounts,
			Set TCcExpenseaccountitems, Set TCcExpenseaccountformulas,
			Set TCcExpenseaccountdimensions, Set TCcExpensestructures) {
		this.expenseaccountid = expenseaccountid;
		this.accountcode = accountcode;
		this.accountname = accountname;
		this.displayorder = displayorder;
		this.controltype = controltype;
		this.inputmethod = inputmethod;
		this.controlitemname = controlitemname;
		this.numbername = numbername;
		this.unitpricename = unitpricename;
		this.amountname = amountname;
		this.warningtitle = warningtitle;
		this.controlitemsource = controlitemsource;
		this.isused = isused;
		this.memo = memo;
		this.TCcExpensedetailaccounts = TCcExpensedetailaccounts;
		this.TCcExpenseaccountitems = TCcExpenseaccountitems;
		this.TCcExpenseaccountformulas = TCcExpenseaccountformulas;
		this.TCcExpenseaccountdimensions = TCcExpenseaccountdimensions;
		this.TCcExpensestructures = TCcExpensestructures;
	}

	// Property accessors

	public Long getExpenseaccountid() {
		return this.expenseaccountid;
	}

	public void setExpenseaccountid(Long expenseaccountid) {
		this.expenseaccountid = expenseaccountid;
	}

	public String getAccountcode() {
		return this.accountcode;
	}

	public void setAccountcode(String accountcode) {
		this.accountcode = accountcode;
	}

	public String getAccountname() {
		return this.accountname;
	}

	public void setAccountname(String accountname) {
		this.accountname = accountname;
	}

	public BigDecimal getDisplayorder() {
		return this.displayorder;
	}

	public void setDisplayorder(BigDecimal displayorder) {
		this.displayorder = displayorder;
	}

	public BigDecimal getControltype() {
		return this.controltype;
	}

	public void setControltype(BigDecimal controltype) {
		this.controltype = controltype;
	}

	public BigDecimal getInputmethod() {
		return this.inputmethod;
	}

	public void setInputmethod(BigDecimal inputmethod) {
		this.inputmethod = inputmethod;
	}

	public String getControlitemname() {
		return this.controlitemname;
	}

	public void setControlitemname(String controlitemname) {
		this.controlitemname = controlitemname;
	}

	public String getNumbername() {
		return this.numbername;
	}

	public void setNumbername(String numbername) {
		this.numbername = numbername;
	}

	public String getUnitpricename() {
		return this.unitpricename;
	}

	public void setUnitpricename(String unitpricename) {
		this.unitpricename = unitpricename;
	}

	public String getAmountname() {
		return this.amountname;
	}

	public void setAmountname(String amountname) {
		this.amountname = amountname;
	}

	public String getWarningtitle() {
		return this.warningtitle;
	}

	public void setWarningtitle(String warningtitle) {
		this.warningtitle = warningtitle;
	}

	public Long getControlitemsource() {
		return this.controlitemsource;
	}

	public void setControlitemsource(Long controlitemsource) {
		this.controlitemsource = controlitemsource;
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

	public Set getTCcExpenseaccountitems() {
		return this.TCcExpenseaccountitems;
	}

	public void setTCcExpenseaccountitems(Set TCcExpenseaccountitems) {
		this.TCcExpenseaccountitems = TCcExpenseaccountitems;
	}

	public Set getTCcExpenseaccountformulas() {
		return this.TCcExpenseaccountformulas;
	}

	public void setTCcExpenseaccountformulas(Set TCcExpenseaccountformulas) {
		this.TCcExpenseaccountformulas = TCcExpenseaccountformulas;
	}

	public Set getTCcExpenseaccountdimensions() {
		return this.TCcExpenseaccountdimensions;
	}

	public void setTCcExpenseaccountdimensions(Set TCcExpenseaccountdimensions) {
		this.TCcExpenseaccountdimensions = TCcExpenseaccountdimensions;
	}

	public Set getTCcExpensestructures() {
		return this.TCcExpensestructures;
	}

	public void setTCcExpensestructures(Set TCcExpensestructures) {
		this.TCcExpensestructures = TCcExpensestructures;
	}

}