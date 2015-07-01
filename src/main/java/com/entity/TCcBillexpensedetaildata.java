package com.entity;

import java.math.BigDecimal;

/**
 * TCcBillexpensedetaildata entity. @author MyEclipse Persistence Tools
 */

public class TCcBillexpensedetaildata implements java.io.Serializable {

	// Fields

	private Long billexpensedetaildataid;
	private Long expenseaccountid;
	private Long billexpensestructureid;
	private Long expensestructureid;
	private Double expensenumber;
	private Double unitprice;
	private Double amount;
	private Double controlstandard;
	private String issuperscale;
	private BigDecimal displaynumber;
	private Long enumerationid;
	private String warninginfo;
	private String item01;
	private String item02;
	private String item03;
	private String item04;
	private String item05;
	private String item06;
	private String item07;
	private String item08;
	private String item09;
	private String item10;

	// Constructors

	/** default constructor */
	public TCcBillexpensedetaildata() {
	}

	/** minimal constructor */
	public TCcBillexpensedetaildata(Long billexpensedetaildataid) {
		this.billexpensedetaildataid = billexpensedetaildataid;
	}

	/** full constructor */
	public TCcBillexpensedetaildata(Long billexpensedetaildataid,
			Long expenseaccountid, Long billexpensestructureid,
			Long expensestructureid, Double expensenumber, Double unitprice,
			Double amount, Double controlstandard, String issuperscale,
			BigDecimal displaynumber, Long enumerationid, String warninginfo,
			String item01, String item02, String item03, String item04,
			String item05, String item06, String item07, String item08,
			String item09, String item10) {
		this.billexpensedetaildataid = billexpensedetaildataid;
		this.expenseaccountid = expenseaccountid;
		this.billexpensestructureid = billexpensestructureid;
		this.expensestructureid = expensestructureid;
		this.expensenumber = expensenumber;
		this.unitprice = unitprice;
		this.amount = amount;
		this.controlstandard = controlstandard;
		this.issuperscale = issuperscale;
		this.displaynumber = displaynumber;
		this.enumerationid = enumerationid;
		this.warninginfo = warninginfo;
		this.item01 = item01;
		this.item02 = item02;
		this.item03 = item03;
		this.item04 = item04;
		this.item05 = item05;
		this.item06 = item06;
		this.item07 = item07;
		this.item08 = item08;
		this.item09 = item09;
		this.item10 = item10;
	}

	// Property accessors

	public Long getBillexpensedetaildataid() {
		return this.billexpensedetaildataid;
	}

	public void setBillexpensedetaildataid(Long billexpensedetaildataid) {
		this.billexpensedetaildataid = billexpensedetaildataid;
	}

	public Long getExpenseaccountid() {
		return this.expenseaccountid;
	}

	public void setExpenseaccountid(Long expenseaccountid) {
		this.expenseaccountid = expenseaccountid;
	}

	public Long getBillexpensestructureid() {
		return this.billexpensestructureid;
	}

	public void setBillexpensestructureid(Long billexpensestructureid) {
		this.billexpensestructureid = billexpensestructureid;
	}

	public Long getExpensestructureid() {
		return this.expensestructureid;
	}

	public void setExpensestructureid(Long expensestructureid) {
		this.expensestructureid = expensestructureid;
	}

	public Double getExpensenumber() {
		return this.expensenumber;
	}

	public void setExpensenumber(Double expensenumber) {
		this.expensenumber = expensenumber;
	}

	public Double getUnitprice() {
		return this.unitprice;
	}

	public void setUnitprice(Double unitprice) {
		this.unitprice = unitprice;
	}

	public Double getAmount() {
		return this.amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public Double getControlstandard() {
		return this.controlstandard;
	}

	public void setControlstandard(Double controlstandard) {
		this.controlstandard = controlstandard;
	}

	public String getIssuperscale() {
		return this.issuperscale;
	}

	public void setIssuperscale(String issuperscale) {
		this.issuperscale = issuperscale;
	}

	public BigDecimal getDisplaynumber() {
		return this.displaynumber;
	}

	public void setDisplaynumber(BigDecimal displaynumber) {
		this.displaynumber = displaynumber;
	}

	public Long getEnumerationid() {
		return this.enumerationid;
	}

	public void setEnumerationid(Long enumerationid) {
		this.enumerationid = enumerationid;
	}

	public String getWarninginfo() {
		return this.warninginfo;
	}

	public void setWarninginfo(String warninginfo) {
		this.warninginfo = warninginfo;
	}

	public String getItem01() {
		return this.item01;
	}

	public void setItem01(String item01) {
		this.item01 = item01;
	}

	public String getItem02() {
		return this.item02;
	}

	public void setItem02(String item02) {
		this.item02 = item02;
	}

	public String getItem03() {
		return this.item03;
	}

	public void setItem03(String item03) {
		this.item03 = item03;
	}

	public String getItem04() {
		return this.item04;
	}

	public void setItem04(String item04) {
		this.item04 = item04;
	}

	public String getItem05() {
		return this.item05;
	}

	public void setItem05(String item05) {
		this.item05 = item05;
	}

	public String getItem06() {
		return this.item06;
	}

	public void setItem06(String item06) {
		this.item06 = item06;
	}

	public String getItem07() {
		return this.item07;
	}

	public void setItem07(String item07) {
		this.item07 = item07;
	}

	public String getItem08() {
		return this.item08;
	}

	public void setItem08(String item08) {
		this.item08 = item08;
	}

	public String getItem09() {
		return this.item09;
	}

	public void setItem09(String item09) {
		this.item09 = item09;
	}

	public String getItem10() {
		return this.item10;
	}

	public void setItem10(String item10) {
		this.item10 = item10;
	}

}