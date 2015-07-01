package com.entity;

/**
 * TCcStandbooknew entity. @author MyEclipse Persistence Tools
 */

public class TCcStandbooknew implements java.io.Serializable {

	// Fields

	private TCcStandbooknewId id;

	// Constructors

	/** default constructor */
	public TCcStandbooknew() {
	}

	/** full constructor */
	public TCcStandbooknew(TCcStandbooknewId id) {
		this.id = id;
	}

	// Property accessors

	public TCcStandbooknewId getId() {
		return this.id;
	}

	public void setId(TCcStandbooknewId id) {
		this.id = id;
	}

}