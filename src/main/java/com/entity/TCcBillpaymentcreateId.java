package com.entity;

/**
 * TCcBillpaymentcreateId entity. @author MyEclipse Persistence Tools
 */

public class TCcBillpaymentcreateId implements java.io.Serializable {

	// Fields

	private Long id;
	private String billnumber;
	private String errormassages;
	private String creatstatus;

	// Constructors

	/** default constructor */
	public TCcBillpaymentcreateId() {
	}

	/** minimal constructor */
	public TCcBillpaymentcreateId(Long id) {
		this.id = id;
	}

	/** full constructor */
	public TCcBillpaymentcreateId(Long id, String billnumber,
			String errormassages, String creatstatus) {
		this.id = id;
		this.billnumber = billnumber;
		this.errormassages = errormassages;
		this.creatstatus = creatstatus;
	}

	// Property accessors

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getBillnumber() {
		return this.billnumber;
	}

	public void setBillnumber(String billnumber) {
		this.billnumber = billnumber;
	}

	public String getErrormassages() {
		return this.errormassages;
	}

	public void setErrormassages(String errormassages) {
		this.errormassages = errormassages;
	}

	public String getCreatstatus() {
		return this.creatstatus;
	}

	public void setCreatstatus(String creatstatus) {
		this.creatstatus = creatstatus;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TCcBillpaymentcreateId))
			return false;
		TCcBillpaymentcreateId castOther = (TCcBillpaymentcreateId) other;

		return ((this.getId() == castOther.getId()) || (this.getId() != null
				&& castOther.getId() != null && this.getId().equals(
				castOther.getId())))
				&& ((this.getBillnumber() == castOther.getBillnumber()) || (this
						.getBillnumber() != null
						&& castOther.getBillnumber() != null && this
						.getBillnumber().equals(castOther.getBillnumber())))
				&& ((this.getErrormassages() == castOther.getErrormassages()) || (this
						.getErrormassages() != null
						&& castOther.getErrormassages() != null && this
						.getErrormassages()
						.equals(castOther.getErrormassages())))
				&& ((this.getCreatstatus() == castOther.getCreatstatus()) || (this
						.getCreatstatus() != null
						&& castOther.getCreatstatus() != null && this
						.getCreatstatus().equals(castOther.getCreatstatus())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getId() == null ? 0 : this.getId().hashCode());
		result = 37
				* result
				+ (getBillnumber() == null ? 0 : this.getBillnumber()
						.hashCode());
		result = 37
				* result
				+ (getErrormassages() == null ? 0 : this.getErrormassages()
						.hashCode());
		result = 37
				* result
				+ (getCreatstatus() == null ? 0 : this.getCreatstatus()
						.hashCode());
		return result;
	}

}