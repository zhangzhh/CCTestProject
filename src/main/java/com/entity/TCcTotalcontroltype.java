package com.entity;

/**
 * TCcTotalcontroltype entity. @author MyEclipse Persistence Tools
 */

public class TCcTotalcontroltype implements java.io.Serializable {

	// Fields

	private TCcTotalcontroltypeId id;

	// Constructors

	/** default constructor */
	public TCcTotalcontroltype() {
	}

	/** full constructor */
	public TCcTotalcontroltype(TCcTotalcontroltypeId id) {
		this.id = id;
	}

	// Property accessors

	public TCcTotalcontroltypeId getId() {
		return this.id;
	}

	public void setId(TCcTotalcontroltypeId id) {
		this.id = id;
	}

}