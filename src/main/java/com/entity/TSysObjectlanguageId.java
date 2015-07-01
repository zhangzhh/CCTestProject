package com.entity;

/**
 * TSysObjectlanguageId entity. @author MyEclipse Persistence Tools
 */

public class TSysObjectlanguageId implements java.io.Serializable {

	// Fields

	private Long objectid;
	private Long languageid;
	private String name;
	private String type;

	// Constructors

	/** default constructor */
	public TSysObjectlanguageId() {
	}

	/** minimal constructor */
	public TSysObjectlanguageId(Long objectid, Long languageid, String name) {
		this.objectid = objectid;
		this.languageid = languageid;
		this.name = name;
	}

	/** full constructor */
	public TSysObjectlanguageId(Long objectid, Long languageid, String name,
			String type) {
		this.objectid = objectid;
		this.languageid = languageid;
		this.name = name;
		this.type = type;
	}

	// Property accessors

	public Long getObjectid() {
		return this.objectid;
	}

	public void setObjectid(Long objectid) {
		this.objectid = objectid;
	}

	public Long getLanguageid() {
		return this.languageid;
	}

	public void setLanguageid(Long languageid) {
		this.languageid = languageid;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TSysObjectlanguageId))
			return false;
		TSysObjectlanguageId castOther = (TSysObjectlanguageId) other;

		return ((this.getObjectid() == castOther.getObjectid()) || (this
				.getObjectid() != null && castOther.getObjectid() != null && this
				.getObjectid().equals(castOther.getObjectid())))
				&& ((this.getLanguageid() == castOther.getLanguageid()) || (this
						.getLanguageid() != null
						&& castOther.getLanguageid() != null && this
						.getLanguageid().equals(castOther.getLanguageid())))
				&& ((this.getName() == castOther.getName()) || (this.getName() != null
						&& castOther.getName() != null && this.getName()
						.equals(castOther.getName())))
				&& ((this.getType() == castOther.getType()) || (this.getType() != null
						&& castOther.getType() != null && this.getType()
						.equals(castOther.getType())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getObjectid() == null ? 0 : this.getObjectid().hashCode());
		result = 37
				* result
				+ (getLanguageid() == null ? 0 : this.getLanguageid()
						.hashCode());
		result = 37 * result
				+ (getName() == null ? 0 : this.getName().hashCode());
		result = 37 * result
				+ (getType() == null ? 0 : this.getType().hashCode());
		return result;
	}

}