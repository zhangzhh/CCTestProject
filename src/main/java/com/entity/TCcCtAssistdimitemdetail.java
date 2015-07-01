package com.entity;

/**
 * TCcCtAssistdimitemdetail entity. @author MyEclipse Persistence Tools
 */

public class TCcCtAssistdimitemdetail implements java.io.Serializable {

	// Fields

	private TCcCtAssistdimitemdetailId id;

	// Constructors

	/** default constructor */
	public TCcCtAssistdimitemdetail() {
	}

	/** full constructor */
	public TCcCtAssistdimitemdetail(TCcCtAssistdimitemdetailId id) {
		this.id = id;
	}

	// Property accessors

	public TCcCtAssistdimitemdetailId getId() {
		return this.id;
	}

	public void setId(TCcCtAssistdimitemdetailId id) {
		this.id = id;
	}

}