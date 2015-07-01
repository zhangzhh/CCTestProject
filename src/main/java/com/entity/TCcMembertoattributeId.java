package com.entity;

/**
 * TCcMembertoattributeId entity. @author MyEclipse Persistence Tools
 */

public class TCcMembertoattributeId implements java.io.Serializable {

	// Fields

	private Long memberid;
	private Long attrid;
	private Long attrmemberid;

	// Constructors

	/** default constructor */
	public TCcMembertoattributeId() {
	}

	/** full constructor */
	public TCcMembertoattributeId(Long memberid, Long attrid, Long attrmemberid) {
		this.memberid = memberid;
		this.attrid = attrid;
		this.attrmemberid = attrmemberid;
	}

	// Property accessors

	public Long getMemberid() {
		return this.memberid;
	}

	public void setMemberid(Long memberid) {
		this.memberid = memberid;
	}

	public Long getAttrid() {
		return this.attrid;
	}

	public void setAttrid(Long attrid) {
		this.attrid = attrid;
	}

	public Long getAttrmemberid() {
		return this.attrmemberid;
	}

	public void setAttrmemberid(Long attrmemberid) {
		this.attrmemberid = attrmemberid;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TCcMembertoattributeId))
			return false;
		TCcMembertoattributeId castOther = (TCcMembertoattributeId) other;

		return ((this.getMemberid() == castOther.getMemberid()) || (this
				.getMemberid() != null && castOther.getMemberid() != null && this
				.getMemberid().equals(castOther.getMemberid())))
				&& ((this.getAttrid() == castOther.getAttrid()) || (this
						.getAttrid() != null && castOther.getAttrid() != null && this
						.getAttrid().equals(castOther.getAttrid())))
				&& ((this.getAttrmemberid() == castOther.getAttrmemberid()) || (this
						.getAttrmemberid() != null
						&& castOther.getAttrmemberid() != null && this
						.getAttrmemberid().equals(castOther.getAttrmemberid())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getMemberid() == null ? 0 : this.getMemberid().hashCode());
		result = 37 * result
				+ (getAttrid() == null ? 0 : this.getAttrid().hashCode());
		result = 37
				* result
				+ (getAttrmemberid() == null ? 0 : this.getAttrmemberid()
						.hashCode());
		return result;
	}

}