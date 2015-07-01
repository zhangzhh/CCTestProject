package com.entity;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * ContractSequenceTable entity. @author MyEclipse Persistence Tools
 */

public class ContractSequenceTable implements java.io.Serializable {

	// Fields

	private String id;
	private Timestamp createdate;
	private BigDecimal no;

	// Constructors

	/** default constructor */
	public ContractSequenceTable() {
	}

	/** minimal constructor */
	public ContractSequenceTable(String id) {
		this.id = id;
	}

	/** full constructor */
	public ContractSequenceTable(String id, Timestamp createdate, BigDecimal no) {
		this.id = id;
		this.createdate = createdate;
		this.no = no;
	}

	// Property accessors

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Timestamp getCreatedate() {
		return this.createdate;
	}

	public void setCreatedate(Timestamp createdate) {
		this.createdate = createdate;
	}

	public BigDecimal getNo() {
		return this.no;
	}

	public void setNo(BigDecimal no) {
		this.no = no;
	}

}