package com.entity;

import java.sql.Timestamp;

/**
 * TCcExpenseupdatelog entity. @author MyEclipse Persistence Tools
 */

public class TCcExpenseupdatelog implements java.io.Serializable {

	// Fields

	private Long id;
	private Long expensestructureid;
	private Double oldbudget;
	private Double newbudget;
	private String operatetype;
	private Timestamp operatetime;
	private Long operatorid;
	private String operator;

	// Constructors

	/** default constructor */
	public TCcExpenseupdatelog() {
	}

	/** minimal constructor */
	public TCcExpenseupdatelog(Long id) {
		this.id = id;
	}

	/** full constructor */
	public TCcExpenseupdatelog(Long id, Long expensestructureid,
			Double oldbudget, Double newbudget, String operatetype,
			Timestamp operatetime, Long operatorid, String operator) {
		this.id = id;
		this.expensestructureid = expensestructureid;
		this.oldbudget = oldbudget;
		this.newbudget = newbudget;
		this.operatetype = operatetype;
		this.operatetime = operatetime;
		this.operatorid = operatorid;
		this.operator = operator;
	}

	// Property accessors

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getExpensestructureid() {
		return this.expensestructureid;
	}

	public void setExpensestructureid(Long expensestructureid) {
		this.expensestructureid = expensestructureid;
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

}