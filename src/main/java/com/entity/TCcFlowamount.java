package com.entity;

/**
 * TCcFlowamount entity. @author MyEclipse Persistence Tools
 */

public class TCcFlowamount implements java.io.Serializable {

	// Fields

	private TCcFlowamountId id;

	// Constructors

	/** default constructor */
	public TCcFlowamount() {
	}

	/** full constructor */
	public TCcFlowamount(TCcFlowamountId id) {
		this.id = id;
	}

	// Property accessors

	public TCcFlowamountId getId() {
		return this.id;
	}

	public void setId(TCcFlowamountId id) {
		this.id = id;
	}

}