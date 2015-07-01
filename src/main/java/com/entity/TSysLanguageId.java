package com.entity;

import java.math.BigDecimal;

/**
 * TSysLanguageId entity. @author MyEclipse Persistence Tools
 */

public class TSysLanguageId implements java.io.Serializable {

	// Fields

	private Long languageid;
	private String languagecode;
	private String languagename;
	private String languagedesc;
	private String enabled;
	private BigDecimal position;

	// Constructors

	/** default constructor */
	public TSysLanguageId() {
	}

	/** minimal constructor */
	public TSysLanguageId(Long languageid) {
		this.languageid = languageid;
	}

	/** full constructor */
	public TSysLanguageId(Long languageid, String languagecode,
			String languagename, String languagedesc, String enabled,
			BigDecimal position) {
		this.languageid = languageid;
		this.languagecode = languagecode;
		this.languagename = languagename;
		this.languagedesc = languagedesc;
		this.enabled = enabled;
		this.position = position;
	}

	// Property accessors

	public Long getLanguageid() {
		return this.languageid;
	}

	public void setLanguageid(Long languageid) {
		this.languageid = languageid;
	}

	public String getLanguagecode() {
		return this.languagecode;
	}

	public void setLanguagecode(String languagecode) {
		this.languagecode = languagecode;
	}

	public String getLanguagename() {
		return this.languagename;
	}

	public void setLanguagename(String languagename) {
		this.languagename = languagename;
	}

	public String getLanguagedesc() {
		return this.languagedesc;
	}

	public void setLanguagedesc(String languagedesc) {
		this.languagedesc = languagedesc;
	}

	public String getEnabled() {
		return this.enabled;
	}

	public void setEnabled(String enabled) {
		this.enabled = enabled;
	}

	public BigDecimal getPosition() {
		return this.position;
	}

	public void setPosition(BigDecimal position) {
		this.position = position;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TSysLanguageId))
			return false;
		TSysLanguageId castOther = (TSysLanguageId) other;

		return ((this.getLanguageid() == castOther.getLanguageid()) || (this
				.getLanguageid() != null && castOther.getLanguageid() != null && this
				.getLanguageid().equals(castOther.getLanguageid())))
				&& ((this.getLanguagecode() == castOther.getLanguagecode()) || (this
						.getLanguagecode() != null
						&& castOther.getLanguagecode() != null && this
						.getLanguagecode().equals(castOther.getLanguagecode())))
				&& ((this.getLanguagename() == castOther.getLanguagename()) || (this
						.getLanguagename() != null
						&& castOther.getLanguagename() != null && this
						.getLanguagename().equals(castOther.getLanguagename())))
				&& ((this.getLanguagedesc() == castOther.getLanguagedesc()) || (this
						.getLanguagedesc() != null
						&& castOther.getLanguagedesc() != null && this
						.getLanguagedesc().equals(castOther.getLanguagedesc())))
				&& ((this.getEnabled() == castOther.getEnabled()) || (this
						.getEnabled() != null && castOther.getEnabled() != null && this
						.getEnabled().equals(castOther.getEnabled())))
				&& ((this.getPosition() == castOther.getPosition()) || (this
						.getPosition() != null
						&& castOther.getPosition() != null && this
						.getPosition().equals(castOther.getPosition())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getLanguageid() == null ? 0 : this.getLanguageid()
						.hashCode());
		result = 37
				* result
				+ (getLanguagecode() == null ? 0 : this.getLanguagecode()
						.hashCode());
		result = 37
				* result
				+ (getLanguagename() == null ? 0 : this.getLanguagename()
						.hashCode());
		result = 37
				* result
				+ (getLanguagedesc() == null ? 0 : this.getLanguagedesc()
						.hashCode());
		result = 37 * result
				+ (getEnabled() == null ? 0 : this.getEnabled().hashCode());
		result = 37 * result
				+ (getPosition() == null ? 0 : this.getPosition().hashCode());
		return result;
	}

}