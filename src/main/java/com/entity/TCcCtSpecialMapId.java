package com.entity;

/**
 * TCcCtSpecialMapId entity. @author MyEclipse Persistence Tools
 */

public class TCcCtSpecialMapId implements java.io.Serializable {

	// Fields

	private String key;
	private String value;
	private Long id;

	// Constructors

	/** default constructor */
	public TCcCtSpecialMapId() {
	}

	/** full constructor */
	public TCcCtSpecialMapId(String key, String value, Long id) {
		this.key = key;
		this.value = value;
		this.id = id;
	}

	// Property accessors

	public String getKey() {
		return this.key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TCcCtSpecialMapId))
			return false;
		TCcCtSpecialMapId castOther = (TCcCtSpecialMapId) other;

		return ((this.getKey() == castOther.getKey()) || (this.getKey() != null
				&& castOther.getKey() != null && this.getKey().equals(
				castOther.getKey())))
				&& ((this.getValue() == castOther.getValue()) || (this
						.getValue() != null && castOther.getValue() != null && this
						.getValue().equals(castOther.getValue())))
				&& ((this.getId() == castOther.getId()) || (this.getId() != null
						&& castOther.getId() != null && this.getId().equals(
						castOther.getId())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getKey() == null ? 0 : this.getKey().hashCode());
		result = 37 * result
				+ (getValue() == null ? 0 : this.getValue().hashCode());
		result = 37 * result + (getId() == null ? 0 : this.getId().hashCode());
		return result;
	}

}