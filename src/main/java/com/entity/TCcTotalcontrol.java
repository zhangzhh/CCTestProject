package com.entity;

import java.math.BigDecimal;

/**
 * TCcTotalcontrol entity. @author MyEclipse Persistence Tools
 */

public class TCcTotalcontrol implements java.io.Serializable {

	// Fields

	private BigDecimal id;
	private BigDecimal controlbillid;
	private BigDecimal dimid;
	private String type;
	private String formulalabel;
	private String formula1;
	private String formula2;
	private String formula3;

	// Constructors

	/** default constructor */
	public TCcTotalcontrol() {
	}

	/** minimal constructor */
	public TCcTotalcontrol(BigDecimal id) {
		this.id = id;
	}

	/** full constructor */
	public TCcTotalcontrol(BigDecimal id, BigDecimal controlbillid,
			BigDecimal dimid, String type, String formulalabel,
			String formula1, String formula2, String formula3) {
		this.id = id;
		this.controlbillid = controlbillid;
		this.dimid = dimid;
		this.type = type;
		this.formulalabel = formulalabel;
		this.formula1 = formula1;
		this.formula2 = formula2;
		this.formula3 = formula3;
	}

	// Property accessors

	public BigDecimal getId() {
		return this.id;
	}

	public void setId(BigDecimal id) {
		this.id = id;
	}

	public BigDecimal getControlbillid() {
		return this.controlbillid;
	}

	public void setControlbillid(BigDecimal controlbillid) {
		this.controlbillid = controlbillid;
	}

	public BigDecimal getDimid() {
		return this.dimid;
	}

	public void setDimid(BigDecimal dimid) {
		this.dimid = dimid;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getFormulalabel() {
		return this.formulalabel;
	}

	public void setFormulalabel(String formulalabel) {
		this.formulalabel = formulalabel;
	}

	public String getFormula1() {
		return this.formula1;
	}

	public void setFormula1(String formula1) {
		this.formula1 = formula1;
	}

	public String getFormula2() {
		return this.formula2;
	}

	public void setFormula2(String formula2) {
		this.formula2 = formula2;
	}

	public String getFormula3() {
		return this.formula3;
	}

	public void setFormula3(String formula3) {
		this.formula3 = formula3;
	}

}