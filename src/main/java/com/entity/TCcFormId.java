package com.entity;

import java.math.BigDecimal;

/**
 * TCcFormId entity. @author MyEclipse Persistence Tools
 */

public class TCcFormId implements java.io.Serializable {

	// Fields

	private Long formid;
	private String formname;
	private String usealias;
	private String enabled;
	private String alertmsg;
	private String controltoemployee;
	private BigDecimal monthovercontroltype;
	private Double monthoverscale;
	private BigDecimal totalovercontroltype;
	private Double totaloverscale;
	private BigDecimal yearovercontroltype;
	private Double yearoverscale;
	private BigDecimal monthovercontroltype2;
	private Double monthoverscale2;
	private BigDecimal totalovercontroltype2;
	private Double totaloverscale2;
	private BigDecimal yearovercontroltype2;
	private Double yearoverscale2;
	private String fillformorganization;

	// Constructors

	/** default constructor */
	public TCcFormId() {
	}

	/** minimal constructor */
	public TCcFormId(Long formid) {
		this.formid = formid;
	}

	/** full constructor */
	public TCcFormId(Long formid, String formname, String usealias,
			String enabled, String alertmsg, String controltoemployee,
			BigDecimal monthovercontroltype, Double monthoverscale,
			BigDecimal totalovercontroltype, Double totaloverscale,
			BigDecimal yearovercontroltype, Double yearoverscale,
			BigDecimal monthovercontroltype2, Double monthoverscale2,
			BigDecimal totalovercontroltype2, Double totaloverscale2,
			BigDecimal yearovercontroltype2, Double yearoverscale2,
			String fillformorganization) {
		this.formid = formid;
		this.formname = formname;
		this.usealias = usealias;
		this.enabled = enabled;
		this.alertmsg = alertmsg;
		this.controltoemployee = controltoemployee;
		this.monthovercontroltype = monthovercontroltype;
		this.monthoverscale = monthoverscale;
		this.totalovercontroltype = totalovercontroltype;
		this.totaloverscale = totaloverscale;
		this.yearovercontroltype = yearovercontroltype;
		this.yearoverscale = yearoverscale;
		this.monthovercontroltype2 = monthovercontroltype2;
		this.monthoverscale2 = monthoverscale2;
		this.totalovercontroltype2 = totalovercontroltype2;
		this.totaloverscale2 = totaloverscale2;
		this.yearovercontroltype2 = yearovercontroltype2;
		this.yearoverscale2 = yearoverscale2;
		this.fillformorganization = fillformorganization;
	}

	// Property accessors

	public Long getFormid() {
		return this.formid;
	}

	public void setFormid(Long formid) {
		this.formid = formid;
	}

	public String getFormname() {
		return this.formname;
	}

	public void setFormname(String formname) {
		this.formname = formname;
	}

	public String getUsealias() {
		return this.usealias;
	}

	public void setUsealias(String usealias) {
		this.usealias = usealias;
	}

	public String getEnabled() {
		return this.enabled;
	}

	public void setEnabled(String enabled) {
		this.enabled = enabled;
	}

	public String getAlertmsg() {
		return this.alertmsg;
	}

	public void setAlertmsg(String alertmsg) {
		this.alertmsg = alertmsg;
	}

	public String getControltoemployee() {
		return this.controltoemployee;
	}

	public void setControltoemployee(String controltoemployee) {
		this.controltoemployee = controltoemployee;
	}

	public BigDecimal getMonthovercontroltype() {
		return this.monthovercontroltype;
	}

	public void setMonthovercontroltype(BigDecimal monthovercontroltype) {
		this.monthovercontroltype = monthovercontroltype;
	}

	public Double getMonthoverscale() {
		return this.monthoverscale;
	}

	public void setMonthoverscale(Double monthoverscale) {
		this.monthoverscale = monthoverscale;
	}

	public BigDecimal getTotalovercontroltype() {
		return this.totalovercontroltype;
	}

	public void setTotalovercontroltype(BigDecimal totalovercontroltype) {
		this.totalovercontroltype = totalovercontroltype;
	}

	public Double getTotaloverscale() {
		return this.totaloverscale;
	}

	public void setTotaloverscale(Double totaloverscale) {
		this.totaloverscale = totaloverscale;
	}

	public BigDecimal getYearovercontroltype() {
		return this.yearovercontroltype;
	}

	public void setYearovercontroltype(BigDecimal yearovercontroltype) {
		this.yearovercontroltype = yearovercontroltype;
	}

