package com.entity;

/**
 * TCcManagementroledimdata entity. @author MyEclipse Persistence Tools
 */

public class TCcManagementroledimdata implements java.io.Serializable {

	// Fields

	private TCcManagementroledimdataId id;

	// Constructors

	/** default constructor */
	public TCcManagementroledimdata() {
	}

	/** full constructor */
	public TCcManagementroledimdata(TCcManagementroledimdataId id) {
		this.id = id;
	}

	// Property accessors

	public TCcManagementroledimdataId getId() {
		return this.id;
	}

	public void setId(TCcManagementroledimdataId id) {
		this.id = id;
	}

}