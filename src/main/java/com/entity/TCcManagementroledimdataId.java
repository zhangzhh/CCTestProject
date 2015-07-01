package com.entity;

/**
 * TCcManagementroledimdataId entity. @author MyEclipse Persistence Tools
 */

public class TCcManagementroledimdataId implements java.io.Serializable {

	// Fields

	private Long dataid;
	private String rindex;
	private Long dimid;
	private Long dimitem;
	private Long roleid;

	// Constructors

	/** default constructor */
	public TCcManagementroledimdataId() {
	}

	/** minimal constructor */
	public TCcManagementroledimdataId(Long dataid) {
		this.dataid = dataid;
	}

	/** full constructor */
	public TCcManagementroledimdataId(Long dataid, String rindex, Long dimid,
			Long dimitem, Long roleid) {
		this.dataid = dataid;
		this.rindex = rindex;
		this.dimid = dimid;
		this.dimitem = dimitem;
		this.roleid = roleid;
	}

	// Property accessors

	public Long getDataid() {
		return this.dataid;
	}

	public void setDataid(Long dataid) {
		this.dataid = dataid;
	}

	public String getRindex() {
		return this.rindex;
	}

	public void setRindex(String rindex) {
		this.rindex = rindex;
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

	public Long getRoleid() {
		return this.roleid;
	}

	public void setRoleid(Long roleid) {
		this.roleid = roleid;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TCcManagementroledimdataId))
			return false;
		TCcManagementroledimdataId castOther = (TCcManagementroledimdataId) other;

		return ((this.getDataid() == castOther.getDataid()) || (this
				.getDataid() != null && castOther.getDataid() != null && this
				.getDataid().equals(castOther.getDataid())))
				&& ((this.getRindex() == castOther.getRindex()) || (this
						.getRindex() != null && castOther.getRindex() != null && this
						.getRindex().equals(castOther.getRindex())))
				&& ((this.getDimid() == castOther.getDimid()) || (this
						.getDimid() != null && castOther.getDimid() != null && this
						.getDimid().equals(castOther.getDimid())))
				&& ((this.getDimitem() == castOther.getDimitem()) || (this
						.getDimitem() != null && castOther.getDimitem() != null && this
						.getDimitem().equals(castOther.getDimitem())))
				&& ((this.getRoleid() == castOther.getRoleid()) || (this
						.getRoleid() != null && castOther.getRoleid() != null && this
						.getRoleid().equals(castOther.getRoleid())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getDataid() == null ? 0 : this.getDataid().hashCode());
		result = 37 * result
				+ (getRindex() == null ? 0 : this.getRindex().hashCode());
		result = 37 * result
				+ (getDimid() == null ? 0 : this.getDimid().hashCode());
		result = 37 * result
				+ (getDimitem() == null ? 0 : this.getDimitem().hashCode());
		result = 37 * result
				+ (getRoleid() == null ? 0 : this.getRoleid().hashCode());
		return result;
	}

}