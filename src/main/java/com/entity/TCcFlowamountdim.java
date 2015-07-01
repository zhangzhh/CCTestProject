package com.entity;

/**
 * TCcFlowamountdim entity. @author MyEclipse Persistence Tools
 */

public class TCcFlowamountdim implements java.io.Serializable {

	// Fields

	private TCcFlowamountdimId id;

	// Constructors

	/** default constructor */
	public TCcFlowamountdim() {
	}

	/** full constructor */
	public TCcFlowamountdim(TCcFlowamountdimId id) {
		this.id = id;
	}

	// Property accessors

	public TCcFlowamountdimId getId() {
		return this.id;
	}

	public void setId(TCcFlowamountdimId id) {
		this.id = id;
	}

}