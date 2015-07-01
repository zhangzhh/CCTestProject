package com.entity;

/**
 * TSysBillfieldId entity. @author MyEclipse Persistence Tools
 */

public class TSysBillfieldId implements java.io.Serializable {

	// Fields

	private Long billfieldid;
	private String billfieldname;
	private Long fieldvalueid;
	private Long displayorder;
	private Long billid;
	private Boolean billfieldtype;
	private String displaytype;
	private Integer fieldlength;

	// Constructors

	/** default constructor */
	public TSysBillfieldId() {
	}

	/** minimal constructor */
	public TSysBillfieldId(Long billfieldid) {
		this.billfieldid = billfieldid;
	}

	/** full constructor */
	public TSysBillfieldId(Long billfieldid, String billfieldname,
			Long fieldvalueid, Long displayorder, Long billid,
			Boolean billfieldtype, String displaytype, Integer fieldlength) {
		this.billfieldid = billfieldid;
		this.billfieldname = billfieldname;
		this.fieldvalueid = fieldvalueid;
		this.displayorder = displayorder;
		this.billid = billid;
		this.billfieldtype = billfieldtype;
		this.displaytype = displaytype;
		this.fieldlength = fieldlength;
	}

	// Property accessors

	public Long getBillfieldid() {
		return this.billfieldid;
	}

	public void setBillfieldid(Long billfieldid) {
		this.billfieldid = billfieldid;
	}

	public String getBillfieldname() {
		return this.billfieldname;
	}

	public void setBillfieldname(String billfieldname) {
		this.billfieldname = billfieldname;
	}

	public Long getFieldvalueid() {
		return this.fieldvalueid;
	}

	public void setFieldvalueid(Long fieldvalueid) {
		this.fieldvalueid = fieldvalueid;
	}

	public Long getDisplayorder() {
		return this.displayorder;
	}

	public void setDisplayorder(Long displayorder) {
		this.displayorder = displayorder;
	}

	public Long getBillid() {
		return this.billid;
	}

	public void setBillid(Long billid) {
		this.billid = billid;
	}

	public Boolean getBillfieldtype() {
		return this.billfieldtype;
	}

	public void setBillfieldtype(Boolean billfieldtype) {
		this.billfieldtype = billfieldtype;
	}

	public String getDisplaytype() {
		return this.displaytype;
	}

	public void setDisplaytype(String displaytype) {
		this.displaytype = displaytype;
	}

	public Integer getFieldlength() {
		return this.fieldlength;
	}

	public void setFieldlength(Integer fieldlength) {
		this.fieldlength = fieldlength;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TSysBillfieldId))
			return false;
		TSysBillfieldId castOther = (TSysBillfieldId) other;

		return ((this.getBillfieldid() == castOther.getBillfieldid()) || (this
				.getBillfieldid() != null && castOther.getBillfieldid() != null && this
				.getBillfieldid().equals(castOther.getBillfieldid())))
				&& ((this.getBillfieldname() == castOther.getBillfieldname()) || (this
						.getBillfieldname() != null
						&& castOther.getBillfieldname() != null && this
						.getBillfieldname()
						.equals(castOther.getBillfieldname())))
				&& ((this.getFieldvalueid() == castOther.getFieldvalueid()) || (this
						.getFieldvalueid() != null
						&& castOther.getFieldvalueid() != null && this
						.getFieldvalueid().equals(castOther.getFieldvalueid())))
				&& ((this.getDisplayorder() == castOther.getDisplayorder()) || (this
						.getDisplayorder() != null
						&& castOther.getDisplayorder() != null && this
						.getDisplayorder().equals(castOther.getDisplayorder())))
				&& ((this.getBillid() == castOther.getBillid()) || (this
						.getBillid() != null && castOther.getBillid() != null && this
						.getBillid().equals(castOther.getBillid())))
				&& ((this.getBillfieldtype() == castOther.getBillfieldtype()) || (this
						.getBillfieldtype() != null
						&& castOther.getBillfieldtype() != null && this
						.getBillfieldtype()
						.equals(castOther.getBillfieldtype())))
				&& ((this.getDisplaytype() == castOther.getDisplaytype()) || (this
						.getDisplaytype() != null
						&& castOther.getDisplaytype() != null && this
						.getDisplaytype().equals(castOther.getDisplaytype())))
				&& ((this.getFieldlength() == castOther.getFieldlength()) || (this
						.getFieldlength() != null
						&& castOther.getFieldlength() != null && this
						.getFieldlength().equals(castOther.getFieldlength())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getBillfieldid() == null ? 0 : this.getBillfieldid()
						.hashCode());
		result = 37
				* result
				+ (getBillfieldname() == null ? 0 : this.getBillfieldname()
						.hashCode());
		result = 37
				* result
				+ (getFieldvalueid() == null ? 0 : this.getFieldvalueid()
						.hashCode());
		result = 37
				* result
				+ (getDisplayorder() == null ? 0 : this.getDisplayorder()
						.hashCode());
		result = 37 * result
				+ (getBillid() == null ? 0 : this.getBillid().hashCode());
		result = 37
				* result
				+ (getBillfieldtype() == null ? 0 : this.getBillfieldtype()
						.hashCode());
		result = 37
				* result
				+ (getDisplaytype() == null ? 0 : this.getDisplaytype()
						.hashCode());
		result = 37
				* result
				+ (getFieldlength() == null ? 0 : this.getFieldlength()
						.hashCode());
		return result;
	}

}