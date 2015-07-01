package com.entity;

import java.math.BigDecimal;

/**
 * TSysFlowActivityId entity. @author MyEclipse Persistence Tools
 */

public class TSysFlowActivityId implements java.io.Serializable {

	// Fields

	private Long id;
	private String processdefinitionid;
	private Long processattributeid;
	private String name;
	private BigDecimal type;
	private BigDecimal budgettype;
	private Double limitamount;
	private BigDecimal permitemailprocess;
	private String showbudgetdata;
	private String personalloananalysis;
	private String showuseraccount;
	private String procedurename;
	private String procedureorder;
	private String pathname;
	private String functionname;
	private String actorrule;
	private String fieldrule;
	private String remark;

	// Constructors

	/** default constructor */
	public TSysFlowActivityId() {
	}

	/** minimal constructor */
	public TSysFlowActivityId(Long id, Long processattributeid, String name) {
		this.id = id;
		this.processattributeid = processattributeid;
		this.name = name;
	}

	/** full constructor */
	public TSysFlowActivityId(Long id, String processdefinitionid,
			Long processattributeid, String name, BigDecimal type,
			BigDecimal budgettype, Double limitamount,
			BigDecimal permitemailprocess, String showbudgetdata,
			String personalloananalysis, String showuseraccount,
			String procedurename, String procedureorder, String pathname,
			String functionname, String actorrule, String fieldrule,
			String remark) {
		this.id = id;
		this.processdefinitionid = processdefinitionid;
		this.processattributeid = processattributeid;
		this.name = name;
		this.type = type;
		this.budgettype = budgettype;
		this.limitamount = limitamount;
		this.permitemailprocess = permitemailprocess;
		this.showbudgetdata = showbudgetdata;
		this.personalloananalysis = personalloananalysis;
		this.showuseraccount = showuseraccount;
		this.procedurename = procedurename;
		this.procedureorder = procedureorder;
		this.pathname = pathname;
		this.functionname = functionname;
		this.actorrule = actorrule;
		this.fieldrule = fieldrule;
		this.remark = remark;
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

	public Long getProcessattributeid() {
		return this.processattributeid;
	}

	public void setProcessattributeid(Long processattributeid) {
		this.processattributeid = processattributeid;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getType() {
		return this.type;
	}

	public void setType(BigDecimal type) {
		this.type = type;
	}

	public BigDecimal getBudgettype() {
		return this.budgettype;
	}

	public void setBudgettype(BigDecimal budgettype) {
		this.budgettype = budgettype;
	}

	public Double getLimitamount() {
		return this.limitamount;
	}

	public void setLimitamount(Double limitamount) {
		this.limitamount = limitamount;
	}

	public BigDecimal getPermitemailprocess() {
		return this.permitemailprocess;
	}

	public void setPermitemailprocess(BigDecimal permitemailprocess) {
		this.permitemailprocess = permitemailprocess;
	}

	public String getShowbudgetdata() {
		return this.showbudgetdata;
	}

	public void setShowbudgetdata(String showbudgetdata) {
		this.showbudgetdata = showbudgetdata;
	}

	public String getPersonalloananalysis() {
		return this.personalloananalysis;
	}

	public void setPersonalloananalysis(String personalloananalysis) {
		this.personalloananalysis = personalloananalysis;
	}

	public String getShowuseraccount() {
		return this.showuseraccount;
	}

	public void setShowuseraccount(String showuseraccount) {
		this.showuseraccount = showuseraccount;
	}

	public String getProcedurename() {
		return this.procedurename;
	}

	public void setProcedurename(String procedurename) {
		this.procedurename = procedurename;
	}

	public String getProcedureorder() {
		return this.procedureorder;
	}

	public void setProcedureorder(String procedureorder) {
		this.procedureorder = procedureorder;
	}

	public String getPathname() {
		return this.pathname;
	}

	public void setPathname(String pathname) {
		this.pathname = pathname;
	}

	public String getFunctionname() {
		return this.functionname;
	}

	public void setFunctionname(String functionname) {
		this.functionname = functionname;
	}

	public String getActorrule() {
		return this.actorrule;
	}

	public void setActorrule(String actorrule) {
		this.actorrule = actorrule;
	}

	public String getFieldrule() {
		return this.fieldrule;
	}

	public void setFieldrule(String fieldrule) {
		this.fieldrule = fieldrule;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TSysFlowActivityId))
			return false;
		TSysFlowActivityId castOther = (TSysFlowActivityId) other;

		return ((this.getId() == castOther.getId()) || (this.getId() != null
				&& castOther.getId() != null && this.getId().equals(
				castOther.getId())))
				&& ((this.getProcessdefinitionid() == castOther
						.getProcessdefinitionid()) || (this
						.getProcessdefinitionid() != null
						&& castOther.getProcessdefinitionid() != null && this
						.getProcessdefinitionid().equals(
								castOther.getProcessdefinitionid())))
				&& ((this.getProcessattributeid() == castOther
						.getProcessattributeid()) || (this
						.getProcessattributeid() != null
						&& castOther.getProcessattributeid() != null && this
						.getProcessattributeid().equals(
								castOther.getProcessattributeid())))
				&& ((this.getName() == castOther.getName()) || (this.getName() != null
						&& castOther.getName() != null && this.getName()
						.equals(castOther.getName())))
				&& ((this.getType() == castOther.getType()) || (this.getType() != null
						&& castOther.getType() != null && this.getType()
						.equals(castOther.getType())))
				&& ((this.getBudgettype() == castOther.getBudgettype()) || (this
						.getBudgettype() != null
						&& castOther.getBudgettype() != null && this
						.getBudgettype().equals(castOther.getBudgettype())))
				&& ((this.getLimitamount() == castOther.getLimitamount()) || (this
						.getLimitamount() != null
						&& castOther.getLimitamount() != null && this
						.getLimitamount().equals(castOther.getLimitamount())))
				&& ((this.getPermitemailprocess() == castOther
						.getPermitemailprocess()) || (this
						.getPermitemailprocess() != null
						&& castOther.getPermitemailprocess() != null && this
						.getPermitemailprocess().equals(
								castOther.getPermitemailprocess())))
				&& ((this.getShowbudgetdata() == castOther.getShowbudgetdata()) || (this
						.getShowbudgetdata() != null
						&& castOther.getShowbudgetdata() != null && this
						.getShowbudgetdata().equals(
								castOther.getShowbudgetdata())))
				&& ((this.getPersonalloananalysis() == castOther
						.getPersonalloananalysis()) || (this
						.getPersonalloananalysis() != null
						&& castOther.getPersonalloananalysis() != null && this
						.getPersonalloananalysis().equals(
								castOther.getPersonalloananalysis())))
				&& ((this.getShowuseraccount() == castOther
						.getShowuseraccount()) || (this.getShowuseraccount() != null
						&& castOther.getShowuseraccount() != null && this
						.getShowuseraccount().equals(
								castOther.getShowuseraccount())))
				&& ((this.getProcedurename() == castOther.getProcedurename()) || (this
						.getProcedurename() != null
						&& castOther.getProcedurename() != null && this
						.getProcedurename()
						.equals(castOther.getProcedurename())))
				&& ((this.getProcedureorder() == castOther.getProcedureorder()) || (this
						.getProcedureorder() != null
						&& castOther.getProcedureorder() != null && this
						.getProcedureorder().equals(
								castOther.getProcedureorder())))
				&& ((this.getPathname() == castOther.getPathname()) || (this
						.getPathname() != null
						&& castOther.getPathname() != null && this
						.getPathname().equals(castOther.getPathname())))
				&& ((this.getFunctionname() == castOther.getFunctionname()) || (this
						.getFunctionname() != null
						&& castOther.getFunctionname() != null && this
						.getFunctionname().equals(castOther.getFunctionname())))
				&& ((this.getActorrule() == castOther.getActorrule()) || (this
						.getActorrule() != null
						&& castOther.getActorrule() != null && this
						.getActorrule().equals(castOther.getActorrule())))
				&& ((this.getFieldrule() == castOther.getFieldrule()) || (this
						.getFieldrule() != null
						&& castOther.getFieldrule() != null && this
						.getFieldrule().equals(castOther.getFieldrule())))
				&& ((this.getRemark() == castOther.getRemark()) || (this
						.getRemark() != null && castOther.getRemark() != null && this
						.getRemark().equals(castOther.getRemark())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getId() == null ? 0 : this.getId().hashCode());
		result = 37
				* result
				+ (getProcessdefinitionid() == null ? 0 : this
						.getProcessdefinitionid().hashCode());
		result = 37
				* result
				+ (getProcessattributeid() == null ? 0 : this
						.getProcessattributeid().hashCode());
		result = 37 * result
				+ (getName() == null ? 0 : this.getName().hashCode());
		result = 37 * result
				+ (getType() == null ? 0 : this.getType().hashCode());
		result = 37
				* result
				+ (getBudgettype() == null ? 0 : this.getBudgettype()
						.hashCode());
		result = 37
				* result
				+ (getLimitamount() == null ? 0 : this.getLimitamount()
						.hashCode());
		result = 37
				* result
				+ (getPermitemailprocess() == null ? 0 : this
						.getPermitemailprocess().hashCode());
		result = 37
				* result
				+ (getShowbudgetdata() == null ? 0 : this.getShowbudgetdata()
						.hashCode());
		result = 37
				* result
				+ (getPersonalloananalysis() == null ? 0 : this
						.getPersonalloananalysis().hashCode());
		result = 37
				* result
				+ (getShowuseraccount() == null ? 0 : this.getShowuseraccount()
						.hashCode());
		result = 37
				* result
				+ (getProcedurename() == null ? 0 : this.getProcedurename()
						.hashCode());
		result = 37
				* result
				+ (getProcedureorder() == null ? 0 : this.getProcedureorder()
						.hashCode());
		result = 37 * result
				+ (getPathname() == null ? 0 : this.getPathname().hashCode());
		result = 37
				* result
				+ (getFunctionname() == null ? 0 : this.getFunctionname()
						.hashCode());
		result = 37 * result
				+ (getActorrule() == null ? 0 : this.getActorrule().hashCode());
		result = 37 * result
				+ (getFieldrule() == null ? 0 : this.getFieldrule().hashCode());
		result = 37 * result
				+ (getRemark() == null ? 0 : this.getRemark().hashCode());
		return result;
	}

}