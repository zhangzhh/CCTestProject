package com.entity;

/**
 * TCcFlowamountdetail entity. @author MyEclipse Persistence Tools
 */

public class TCcFlowamountdetail implements java.io.Serializable {

	// Fields

	private TCcFlowamountdetailId id;

	// Constructors

	/** default constructor */
	public TCcFlowamountdetail() {
	}

	/** full constructor */
	public TCcFlowamountdetail(TCcFlowamountdetailId id) {
		this.id = id;
	}

	// Property accessors

	public TCcFlowamountdetailId getId() {
		return this.id;
	}

	public void setId(TCcFlowamountdetailId id) {
		this.id = id;
	}

}