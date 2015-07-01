package com.entity;

import java.math.BigDecimal;

/**
 * TCcBalancemode entity. @author MyEclipse Persistence Tools
 */

public class TCcBalancemode implements java.io.Serializable {

	// Fields

	private Long balancemodeid;
	private String balancemodename;
	private BigDecimal balancemodetype;

	// Constructors

	/** default constructor */
	public TCcBalancemode() {
	}

	/** minimal constructor */
	public TCcBalancemode(Long balancemodeid) {
		this.balancemodeid = balancemodeid;
	}

	/** full constructor */
	public TCcBalancemode(Long balancemodeid, String balancemodename,
			BigDecimal balancemodetype) {
		this.balancemodeid = balancemodeid;
		this.balancemodename = balancemodename;
		this.balancemodetype = balancemodetype;
	}

	// Property accessors

	public Long getBalancemodeid() {
		return this.balancemodeid;
	}

	public void setBalancemodeid(Long balancemodeid) {
		this.balancemodeid = balancemodeid;
	}

	public String getBalancemodename() {
		return this.balancemodename;
	}

	public void setBalancemodename(String balancemodename) {
		this.balancemodename = balancemodename;
	}

	public BigDecimal getBalancemodetype() {
		return this.balancemodetype;
	}

	public void setBalancemodetype(BigDecimal balancemodetype) {
		this.balancemodetype = balancemodetype;
	}

}