package com.entity;

import java.sql.Timestamp;

/**
 * TCcAccountbalanceJz entity. @author MyEclipse Persistence Tools
 */

public class TCcAccountbalanceJz implements java.io.Serializable {

	// Fields

	private Long id;
	private Short year;
	private Byte periodmonth;
	private Long structureid;
	private Long formid;
	private String dimcurrency;
	private Double initialbudget;
	private Double naturaladd;
	private Double naturalreduce;
	private Double endnaturalamount;
	private Timestamp monthdate;

	// Constructors

	/** default constructor */
	public TCcAccountbalanceJz() {
	}

	/** minimal constructor */
	public TCcAccountbalanceJz(Long id) {
		this.id = id;
	}

	/** full constructor */
	public TCcAccountbalanceJz(Long id, Short year, Byte periodmonth,
			Long structureid, Long formid, String dimcurrency,
			Double initialbudget, Double naturaladd, Double naturalreduce,
			Double endnaturalamount, Timestamp monthdate) {
		this.id = id;
		this.year = year;
		this.periodmonth = periodmonth;
		this.structureid = structureid;
		this.formid = formid;
		this.dimcurrency = dimcurrency;
		this.initialbudget = initialbudget;
		this.naturaladd = naturaladd;
		this.naturalreduce = naturalreduce;
		this.endnaturalamount = endnaturalamount;
		this.monthdate = monthdate;
	}

	// Property accessors

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Short getYear() {
		return this.year;
	}

	public void setYear(Short year) {
		this.year = year;
	}

	public Byte getPeriodmonth() {
		return this.periodmonth;
	}

	public void setPeriodmonth(Byte periodmonth) {
		this.periodmonth = periodmonth;
	}

	public Long getStructureid() {
		return this.structureid;
	}

	public void setStructureid(Long structureid) {
		this.structureid = structureid;
	}

	public Long getFormid() {
		return this.formid;
	}

	public void setFormid(Long formid) {
		this.formid = formid;
	}

	public String getDimcurrency() {
		return this.dimcurrency;
	}

	public void setDimcurrency(String dimcurrency) {
		this.dimcurrency = dimcurrency;
	}

	public Double getInitialbudget() {
		return this.initialbudget;
	}

	public void setInitialbudget(Double initialbudget) {
		this.initialbudget = initialbudget;
	}

	public Double getNaturaladd() {
		return this.naturaladd;
	}

	public void setNaturaladd(Double naturaladd) {
		this.naturaladd = naturaladd;
	}

	public Double getNaturalreduce() {
		return this.naturalreduce;
	}

	public void setNaturalreduce(Double naturalreduce) {
		this.naturalreduce = naturalreduce;
	}

	public Double getEndnaturalamount() {
		return this.endnaturalamount;
	}

	public void setEndnaturalamount(Double endnaturalamount) {
		this.endnaturalamount = endnaturalamount;
	}

	public Timestamp getMonthdate() {
		return this.monthdate;
	}

	public void setMonthdate(Timestamp monthdate) {
		this.monthdate = monthdate;
	}

}