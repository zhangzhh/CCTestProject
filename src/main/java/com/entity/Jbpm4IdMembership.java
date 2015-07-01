package com.entity;

import java.math.BigDecimal;

/**
 * Jbpm4IdMembership entity. @author MyEclipse Persistence Tools
 */

public class Jbpm4IdMembership implements java.io.Serializable {

	// Fields

	private BigDecimal dbid;
	private Jbpm4IdUser jbpm4IdUser;
	private Jbpm4IdGroup jbpm4IdGroup;
	private Long dbversion;
	private String name;

	// Constructors

	/** default constructor */
	public Jbpm4IdMembership() {
	}

	/** minimal constructor */
	public Jbpm4IdMembership(BigDecimal dbid, Long dbversion) {
		this.dbid = dbid;
		this.dbversion = dbversion;
	}

	/** full constructor */
	public Jbpm4IdMembership(BigDecimal dbid, Jbpm4IdUser jbpm4IdUser,
			Jbpm4IdGroup jbpm4IdGroup, Long dbversion, String name) {
		this.dbid = dbid;
		this.jbpm4IdUser = jbpm4IdUser;
		this.jbpm4IdGroup = jbpm4IdGroup;
		this.dbversion = dbversion;
		this.name = name;
	}

	// Property accessors

	public BigDecimal getDbid() {
		return this.dbid;
	}

	public void setDbid(BigDecimal dbid) {
		this.dbid = dbid;
	}

	public Jbpm4IdUser getJbpm4IdUser() {
		return this.jbpm4IdUser;
	}

	public void setJbpm4IdUser(Jbpm4IdUser jbpm4IdUser) {
		this.jbpm4IdUser = jbpm4IdUser;
	}

	public Jbpm4IdGroup getJbpm4IdGroup() {
		return this.jbpm4IdGroup;
	}

	public void setJbpm4IdGroup(Jbpm4IdGroup jbpm4IdGroup) {
		this.jbpm4IdGroup = jbpm4IdGroup;
	}

	public Long getDbversion() {
		return this.dbversion;
	}

	public void setDbversion(Long dbversion) {
		this.dbversion = dbversion;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}