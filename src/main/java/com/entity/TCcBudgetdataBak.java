package com.entity;

/**
 * TCcBudgetdataBak entity. @author MyEclipse Persistence Tools
 */

public class TCcBudgetdataBak implements java.io.Serializable {

	// Fields

	private TCcBudgetdataBakId id;

	// Constructors

	/** default constructor */
	public TCcBudgetdataBak() {
	}

	/** full constructor */
	public TCcBudgetdataBak(TCcBudgetdataBakId id) {
		this.id = id;
	}

	// Property accessors

	public TCcBudgetdataBakId getId() {
		return this.id;
	}

	public void setId(TCcBudgetdataBakId id) {
		this.id = id;
	}

}