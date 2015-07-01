package com.entity;

import java.sql.Timestamp;

/**
 * TSysMaillogger entity. @author MyEclipse Persistence Tools
 */

public class TSysMaillogger implements java.io.Serializable {

	// Fields

	private Long id;
	private String billnumber;
	private String billname;
	private Long taskid;
	private String taskname;
	private String activityname;
	private Long actorid;
	private String actorname;
	private String email;
	private Timestamp senddate;
	private Timestamp actdate;
	private String actresult;
	private String actcontent;
	private String status;
	private String errormessage;
	private Boolean loggertype;
	private Boolean mailtype;

	// Constructors

	/** default constructor */
	public TSysMaillogger() {
	}

	/** minimal constructor */
	public TSysMaillogger(Long id) {
		this.id = id;
	}

	/** full constructor */
	public TSysMaillogger(Long id, String billnumber, String billname,
			Long taskid, String taskname, String activityname, Long actorid,
			String actorname, String email, Timestamp senddate,
			Timestamp actdate, String actresult, String actcontent,
			String status, String errormessage, Boolean loggertype,
			Boolean mailtype) {
		this.id = id;
		this.billnumber = billnumber;
		this.billname = billname;
		this.taskid = taskid;
		this.taskname = taskname;
		this.activityname = activityname;
		this.actorid = actorid;
		this.actorname = actorname;
		this.email = email;
		this.senddate = senddate;
		this.actdate = actdate;
		this.actresult = actresult;
		this.actcontent = actcontent;
		this.status = status;
		this.errormessage = errormessage;
		this.loggertype = loggertype;
		this.mailtype = mailtype;
	}

	// Property accessors

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getBillnumber() {
		return this.billnumber;
	}

	public void setBillnumber(String billnumber) {
		this.billnumber = billnumber;
	}

	public String getBillname() {
		return this.billname;
	}

	public void setBillname(String billname) {
		this.billname = billname;
	}

	public Long getTaskid() {
		return this.taskid;
	}

	public void setTaskid(Long taskid) {
		this.taskid = taskid;
	}

	public String getTaskname() {
		return this.taskname;
	}

	public void setTaskname(String taskname) {
		this.taskname = taskname;
	}

	public String getActivityname() {
		return this.activityname;
	}

	public void setActivityname(String activityname) {
		this.activityname = activityname;
	}

	public Long getActorid() {
		return this.actorid;
	}

	public void setActorid(Long actorid) {
		this.actorid = actorid;
	}

	public String getActorname() {
		return this.actorname;
	}

	public void setActorname(String actorname) {
		this.actorname = actorname;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Timestamp getSenddate() {
		return this.senddate;
	}

	public void setSenddate(Timestamp senddate) {
		this.senddate = senddate;
	}

	public Timestamp getActdate() {
		return this.actdate;
	}

	public void setActdate(Timestamp actdate) {
		this.actdate = actdate;
	}

	public String getActresult() {
		return this.actresult;
	}

	public void setActresult(String actresult) {
		this.actresult = actresult;
	}

	public String getActcontent() {
		return this.actcontent;
	}

	public void setActcontent(String actcontent) {
		this.actcontent = actcontent;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getErrormessage() {
		return this.errormessage;
	}

	public void setErrormessage(String errormessage) {
		this.errormessage = errormessage;
	}

	public Boolean getLoggertype() {
		return this.loggertype;
	}

	public void setLoggertype(Boolean loggertype) {
		this.loggertype = loggertype;
	}

	public Boolean getMailtype() {
		return this.mailtype;
	}

	public void setMailtype(Boolean mailtype) {
		this.mailtype = mailtype;
	}

}