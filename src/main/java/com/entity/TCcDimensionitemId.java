package com.entity;

/**
 * TCcDimensionitemId entity. @author MyEclipse Persistence Tools
 */

public class TCcDimensionitemId implements java.io.Serializable {

	// Fields

	private Long dimid;
	private String dimname;
	private String itemname;
	private String itemvarname;

	// Constructors

	/** default constructor */
	public TCcDimensionitemId() {
	}

	/** full constructor */
	public TCcDimensionitemId(Long dimid, String dimname, String itemname,
			String itemvarname) {
		this.dimid = dimid;
		this.dimname = dimname;
		this.itemname = itemname;
		this.itemvarname = itemvarname;
	}

	// Property accessors

	public Long getDimid() {
		return this.dimid;
	}

	public void setDimid(Long dimid) {
		this.dimid = dimid;
	}

	public String getDimname() {
		return this.dimname;
	}

	public void setDimname(String dimname) {
		this.dimname = dimname;
	}

	public String getItemname() {
		return this.itemname;
	}

	public void setItemname(String itemname) {
		this.itemname = itemname;
	}

	public String getItemvarname() {
		return this.itemvarname;
	}

	public void setItemvarname(String itemvarname) {
		this.itemvarname = itemvarname;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TCcDimensionitemId))
			return false;
		TCcDimensionitemId castOther = (TCcDimensionitemId) other;

		return ((this.getDimid() == castOther.getDimid()) || (this.getDimid() != null
				&& castOther.getDimid() != null && this.getDimid().equals(
				castOther.getDimid())))
				&& ((this.getDimname() == castOther.getDimname()) || (this
						.getDimname() != null && castOther.getDimname() != null && this
						.getDimname().equals(castOther.getDimname())))
				&& ((this.getItemname() == castOther.getItemname()) || (this
						.getItemname() != null
						&& castOther.getItemname() != null && this
						.getItemname().equals(castOther.getItemname())))
				&& ((this.getItemvarname() == castOther.getItemvarname()) || (this
						.getItemvarname() != null
						&& castOther.getItemvarname() != null && this
						.getItemvarname().equals(castOther.getItemvarname())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getDimid() == null ? 0 : this.getDimid().hashCode());
		result = 37 * result
				+ (getDimname() == null ? 0 : this.getDimname().hashCode());
		result = 37 * result
				+ (getItemname() == null ? 0 : this.getItemname().hashCode());
		result = 37
				* result
				+ (getItemvarname() == null ? 0 : this.getItemvarname()
						.hashCode());
		return result;
	}

}