	public Double getYearoverscale() {
		return this.yearoverscale;
	}

	public void setYearoverscale(Double yearoverscale) {
		this.yearoverscale = yearoverscale;
	}

	public BigDecimal getMonthovercontroltype2() {
		return this.monthovercontroltype2;
	}

	public void setMonthovercontroltype2(BigDecimal monthovercontroltype2) {
		this.monthovercontroltype2 = monthovercontroltype2;
	}

	public Double getMonthoverscale2() {
		return this.monthoverscale2;
	}

	public void setMonthoverscale2(Double monthoverscale2) {
		this.monthoverscale2 = monthoverscale2;
	}

	public BigDecimal getTotalovercontroltype2() {
		return this.totalovercontroltype2;
	}

	public void setTotalovercontroltype2(BigDecimal totalovercontroltype2) {
		this.totalovercontroltype2 = totalovercontroltype2;
	}

	public Double getTotaloverscale2() {
		return this.totaloverscale2;
	}

	public void setTotaloverscale2(Double totaloverscale2) {
		this.totaloverscale2 = totaloverscale2;
	}

	public BigDecimal getYearovercontroltype2() {
		return this.yearovercontroltype2;
	}

	public void setYearovercontroltype2(BigDecimal yearovercontroltype2) {
		this.yearovercontroltype2 = yearovercontroltype2;
	}

	public Double getYearoverscale2() {
		return this.yearoverscale2;
	}

	public void setYearoverscale2(Double yearoverscale2) {
		this.yearoverscale2 = yearoverscale2;
	}

	public String getFillformorganization() {
		return this.fillformorganization;
	}

