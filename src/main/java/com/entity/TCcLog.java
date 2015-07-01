package com.entity;

import java.sql.Timestamp;

/**
 * TCcLog entity. @author MyEclipse Persistence Tools
 */

public class TCcLog implements java.io.Serializable {

	// Fields

	private Long logid;
	private String operateuser;
	private Timestamp operatetime;
	private String classname;
	private String method;
	private String description;
	private String type;
	private String parameter;
	private String exceptionmessage;
	private String ip;

	// Constructors

	/** default constructor */
	public TCcLog() {
	}

	/** minimal constructor */
	public TCcLog(Long logid) {
		this.logid = logid;
	}

	/** full constructor */
	public TCcLog(Long logid, String operateuser, Timestamp operatetime,
			String classname, String method, String description, String type,
			String parameter, String exceptionmessage, String ip) {
		this.logid = logid;
		this.operateuser = operateuser;
		this.operatetime = operatetime;
		this.classname = classname;
		this.method = method;
		this.description = description;
		this.type = type;
		this.parameter = parameter;
		this.exceptionmessage = exceptionmessage;
		this.ip = ip;
	}

	// Property accessors

	public Long getLogid() {
		return this.logid;
	}

	public void setLogid(Long logid) {
		this.logid = logid;
	}

	public String getOperateuser() {
		return this.operateuser;
	}

	public void setOperateuser(String operateuser) {
		this.operateuser = operateuser;
	}

	public Timestamp getOperatetime() {
		return this.operatetime;
	}

	public void setOperatetime(Timestamp operatetime) {
		this.operatetime = operatetime;
	}

	public String getClassname() {
		return this.classname;
	}

	public void setClassname(String classname) {
		this.classname = classname;
	}

	public String getMethod() {
		return this.method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getParameter() {
		return this.parameter;
	}

	public void setParameter(String parameter) {
		this.parameter = parameter;
	}

	public String getExceptionmessage() {
		return this.exceptionmessage;
	}

	public void setExceptionmessage(String exceptionmessage) {
		this.exceptionmessage = exceptionmessage;
	}

	public String getIp() {
		return this.ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

}