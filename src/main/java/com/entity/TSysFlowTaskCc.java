package com.entity;

import java.sql.Timestamp;

/**
 * TSysFlowTaskCc entity. @author MyEclipse Persistence Tools
 */

public class TSysFlowTaskCc implements java.io.Serializable {

	// Fields

	private Long id;
	private Long taskid;
	private String tasktitle;
	private String tasklink;
	private String rejectdirectinfo;
	private String tasktype;
	private String taskstatus;
	private Timestamp taskcreatetime;
	private Timestamp taskfinishtime;
	private Timestamp copytime;
	private Long actorid;
	private String actorname;
	private Long actordeptid;
	private String actordeptname;
	private Long actorpostid;
	private String actorpostname;
	private String opinioncause;
	private String opinionresult;
	private String activityname;
	private String processdefinitionname;
	private String processdefinitionid;
	private String processinstanceid;
	private Timestamp processcreatetime;
	private Long processinitiatorid;
	private String processinitiatorname;
	private Long fromtaskid;
	private String fromactivityname;
	private Long fromactorid;
	private String fromactorname;
	private Long boid;
	private String bono;
	private String boname;
	private String botype;
	private String bofield1;
	private String bofield2;
	private String bofield3;
	private String bofield4;
	private String bofield5;
	private String bofield6;
	private String bofield7;
	private String bofield8;
	private String bofield9;
	private String bofield10;
	private String bofield11;
	private String bofield12;
	private String bofield13;
	private String bofield14;
	private String bofield15;
	private String remark;
	private String executemodecount;
	private Long agentactorid;
	private String agentactorname;

	// Constructors

	/** default constructor */
	public TSysFlowTaskCc() {
	}

	/** minimal constructor */
	public TSysFlowTaskCc(Long id) {
		this.id = id;
	}

