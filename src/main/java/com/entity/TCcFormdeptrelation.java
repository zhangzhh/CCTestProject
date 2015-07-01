package com.entity;

/**
 * TCcFormdeptrelation entity. @author MyEclipse Persistence Tools
 */

public class TCcFormdeptrelation implements java.io.Serializable {

	// Fields

	private TCcFormdeptrelationId id;

	// Constructors

	/** default constructor */
	public TCcFormdeptrelation() {
	}

	/** full constructor */
	public TCcFormdeptrelation(TCcFormdeptrelationId id) {
		this.id = id;
	}

	// Property accessors

	public TCcFormdeptrelationId getId() {
		return this.id;
	}

	public void setId(TCcFormdeptrelationId id) {
		this.id = id;
	}

}