package com.entity;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Jbpm4HistActinst entity. @author MyEclipse Persistence Tools
 */

public class Jbpm4HistActinst implements java.io.Serializable {

	// Fields

	private BigDecimal dbid;
	private String class_;
	private Long dbversion;
	private BigDecimal hproci;
	private String type;
	private String execution;
	private String activityName;
	private Timestamp start;
	private Timestamp end;
	private BigDecimal duration;
	private String transition;
	private Long nextidx;
	private BigDecimal htask;

	// Constructors

	/** default constructor */
	public Jbpm4HistActinst() {
	}

	/** minimal constructor */
	public Jbpm4HistActinst(BigDecimal dbid, String class_, Long dbversion) {
		this.dbid = dbid;
		this.class_ = class_;
		this.dbversion = dbversion;
	}

	/** full constructor */
	public Jbpm4HistActinst(BigDecimal dbid, String class_, Long dbversion,
			BigDecimal hproci, String type, String execution,
			String activityName, Timestamp start, Timestamp end,
			BigDecimal duration, String transition, Long nextidx,
			BigDecimal htask) {
		this.dbid = dbid;
		this.class_ = class_;
		this.dbversion = dbversion;
		this.hproci = hproci;
		this.type = type;
		this.execution = execution;
		this.activityName = activityName;
		this.start = start;
		this.end = end;
		this.duration = duration;
		this.transition = transition;
		this.nextidx = nextidx;
		this.htask = htask;
	}

	// Property accessors

	public BigDecimal getDbid() {
		return this.dbid;
	}

	public void setDbid(BigDecimal dbid) {
		this.dbid = dbid;
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

	public BigDecimal getHproci() {
		return this.hproci;
	}

	public void setHproci(BigDecimal hproci) {
		this.hproci = hproci;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getExecution() {
		return this.execution;
	}

	public void setExecution(String execution) {
		this.execution = execution;
	}

	public String getActivityName() {
		return this.activityName;
	}

	public void setActivityName(String activityName) {
		this.activityName = activityName;
	}

	public Timestamp getStart() {
		return this.start;
	}

	public void setStart(Timestamp start) {
		this.start = start;
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

	public String getTransition() {
		return this.transition;
	}

	public void setTransition(String transition) {
		this.transition = transition;
	}

	public Long getNextidx() {
		return this.nextidx;
	}

	public void setNextidx(Long nextidx) {
		this.nextidx = nextidx;
	}

	public BigDecimal getHtask() {
		return this.htask;
	}

	public void setHtask(BigDecimal htask) {
		this.htask = htask;
	}

}