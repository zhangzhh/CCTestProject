package com.entity;

/**
 * TCcFlowamountdimdataId entity. @author MyEclipse Persistence Tools
 */

public class TCcFlowamountdimdataId implements java.io.Serializable {

	// Fields

	private Long dataid;
	private String linenum;
	private Long flowamountid;
	private Long dimid;
	private Long dimitem;

	// Constructors

	/** default constructor */
	public TCcFlowamountdimdataId() {
	}

	/** minimal constructor */
	public TCcFlowamountdimdataId(Long dataid) {
		this.dataid = dataid;
	}

	/** full constructor */
	public TCcFlowamountdimdataId(Long dataid, String linenum,
			Long flowamountid, Long dimid, Long dimitem) {
		this.dataid = dataid;
		this.linenum = linenum;
		this.flowamountid = flowamountid;
		this.dimid = dimid;
		this.dimitem = dimitem;
	}

	// Property accessors

	public Long getDataid() {
		return this.dataid;
	}

	public void setDataid(Long dataid) {
		this.dataid = dataid;
	}

	public String getLinenum() {
		return this.linenum;
	}

	public void setLinenum(String linenum) {
		this.linenum = linenum;
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

	public Long getDimitem() {
		return this.dimitem;
	}

	public void setDimitem(Long dimitem) {
		this.dimitem = dimitem;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TCcFlowamountdimdataId))
			return false;
		TCcFlowamountdimdataId castOther = (TCcFlowamountdimdataId) other;

		return ((this.getDataid() == castOther.getDataid()) || (this
				.getDataid() != null && castOther.getDataid() != null && this
				.getDataid().equals(castOther.getDataid())))
				&& ((this.getLinenum() == castOther.getLinenum()) || (this
						.getLinenum() != null && castOther.getLinenum() != null && this
						.getLinenum().equals(castOther.getLinenum())))
				&& ((this.getFlowamountid() == castOther.getFlowamountid()) || (this
						.getFlowamountid() != null
						&& castOther.getFlowamountid() != null && this
						.getFlowamountid().equals(castOther.getFlowamountid())))
				&& ((this.getDimid() == castOther.getDimid()) || (this
						.getDimid() != null && castOther.getDimid() != null && this
						.getDimid().equals(castOther.getDimid())))
				&& ((this.getDimitem() == castOther.getDimitem()) || (this
						.getDimitem() != null && castOther.getDimitem() != null && this
						.getDimitem().equals(castOther.getDimitem())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getDataid() == null ? 0 : this.getDataid().hashCode());
		result = 37 * result
				+ (getLinenum() == null ? 0 : this.getLinenum().hashCode());
		result = 37
				* result
				+ (getFlowamountid() == null ? 0 : this.getFlowamountid()
						.hashCode());
		result = 37 * result
				+ (getDimid() == null ? 0 : this.getDimid().hashCode());
		result = 37 * result
				+ (getDimitem() == null ? 0 : this.getDimitem().hashCode());
		return result;
	}

}