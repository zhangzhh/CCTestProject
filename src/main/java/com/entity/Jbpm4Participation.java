package com.entity;

import java.math.BigDecimal;

/**
 * Jbpm4Participation entity. @author MyEclipse Persistence Tools
 */

public class Jbpm4Participation implements java.io.Serializable {

	// Fields

	private BigDecimal dbid;
	private Jbpm4Swimlane jbpm4Swimlane;
	private Jbpm4Task jbpm4Task;
	private Long dbversion;
	private String groupid;
	private String userid;
	private String type;

	// Constructors

	/** default constructor */
	public Jbpm4Participation() {
	}

	/** minimal constructor */
	public Jbpm4Participation(BigDecimal dbid, Long dbversion) {
		this.dbid = dbid;
		this.dbversion = dbversion;
	}

	/** full constructor */
	public Jbpm4Participation(BigDecimal dbid, Jbpm4Swimlane jbpm4Swimlane,
			Jbpm4Task jbpm4Task, Long dbversion, String groupid, String userid,
			String type) {
		this.dbid = dbid;
		this.jbpm4Swimlane = jbpm4Swimlane;
		this.jbpm4Task = jbpm4Task;
		this.dbversion = dbversion;
		this.groupid = groupid;
		this.userid = userid;
		this.type = type;
	}

	// Property accessors

	public BigDecimal getDbid() {
		return this.dbid;
	}

	public void setDbid(BigDecimal dbid) {
		this.dbid = dbid;
	}

	public Jbpm4Swimlane getJbpm4Swimlane() {
		return this.jbpm4Swimlane;
	}

	public void setJbpm4Swimlane(Jbpm4Swimlane jbpm4Swimlane) {
		this.jbpm4Swimlane = jbpm4Swimlane;
	}

	public Jbpm4Task getJbpm4Task() {
		return this.jbpm4Task;
	}

	public void setJbpm4Task(Jbpm4Task jbpm4Task) {
		this.jbpm4Task = jbpm4Task;
	}

	public Long getDbversion() {
		return this.dbversion;
	}

	public void setDbversion(Long dbversion) {
		this.dbversion = dbversion;
	}

	public String getGroupid() {
		return this.groupid;
	}

	public void setGroupid(String groupid) {
		this.groupid = groupid;
	}

	public String getUserid() {
		return this.userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

}