package com.entity;

/**
 * TCcBillauditdataId entity. @author MyEclipse Persistence Tools
 */

public class TCcBillauditdataId implements java.io.Serializable {

	// Fields

	private Long auditdataid;
	private Long companyid;
	private String loginnameone;
	private String loginnametwo;

	// Constructors

	/** default constructor */
	public TCcBillauditdataId() {
	}

	/** full constructor */
	public TCcBillauditdataId(Long auditdataid, Long companyid,
			String loginnameone, String loginnametwo) {
		this.auditdataid = auditdataid;
		this.companyid = companyid;
		this.loginnameone = loginnameone;
		this.loginnametwo = loginnametwo;
	}

	// Property accessors

	public Long getAuditdataid() {
		return this.auditdataid;
	}

	public void setAuditdataid(Long auditdataid) {
		this.auditdataid = auditdataid;
	}

	public Long getCompanyid() {
		return this.companyid;
	}

	public void setCompanyid(Long companyid) {
		this.companyid = companyid;
	}

	public String getLoginnameone() {
		return this.loginnameone;
	}

	public void setLoginnameone(String loginnameone) {
		this.loginnameone = loginnameone;
	}

	public String getLoginnametwo() {
		return this.loginnametwo;
	}

	public void setLoginnametwo(String loginnametwo) {
		this.loginnametwo = loginnametwo;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TCcBillauditdataId))
			return false;
		TCcBillauditdataId castOther = (TCcBillauditdataId) other;

		return ((this.getAuditdataid() == castOther.getAuditdataid()) || (this
				.getAuditdataid() != null && castOther.getAuditdataid() != null && this
				.getAuditdataid().equals(castOther.getAuditdataid())))
				&& ((this.getCompanyid() == castOther.getCompanyid()) || (this
						.getCompanyid() != null
						&& castOther.getCompanyid() != null && this
						.getCompanyid().equals(castOther.getCompanyid())))
				&& ((this.getLoginnameone() == castOther.getLoginnameone()) || (this
						.getLoginnameone() != null
						&& castOther.getLoginnameone() != null && this
						.getLoginnameone().equals(castOther.getLoginnameone())))
				&& ((this.getLoginnametwo() == castOther.getLoginnametwo()) || (this
						.getLoginnametwo() != null
						&& castOther.getLoginnametwo() != null && this
						.getLoginnametwo().equals(castOther.getLoginnametwo())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getAuditdataid() == null ? 0 : this.getAuditdataid()
						.hashCode());
		result = 37 * result
				+ (getCompanyid() == null ? 0 : this.getCompanyid().hashCode());
		result = 37
				* result
				+ (getLoginnameone() == null ? 0 : this.getLoginnameone()
						.hashCode());
		result = 37
				* result
				+ (getLoginnametwo() == null ? 0 : this.getLoginnametwo()
						.hashCode());
		return result;
	}

}