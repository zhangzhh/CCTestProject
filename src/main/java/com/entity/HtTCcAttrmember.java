package com.entity;

import java.math.BigDecimal;

/**
 * HtTCcAttrmember entity. @author MyEclipse Persistence Tools
 */

public class HtTCcAttrmember implements java.io.Serializable {

	// Fields

	private BigDecimal attrmemberid;

	// Constructors

	/** default constructor */
	public HtTCcAttrmember() {
	}

	/** full constructor */
	public HtTCcAttrmember(BigDecimal attrmemberid) {
		this.attrmemberid = attrmemberid;
	}

	// Property accessors

	public BigDecimal getAttrmemberid() {
		return this.attrmemberid;
	}

	public void setAttrmemberid(BigDecimal attrmemberid) {
		this.attrmemberid = attrmemberid;
	}

}