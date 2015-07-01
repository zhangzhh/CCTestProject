package com.entity;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * TSysFlowProcess entity. @author MyEclipse Persistence Tools
 */

public class TSysFlowProcess implements java.io.Serializable {

	// Fields

	private Long id;
	private String processdefinitionid;
	private Long formid;
	private String processname;
	private String processtype;
	private BigDecimal processindex;
	private String sameasbillorg;
	private Boolean applyorgtype;
	private String applyorgresult;
	private Double monthoverspendscale1;
	private Double monthoverspendscale2;
	private Double monthoverspendscale3;
	private Double quarteroverspendscale1;
	private Double quarteroverspendscale2;
	private Double quarteroverspendscale3;
	private Double totaloverspendscale1;
	private Double totaloverspendscale2;
	private Double totaloverspendscale3;
	private Double annualoverspendscale1;
	private Double annualoverspendscale2;
	private Double annualoverspendscale3;
	private String controloverstandard;
	private String notrenderbudget;
	private Long createuser;
	private Timestamp createtime;
	private Long lastedituser;
	private Timestamp lastedittime;
	private Timestamp startusetime;
	private Timestamp endusetime;
	private String belongto;
	private String caninherit;
	private Long inheritfrom;
	private String budgetdeduct;
	private String status;
	private String processgraphdeployed;
	private String processgraphcontent;
	private String remark;
	private String rejectcauserequired;
	private String rejectfieldaccess;
	private String applyorgruledescription;
	private String processstrategy;
	private String overbudgetprocess;
	private String finishmailtorequisitionuser;
	private BigDecimal version;
	private String versionvalue;
	private String isnewversion;
	private String processeventname;
	private String applysubjectruledescription;
	private String applysubjectresult;
	private String usersubject;
	private Set TSysFlowNodeAttributes = new HashSet(0);

	// Constructors

	/** default constructor */
	public TSysFlowProcess() {
	}

	/** minimal constructor */
	public TSysFlowProcess(Long id, Long formid, String processname) {
		this.id = id;
		this.formid = formid;
		this.processname = processname;
	}

	/** full constructor */
	public TSysFlowProcess(Long id, String processdefinitionid, Long formid,
			String processname, String processtype, BigDecimal processindex,
			String sameasbillorg, Boolean applyorgtype, String applyorgresult,
			Double monthoverspendscale1, Double monthoverspendscale2,
			Double monthoverspendscale3, Double quarteroverspendscale1,
			Double quarteroverspendscale2, Double quarteroverspendscale3,
			Double totaloverspendscale1, Double totaloverspendscale2,
			Double totaloverspendscale3, Double annualoverspendscale1,
			Double annualoverspendscale2, Double annualoverspendscale3,
			String controloverstandard, String notrenderbudget,
			Long createuser, Timestamp createtime, Long lastedituser,
			Timestamp lastedittime, Timestamp startusetime,
			Timestamp endusetime, String belongto, String caninherit,
			Long inheritfrom, String budgetdeduct, String status,
			String processgraphdeployed, String processgraphcontent,
			String remark, String rejectcauserequired,
			String rejectfieldaccess, String applyorgruledescription,
			String processstrategy, String overbudgetprocess,
			String finishmailtorequisitionuser, BigDecimal version,
			String versionvalue, String isnewversion, String processeventname,
			String applysubjectruledescription, String applysubjectresult,
			String usersubject, Set TSysFlowNodeAttributes) {
		this.id = id;
		this.processdefinitionid = processdefinitionid;
		this.formid = formid;
		this.processname = processname;
		this.processtype = processtype;
		this.processindex = processindex;
		this.sameasbillorg = sameasbillorg;
		this.applyorgtype = applyorgtype;
		this.applyorgresult = applyorgresult;
		this.monthoverspendscale1 = monthoverspendscale1;
		this.monthoverspendscale2 = monthoverspendscale2;
		this.monthoverspendscale3 = monthoverspendscale3;
		this.quarteroverspendscale1 = quarteroverspendscale1;
		this.quarteroverspendscale2 = quarteroverspendscale2;
		this.quarteroverspendscale3 = quarteroverspendscale3;
		this.totaloverspendscale1 = totaloverspendscale1;
		this.totaloverspendscale2 = totaloverspendscale2;
		this.totaloverspendscale3 = totaloverspendscale3;
		this.annualoverspendscale1 = annualoverspendscale1;
		this.annualoverspendscale2 = annualoverspendscale2;
		this.annualoverspendscale3 = annualoverspendscale3;
		this.controloverstandard = controloverstandard;
		this.notrenderbudget = notrenderbudget;
		this.createuser = createuser;
		this.createtime = createtime;
		this.lastedituser = lastedituser;
		this.lastedittime = lastedittime;
		this.startusetime = startusetime;
		this.endusetime = endusetime;
		this.belongto = belongto;
		this.caninherit = caninherit;
		this.inheritfrom = inheritfrom;
		this.budgetdeduct = budgetdeduct;
		this.status = status;
		this.processgraphdeployed = processgraphdeployed;
		this.processgraphcontent = processgraphcontent;
		this.remark = remark;
		this.rejectcauserequired = rejectcauserequired;
		this.rejectfieldaccess = rejectfieldaccess;
		this.applyorgruledescription = applyorgruledescription;
		this.processstrategy = processstrategy;
		this.overbudgetprocess = overbudgetprocess;
		this.finishmailtorequisitionuser = finishmailtorequisitionuser;
		this.version = version;
		this.versionvalue = versionvalue;
		this.isnewversion = isnewversion;
		this.processeventname = processeventname;
		this.applysubjectruledescription = applysubjectruledescription;
		this.applysubjectresult = applysubjectresult;
		this.usersubject = usersubject;
		this.TSysFlowNodeAttributes = TSysFlowNodeAttributes;
	}

