package com.entity;

/**
 * TSysFlowNodeAttribute entity. @author MyEclipse Persistence Tools
 */

public class TSysFlowNodeAttribute implements java.io.Serializable {

	// Fields

	private Long id;
	private TSysFlowProcess TSysFlowProcess;
	private String processdefinitionid;
	private String name;
	private String type;
	private String attributename;
	private String attributevalue;

	// Constructors

	/** default constructor */
	public TSysFlowNodeAttribute() {
	}

	/** minimal constructor */
	public TSysFlowNodeAttribute(Long id, TSysFlowProcess TSysFlowProcess,
			String name, String type) {
		this.id = id;
		this.TSysFlowProcess = TSysFlowProcess;
		this.name = name;
		this.type = type;
	}

	/** full constructor */
	public TSysFlowNodeAttribute(Long id, TSysFlowProcess TSysFlowProcess,
			String processdefinitionid, String name, String type,
			String attributename, String attributevalue) {
		this.id = id;
		this.TSysFlowProcess = TSysFlowProcess;
		this.processdefinitionid = processdefinitionid;
		this.name = name;
		this.type = type;
		this.attributename = attributename;
		this.attributevalue = attributevalue;
	}

	// Property accessors

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public TSysFlowProcess getTSysFlowProcess() {
		return this.TSysFlowProcess;
	}

	public void setTSysFlowProcess(TSysFlowProcess TSysFlowProcess) {
		this.TSysFlowProcess = TSysFlowProcess;
	}

	public String getProcessdefinitionid() {
		return this.processdefinitionid;
	}

	public void setProcessdefinitionid(String processdefinitionid) {
		this.processdefinitionid = processdefinitionid;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getAttributename() {
		return this.attributename;
	}

	public void setAttributename(String attributename) {
		this.attributename = attributename;
	}

	public String getAttributevalue() {
		return this.attributevalue;
	}

	public void setAttributevalue(String attributevalue) {
		this.attributevalue = attributevalue;
	}

}