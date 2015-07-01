package com.entity;

/**
 * TCcFlowamountdimId entity. @author MyEclipse Persistence Tools
 */

public class TCcFlowamountdimId implements java.io.Serializable {

	// Fields

	private Long flowamountdimid;
	private Long flowamountid;
	private Long dimid;

	// Constructors

	/** default constructor */
	public TCcFlowamountdimId() {
	}

	/** minimal constructor */
	public TCcFlowamountdimId(Long flowamountdimid) {
		this.flowamountdimid = flowamountdimid;
	}

	/** full constructor */
	public TCcFlowamountdimId(Long flowamountdimid, Long flowamountid,
			Long dimid) {
		this.flowamountdimid = flowamountdimid;
		this.flowamountid = flowamountid;
		this.dimid = dimid;
	}

	// Property accessors

	public Long getFlowamountdimid() {
		return this.flowamountdimid;
	}

	public void setFlowamountdimid(Long flowamountdimid) {
		this.flowamountdimid = flowamountdimid;
	}

	public Long getFlowamountid() {
		return this.flowamountid;
	}

	public void setFlowamountid(Long flowamountid) {
		this.flowamountid = flowamountid;
	}

	public Long getDimid() {
		return this.dimid;
	}

	public void setDimid(Long dimid) {
		this.dimid = dimid;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TCcFlowamountdimId))
			return false;
		TCcFlowamountdimId castOther = (TCcFlowamountdimId) other;

		return ((this.getFlowamountdimid() == castOther.getFlowamountdimid()) || (this
				.getFlowamountdimid() != null
				&& castOther.getFlowamountdimid() != null && this
				.getFlowamountdimid().equals(castOther.getFlowamountdimid())))
				&& ((this.getFlowamountid() == castOther.getFlowamountid()) || (this
						.getFlowamountid() != null
						&& castOther.getFlowamountid() != null && this
						.getFlowamountid().equals(castOther.getFlowamountid())))
				&& ((this.getDimid() == castOther.getDimid()) || (this
						.getDimid() != null && castOther.getDimid() != null && this
						.getDimid().equals(castOther.getDimid())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getFlowamountdimid() == null ? 0 : this.getFlowamountdimid()
						.hashCode());
		result = 37
				* result
				+ (getFlowamountid() == null ? 0 : this.getFlowamountid()
						.hashCode());
		result = 37 * result
				+ (getDimid() == null ? 0 : this.getDimid().hashCode());
		return result;
	}

}