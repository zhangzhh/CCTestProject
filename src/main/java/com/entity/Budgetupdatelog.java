package com.entity;

import java.sql.Timestamp;

/**
 * Budgetupdatelog entity. @author MyEclipse Persistence Tools
 */

public class Budgetupdatelog implements java.io.Serializable {

	// Fields

	private Long id;
	private Long structureid;
	private String month;
	private Double oldbudget;
	private Double newbudget;
	private String operatetype;
	private Timestamp operatetime;
	private Long operatorid;
	private String operator;
	private Long yearid;

	// Constructors

	/** default constructor */
	public Budgetupdatelog() {
	}

	/** minimal constructor */
	public Budgetupdatelog(Long id) {
		this.id = id;
	}

	/** full constructor */
	public Budgetupdatelog(Long id, Long structureid, String month,
			Double oldbudget, Double newbudget, String operatetype,
			Timestamp operatetime, Long operatorid, String operator, Long yearid) {
		this.id = id;
		this.structureid = structureid;
		this.month = month;
		this.oldbudget = oldbudget;
		this.newbudget = newbudget;
		this.operatetype = operatetype;
		this.operatetime = operatetime;
		this.operatorid = operatorid;
		this.operator = operator;
		this.yearid = yearid;
	}

	// Property accessors

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getStructureid() {
		return this.structureid;
	}

	public void setStructureid(Long structureid) {
		this.structureid = structureid;
	}

	public String getMonth() {
		return this.month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public Double getOldbudget() {
		return this.oldbudget;
	}

	public void setOldbudget(Double oldbudget) {
		this.oldbudget = oldbudget;
	}

	public Double getNewbudget() {
		return this.newbudget;
	}

	public void setNewbudget(Double newbudget) {
		this.newbudget = newbudget;
	}

	public String getOperatetype() {
		return this.operatetype;
	}

	public void setOperatetype(String operatetype) {
		this.operatetype = operatetype;
	}

	public Timestamp getOperatetime() {
		return this.operatetime;
	}

	public void setOperatetime(Timestamp operatetime) {
		this.operatetime = operatetime;
	}

	public Long getOperatorid() {
		return this.operatorid;
	}

	public void setOperatorid(Long operatorid) {
		this.operatorid = operatorid;
	}

	public String getOperator() {
		return this.operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	public Long getYearid() {
		return this.yearid;
	}

	public void setYearid(Long yearid) {
		this.yearid = yearid;
	}

}