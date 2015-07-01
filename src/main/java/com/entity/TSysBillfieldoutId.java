package com.entity;

import java.math.BigDecimal;

/**
 * TSysBillfieldoutId entity. @author MyEclipse Persistence Tools
 */

public class TSysBillfieldoutId implements java.io.Serializable {

	// Fields

	private Long billfieldoutid;
	private BigDecimal billfieldtype;
	private Long billid;
	private Long targetbillid;
	private String itemname;
	private String targetitemname;

	// Constructors

	/** default constructor */
	public TSysBillfieldoutId() {
	}

	/** full constructor */
	public TSysBillfieldoutId(Long billfieldoutid, BigDecimal billfieldtype,
			Long billid, Long targetbillid, String itemname,
			String targetitemname) {
		this.billfieldoutid = billfieldoutid;
		this.billfieldtype = billfieldtype;
		this.billid = billid;
		this.targetbillid = targetbillid;
		this.itemname = itemname;
		this.targetitemname = targetitemname;
	}

	// Property accessors

	public Long getBillfieldoutid() {
		return this.billfieldoutid;
	}

	public void setBillfieldoutid(Long billfieldoutid) {
		this.billfieldoutid = billfieldoutid;
	}

	public BigDecimal getBillfieldtype() {
		return this.billfieldtype;
	}

	public void setBillfieldtype(BigDecimal billfieldtype) {
		this.billfieldtype = billfieldtype;
	}

	public Long getBillid() {
		return this.billid;
	}

	public void setBillid(Long billid) {
		this.billid = billid;
	}

	public Long getTargetbillid() {
		return this.targetbillid;
	}

	public void setTargetbillid(Long targetbillid) {
		this.targetbillid = targetbillid;
	}

	public String getItemname() {
		return this.itemname;
	}

	public void setItemname(String itemname) {
		this.itemname = itemname;
	}

	public String getTargetitemname() {
		return this.targetitemname;
	}

	public void setTargetitemname(String targetitemname) {
		this.targetitemname = targetitemname;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TSysBillfieldoutId))
			return false;
		TSysBillfieldoutId castOther = (TSysBillfieldoutId) other;

		return ((this.getBillfieldoutid() == castOther.getBillfieldoutid()) || (this
				.getBillfieldoutid() != null
				&& castOther.getBillfieldoutid() != null && this
				.getBillfieldoutid().equals(castOther.getBillfieldoutid())))
				&& ((this.getBillfieldtype() == castOther.getBillfieldtype()) || (this
						.getBillfieldtype() != null
						&& castOther.getBillfieldtype() != null && this
						.getBillfieldtype()
						.equals(castOther.getBillfieldtype())))
				&& ((this.getBillid() == castOther.getBillid()) || (this
						.getBillid() != null && castOther.getBillid() != null && this
						.getBillid().equals(castOther.getBillid())))
				&& ((this.getTargetbillid() == castOther.getTargetbillid()) || (this
						.getTargetbillid() != null
						&& castOther.getTargetbillid() != null && this
						.getTargetbillid().equals(castOther.getTargetbillid())))
				&& ((this.getItemname() == castOther.getItemname()) || (this
						.getItemname() != null
						&& castOther.getItemname() != null && this
						.getItemname().equals(castOther.getItemname())))
				&& ((this.getTargetitemname() == castOther.getTargetitemname()) || (this
						.getTargetitemname() != null
						&& castOther.getTargetitemname() != null && this
						.getTargetitemname().equals(
								castOther.getTargetitemname())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getBillfieldoutid() == null ? 0 : this.getBillfieldoutid()
						.hashCode());
		result = 37
				* result
				+ (getBillfieldtype() == null ? 0 : this.getBillfieldtype()
						.hashCode());
		result = 37 * result
				+ (getBillid() == null ? 0 : this.getBillid().hashCode());
		result = 37
				* result
				+ (getTargetbillid() == null ? 0 : this.getTargetbillid()
						.hashCode());
		result = 37 * result
				+ (getItemname() == null ? 0 : this.getItemname().hashCode());
		result = 37
				* result
				+ (getTargetitemname() == null ? 0 : this.getTargetitemname()
						.hashCode());
		return result;
	}

}