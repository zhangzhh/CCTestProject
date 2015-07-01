package com.entity;

import java.math.BigDecimal;

/**
 * TLsBugetId entity. @author MyEclipse Persistence Tools
 */

public class TLsBugetId implements java.io.Serializable {

	// Fields

	private Long parent0;
	private BigDecimal buget;
	private BigDecimal real;
	private Long parent1;
	private Long parent2;
	private Long parent3;
	private Long parent4;
	private Long parent5;
	private Long parent6;
	private BigDecimal occupation;

	// Constructors

	/** default constructor */
	public TLsBugetId() {
	}

	/** full constructor */
	public TLsBugetId(Long parent0, BigDecimal buget, BigDecimal real,
			Long parent1, Long parent2, Long parent3, Long parent4,
			Long parent5, Long parent6, BigDecimal occupation) {
		this.parent0 = parent0;
		this.buget = buget;
		this.real = real;
		this.parent1 = parent1;
		this.parent2 = parent2;
		this.parent3 = parent3;
		this.parent4 = parent4;
		this.parent5 = parent5;
		this.parent6 = parent6;
		this.occupation = occupation;
	}

	// Property accessors

	public Long getParent0() {
		return this.parent0;
	}

	public void setParent0(Long parent0) {
		this.parent0 = parent0;
	}

	public BigDecimal getBuget() {
		return this.buget;
	}

	public void setBuget(BigDecimal buget) {
		this.buget = buget;
	}

	public BigDecimal getReal() {
		return this.real;
	}

	public void setReal(BigDecimal real) {
		this.real = real;
	}

	public Long getParent1() {
		return this.parent1;
	}

	public void setParent1(Long parent1) {
		this.parent1 = parent1;
	}

	public Long getParent2() {
		return this.parent2;
	}

	public void setParent2(Long parent2) {
		this.parent2 = parent2;
	}

	public Long getParent3() {
		return this.parent3;
	}

	public void setParent3(Long parent3) {
		this.parent3 = parent3;
	}

	public Long getParent4() {
		return this.parent4;
	}

	public void setParent4(Long parent4) {
		this.parent4 = parent4;
	}

	public Long getParent5() {
		return this.parent5;
	}

	public void setParent5(Long parent5) {
		this.parent5 = parent5;
	}

	public Long getParent6() {
		return this.parent6;
	}

	public void setParent6(Long parent6) {
		this.parent6 = parent6;
	}

	public BigDecimal getOccupation() {
		return this.occupation;
	}

	public void setOccupation(BigDecimal occupation) {
		this.occupation = occupation;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TLsBugetId))
			return false;
		TLsBugetId castOther = (TLsBugetId) other;

		return ((this.getParent0() == castOther.getParent0()) || (this
				.getParent0() != null && castOther.getParent0() != null && this
				.getParent0().equals(castOther.getParent0())))
				&& ((this.getBuget() == castOther.getBuget()) || (this
						.getBuget() != null && castOther.getBuget() != null && this
						.getBuget().equals(castOther.getBuget())))
				&& ((this.getReal() == castOther.getReal()) || (this.getReal() != null
						&& castOther.getReal() != null && this.getReal()
						.equals(castOther.getReal())))
				&& ((this.getParent1() == castOther.getParent1()) || (this
						.getParent1() != null && castOther.getParent1() != null && this
						.getParent1().equals(castOther.getParent1())))
				&& ((this.getParent2() == castOther.getParent2()) || (this
						.getParent2() != null && castOther.getParent2() != null && this
						.getParent2().equals(castOther.getParent2())))
				&& ((this.getParent3() == castOther.getParent3()) || (this
						.getParent3() != null && castOther.getParent3() != null && this
						.getParent3().equals(castOther.getParent3())))
				&& ((this.getParent4() == castOther.getParent4()) || (this
						.getParent4() != null && castOther.getParent4() != null && this
						.getParent4().equals(castOther.getParent4())))
				&& ((this.getParent5() == castOther.getParent5()) || (this
						.getParent5() != null && castOther.getParent5() != null && this
						.getParent5().equals(castOther.getParent5())))
				&& ((this.getParent6() == castOther.getParent6()) || (this
						.getParent6() != null && castOther.getParent6() != null && this
						.getParent6().equals(castOther.getParent6())))
				&& ((this.getOccupation() == castOther.getOccupation()) || (this
						.getOccupation() != null
						&& castOther.getOccupation() != null && this
						.getOccupation().equals(castOther.getOccupation())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getParent0() == null ? 0 : this.getParent0().hashCode());
		result = 37 * result
				+ (getBuget() == null ? 0 : this.getBuget().hashCode());
		result = 37 * result
				+ (getReal() == null ? 0 : this.getReal().hashCode());
		result = 37 * result
				+ (getParent1() == null ? 0 : this.getParent1().hashCode());
		result = 37 * result
				+ (getParent2() == null ? 0 : this.getParent2().hashCode());
		result = 37 * result
				+ (getParent3() == null ? 0 : this.getParent3().hashCode());
		result = 37 * result
				+ (getParent4() == null ? 0 : this.getParent4().hashCode());
		result = 37 * result
				+ (getParent5() == null ? 0 : this.getParent5().hashCode());
		result = 37 * result
				+ (getParent6() == null ? 0 : this.getParent6().hashCode());
		result = 37
				* result
				+ (getOccupation() == null ? 0 : this.getOccupation()
						.hashCode());
		return result;
	}

}