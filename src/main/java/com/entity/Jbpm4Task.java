package com.entity;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * Jbpm4Task entity. @author MyEclipse Persistence Tools
 */

public class Jbpm4Task implements java.io.Serializable {

	// Fields

	private BigDecimal dbid;
	private Jbpm4Task jbpm4Task;
	private String class_;
	private Long dbversion;
	private String name;
	private String descr;
	private String state;
	private String susphiststate;
	private String assignee;
	private String form;
	private Long priority;
	private Timestamp create;
	private Timestamp duedate;
	private Long progress;
	private Boolean signalling;
	private String executionId;
	private String activityName;
	private Boolean hasvars;
	private BigDecimal execution;
	private BigDecimal procinst;
	private BigDecimal swimlane;
	private String taskdefname;
	private Set jbpm4Variables = new HashSet(0);
	private Set jbpm4Tasks = new HashSet(0);
	private Set jbpm4Participations = new HashSet(0);

	// Constructors

	/** default constructor */
	public Jbpm4Task() {
	}

	/** minimal constructor */
	public Jbpm4Task(BigDecimal dbid, String class_, Long dbversion) {
		this.dbid = dbid;
		this.class_ = class_;
		this.dbversion = dbversion;
	}

	/** full constructor */
	public Jbpm4Task(BigDecimal dbid, Jbpm4Task jbpm4Task, String class_,
			Long dbversion, String name, String descr, String state,
			String susphiststate, String assignee, String form, Long priority,
			Timestamp create, Timestamp duedate, Long progress,
			Boolean signalling, String executionId, String activityName,
			Boolean hasvars, BigDecimal execution, BigDecimal procinst,
			BigDecimal swimlane, String taskdefname, Set jbpm4Variables,
			Set jbpm4Tasks, Set jbpm4Participations) {
		this.dbid = dbid;
		this.jbpm4Task = jbpm4Task;
		this.class_ = class_;
		this.dbversion = dbversion;
		this.name = name;
		this.descr = descr;
		this.state = state;
		this.susphiststate = susphiststate;
		this.assignee = assignee;
		this.form = form;
		this.priority = priority;
		this.create = create;
		this.duedate = duedate;
		this.progress = progress;
		this.signalling = signalling;
		this.executionId = executionId;
		this.activityName = activityName;
		this.hasvars = hasvars;
		this.execution = execution;
		this.procinst = procinst;
		this.swimlane = swimlane;
		this.taskdefname = taskdefname;
		this.jbpm4Variables = jbpm4Variables;
		this.jbpm4Tasks = jbpm4Tasks;
		this.jbpm4Participations = jbpm4Participations;
	}

	// Property accessors

	public BigDecimal getDbid() {
		return this.dbid;
	}

	public void setDbid(BigDecimal dbid) {
		this.dbid = dbid;
	}

	public Jbpm4Task getJbpm4Task() {
		return this.jbpm4Task;
	}

	public void setJbpm4Task(Jbpm4Task jbpm4Task) {
		this.jbpm4Task = jbpm4Task;
	}

	public String getClass_() {
		return this.class_;
	}

	public void setClass_(String class_) {
		this.class_ = class_;
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

	public String getDescr() {
		return this.descr;
	}

	public void setDescr(String descr) {
		this.descr = descr;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getSusphiststate() {
		return this.susphiststate;
	}

	public void setSusphiststate(String susphiststate) {
		this.susphiststate = susphiststate;
	}

	public String getAssignee() {
		return this.assignee;
	}

	public void setAssignee(String assignee) {
		this.assignee = assignee;
	}

	public String getForm() {
		return this.form;
	}

	public void setForm(String form) {
		this.form = form;
	}

	public Long getPriority() {
		return this.priority;
	}

	public void setPriority(Long priority) {
		this.priority = priority;
	}

	public Timestamp getCreate() {
		return this.create;
	}

	public void setCreate(Timestamp create) {
		this.create = create;
	}

	public Timestamp getDuedate() {
		return this.duedate;
	}

	public void setDuedate(Timestamp duedate) {
		this.duedate = duedate;
	}

	public Long getProgress() {
		return this.progress;
	}

	public void setProgress(Long progress) {
		this.progress = progress;
	}

	public Boolean getSignalling() {
		return this.signalling;
	}

	public void setSignalling(Boolean signalling) {
		this.signalling = signalling;
	}

	public String getExecutionId() {
		return this.executionId;
	}

	public void setExecutionId(String executionId) {
		this.executionId = executionId;
	}

	public String getActivityName() {
		return this.activityName;
	}

	public void setActivityName(String activityName) {
		this.activityName = activityName;
	}

	public Boolean getHasvars() {
		return this.hasvars;
	}

	public void setHasvars(Boolean hasvars) {
		this.hasvars = hasvars;
	}

	public BigDecimal getExecution() {
		return this.execution;
	}

	public void setExecution(BigDecimal execution) {
		this.execution = execution;
	}

	public BigDecimal getProcinst() {
		return this.procinst;
	}

	public void setProcinst(BigDecimal procinst) {
		this.procinst = procinst;
	}

	public BigDecimal getSwimlane() {
		return this.swimlane;
	}

	public void setSwimlane(BigDecimal swimlane) {
		this.swimlane = swimlane;
	}

	public String getTaskdefname() {
		return this.taskdefname;
	}

	public void setTaskdefname(String taskdefname) {
		this.taskdefname = taskdefname;
	}

	public Set getJbpm4Variables() {
		return this.jbpm4Variables;
	}

	public void setJbpm4Variables(Set jbpm4Variables) {
		this.jbpm4Variables = jbpm4Variables;
	}

	public Set getJbpm4Tasks() {
		return this.jbpm4Tasks;
	}

	public void setJbpm4Tasks(Set jbpm4Tasks) {
		this.jbpm4Tasks = jbpm4Tasks;
	}

	public Set getJbpm4Participations() {
		return this.jbpm4Participations;
	}

	public void setJbpm4Participations(Set jbpm4Participations) {
		this.jbpm4Participations = jbpm4Participations;
	}

}