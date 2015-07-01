package com.entity;

import java.sql.Timestamp;

/**
 * TCcFreezeId entity. @author MyEclipse Persistence Tools
 */

public class TCcFreezeId implements java.io.Serializable {

	// Fields

	private Long id;
	private Timestamp freezedate;
	private Long freezeuserid;
	private Long structureid;

	// Constructors

	/** default constructor */
	public TCcFreezeId() {
	}

	/** minimal constructor */
	public TCcFreezeId(Long id) {
		this.id = id;
	}

	/** full constructor */
	public TCcFreezeId(Long id, Timestamp freezedate, Long freezeuserid,
			Long structureid) {
		this.id = id;
		this.freezedate = freezedate;
		this.freezeuserid = freezeuserid;
		this.structureid = structureid;
	}

	// Property accessors

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Timestamp getFreezedate() {
		return this.freezedate;
	}

	public void setFreezedate(Timestamp freezedate) {
		this.freezedate = freezedate;
	}

	public Long getFreezeuserid() {
		return this.freezeuserid;
	}

	public void setFreezeuserid(Long freezeuserid) {
		this.freezeuserid = freezeuserid;
	}

	public Long getStructureid() {
		return this.structureid;
	}

	public void setStructureid(Long structureid) {
		this.structureid = structureid;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TCcFreezeId))
			return false;
		TCcFreezeId castOther = (TCcFreezeId) other;

		return ((this.getId() == castOther.getId()) || (this.getId() != null
				&& castOther.getId() != null && this.getId().equals(
				castOther.getId())))
				&& ((this.getFreezedate() == castOther.getFreezedate()) || (this
						.getFreezedate() != null
						&& castOther.getFreezedate() != null && this
						.getFreezedate().equals(castOther.getFreezedate())))
				&& ((this.getFreezeuserid() == castOther.getFreezeuserid()) || (this
						.getFreezeuserid() != null
						&& castOther.getFreezeuserid() != null && this
						.getFreezeuserid().equals(castOther.getFreezeuserid())))
				&& ((this.getStructureid() == castOther.getStructureid()) || (this
						.getStructureid() != null
						&& castOther.getStructureid() != null && this
						.getStructureid().equals(castOther.getStructureid())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getId() == null ? 0 : this.getId().hashCode());
		result = 37
				* result
				+ (getFreezedate() == null ? 0 : this.getFreezedate()
						.hashCode());
		result = 37
				* result
				+ (getFreezeuserid() == null ? 0 : this.getFreezeuserid()
						.hashCode());
		result = 37
				* result
				+ (getStructureid() == null ? 0 : this.getStructureid()
						.hashCode());
		return result;
	}

}