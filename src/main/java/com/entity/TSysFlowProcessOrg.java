package com.entity;

/**
 * TSysFlowProcessOrg entity. @author MyEclipse Persistence Tools
 */

public class TSysFlowProcessOrg implements java.io.Serializable {

	// Fields

	private TSysFlowProcessOrgId id;

	// Constructors

	/** default constructor */
	public TSysFlowProcessOrg() {
	}

	/** full constructor */
	public TSysFlowProcessOrg(TSysFlowProcessOrgId id) {
		this.id = id;
	}

	// Property accessors

	public TSysFlowProcessOrgId getId() {
		return this.id;
	}

	public void setId(TSysFlowProcessOrgId id) {
		this.id = id;
	}

}