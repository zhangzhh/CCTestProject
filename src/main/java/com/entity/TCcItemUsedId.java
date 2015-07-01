package com.entity;

/**
 * TCcItemUsedId entity. @author MyEclipse Persistence Tools
 */

public class TCcItemUsedId implements java.io.Serializable {

	// Fields

	private Long id;
	private Byte itembilltype;
	private String itemvarname;
	private String itemname;
	private Boolean isused;

	// Constructors

	/** default constructor */
	public TCcItemUsedId() {
	}

	/** full constructor */
	public TCcItemUsedId(Long id, Byte itembilltype, String itemvarname,
			String itemname, Boolean isused) {
		this.id = id;
		this.itembilltype = itembilltype;
		this.itemvarname = itemvarname;
		this.itemname = itemname;
		this.isused = isused;
	}

	// Property accessors

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Byte getItembilltype() {
		return this.itembilltype;
	}

	public void setItembilltype(Byte itembilltype) {
		this.itembilltype = itembilltype;
	}

	public String getItemvarname() {
		return this.itemvarname;
	}

	public void setItemvarname(String itemvarname) {
		this.itemvarname = itemvarname;
	}

	public String getItemname() {
		return this.itemname;
	}

	public void setItemname(String itemname) {
		this.itemname = itemname;
	}

	public Boolean getIsused() {
		return this.isused;
	}

	public void setIsused(Boolean isused) {
		this.isused = isused;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TCcItemUsedId))
			return false;
		TCcItemUsedId castOther = (TCcItemUsedId) other;

		return ((this.getId() == castOther.getId()) || (this.getId() != null
				&& castOther.getId() != null && this.getId().equals(
				castOther.getId())))
				&& ((this.getItembilltype() == castOther.getItembilltype()) || (this
						.getItembilltype() != null
						&& castOther.getItembilltype() != null && this
						.getItembilltype().equals(castOther.getItembilltype())))
				&& ((this.getItemvarname() == castOther.getItemvarname()) || (this
						.getItemvarname() != null
						&& castOther.getItemvarname() != null && this
						.getItemvarname().equals(castOther.getItemvarname())))
				&& ((this.getItemname() == castOther.getItemname()) || (this
						.getItemname() != null
						&& castOther.getItemname() != null && this
						.getItemname().equals(castOther.getItemname())))
				&& ((this.getIsused() == castOther.getIsused()) || (this
						.getIsused() != null && castOther.getIsused() != null && this
						.getIsused().equals(castOther.getIsused())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getId() == null ? 0 : this.getId().hashCode());
		result = 37
				* result
				+ (getItembilltype() == null ? 0 : this.getItembilltype()
						.hashCode());
		result = 37
				* result
				+ (getItemvarname() == null ? 0 : this.getItemvarname()
						.hashCode());
		result = 37 * result
				+ (getItemname() == null ? 0 : this.getItemname().hashCode());
		result = 37 * result
				+ (getIsused() == null ? 0 : this.getIsused().hashCode());
		return result;
	}

}