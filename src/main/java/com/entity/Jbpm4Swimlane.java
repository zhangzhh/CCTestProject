package com.entity;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * Jbpm4Swimlane entity. @author MyEclipse Persistence Tools
 */

public class Jbpm4Swimlane implements java.io.Serializable {

	// Fields

	private BigDecimal dbid;
	private Jbpm4Execution jbpm4Execution;
	private Long dbversion;
	private String name;
	private String assignee;
	private Set jbpm4Participations = new HashSet(0);

	// Constructors

	/** default constructor */
	public Jbpm4Swimlane() {
	}

	/** minimal constructor */
	public Jbpm4Swimlane(BigDecimal dbid, Long dbversion) {
		this.dbid = dbid;
		this.dbversion = dbversion;
	}

	/** full constructor */
	public Jbpm4Swimlane(BigDecimal dbid, Jbpm4Execution jbpm4Execution,
			Long dbversion, String name, String assignee,
			Set jbpm4Participations) {
		this.dbid = dbid;
		this.jbpm4Execution = jbpm4Execution;
		this.dbversion = dbversion;
		this.name = name;
		this.assignee = assignee;
		this.jbpm4Participations = jbpm4Participations;
	}

	// Property accessors

	public BigDecimal getDbid() {
		return this.dbid;
	}

	public void setDbid(BigDecimal dbid) {
		this.dbid = dbid;
	}

	public Jbpm4Execution getJbpm4Execution() {
		return this.jbpm4Execution;
	}

	public void setJbpm4Execution(Jbpm4Execution jbpm4Execution) {
		this.jbpm4Execution = jbpm4Execution;
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

	public String getAssignee() {
		return this.assignee;
	}

	public void setAssignee(String assignee) {
		this.assignee = assignee;
	}

	public Set getJbpm4Participations() {
		return this.jbpm4Participations;
	}

	public void setJbpm4Participations(Set jbpm4Participations) {
		this.jbpm4Participations = jbpm4Participations;
	}

}