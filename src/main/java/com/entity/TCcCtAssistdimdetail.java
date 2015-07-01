package com.entity;

/**
 * TCcCtAssistdimdetail entity. @author MyEclipse Persistence Tools
 */

public class TCcCtAssistdimdetail implements java.io.Serializable {

	// Fields

	private TCcCtAssistdimdetailId id;

	// Constructors

	/** default constructor */
	public TCcCtAssistdimdetail() {
	}

	/** full constructor */
	public TCcCtAssistdimdetail(TCcCtAssistdimdetailId id) {
		this.id = id;
	}

	// Property accessors

	public TCcCtAssistdimdetailId getId() {
		return this.id;
	}

	public void setId(TCcCtAssistdimdetailId id) {
		this.id = id;
	}

}