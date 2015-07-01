package com.entity;

import java.math.BigDecimal;

/**
 * TCcBilltype entity. @author MyEclipse Persistence Tools
 */

public class TCcBilltype implements java.io.Serializable {

	// Fields

	private Long typeid;
	private String typename;
	private String typeprefix;
	private BigDecimal disorder;
	private BigDecimal type;

	// Constructors

	/** default constructor */
	public TCcBilltype() {
	}

	/** minimal constructor */
	public TCcBilltype(Long typeid) {
		this.typeid = typeid;
	}

	/** full constructor */
	public TCcBilltype(Long typeid, String typename, String typeprefix,
			BigDecimal disorder, BigDecimal type) {
		this.typeid = typeid;
		this.typename = typename;
		this.typeprefix = typeprefix;
		this.disorder = disorder;
		this.type = type;
	}

	// Property accessors

	public Long getTypeid() {
		return this.typeid;
	}

	public void setTypeid(Long typeid) {
		this.typeid = typeid;
	}

	public String getTypename() {
		return this.typename;
	}

	public void setTypename(String typename) {
		this.typename = typename;
	}

	public String getTypeprefix() {
		return this.typeprefix;
	}

	public void setTypeprefix(String typeprefix) {
		this.typeprefix = typeprefix;
	}

	public BigDecimal getDisorder() {
		return this.disorder;
	}

	public void setDisorder(BigDecimal disorder) {
		this.disorder = disorder;
	}

	public BigDecimal getType() {
		return this.type;
	}

	public void setType(BigDecimal type) {
		this.type = type;
	}

}