package com.entity;

/**
 * TCcItemMark entity. @author MyEclipse Persistence Tools
 */

public class TCcItemMark implements java.io.Serializable {

	// Fields

	private TCcItemMarkId id;

	// Constructors

	/** default constructor */
	public TCcItemMark() {
	}

	/** full constructor */
	public TCcItemMark(TCcItemMarkId id) {
		this.id = id;
	}

	// Property accessors

	public TCcItemMarkId getId() {
		return this.id;
	}

	public void setId(TCcItemMarkId id) {
		this.id = id;
	}

}