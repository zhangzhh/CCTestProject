package com.entity;

import java.math.BigDecimal;

/**
 * TSysDataaccess entity. @author MyEclipse Persistence Tools
 */

public class TSysDataaccess implements java.io.Serializable {

	// Fields

	private Long dataaccessid;
	private Long userorgroupid;
	private Long dataaccesstypeid;
	private Long dataaccessobjectid;
	private Long objectid;
	private BigDecimal accessmode;
	private BigDecimal objecttype;

	// Constructors

	/** default constructor */
	public TSysDataaccess() {
	}

	/** minimal constructor */
	public TSysDataaccess(Long dataaccessid) {
		this.dataaccessid = dataaccessid;
	}

	/** full constructor */
	public TSysDataaccess(Long dataaccessid, Long userorgroupid,
			Long dataaccesstypeid, Long dataaccessobjectid, Long objectid,
			BigDecimal accessmode, BigDecimal objecttype) {
		this.dataaccessid = dataaccessid;
		this.userorgroupid = userorgroupid;
		this.dataaccesstypeid = dataaccesstypeid;
		this.dataaccessobjectid = dataaccessobjectid;
		this.objectid = objectid;
		this.accessmode = accessmode;
		this.objecttype = objecttype;
	}

	// Property accessors

	public Long getDataaccessid() {
		return this.dataaccessid;
	}

	public void setDataaccessid(Long dataaccessid) {
		this.dataaccessid = dataaccessid;
	}

	public Long getUserorgroupid() {
		return this.userorgroupid;
	}

	public void setUserorgroupid(Long userorgroupid) {
		this.userorgroupid = userorgroupid;
	}

	public Long getDataaccesstypeid() {
		return this.dataaccesstypeid;
	}

	public void setDataaccesstypeid(Long dataaccesstypeid) {
		this.dataaccesstypeid = dataaccesstypeid;
	}

	public Long getDataaccessobjectid() {
		return this.dataaccessobjectid;
	}

	public void setDataaccessobjectid(Long dataaccessobjectid) {
		this.dataaccessobjectid = dataaccessobjectid;
	}

	public Long getObjectid() {
		return this.objectid;
	}

	public void setObjectid(Long objectid) {
		this.objectid = objectid;
	}

	public BigDecimal getAccessmode() {
		return this.accessmode;
	}

	public void setAccessmode(BigDecimal accessmode) {
		this.accessmode = accessmode;
	}

	public BigDecimal getObjecttype() {
		return this.objecttype;
	}

	public void setObjecttype(BigDecimal objecttype) {
		this.objecttype = objecttype;
	}

}