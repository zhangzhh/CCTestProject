package com.entity;

/**
 * TSysLanguage entity. @author MyEclipse Persistence Tools
 */

public class TSysLanguage implements java.io.Serializable {

	// Fields

	private TSysLanguageId id;

	// Constructors

	/** default constructor */
	public TSysLanguage() {
	}

	/** full constructor */
	public TSysLanguage(TSysLanguageId id) {
		this.id = id;
	}

	// Property accessors

	public TSysLanguageId getId() {
		return this.id;
	}

	public void setId(TSysLanguageId id) {
		this.id = id;
	}

}