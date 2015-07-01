package com.entity;

/**
 * TCcCtSpecialMap entity. @author MyEclipse Persistence Tools
 */

public class TCcCtSpecialMap implements java.io.Serializable {

	// Fields

	private TCcCtSpecialMapId id;

	// Constructors

	/** default constructor */
	public TCcCtSpecialMap() {
	}

	/** full constructor */
	public TCcCtSpecialMap(TCcCtSpecialMapId id) {
		this.id = id;
	}

	// Property accessors

	public TCcCtSpecialMapId getId() {
		return this.id;
	}

	public void setId(TCcCtSpecialMapId id) {
		this.id = id;
	}

}