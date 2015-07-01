package com.entity;

import java.math.BigDecimal;

/**
 * Jbpm4Deployprop entity. @author MyEclipse Persistence Tools
 */

public class Jbpm4Deployprop implements java.io.Serializable {

	// Fields

	private BigDecimal dbid;
	private Jbpm4Deployment jbpm4Deployment;
	private String objname;
	private String key;
	private String stringval;
	private BigDecimal longval;

	// Constructors

	/** default constructor */
	public Jbpm4Deployprop() {
	}

	/** minimal constructor */
	public Jbpm4Deployprop(BigDecimal dbid) {
		this.dbid = dbid;
	}

	/** full constructor */
	public Jbpm4Deployprop(BigDecimal dbid, Jbpm4Deployment jbpm4Deployment,
			String objname, String key, String stringval, BigDecimal longval) {
		this.dbid = dbid;
		this.jbpm4Deployment = jbpm4Deployment;
		this.objname = objname;
		this.key = key;
		this.stringval = stringval;
		this.longval = longval;
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

	public String getObjname() {
		return this.objname;
	}

	public void setObjname(String objname) {
		this.objname = objname;
	}

	public String getKey() {
		return this.key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getStringval() {
		return this.stringval;
	}

	public void setStringval(String stringval) {
		this.stringval = stringval;
	}

	public BigDecimal getLongval() {
		return this.longval;
	}

	public void setLongval(BigDecimal longval) {
		this.longval = longval;
	}

}