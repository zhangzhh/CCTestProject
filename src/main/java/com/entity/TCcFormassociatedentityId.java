package com.entity;

import java.math.BigDecimal;

/**
 * TCcFormassociatedentityId entity. @author MyEclipse Persistence Tools
 */

public class TCcFormassociatedentityId implements java.io.Serializable {

	// Fields

	private Long formassociatedentityid;
	private Long formid;
	private Long memberid;
	private BigDecimal formula;

	// Constructors

	/** default constructor */
	public TCcFormassociatedentityId() {
	}

	/** minimal constructor */
	public TCcFormassociatedentityId(Long formassociatedentityid) {
		this.formassociatedentityid = formassociatedentityid;
	}

	/** full constructor */
	public TCcFormassociatedentityId(Long formassociatedentityid, Long formid,
			Long memberid, BigDecimal formula) {
		this.formassociatedentityid = formassociatedentityid;
		this.formid = formid;
		this.memberid = memberid;
		this.formula = formula;
	}

	// Property accessors

	public Long getFormassociatedentityid() {
		return this.formassociatedentityid;
	}

	public void setFormassociatedentityid(Long formassociatedentityid) {
		this.formassociatedentityid = formassociatedentityid;
	}

	public Long getFormid() {
		return this.formid;
	}

	public void setFormid(Long formid) {
		this.formid = formid;
	}

	public Long getMemberid() {
		return this.memberid;
	}

	public void setMemberid(Long memberid) {
		this.memberid = memberid;
	}

	public BigDecimal getFormula() {
		return this.formula;
	}

	public void setFormula(BigDecimal formula) {
		this.formula = formula;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TCcFormassociatedentityId))
			return false;
		TCcFormassociatedentityId castOther = (TCcFormassociatedentityId) other;

		return ((this.getFormassociatedentityid() == castOther
				.getFormassociatedentityid()) || (this
				.getFormassociatedentityid() != null
				&& castOther.getFormassociatedentityid() != null && this
				.getFormassociatedentityid().equals(
						castOther.getFormassociatedentityid())))
				&& ((this.getFormid() == castOther.getFormid()) || (this
						.getFormid() != null && castOther.getFormid() != null && this
						.getFormid().equals(castOther.getFormid())))
				&& ((this.getMemberid() == castOther.getMemberid()) || (this
						.getMemberid() != null
						&& castOther.getMemberid() != null && this
						.getMemberid().equals(castOther.getMemberid())))
				&& ((this.getFormula() == castOther.getFormula()) || (this
						.getFormula() != null && castOther.getFormula() != null && this
						.getFormula().equals(castOther.getFormula())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getFormassociatedentityid() == null ? 0 : this
						.getFormassociatedentityid().hashCode());
		result = 37 * result
				+ (getFormid() == null ? 0 : this.getFormid().hashCode());
		result = 37 * result
				+ (getMemberid() == null ? 0 : this.getMemberid().hashCode());
		result = 37 * result
				+ (getFormula() == null ? 0 : this.getFormula().hashCode());
		return result;
	}

}