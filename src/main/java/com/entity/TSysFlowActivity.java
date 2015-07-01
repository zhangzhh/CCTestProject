package com.entity;

/**
 * TSysFlowActivity entity. @author MyEclipse Persistence Tools
 */

public class TSysFlowActivity implements java.io.Serializable {

	// Fields

	private TSysFlowActivityId id;

	// Constructors

	/** default constructor */
	public TSysFlowActivity() {
	}

	/** full constructor */
	public TSysFlowActivity(TSysFlowActivityId id) {
		this.id = id;
	}

	// Property accessors

	public TSysFlowActivityId getId() {
		return this.id;
	}

	public void setId(TSysFlowActivityId id) {
		this.id = id;
	}

}