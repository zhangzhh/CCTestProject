package com.entity;

/**
 * TSysFunctionoperation entity. @author MyEclipse Persistence Tools
 */

public class TSysFunctionoperation implements java.io.Serializable {

	// Fields

	private Long functionoperationid;
	private TSysMenu TSysMenu;
	private String operationcode;
	private String operationname;
	private String isused;

	// Constructors

	/** default constructor */
	public TSysFunctionoperation() {
	}

	/** minimal constructor */
	public TSysFunctionoperation(Long functionoperationid) {
		this.functionoperationid = functionoperationid;
	}

	/** full constructor */
	public TSysFunctionoperation(Long functionoperationid, TSysMenu TSysMenu,
			String operationcode, String operationname, String isused) {
		this.functionoperationid = functionoperationid;
		this.TSysMenu = TSysMenu;
		this.operationcode = operationcode;
		this.operationname = operationname;
		this.isused = isused;
	}

	// Property accessors

	public Long getFunctionoperationid() {
		return this.functionoperationid;
	}

	public void setFunctionoperationid(Long functionoperationid) {
		this.functionoperationid = functionoperationid;
	}

	public TSysMenu getTSysMenu() {
		return this.TSysMenu;
	}

	public void setTSysMenu(TSysMenu TSysMenu) {
		this.TSysMenu = TSysMenu;
	}

	public String getOperationcode() {
		return this.operationcode;
	}

	public void setOperationcode(String operationcode) {
		this.operationcode = operationcode;
	}

	public String getOperationname() {
		return this.operationname;
	}

	public void setOperationname(String operationname) {
		this.operationname = operationname;
	}

	public String getIsused() {
		return this.isused;
	}

	public void setIsused(String isused) {
		this.isused = isused;
	}

}