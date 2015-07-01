package com.entity;

/**
 * Jbpm4Property entity. @author MyEclipse Persistence Tools
 */

public class Jbpm4Property implements java.io.Serializable {

	// Fields

	private String key;
	private Long version;
	private String value;

	// Constructors

	/** default constructor */
	public Jbpm4Property() {
	}

	/** minimal constructor */
	public Jbpm4Property(String key, Long version) {
		this.key = key;
		this.version = version;
	}

	/** full constructor */
	public Jbpm4Property(String key, Long version, String value) {
		this.key = key;
		this.version = version;
		this.value = value;
	}

	// Property accessors

	public String getKey() {
		return this.key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public Long getVersion() {
		return this.version;
	}

	public void setVersion(Long version) {
		this.version = version;
	}

	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}