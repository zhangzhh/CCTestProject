package com.entity;

import java.math.BigDecimal;

/**
 * TCcBalancedata entity. @author MyEclipse Persistence Tools
 */

public class TCcBalancedata implements java.io.Serializable {

	// Fields

	private Long balancedataid;
	private Long formid;
	private BigDecimal type;
	private String formula;

	// Constructors

	/** default constructor */
	public TCcBalancedata() {
	}

	/** minimal constructor */
	public TCcBalancedata(Long balancedataid) {
		this.balancedataid = balancedataid;
	}

	/** full constructor */
	public TCcBalancedata(Long balancedataid, Long formid, BigDecimal type,
			String formula) {
		this.balancedataid = balancedataid;
		this.formid = formid;
		this.type = type;
		this.formula = formula;
	}

	// Property accessors

	public Long getBalancedataid() {
		return this.balancedataid;
	}

	public void setBalancedataid(Long balancedataid) {
		this.balancedataid = balancedataid;
	}

	public Long getFormid() {
		return this.formid;
	}

	public void setFormid(Long formid) {
		this.formid = formid;
	}

	public BigDecimal getType() {
		return this.type;
	}

	public void setType(BigDecimal type) {
		this.type = type;
	}

	public String getFormula() {
		return this.formula;
	}

	public void setFormula(String formula) {
		this.formula = formula;
	}

}