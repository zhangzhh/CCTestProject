package com.entity;

/**
 * TCcCtAssistdimitem entity. @author MyEclipse Persistence Tools
 */

public class TCcCtAssistdimitem implements java.io.Serializable {

	// Fields

	private TCcCtAssistdimitemId id;

	// Constructors

	/** default constructor */
	public TCcCtAssistdimitem() {
	}

	/** full constructor */
	public TCcCtAssistdimitem(TCcCtAssistdimitemId id) {
		this.id = id;
	}

	// Property accessors

	public TCcCtAssistdimitemId getId() {
		return this.id;
	}

	public void setId(TCcCtAssistdimitemId id) {
		this.id = id;
	}

}