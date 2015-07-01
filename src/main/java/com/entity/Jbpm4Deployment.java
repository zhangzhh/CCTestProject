package com.entity;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * Jbpm4Deployment entity. @author MyEclipse Persistence Tools
 */

public class Jbpm4Deployment implements java.io.Serializable {

	// Fields

	private BigDecimal dbid;
	private String name;
	private BigDecimal timestamp;
	private String state;
	private Set jbpm4Deployprops = new HashSet(0);
	private Set jbpm4Lobs = new HashSet(0);

	// Constructors

	/** default constructor */
	public Jbpm4Deployment() {
	}

	/** minimal constructor */
	public Jbpm4Deployment(BigDecimal dbid) {
		this.dbid = dbid;
	}

	/** full constructor */
	public Jbpm4Deployment(BigDecimal dbid, String name, BigDecimal timestamp,
			String state, Set jbpm4Deployprops, Set jbpm4Lobs) {
		this.dbid = dbid;
		this.name = name;
		this.timestamp = timestamp;
		this.state = state;
		this.jbpm4Deployprops = jbpm4Deployprops;
		this.jbpm4Lobs = jbpm4Lobs;
	}

	// Property accessors

	public BigDecimal getDbid() {
		return this.dbid;
	}

	public void setDbid(BigDecimal dbid) {
		this.dbid = dbid;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getTimestamp() {
		return this.timestamp;
	}

	public void setTimestamp(BigDecimal timestamp) {
		this.timestamp = timestamp;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Set getJbpm4Deployprops() {
		return this.jbpm4Deployprops;
	}

	public void setJbpm4Deployprops(Set jbpm4Deployprops) {
		this.jbpm4Deployprops = jbpm4Deployprops;
	}

	public Set getJbpm4Lobs() {
		return this.jbpm4Lobs;
	}

	public void setJbpm4Lobs(Set jbpm4Lobs) {
		this.jbpm4Lobs = jbpm4Lobs;
	}

}