	// Property accessors

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getProcessdefinitionid() {
		return this.processdefinitionid;
	}

	public void setProcessdefinitionid(String processdefinitionid) {
		this.processdefinitionid = processdefinitionid;
	}

	public Long getFormid() {
		return this.formid;
	}

	public void setFormid(Long formid) {
		this.formid = formid;
	}

	public String getProcessname() {
		return this.processname;
	}

	public void setProcessname(String processname) {
		this.processname = processname;
	}

	public String getProcesstype() {
		return this.processtype;
	}

	public void setProcesstype(String processtype) {
		this.processtype = processtype;
	}

	public BigDecimal getProcessindex() {
		return this.processindex;
	}

	public void setProcessindex(BigDecimal processindex) {
		this.processindex = processindex;
	}

	public String getSameasbillorg() {
		return this.sameasbillorg;
	}

	public void setSameasbillorg(String sameasbillorg) {
		this.sameasbillorg = sameasbillorg;
	}

	public Boolean getApplyorgtype() {
		return this.applyorgtype;
	}

	public void setApplyorgtype(Boolean applyorgtype) {
		this.applyorgtype = applyorgtype;
	}

	public String getApplyorgresult() {
		return this.applyorgresult;
	}

	public void setApplyorgresult(String applyorgresult) {
		this.applyorgresult = applyorgresult;
	}

	public Double getMonthoverspendscale1() {
		return this.monthoverspendscale1;
	}

	public void setMonthoverspendscale1(Double monthoverspendscale1) {
		this.monthoverspendscale1 = monthoverspendscale1;
	}

	public Double getMonthoverspendscale2() {
		return this.monthoverspendscale2;
	}

	public void setMonthoverspendscale2(Double monthoverspendscale2) {
		this.monthoverspendscale2 = monthoverspendscale2;
	}

	public Double getMonthoverspendscale3() {
		return this.monthoverspendscale3;
	}

	public void setMonthoverspendscale3(Double monthoverspendscale3) {
		this.monthoverspendscale3 = monthoverspendscale3;
	}

	public Double getQuarteroverspendscale1() {
		return this.quarteroverspendscale1;
	}

	public void setQuarteroverspendscale1(Double quarteroverspendscale1) {
		this.quarteroverspendscale1 = quarteroverspendscale1;
	}

	public Double getQuarteroverspendscale2() {
		return this.quarteroverspendscale2;
	}

	public void setQuarteroverspendscale2(Double quarteroverspendscale2) {
		this.quarteroverspendscale2 = quarteroverspendscale2;
	}

	public Double getQuarteroverspendscale3() {
		return this.quarteroverspendscale3;
	}

	public void setQuarteroverspendscale3(Double quarteroverspendscale3) {
		this.quarteroverspendscale3 = quarteroverspendscale3;
	}

	public Double getTotaloverspendscale1() {
		return this.totaloverspendscale1;
	}

	public void setTotaloverspendscale1(Double totaloverspendscale1) {
		this.totaloverspendscale1 = totaloverspendscale1;
	}

	public Double getTotaloverspendscale2() {
		return this.totaloverspendscale2;
	}

	public void setTotaloverspendscale2(Double totaloverspendscale2) {
		this.totaloverspendscale2 = totaloverspendscale2;
	}

	public Double getTotaloverspendscale3() {
		return this.totaloverspendscale3;
	}

	public void setTotaloverspendscale3(Double totaloverspendscale3) {
		this.totaloverspendscale3 = totaloverspendscale3;
	}

	public Double getAnnualoverspendscale1() {
		return this.annualoverspendscale1;
	}

	public void setAnnualoverspendscale1(Double annualoverspendscale1) {
		this.annualoverspendscale1 = annualoverspendscale1;
	}

	public Double getAnnualoverspendscale2() {
		return this.annualoverspendscale2;
	}

	public void setAnnualoverspendscale2(Double annualoverspendscale2) {
		this.annualoverspendscale2 = annualoverspendscale2;
	}

	public Double getAnnualoverspendscale3() {
		return this.annualoverspendscale3;
	}

	public void setAnnualoverspendscale3(Double annualoverspendscale3) {
		this.annualoverspendscale3 = annualoverspendscale3;
	}

	public String getControloverstandard() {
		return this.controloverstandard;
	}

