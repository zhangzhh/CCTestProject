package com.entity;

/**
 * TCcLoghandle entity. @author MyEclipse Persistence Tools
 */

public class TCcLoghandle implements java.io.Serializable {

	// Fields

	private TCcLoghandleId id;

	// Constructors

	/** default constructor */
	public TCcLoghandle() {
	}

	/** full constructor */
	public TCcLoghandle(TCcLoghandleId id) {
		this.id = id;
	}

	// Property accessors

	public TCcLoghandleId getId() {
		return this.id;
	}

	public void setId(TCcLoghandleId id) {
		this.id = id;
	}

}