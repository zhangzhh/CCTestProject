package com.entity;

import java.sql.Timestamp;

/**
 * TSysFlowSharecentertask entity. @author MyEclipse Persistence Tools
 */

public class TSysFlowSharecentertask implements java.io.Serializable {

	// Fields

	private Long id;
	private Long taskid;
	private Long actorid;
	private String actorname;
	private Timestamp holdingtime;
	private Timestamp freetime;
	private String tasktype;
	private String sharestatus;
	private Timestamp createtime;
	private Long actorpostid;
	private String actorpostname;
	private String thesingle;
	private String sendsingle;
	private Timestamp handletime;

	// Constructors

	/** default constructor */
	public TSysFlowSharecentertask() {
	}

	/** minimal constructor */
	public TSysFlowSharecentertask(Long id) {
		this.id = id;
	}

	/** full constructor */
	public TSysFlowSharecentertask(Long id, Long taskid, Long actorid,
			String actorname, Timestamp holdingtime, Timestamp freetime,
			String tasktype, String sharestatus, Timestamp createtime,
			Long actorpostid, String actorpostname, String thesingle,
			String sendsingle, Timestamp handletime) {
		this.id = id;
		this.taskid = taskid;
		this.actorid = actorid;
		this.actorname = actorname;
		this.holdingtime = holdingtime;
		this.freetime = freetime;
		this.tasktype = tasktype;
		this.sharestatus = sharestatus;
		this.createtime = createtime;
		this.actorpostid = actorpostid;
		this.actorpostname = actorpostname;
		this.thesingle = thesingle;
		this.sendsingle = sendsingle;
		this.handletime = handletime;
	}

	// Property accessors

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getTaskid() {
		return this.taskid;
	}

	public void setTaskid(Long taskid) {
		this.taskid = taskid;
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

	public Timestamp getHoldingtime() {
		return this.holdingtime;
	}

	public void setHoldingtime(Timestamp holdingtime) {
		this.holdingtime = holdingtime;
	}

	public Timestamp getFreetime() {
		return this.freetime;
	}

	public void setFreetime(Timestamp freetime) {
		this.freetime = freetime;
	}

	public String getTasktype() {
		return this.tasktype;
	}

	public void setTasktype(String tasktype) {
		this.tasktype = tasktype;
	}

	public String getSharestatus() {
		return this.sharestatus;
	}

	public void setSharestatus(String sharestatus) {
		this.sharestatus = sharestatus;
	}

	public Timestamp getCreatetime() {
		return this.createtime;
	}

	public void setCreatetime(Timestamp createtime) {
		this.createtime = createtime;
	}

	public Long getActorpostid() {
		return this.actorpostid;
	}

	public void setActorpostid(Long actorpostid) {
		this.actorpostid = actorpostid;
	}

	public String getActorpostname() {
		return this.actorpostname;
	}

	public void setActorpostname(String actorpostname) {
		this.actorpostname = actorpostname;
	}

	public String getThesingle() {
		return this.thesingle;
	}

	public void setThesingle(String thesingle) {
		this.thesingle = thesingle;
	}

	public String getSendsingle() {
		return this.sendsingle;
	}

	public void setSendsingle(String sendsingle) {
		this.sendsingle = sendsingle;
	}

	public Timestamp getHandletime() {
		return this.handletime;
	}

	public void setHandletime(Timestamp handletime) {
		this.handletime = handletime;
	}

}