	public void setControloverstandard(String controloverstandard) {
		this.controloverstandard = controloverstandard;
	}

	public String getNotrenderbudget() {
		return this.notrenderbudget;
	}

	public void setNotrenderbudget(String notrenderbudget) {
		this.notrenderbudget = notrenderbudget;
	}

	public Long getCreateuser() {
		return this.createuser;
	}

	public void setCreateuser(Long createuser) {
		this.createuser = createuser;
	}

	public Timestamp getCreatetime() {
		return this.createtime;
	}

	public void setCreatetime(Timestamp createtime) {
		this.createtime = createtime;
	}

	public Long getLastedituser() {
		return this.lastedituser;
	}

	public void setLastedituser(Long lastedituser) {
		this.lastedituser = lastedituser;
	}

	public Timestamp getLastedittime() {
		return this.lastedittime;
	}

	public void setLastedittime(Timestamp lastedittime) {
		this.lastedittime = lastedittime;
	}

	public Timestamp getStartusetime() {
		return this.startusetime;
	}

	public void setStartusetime(Timestamp startusetime) {
		this.startusetime = startusetime;
	}

	public Timestamp getEndusetime() {
		return this.endusetime;
	}

	public void setEndusetime(Timestamp endusetime) {
		this.endusetime = endusetime;
	}

	public String getBelongto() {
		return this.belongto;
	}

	public void setBelongto(String belongto) {
		this.belongto = belongto;
	}

	public String getCaninherit() {
		return this.caninherit;
	}

	public void setCaninherit(String caninherit) {
		this.caninherit = caninherit;
	}

	public Long getInheritfrom() {
		return this.inheritfrom;
	}

	public void setInheritfrom(Long inheritfrom) {
		this.inheritfrom = inheritfrom;
	}

	public String getBudgetdeduct() {
		return this.budgetdeduct;
	}

	public void setBudgetdeduct(String budgetdeduct) {
		this.budgetdeduct = budgetdeduct;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getProcessgraphdeployed() {
		return this.processgraphdeployed;
	}

	public void setProcessgraphdeployed(String processgraphdeployed) {
		this.processgraphdeployed = processgraphdeployed;
	}

	public String getProcessgraphcontent() {
		return this.processgraphcontent;
	}

	public void setProcessgraphcontent(String processgraphcontent) {
		this.processgraphcontent = processgraphcontent;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getRejectcauserequired() {
		return this.rejectcauserequired;
	}

	public void setRejectcauserequired(String rejectcauserequired) {
		this.rejectcauserequired = rejectcauserequired;
	}

	public String getRejectfieldaccess() {
		return this.rejectfieldaccess;
	}

	public void setRejectfieldaccess(String rejectfieldaccess) {
		this.rejectfieldaccess = rejectfieldaccess;
	}

	public String getApplyorgruledescription() {
		return this.applyorgruledescription;
	}

	public void setApplyorgruledescription(String applyorgruledescription) {
		this.applyorgruledescription = applyorgruledescription;
	}

	public String getProcessstrategy() {
		return this.processstrategy;
	}

	public void setProcessstrategy(String processstrategy) {
		this.processstrategy = processstrategy;
	}

	public String getOverbudgetprocess() {
		return this.overbudgetprocess;
	}

	public void setOverbudgetprocess(String overbudgetprocess) {
		this.overbudgetprocess = overbudgetprocess;
	}

	public String getFinishmailtorequisitionuser() {
		return this.finishmailtorequisitionuser;
	}

	public void setFinishmailtorequisitionuser(
			String finishmailtorequisitionuser) {
		this.finishmailtorequisitionuser = finishmailtorequisitionuser;
	}

	public BigDecimal getVersion() {
		return this.version;
	}

	public void setVersion(BigDecimal version) {
		this.version = version;
	}

	public String getVersionvalue() {
		return this.versionvalue;
	}

	public void setVersionvalue(String versionvalue) {
		this.versionvalue = versionvalue;
	}

	public String getIsnewversion() {
		return this.isnewversion;
	}

	public void setIsnewversion(String isnewversion) {
		this.isnewversion = isnewversion;
	}

	public String getProcesseventname() {
		return this.processeventname;
	}

	public void setProcesseventname(String processeventname) {
		this.processeventname = processeventname;
	}

	public String getApplysubjectruledescription() {
		return this.applysubjectruledescription;
	}

	public void setApplysubjectruledescription(
			String applysubjectruledescription) {
		this.applysubjectruledescription = applysubjectruledescription;
	}

	public String getApplysubjectresult() {
		return this.applysubjectresult;
	}

	public void setApplysubjectresult(String applysubjectresult) {
		this.applysubjectresult = applysubjectresult;
	}

	public String getUsersubject() {
		return this.usersubject;
	}

	public void setUsersubject(String usersubject) {
		this.usersubject = usersubject;
	}

	public Set getTSysFlowNodeAttributes() {
		return this.TSysFlowNodeAttributes;
	}

	public void setTSysFlowNodeAttributes(Set TSysFlowNodeAttributes) {
		this.TSysFlowNodeAttributes = TSysFlowNodeAttributes;
	}

}