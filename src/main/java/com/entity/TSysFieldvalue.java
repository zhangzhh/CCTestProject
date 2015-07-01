package com.entity;

/**
 * TSysFieldvalue entity. @author MyEclipse Persistence Tools
 */

public class TSysFieldvalue implements java.io.Serializable {

	// Fields

	private Long fieldvalueid;
	private String fieldvalue;
	private String fieldname;
	private String relationtable;
	private String relationfield;
	private String viewfield;
	private Boolean fieldtype;
	private String fielddatatype;

	// Constructors

	/** default constructor */
	public TSysFieldvalue() {
	}

	/** minimal constructor */
	public TSysFieldvalue(Long fieldvalueid) {
		this.fieldvalueid = fieldvalueid;
	}

	/** full constructor */
	public TSysFieldvalue(Long fieldvalueid, String fieldvalue,
			String fieldname, String relationtable, String relationfield,
			String viewfield, Boolean fieldtype, String fielddatatype) {
		this.fieldvalueid = fieldvalueid;
		this.fieldvalue = fieldvalue;
		this.fieldname = fieldname;
		this.relationtable = relationtable;
		this.relationfield = relationfield;
		this.viewfield = viewfield;
		this.fieldtype = fieldtype;
		this.fielddatatype = fielddatatype;
	}

	// Property accessors

	public Long getFieldvalueid() {
		return this.fieldvalueid;
	}

	public void setFieldvalueid(Long fieldvalueid) {
		this.fieldvalueid = fieldvalueid;
	}

	public String getFieldvalue() {
		return this.fieldvalue;
	}

	public void setFieldvalue(String fieldvalue) {
		this.fieldvalue = fieldvalue;
	}

	public String getFieldname() {
		return this.fieldname;
	}

	public void setFieldname(String fieldname) {
		this.fieldname = fieldname;
	}

	public String getRelationtable() {
		return this.relationtable;
	}

	public void setRelationtable(String relationtable) {
		this.relationtable = relationtable;
	}

	public String getRelationfield() {
		return this.relationfield;
	}

	public void setRelationfield(String relationfield) {
		this.relationfield = relationfield;
	}

	public String getViewfield() {
		return this.viewfield;
	}

	public void setViewfield(String viewfield) {
		this.viewfield = viewfield;
	}

	public Boolean getFieldtype() {
		return this.fieldtype;
	}

	public void setFieldtype(Boolean fieldtype) {
		this.fieldtype = fieldtype;
	}

	public String getFielddatatype() {
		return this.fielddatatype;
	}

	public void setFielddatatype(String fielddatatype) {
		this.fielddatatype = fielddatatype;
	}

}