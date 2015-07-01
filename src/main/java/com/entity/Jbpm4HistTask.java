package com.entity;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * Jbpm4HistTask entity. @author MyEclipse Persistence Tools
 */

public class Jbpm4HistTask implements java.io.Serializable {

	// Fields

	private BigDecimal dbid;
	private Jbpm4HistTask jbpm4HistTask;
	private Long dbversion;
	private String execution;
	private String outcome;
	private String assignee;
	private Long priority;
	private String state;
	private Timestamp create;
	private Timestamp end;
	private BigDecimal duration;
	private Long nextidx;
	private Set jbpm4HistVars = new HashSet(0);
	private Set jbpm4HistTasks = new HashSet(0);

	// Constructors

	/** default constructor */
	public Jbpm4HistTask() {
	}

	/** minimal constructor */
	public Jbpm4HistTask(BigDecimal dbid, Long dbversion) {
		this.dbid = dbid;
		this.dbversion = dbversion;
	}

	/** full constructor */
	public Jbpm4HistTask(BigDecimal dbid, Jbpm4HistTask jbpm4HistTask,
			Long dbversion, String execution, String outcome, String assignee,
			Long priority, String state, Timestamp create, Timestamp end,
			BigDecimal duration, Long nextidx, Set jbpm4HistVars,
			Set jbpm4HistTasks) {
		this.dbid = dbid;
		this.jbpm4HistTask = jbpm4HistTask;
		this.dbversion = dbversion;
		this.execution = execution;
		this.outcome = outcome;
		this.assignee = assignee;
		this.priority = priority;
		this.state = state;
		this.create = create;
		this.end = end;
		this.duration = duration;
		this.nextidx = nextidx;
		this.jbpm4HistVars = jbpm4HistVars;
		this.jbpm4HistTasks = jbpm4HistTasks;
	}

	// Property accessors

	public BigDecimal getDbid() {
		return this.dbid;
	}

	public void setDbid(BigDecimal dbid) {
		this.dbid = dbid;
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

	public String getExecution() {
		return this.execution;
	}

	public void setExecution(String execution) {
		this.execution = execution;
	}

	public String getOutcome() {
		return this.outcome;
	}

	public void setOutcome(String outcome) {
		this.outcome = outcome;
	}

	public String getAssignee() {
		return this.assignee;
	}

	public void setAssignee(String assignee) {
		this.assignee = assignee;
	}

	public Long getPriority() {
		return this.priority;
	}

	public void setPriority(Long priority) {
		this.priority = priority;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Timestamp getCreate() {
		return this.create;
	}

	public void setCreate(Timestamp create) {
		this.create = create;
	}

	public Timestamp getEnd() {
		return this.end;
	}

	public void setEnd(Timestamp end) {
		this.end = end;
	}

	public BigDecimal getDuration() {
		return this.duration;
	}

	public void setDuration(BigDecimal duration) {
		this.duration = duration;
	}

	public Long getNextidx() {
		return this.nextidx;
	}

	public void setNextidx(Long nextidx) {
		this.nextidx = nextidx;
	}

	public Set getJbpm4HistVars() {
		return this.jbpm4HistVars;
	}

	public void setJbpm4HistVars(Set jbpm4HistVars) {
		this.jbpm4HistVars = jbpm4HistVars;
	}

	public Set getJbpm4HistTasks() {
		return this.jbpm4HistTasks;
	}

	public void setJbpm4HistTasks(Set jbpm4HistTasks) {
		this.jbpm4HistTasks = jbpm4HistTasks;
	}

}