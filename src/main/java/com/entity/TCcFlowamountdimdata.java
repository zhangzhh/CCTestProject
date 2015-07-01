package com.entity;

/**
 * TCcFlowamountdimdata entity. @author MyEclipse Persistence Tools
 */

public class TCcFlowamountdimdata implements java.io.Serializable {

	// Fields

	private TCcFlowamountdimdataId id;

	// Constructors

	/** default constructor */
	public TCcFlowamountdimdata() {
	}

	/** full constructor */
	public TCcFlowamountdimdata(TCcFlowamountdimdataId id) {
		this.id = id;
	}

	// Property accessors

	public TCcFlowamountdimdataId getId() {
		return this.id;
	}

	public void setId(TCcFlowamountdimdataId id) {
		this.id = id;
	}

}