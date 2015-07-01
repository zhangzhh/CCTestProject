package com.entity;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * Jbpm4IdGroup entity. @author MyEclipse Persistence Tools
 */

public class Jbpm4IdGroup implements java.io.Serializable {

	// Fields

	private BigDecimal dbid;
	private Jbpm4IdGroup jbpm4IdGroup;
	private Long dbversion;
	private String id;
	private String name;
	private String type;
	private Set jbpm4IdGroups = new HashSet(0);
	private Set jbpm4IdMemberships = new HashSet(0);

	// Constructors

	/** default constructor */
	public Jbpm4IdGroup() {
	}

	/** minimal constructor */
	public Jbpm4IdGroup(BigDecimal dbid, Long dbversion) {
		this.dbid = dbid;
		this.dbversion = dbversion;
	}

	/** full constructor */
	public Jbpm4IdGroup(BigDecimal dbid, Jbpm4IdGroup jbpm4IdGroup,
			Long dbversion, String id, String name, String type,
			Set jbpm4IdGroups, Set jbpm4IdMemberships) {
		this.dbid = dbid;
		this.jbpm4IdGroup = jbpm4IdGroup;
		this.dbversion = dbversion;
		this.id = id;
		this.name = name;
		this.type = type;
		this.jbpm4IdGroups = jbpm4IdGroups;
		this.jbpm4IdMemberships = jbpm4IdMemberships;
	}

	// Property accessors

	public BigDecimal getDbid() {
		return this.dbid;
	}

	public void setDbid(BigDecimal dbid) {
		this.dbid = dbid;
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

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Set getJbpm4IdGroups() {
		return this.jbpm4IdGroups;
	}

	public void setJbpm4IdGroups(Set jbpm4IdGroups) {
		this.jbpm4IdGroups = jbpm4IdGroups;
	}

	public Set getJbpm4IdMemberships() {
		return this.jbpm4IdMemberships;
	}

	public void setJbpm4IdMemberships(Set jbpm4IdMemberships) {
		this.jbpm4IdMemberships = jbpm4IdMemberships;
	}

}