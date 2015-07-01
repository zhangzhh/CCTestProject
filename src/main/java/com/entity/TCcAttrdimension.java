package com.entity;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * TCcAttrdimension entity. @author MyEclipse Persistence Tools
 */

public class TCcAttrdimension implements java.io.Serializable {

	// Fields

	private Long attrid;
	private BigDecimal attrtype;
	private Long dimid;
	private BigDecimal displaytype;
	private BigDecimal attrapplyto;
	private String remarks;
	private Set TCcMembertoattributes = new HashSet(0);

	// Constructors

	/** default constructor */
	public TCcAttrdimension() {
	}

	/** minimal constructor */
	public TCcAttrdimension(Long attrid) {
		this.attrid = attrid;
	}

	/** full constructor */
	public TCcAttrdimension(Long attrid, BigDecimal attrtype, Long dimid,
			BigDecimal displaytype, BigDecimal attrapplyto, String remarks,
			Set TCcMembertoattributes) {
		this.attrid = attrid;
		this.attrtype = attrtype;
		this.dimid = dimid;
		this.displaytype = displaytype;
		this.attrapplyto = attrapplyto;
		this.remarks = remarks;
		this.TCcMembertoattributes = TCcMembertoattributes;
	}

	// Property accessors

	public Long getAttrid() {
		return this.attrid;
	}

	public void setAttrid(Long attrid) {
		this.attrid = attrid;
	}

	public BigDecimal getAttrtype() {
		return this.attrtype;
	}

	public void setAttrtype(BigDecimal attrtype) {
		this.attrtype = attrtype;
	}

	public Long getDimid() {
		return this.dimid;
	}

	public void setDimid(Long dimid) {
		this.dimid = dimid;
	}

	public BigDecimal getDisplaytype() {
		return this.displaytype;
	}

	public void setDisplaytype(BigDecimal displaytype) {
		this.displaytype = displaytype;
	}

	public BigDecimal getAttrapplyto() {
		return this.attrapplyto;
	}

	public void setAttrapplyto(BigDecimal attrapplyto) {
		this.attrapplyto = attrapplyto;
	}

	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public Set getTCcMembertoattributes() {
		return this.TCcMembertoattributes;
	}

	public void setTCcMembertoattributes(Set TCcMembertoattributes) {
		this.TCcMembertoattributes = TCcMembertoattributes;
	}

}