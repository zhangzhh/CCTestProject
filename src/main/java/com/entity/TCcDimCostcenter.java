package com.entity;

/**
 * TCcDimCostcenter entity. @author MyEclipse Persistence Tools
 */

public class TCcDimCostcenter implements java.io.Serializable {

	// Fields

	private TCcDimCostcenterId id;

	// Constructors

	/** default constructor */
	public TCcDimCostcenter() {
	}

	/** full constructor */
	public TCcDimCostcenter(TCcDimCostcenterId id) {
		this.id = id;
	}

	// Property accessors

	public TCcDimCostcenterId getId() {
		return this.id;
	}

	public void setId(TCcDimCostcenterId id) {
		this.id = id;
	}

}