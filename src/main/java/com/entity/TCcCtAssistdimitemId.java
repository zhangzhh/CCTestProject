package com.entity;

/**
 * TCcCtAssistdimitemId entity. @author MyEclipse Persistence Tools
 */

public class TCcCtAssistdimitemId implements java.io.Serializable {

	// Fields

	private Long itemid;
	private String itemname;
	private String memo;

	// Constructors

	/** default constructor */
	public TCcCtAssistdimitemId() {
	}

	/** full constructor */
	public TCcCtAssistdimitemId(Long itemid, String itemname, String memo) {
		this.itemid = itemid;
		this.itemname = itemname;
		this.memo = memo;
	}

	// Property accessors

	public Long getItemid() {
		return this.itemid;
	}

	public void setItemid(Long itemid) {
		this.itemid = itemid;
	}

	public String getItemname() {
		return this.itemname;
	}

	public void setItemname(String itemname) {
		this.itemname = itemname;
	}

	public String getMemo() {
		return this.memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TCcCtAssistdimitemId))
			return false;
		TCcCtAssistdimitemId castOther = (TCcCtAssistdimitemId) other;

		return ((this.getItemid() == castOther.getItemid()) || (this
				.getItemid() != null && castOther.getItemid() != null && this
				.getItemid().equals(castOther.getItemid())))
				&& ((this.getItemname() == castOther.getItemname()) || (this
						.getItemname() != null
						&& castOther.getItemname() != null && this
						.getItemname().equals(castOther.getItemname())))
				&& ((this.getMemo() == castOther.getMemo()) || (this.getMemo() != null
						&& castOther.getMemo() != null && this.getMemo()
						.equals(castOther.getMemo())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getItemid() == null ? 0 : this.getItemid().hashCode());
		result = 37 * result
				+ (getItemname() == null ? 0 : this.getItemname().hashCode());
		result = 37 * result
				+ (getMemo() == null ? 0 : this.getMemo().hashCode());
		return result;
	}

}