	/** full constructor */
	public TSysFlowTaskCc(Long id, Long taskid, String tasktitle,
			String tasklink, String rejectdirectinfo, String tasktype,
			String taskstatus, Timestamp taskcreatetime,
			Timestamp taskfinishtime, Timestamp copytime, Long actorid,
			String actorname, Long actordeptid, String actordeptname,
			Long actorpostid, String actorpostname, String opinioncause,
			String opinionresult, String activityname,
			String processdefinitionname, String processdefinitionid,
			String processinstanceid, Timestamp processcreatetime,
			Long processinitiatorid, String processinitiatorname,
			Long fromtaskid, String fromactivityname, Long fromactorid,
			String fromactorname, Long boid, String bono, String boname,
			String botype, String bofield1, String bofield2, String bofield3,
			String bofield4, String bofield5, String bofield6, String bofield7,
			String bofield8, String bofield9, String bofield10,
			String bofield11, String bofield12, String bofield13,
			String bofield14, String bofield15, String remark,
			String executemodecount, Long agentactorid, String agentactorname) {
		this.id = id;
		this.taskid = taskid;
		this.tasktitle = tasktitle;
		this.tasklink = tasklink;
		this.rejectdirectinfo = rejectdirectinfo;
		this.tasktype = tasktype;
		this.taskstatus = taskstatus;
		this.taskcreatetime = taskcreatetime;
		this.taskfinishtime = taskfinishtime;
		this.copytime = copytime;
		this.actorid = actorid;
		this.actorname = actorname;
		this.actordeptid = actordeptid;
		this.actordeptname = actordeptname;
		this.actorpostid = actorpostid;
		this.actorpostname = actorpostname;
		this.opinioncause = opinioncause;
		this.opinionresult = opinionresult;
		this.activityname = activityname;
		this.processdefinitionname = processdefinitionname;
		this.processdefinitionid = processdefinitionid;
		this.processinstanceid = processinstanceid;
		this.processcreatetime = processcreatetime;
		this.processinitiatorid = processinitiatorid;
		this.processinitiatorname = processinitiatorname;
		this.fromtaskid = fromtaskid;
		this.fromactivityname = fromactivityname;
		this.fromactorid = fromactorid;
		this.fromactorname = fromactorname;
		this.boid = boid;
		this.bono = bono;
		this.boname = boname;
		this.botype = botype;
		this.bofield1 = bofield1;
		this.bofield2 = bofield2;
		this.bofield3 = bofield3;
		this.bofield4 = bofield4;
		this.bofield5 = bofield5;
		this.bofield6 = bofield6;
		this.bofield7 = bofield7;
		this.bofield8 = bofield8;
		this.bofield9 = bofield9;
		this.bofield10 = bofield10;
		this.bofield11 = bofield11;
		this.bofield12 = bofield12;
		this.bofield13 = bofield13;
		this.bofield14 = bofield14;
		this.bofield15 = bofield15;
		this.remark = remark;
		this.executemodecount = executemodecount;
		this.agentactorid = agentactorid;
		this.agentactorname = agentactorname;
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

	public String getTasktitle() {
		return this.tasktitle;
	}

	public void setTasktitle(String tasktitle) {
		this.tasktitle = tasktitle;
	}

	public String getTasklink() {
		return this.tasklink;
	}

	public void setTasklink(String tasklink) {
		this.tasklink = tasklink;
	}

	public String getRejectdirectinfo() {
		return this.rejectdirectinfo;
	}

	public void setRejectdirectinfo(String rejectdirectinfo) {
		this.rejectdirectinfo = rejectdirectinfo;
	}

	public String getTasktype() {
		return this.tasktype;
	}

	public void setTasktype(String tasktype) {
		this.tasktype = tasktype;
	}

	public String getTaskstatus() {
		return this.taskstatus;
	}

	public void setTaskstatus(String taskstatus) {
		this.taskstatus = taskstatus;
	}

	public Timestamp getTaskcreatetime() {
		return this.taskcreatetime;
	}

	public void setTaskcreatetime(Timestamp taskcreatetime) {
		this.taskcreatetime = taskcreatetime;
	}

	public Timestamp getTaskfinishtime() {
		return this.taskfinishtime;
	}

	public void setTaskfinishtime(Timestamp taskfinishtime) {
		this.taskfinishtime = taskfinishtime;
	}

	public Timestamp getCopytime() {
		return this.copytime;
	}

	public void setCopytime(Timestamp copytime) {
		this.copytime = copytime;
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

	public Long getActordeptid() {
		return this.actordeptid;
	}

	public void setActordeptid(Long actordeptid) {
		this.actordeptid = actordeptid;
	}

	public String getActordeptname() {
		return this.actordeptname;
	}

	public void setActordeptname(String actordeptname) {
		this.actordeptname = actordeptname;
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

	public String getOpinioncause() {
		return this.opinioncause;
	}

	public void setOpinioncause(String opinioncause) {
		this.opinioncause = opinioncause;
	}

	public String getOpinionresult() {
		return this.opinionresult;
	}

	public void setOpinionresult(String opinionresult) {
		this.opinionresult = opinionresult;
	}

	public String getActivityname() {
		return this.activityname;
	}

	public void setActivityname(String activityname) {
		this.activityname = activityname;
	}

	public String getProcessdefinitionname() {
		return this.processdefinitionname;
	}

	public void setProcessdefinitionname(String processdefinitionname) {
		this.processdefinitionname = processdefinitionname;
	}

	public String getProcessdefinitionid() {
		return this.processdefinitionid;
	}

	public void setProcessdefinitionid(String processdefinitionid) {
		this.processdefinitionid = processdefinitionid;
	}

	public String getProcessinstanceid() {
		return this.processinstanceid;
	}

	public void setProcessinstanceid(String processinstanceid) {
		this.processinstanceid = processinstanceid;
	}

	public Timestamp getProcesscreatetime() {
		return this.processcreatetime;
	}

	public void setProcesscreatetime(Timestamp processcreatetime) {
		this.processcreatetime = processcreatetime;
	}

	public Long getProcessinitiatorid() {
		return this.processinitiatorid;
	}

	public void setProcessinitiatorid(Long processinitiatorid) {
		this.processinitiatorid = processinitiatorid;
	}

	public String getProcessinitiatorname() {
		return this.processinitiatorname;
	}

	public void setProcessinitiatorname(String processinitiatorname) {
		this.processinitiatorname = processinitiatorname;
	}

	public Long getFromtaskid() {
		return this.fromtaskid;
	}

	public void setFromtaskid(Long fromtaskid) {
		this.fromtaskid = fromtaskid;
	}

	public String getFromactivityname() {
		return this.fromactivityname;
	}

	public void setFromactivityname(String fromactivityname) {
		this.fromactivityname = fromactivityname;
	}

	public Long getFromactorid() {
		return this.fromactorid;
	}

	public void setFromactorid(Long fromactorid) {
		this.fromactorid = fromactorid;
	}

	public String getFromactorname() {
		return this.fromactorname;
	}

	public void setFromactorname(String fromactorname) {
		this.fromactorname = fromactorname;
	}

	public Long getBoid() {
		return this.boid;
	}

	public void setBoid(Long boid) {
		this.boid = boid;
	}

	public String getBono() {
		return this.bono;
	}

	public void setBono(String bono) {
		this.bono = bono;
	}

	public String getBoname() {
		return this.boname;
	}

	public void setBoname(String boname) {
		this.boname = boname;
	}

	public String getBotype() {
		return this.botype;
	}

	public void setBotype(String botype) {
		this.botype = botype;
	}

	public String getBofield1() {
		return this.bofield1;
	}

	public void setBofield1(String bofield1) {
		this.bofield1 = bofield1;
	}

	public String getBofield2() {
		return this.bofield2;
	}

	public void setBofield2(String bofield2) {
		this.bofield2 = bofield2;
	}

	public String getBofield3() {
		return this.bofield3;
	}

	public void setBofield3(String bofield3) {
		this.bofield3 = bofield3;
	}

	public String getBofield4() {
		return this.bofield4;
	}

	public void setBofield4(String bofield4) {
		this.bofield4 = bofield4;
	}

	public String getBofield5() {
		return this.bofield5;
	}

	public void setBofield5(String bofield5) {
		this.bofield5 = bofield5;
	}

	public String getBofield6() {
		return this.bofield6;
	}

	public void setBofield6(String bofield6) {
		this.bofield6 = bofield6;
	}

	public String getBofield7() {
		return this.bofield7;
	}

	public void setBofield7(String bofield7) {
		this.bofield7 = bofield7;
	}

	public String getBofield8() {
		return this.bofield8;
	}

	public void setBofield8(String bofield8) {
		this.bofield8 = bofield8;
	}

	public String getBofield9() {
		return this.bofield9;
	}

	public void setBofield9(String bofield9) {
		this.bofield9 = bofield9;
	}

	public String getBofield10() {
		return this.bofield10;
	}

	public void setBofield10(String bofield10) {
		this.bofield10 = bofield10;
	}

	public String getBofield11() {
		return this.bofield11;
	}

	public void setBofield11(String bofield11) {
		this.bofield11 = bofield11;
	}

	public String getBofield12() {
		return this.bofield12;
	}

	public void setBofield12(String bofield12) {
		this.bofield12 = bofield12;
	}

	public String getBofield13() {
		return this.bofield13;
	}

	public void setBofield13(String bofield13) {
		this.bofield13 = bofield13;
	}

	public String getBofield14() {
		return this.bofield14;
	}

	public void setBofield14(String bofield14) {
		this.bofield14 = bofield14;
	}

	public String getBofield15() {
		return this.bofield15;
	}

	public void setBofield15(String bofield15) {
		this.bofield15 = bofield15;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getExecutemodecount() {
		return this.executemodecount;
	}

	public void setExecutemodecount(String executemodecount) {
		this.executemodecount = executemodecount;
	}

	public Long getAgentactorid() {
		return this.agentactorid;
	}

	public void setAgentactorid(Long agentactorid) {
		this.agentactorid = agentactorid;
	}

	public String getAgentactorname() {
		return this.agentactorname;
	}

	public void setAgentactorname(String agentactorname) {
		this.agentactorname = agentactorname;
	}

}