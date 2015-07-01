package com.entity;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Jbpm4Variable entity. @author MyEclipse Persistence Tools
 */

public class Jbpm4Variable implements java.io.Serializable {

	// Fields

	private BigDecimal dbid;
	private Jbpm4Execution jbpm4Execution;
	private Jbpm4Task jbpm4Task;
	private String class_;
	private Long dbversion;
	private String key;
	private String converter;
	private Boolean hist;
	private BigDecimal execution;
	private BigDecimal lob;
	private Timestamp dateValue;
	private Double doubleValue;
	private String classname;
	private BigDecimal longValue;
	private String stringValue;
	private String textValue;

	// Constructors

	/** default constructor */
	public Jbpm4Variable() {
	}

	/** minimal constructor */
	public Jbpm4Variable(BigDecimal dbid, String class_, Long dbversion) {
		this.dbid = dbid;
		this.class_ = class_;
		this.dbversion = dbversion;
	}

	/** full constructor */
	public Jbpm4Variable(BigDecimal dbid, Jbpm4Execution jbpm4Execution,
			Jbpm4Task jbpm4Task, String class_, Long dbversion, String key,
			String converter, Boolean hist, BigDecimal execution,
			BigDecimal lob, Timestamp dateValue, Double doubleValue,
			String classname, BigDecimal longValue, String stringValue,
			String textValue) {
		this.dbid = dbid;
		this.jbpm4Execution = jbpm4Execution;
		this.jbpm4Task = jbpm4Task;
		this.class_ = class_;
		this.dbversion = dbversion;
		this.key = key;
		this.converter = converter;
		this.hist = hist;
		this.execution = execution;
		this.lob = lob;
		this.dateValue = dateValue;
		this.doubleValue = doubleValue;
		this.classname = classname;
		this.longValue = longValue;
		this.stringValue = stringValue;
		this.textValue = textValue;
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

	public String getKey() {
		return this.key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getConverter() {
		return this.converter;
	}

	public void setConverter(String converter) {
		this.converter = converter;
	}

	public Boolean getHist() {
		return this.hist;
	}

	public void setHist(Boolean hist) {
		this.hist = hist;
	}

	public BigDecimal getExecution() {
		return this.execution;
	}

	public void setExecution(BigDecimal execution) {
		this.execution = execution;
	}

	public BigDecimal getLob() {
		return this.lob;
	}

	public void setLob(BigDecimal lob) {
		this.lob = lob;
	}

	public Timestamp getDateValue() {
		return this.dateValue;
	}

	public void setDateValue(Timestamp dateValue) {
		this.dateValue = dateValue;
	}

	public Double getDoubleValue() {
		return this.doubleValue;
	}

	public void setDoubleValue(Double doubleValue) {
		this.doubleValue = doubleValue;
	}

	public String getClassname() {
		return this.classname;
	}

	public void setClassname(String classname) {
		this.classname = classname;
	}

	public BigDecimal getLongValue() {
		return this.longValue;
	}

	public void setLongValue(BigDecimal longValue) {
		this.longValue = longValue;
	}

	public String getStringValue() {
		return this.stringValue;
	}

	public void setStringValue(String stringValue) {
		this.stringValue = stringValue;
	}

	public String getTextValue() {
		return this.textValue;
	}

	public void setTextValue(String textValue) {
		this.textValue = textValue;
	}

}