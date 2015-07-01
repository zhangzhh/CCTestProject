package com.entity;

/**
 * TCcFormdeptrelationId entity. @author MyEclipse Persistence Tools
 */

public class TCcFormdeptrelationId implements java.io.Serializable {

	// Fields

	private Long formid;
	private Long deptid;
	private String deptname;
	private Long deptperentid;

	// Constructors

	/** default constructor */
	public TCcFormdeptrelationId() {
	}

	/** minimal constructor */
	public TCcFormdeptrelationId(Long formid) {
		this.formid = formid;
	}

	/** full constructor */
	public TCcFormdeptrelationId(Long formid, Long deptid, String deptname,
			Long deptperentid) {
		this.formid = formid;
		this.deptid = deptid;
		this.deptname = deptname;
		this.deptperentid = deptperentid;
	}

	// Property accessors

	public Long getFormid() {
		return this.formid;
	}

	public void setFormid(Long formid) {
		this.formid = formid;
	}

	public Long getDeptid() {
		return this.deptid;
	}

	public void setDeptid(Long deptid) {
		this.deptid = deptid;
	}

	public String getDeptname() {
		return this.deptname;
	}

	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}

	public Long getDeptperentid() {
		return this.deptperentid;
	}

	public void setDeptperentid(Long deptperentid) {
		this.deptperentid = deptperentid;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TCcFormdeptrelationId))
			return false;
		TCcFormdeptrelationId castOther = (TCcFormdeptrelationId) other;

		return ((this.getFormid() == castOther.getFormid()) || (this
				.getFormid() != null && castOther.getFormid() != null && this
				.getFormid().equals(castOther.getFormid())))
				&& ((this.getDeptid() == castOther.getDeptid()) || (this
						.getDeptid() != null && castOther.getDeptid() != null && this
						.getDeptid().equals(castOther.getDeptid())))
				&& ((this.getDeptname() == castOther.getDeptname()) || (this
						.getDeptname() != null
						&& castOther.getDeptname() != null && this
						.getDeptname().equals(castOther.getDeptname())))
				&& ((this.getDeptperentid() == castOther.getDeptperentid()) || (this
						.getDeptperentid() != null
						&& castOther.getDeptperentid() != null && this
						.getDeptperentid().equals(castOther.getDeptperentid())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getFormid() == null ? 0 : this.getFormid().hashCode());
		result = 37 * result
				+ (getDeptid() == null ? 0 : this.getDeptid().hashCode());
		result = 37 * result
				+ (getDeptname() == null ? 0 : this.getDeptname().hashCode());
		result = 37
				* result
				+ (getDeptperentid() == null ? 0 : this.getDeptperentid()
						.hashCode());
		return result;
	}

}