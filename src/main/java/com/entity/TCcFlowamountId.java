package com.entity;

/**
 * TCcFlowamountId entity. @author MyEclipse Persistence Tools
 */

public class TCcFlowamountId implements java.io.Serializable {

	// Fields

	private Long flowamountid;
	private String amountname;

	// Constructors

	/** default constructor */
	public TCcFlowamountId() {
	}

	/** minimal constructor */
	public TCcFlowamountId(Long flowamountid) {
		this.flowamountid = flowamountid;
	}

	/** full constructor */
	public TCcFlowamountId(Long flowamountid, String amountname) {
		this.flowamountid = flowamountid;
		this.amountname = amountname;
	}

	// Property accessors

	public Long getFlowamountid() {
		return this.flowamountid;
	}

	public void setFlowamountid(Long flowamountid) {
		this.flowamountid = flowamountid;
	}

	public String getAmountname() {
		return this.amountname;
	}

	public void setAmountname(String amountname) {
		this.amountname = amountname;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TCcFlowamountId))
			return false;
		TCcFlowamountId castOther = (TCcFlowamountId) other;

		return ((this.getFlowamountid() == castOther.getFlowamountid()) || (this
				.getFlowamountid() != null
				&& castOther.getFlowamountid() != null && this
				.getFlowamountid().equals(castOther.getFlowamountid())))
				&& ((this.getAmountname() == castOther.getAmountname()) || (this
						.getAmountname() != null
						&& castOther.getAmountname() != null && this
						.getAmountname().equals(castOther.getAmountname())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getFlowamountid() == null ? 0 : this.getFlowamountid()
						.hashCode());
		result = 37
				* result
				+ (getAmountname() == null ? 0 : this.getAmountname()
						.hashCode());
		return result;
	}

}