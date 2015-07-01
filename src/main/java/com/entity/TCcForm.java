package com.entity;

/**
 * TCcForm entity. @author MyEclipse Persistence Tools
 */

public class TCcForm implements java.io.Serializable {

	// Fields

	private TCcFormId id;

	// Constructors

	/** default constructor */
	public TCcForm() {
	}

	/** full constructor */
	public TCcForm(TCcFormId id) {
		this.id = id;
	}

	// Property accessors

	public TCcFormId getId() {
		return this.id;
	}

	public void setId(TCcFormId id) {
		this.id = id;
	}

}