package com.entity;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * Jbpm4HistProcinst entity. @author MyEclipse Persistence Tools
 */

public class Jbpm4HistProcinst implements java.io.Serializable {

	// Fields

	private BigDecimal dbid;
	private Long dbversion;
	private String id;
	private String procdefid;
	private String key;
	private Timestamp start;
	private Timestamp end;
	private BigDecimal duration;
	private String state;
	private String endactivity;
	private Long nextidx;
	private Set jbpm4HistVars = new HashSet(0);

	// Constructors

	/** default constructor */
	public Jbpm4HistProcinst() {
	}

	/** minimal constructor */
	public Jbpm4HistProcinst(BigDecimal dbid, Long dbversion) {
		this.dbid = dbid;
		this.dbversion = dbversion;
	}

	/** full constructor */
	public Jbpm4HistProcinst(BigDecimal dbid, Long dbversion, String id,
			String procdefid, String key, Timestamp start, Timestamp end,
			BigDecimal duration, String state, String endactivity,
			Long nextidx, Set jbpm4HistVars) {
		this.dbid = dbid;
		this.dbversion = dbversion;
		this.id = id;
		this.procdefid = procdefid;
		this.key = key;
		this.start = start;
		this.end = end;
		this.duration = duration;
		this.state = state;
		this.endactivity = endactivity;
		this.nextidx = nextidx;
		this.jbpm4HistVars = jbpm4HistVars;
	}

	// Property accessors

	public BigDecimal getDbid() {
		return this.dbid;
	}

	public void setDbid(BigDecimal dbid) {
		this.dbid = dbid;
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

	public String getProcdefid() {
		return this.procdefid;
	}

	public void setProcdefid(String procdefid) {
		this.procdefid = procdefid;
	}

	public String getKey() {
		return this.key;
	}

	public void setKey(String key) {
		this.key = key;
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

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getEndactivity() {
		return this.endactivity;
	}

	public void setEndactivity(String endactivity) {
		this.endactivity = endactivity;
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

}