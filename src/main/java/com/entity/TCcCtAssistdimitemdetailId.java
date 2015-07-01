package com.entity;

/**
 * TCcCtAssistdimitemdetailId entity. @author MyEclipse Persistence Tools
 */

public class TCcCtAssistdimitemdetailId implements java.io.Serializable {

	// Fields

	private Long id;
	private Long detailid;
	private Long assistdimitemid;
	private String dimitemvalue;

	// Constructors

	/** default constructor */
	public TCcCtAssistdimitemdetailId() {
	}

	/** full constructor */
	public TCcCtAssistdimitemdetailId(Long id, Long detailid,
			Long assistdimitemid, String dimitemvalue) {
		this.id = id;
		this.detailid = detailid;
		this.assistdimitemid = assistdimitemid;
		this.dimitemvalue = dimitemvalue;
	}

	// Property accessors

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getDetailid() {
		return this.detailid;
	}

	public void setDetailid(Long detailid) {
		this.detailid = detailid;
	}

	public Long getAssistdimitemid() {
		return this.assistdimitemid;
	}

	public void setAssistdimitemid(Long assistdimitemid) {
		this.assistdimitemid = assistdimitemid;
	}

	public String getDimitemvalue() {
		return this.dimitemvalue;
	}

	public void setDimitemvalue(String dimitemvalue) {
		this.dimitemvalue = dimitemvalue;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TCcCtAssistdimitemdetailId))
			return false;
		TCcCtAssistdimitemdetailId castOther = (TCcCtAssistdimitemdetailId) other;

		return ((this.getId() == castOther.getId()) || (this.getId() != null
				&& castOther.getId() != null && this.getId().equals(
				castOther.getId())))
				&& ((this.getDetailid() == castOther.getDetailid()) || (this
						.getDetailid() != null
						&& castOther.getDetailid() != null && this
						.getDetailid().equals(castOther.getDetailid())))
				&& ((this.getAssistdimitemid() == castOther
						.getAssistdimitemid()) || (this.getAssistdimitemid() != null
						&& castOther.getAssistdimitemid() != null && this
						.getAssistdimitemid().equals(
								castOther.getAssistdimitemid())))
				&& ((this.getDimitemvalue() == castOther.getDimitemvalue()) || (this
						.getDimitemvalue() != null
						&& castOther.getDimitemvalue() != null && this
						.getDimitemvalue().equals(castOther.getDimitemvalue())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getId() == null ? 0 : this.getId().hashCode());
		result = 37 * result
				+ (getDetailid() == null ? 0 : this.getDetailid().hashCode());
		result = 37
				* result
				+ (getAssistdimitemid() == null ? 0 : this.getAssistdimitemid()
						.hashCode());
		result = 37
				* result
				+ (getDimitemvalue() == null ? 0 : this.getDimitemvalue()
						.hashCode());
		return result;
	}

}