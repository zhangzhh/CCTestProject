package com.entity;

import java.math.BigDecimal;

/**
 * Jbpm4HistVar entity. @author MyEclipse Persistence Tools
 */

public class Jbpm4HistVar implements java.io.Serializable {

	// Fields

	private BigDecimal dbid;
	private Jbpm4HistProcinst jbpm4HistProcinst;
	private Jbpm4HistTask jbpm4HistTask;
	private Long dbversion;
	private String procinstid;
	private String executionid;
	private String varname;
	private String value;

	// Constructors

	/** default constructor */
	public Jbpm4HistVar() {
	}

	/** minimal constructor */
	public Jbpm4HistVar(BigDecimal dbid, Long dbversion) {
		this.dbid = dbid;
		this.dbversion = dbversion;
	}

	/** full constructor */
	public Jbpm4HistVar(BigDecimal dbid, Jbpm4HistProcinst jbpm4HistProcinst,
			Jbpm4HistTask jbpm4HistTask, Long dbversion, String procinstid,
			String executionid, String varname, String value) {
		this.dbid = dbid;
		this.jbpm4HistProcinst = jbpm4HistProcinst;
		this.jbpm4HistTask = jbpm4HistTask;
		this.dbversion = dbversion;
		this.procinstid = procinstid;
		this.executionid = executionid;
		this.varname = varname;
		this.value = value;
	}

	// Property accessors

	public BigDecimal getDbid() {
		return this.dbid;
	}

	public void setDbid(BigDecimal dbid) {
		this.dbid = dbid;
	}

	public Jbpm4HistProcinst getJbpm4HistProcinst() {
		return this.jbpm4HistProcinst;
	}

	public void setJbpm4HistProcinst(Jbpm4HistProcinst jbpm4HistProcinst) {
		this.jbpm4HistProcinst = jbpm4HistProcinst;
	}

	public Jbpm4HistTask getJbpm4HistTask() {
		return this.jbpm4HistTask;
	}

	public void setJbpm4HistTask(Jbpm4HistTask jbpm4HistTask) {
		this.jbpm4HistTask = jbpm4HistTask;
	}

	public Long getDbversion() {
		return this.dbversion;
	}

	public void setDbversion(Long dbversion) {
		this.dbversion = dbversion;
	}

	public String getProcinstid() {
		return this.procinstid;
	}

	public void setProcinstid(String procinstid) {
		this.procinstid = procinstid;
	}

	public String getExecutionid() {
		return this.executionid;
	}

	public void setExecutionid(String executionid) {
		this.executionid = executionid;
	}

	public String getVarname() {
		return this.varname;
	}

	public void setVarname(String varname) {
		this.varname = varname;
	}

	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}