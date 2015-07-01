package com.entity;

/**
 * TLsBuget entity. @author MyEclipse Persistence Tools
 */

public class TLsBuget implements java.io.Serializable {

	// Fields

	private TLsBugetId id;

	// Constructors

	/** default constructor */
	public TLsBuget() {
	}

	/** full constructor */
	public TLsBuget(TLsBugetId id) {
		this.id = id;
	}

	// Property accessors

	public TLsBugetId getId() {
		return this.id;
	}

	public void setId(TLsBugetId id) {
		this.id = id;
	}

}