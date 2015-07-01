package com.entity;

/**
 * TSysFlowProcessAccount entity. @author MyEclipse Persistence Tools
 */

public class TSysFlowProcessAccount implements java.io.Serializable {

	// Fields

	private TSysFlowProcessAccountId id;

	// Constructors

	/** default constructor */
	public TSysFlowProcessAccount() {
	}

	/** full constructor */
	public TSysFlowProcessAccount(TSysFlowProcessAccountId id) {
		this.id = id;
	}

	// Property accessors

	public TSysFlowProcessAccountId getId() {
		return this.id;
	}

	public void setId(TSysFlowProcessAccountId id) {
		this.id = id;
	}

}