package com.entity;

import java.math.BigDecimal;

/**
 * Jbpm4Lob entity. @author MyEclipse Persistence Tools
 */

public class Jbpm4Lob implements java.io.Serializable {

	// Fields

	private BigDecimal dbid;
	private Jbpm4Deployment jbpm4Deployment;
	private Long dbversion;
	private byte[] blobValue;
	private String name;

	// Constructors

	/** default constructor */
	public Jbpm4Lob() {
	}

	/** minimal constructor */
	public Jbpm4Lob(BigDecimal dbid, Long dbversion) {
		this.dbid = dbid;
		this.dbversion = dbversion;
	}

	/** full constructor */
	public Jbpm4Lob(BigDecimal dbid, Jbpm4Deployment jbpm4Deployment,
			Long dbversion, byte[] blobValue, String name) {
		this.dbid = dbid;
		this.jbpm4Deployment = jbpm4Deployment;
		this.dbversion = dbversion;
		this.blobValue = blobValue;
		this.name = name;
	}

	// Property accessors

	public BigDecimal getDbid() {
		return this.dbid;
	}

	public void setDbid(BigDecimal dbid) {
		this.dbid = dbid;
	}

	public Jbpm4Deployment getJbpm4Deployment() {
		return this.jbpm4Deployment;
	}

	public void setJbpm4Deployment(Jbpm4Deployment jbpm4Deployment) {
		this.jbpm4Deployment = jbpm4Deployment;
	}

	public Long getDbversion() {
		return this.dbversion;
	}

	public void setDbversion(Long dbversion) {
		this.dbversion = dbversion;
	}

	public byte[] getBlobValue() {
		return this.blobValue;
	}

	public void setBlobValue(byte[] blobValue) {
		this.blobValue = blobValue;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}