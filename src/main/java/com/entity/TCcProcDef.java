package com.entity;

/**
 * TCcProcDef entity. @author MyEclipse Persistence Tools
 */

public class TCcProcDef implements java.io.Serializable {

	// Fields

	private TCcProcDefId id;

	// Constructors

	/** default constructor */
	public TCcProcDef() {
	}

	/** full constructor */
	public TCcProcDef(TCcProcDefId id) {
		this.id = id;
	}

	// Property accessors

	public TCcProcDefId getId() {
		return this.id;
	}

	public void setId(TCcProcDefId id) {
		this.id = id;
	}

}