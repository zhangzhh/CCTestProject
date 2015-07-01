package com.entity;

/**
 * TCcFormno entity. @author MyEclipse Persistence Tools
 */

public class TCcFormno implements java.io.Serializable {

	// Fields

	private String formno;

	// Constructors

	/** default constructor */
	public TCcFormno() {
	}

	/** full constructor */
	public TCcFormno(String formno) {
		this.formno = formno;
	}

	// Property accessors

	public String getFormno() {
		return this.formno;
	}

	public void setFormno(String formno) {
		this.formno = formno;
	}

}