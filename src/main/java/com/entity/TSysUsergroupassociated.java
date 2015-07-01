package com.entity;

/**
 * TSysUsergroupassociated entity. @author MyEclipse Persistence Tools
 */

public class TSysUsergroupassociated implements java.io.Serializable {

	// Fields

	private TSysUsergroupassociatedId id;

	// Constructors

	/** default constructor */
	public TSysUsergroupassociated() {
	}

	/** full constructor */
	public TSysUsergroupassociated(TSysUsergroupassociatedId id) {
		this.id = id;
	}

	// Property accessors

	public TSysUsergroupassociatedId getId() {
		return this.id;
	}

	public void setId(TSysUsergroupassociatedId id) {
		this.id = id;
	}

}