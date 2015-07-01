package com.entity;

/**
 * CcForm entity. @author MyEclipse Persistence Tools
 */

public class CcForm implements java.io.Serializable {

	// Fields

	private CcFormId id;

	// Constructors

	/** default constructor */
	public CcForm() {
	}

	/** full constructor */
	public CcForm(CcFormId id) {
		this.id = id;
	}

	// Property accessors

	public CcFormId getId() {
		return this.id;
	}

	public void setId(CcFormId id) {
		this.id = id;
	}

}