	public void setFillformorganization(String fillformorganization) {
		this.fillformorganization = fillformorganization;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TCcFormId))
			return false;
		TCcFormId castOther = (TCcFormId) other;

		return ((this.getFormid() == castOther.getFormid()) || (this
				.getFormid() != null && castOther.getFormid() != null && this
				.getFormid().equals(castOther.getFormid())))
				&& ((this.getFormname() == castOther.getFormname()) || (this
						.getFormname() != null
						&& castOther.getFormname() != null && this
						.getFormname().equals(castOther.getFormname())))
				&& ((this.getUsealias() == castOther.getUsealias()) || (this
						.getUsealias() != null
						&& castOther.getUsealias() != null && this
						.getUsealias().equals(castOther.getUsealias())))
				&& ((this.getEnabled() == castOther.getEnabled()) || (this
						.getEnabled() != null && castOther.getEnabled() != null && this
						.getEnabled().equals(castOther.getEnabled())))
				&& ((this.getAlertmsg() == castOther.getAlertmsg()) || (this
						.getAlertmsg() != null
						&& castOther.getAlertmsg() != null && this
						.getAlertmsg().equals(castOther.getAlertmsg())))
				&& ((this.getControltoemployee() == castOther
						.getControltoemployee()) || (this
						.getControltoemployee() != null
						&& castOther.getControltoemployee() != null && this
						.getControltoemployee().equals(
								castOther.getControltoemployee())))
				&& ((this.getMonthovercontroltype() == castOther
						.getMonthovercontroltype()) || (this
						.getMonthovercontroltype() != null
						&& castOther.getMonthovercontroltype() != null && this
						.getMonthovercontroltype().equals(
								castOther.getMonthovercontroltype())))
				&& ((this.getMonthoverscale() == castOther.getMonthoverscale()) || (this
						.getMonthoverscale() != null
						&& castOther.getMonthoverscale() != null && this
						.getMonthoverscale().equals(
								castOther.getMonthoverscale())))
				&& ((this.getTotalovercontroltype() == castOther
						.getTotalovercontroltype()) || (this
						.getTotalovercontroltype() != null
						&& castOther.getTotalovercontroltype() != null && this
						.getTotalovercontroltype().equals(
								castOther.getTotalovercontroltype())))
				&& ((this.getTotaloverscale() == castOther.getTotaloverscale()) || (this
						.getTotaloverscale() != null
						&& castOther.getTotaloverscale() != null && this
						.getTotaloverscale().equals(
								castOther.getTotaloverscale())))
				&& ((this.getYearovercontroltype() == castOther
						.getYearovercontroltype()) || (this
						.getYearovercontroltype() != null
						&& castOther.getYearovercontroltype() != null && this
						.getYearovercontroltype().equals(
								castOther.getYearovercontroltype())))
				&& ((this.getYearoverscale() == castOther.getYearoverscale()) || (this
						.getYearoverscale() != null
						&& castOther.getYearoverscale() != null && this
						.getYearoverscale()
						.equals(castOther.getYearoverscale())))
				&& ((this.getMonthovercontroltype2() == castOther
						.getMonthovercontroltype2()) || (this
						.getMonthovercontroltype2() != null
						&& castOther.getMonthovercontroltype2() != null && this
						.getMonthovercontroltype2().equals(
								castOther.getMonthovercontroltype2())))
				&& ((this.getMonthoverscale2() == castOther
						.getMonthoverscale2()) || (this.getMonthoverscale2() != null
						&& castOther.getMonthoverscale2() != null && this
						.getMonthoverscale2().equals(
								castOther.getMonthoverscale2())))
				&& ((this.getTotalovercontroltype2() == castOther
						.getTotalovercontroltype2()) || (this
						.getTotalovercontroltype2() != null
						&& castOther.getTotalovercontroltype2() != null && this
						.getTotalovercontroltype2().equals(
								castOther.getTotalovercontroltype2())))
				&& ((this.getTotaloverscale2() == castOther
						.getTotaloverscale2()) || (this.getTotaloverscale2() != null
						&& castOther.getTotaloverscale2() != null && this
						.getTotaloverscale2().equals(
								castOther.getTotaloverscale2())))
				&& ((this.getYearovercontroltype2() == castOther
						.getYearovercontroltype2()) || (this
						.getYearovercontroltype2() != null
						&& castOther.getYearovercontroltype2() != null && this
						.getYearovercontroltype2().equals(
								castOther.getYearovercontroltype2())))
				&& ((this.getYearoverscale2() == castOther.getYearoverscale2()) || (this
						.getYearoverscale2() != null
						&& castOther.getYearoverscale2() != null && this
						.getYearoverscale2().equals(
								castOther.getYearoverscale2())))
				&& ((this.getFillformorganization() == castOther
						.getFillformorganization()) || (this
						.getFillformorganization() != null
						&& castOther.getFillformorganization() != null && this
						.getFillformorganization().equals(
								castOther.getFillformorganization())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getFormid() == null ? 0 : this.getFormid().hashCode());
		result = 37 * result
				+ (getFormname() == null ? 0 : this.getFormname().hashCode());
		result = 37 * result
				+ (getUsealias() == null ? 0 : this.getUsealias().hashCode());
		result = 37 * result
				+ (getEnabled() == null ? 0 : this.getEnabled().hashCode());
		result = 37 * result
				+ (getAlertmsg() == null ? 0 : this.getAlertmsg().hashCode());
		result = 37
				* result
				+ (getControltoemployee() == null ? 0 : this
						.getControltoemployee().hashCode());
		result = 37
				* result
				+ (getMonthovercontroltype() == null ? 0 : this
						.getMonthovercontroltype().hashCode());
		result = 37
				* result
				+ (getMonthoverscale() == null ? 0 : this.getMonthoverscale()
						.hashCode());
		result = 37
				* result
				+ (getTotalovercontroltype() == null ? 0 : this
						.getTotalovercontroltype().hashCode());
		result = 37
				* result
				+ (getTotaloverscale() == null ? 0 : this.getTotaloverscale()
						.hashCode());
		result = 37
				* result
				+ (getYearovercontroltype() == null ? 0 : this
						.getYearovercontroltype().hashCode());
		result = 37
				* result
				+ (getYearoverscale() == null ? 0 : this.getYearoverscale()
						.hashCode());
		result = 37
				* result
				+ (getMonthovercontroltype2() == null ? 0 : this
						.getMonthovercontroltype2().hashCode());
		result = 37
				* result
				+ (getMonthoverscale2() == null ? 0 : this.getMonthoverscale2()
						.hashCode());
		result = 37
				* result
				+ (getTotalovercontroltype2() == null ? 0 : this
						.getTotalovercontroltype2().hashCode());
		result = 37
				* result
				+ (getTotaloverscale2() == null ? 0 : this.getTotaloverscale2()
						.hashCode());
		result = 37
				* result
				+ (getYearovercontroltype2() == null ? 0 : this
						.getYearovercontroltype2().hashCode());
		result = 37
				* result
				+ (getYearoverscale2() == null ? 0 : this.getYearoverscale2()
						.hashCode());
		result = 37
				* result
				+ (getFillformorganization() == null ? 0 : this
						.getFillformorganization().hashCode());
		return result;
	}

}