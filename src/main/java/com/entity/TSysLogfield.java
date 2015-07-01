package com.entity;

/**
 * TSysLogfield entity. @author MyEclipse Persistence Tools
 */

public class TSysLogfield implements java.io.Serializable {

	// Fields

	private Long id;
	private String logtype;
	private String fieldtitle;
	private Long displayorder;
	private Integer fieldlength;
	private String fieldvalue;
	private String relationtable;
	private String relationfield;
	private String viewfield;
	private String fielddatatype;
	private String fieldalign;

	// Constructors

	/** default constructor */
	public TSysLogfield() {
	}

	/** minimal constructor */
	public TSysLogfield(Long id) {
		this.id = id;
	}

	/** full constructor */
	public TSysLogfield(Long id, String logtype, String fieldtitle,
			Long displayorder, Integer fieldlength, String fieldvalue,
			String relationtable, String relationfield, String viewfield,
			String fielddatatype, String fieldalign) {
		this.id = id;
		this.logtype = logtype;
		this.fieldtitle = fieldtitle;
		this.displayorder = displayorder;
		this.fieldlength = fieldlength;
		this.fieldvalue = fieldvalue;
		this.relationtable = relationtable;
		this.relationfield = relationfield;
		this.viewfield = viewfield;
		this.fielddatatype = fielddatatype;
		this.fieldalign = fieldalign;
	}

	// Property accessors

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLogtype() {
		return this.logtype;
	}

	public void setLogtype(String logtype) {
		this.logtype = logtype;
	}

	public String getFieldtitle() {
		return this.fieldtitle;
	}

	public void setFieldtitle(String fieldtitle) {
		this.fieldtitle = fieldtitle;
	}

	public Long getDisplayorder() {
		return this.displayorder;
	}

	public void setDisplayorder(Long displayorder) {
		this.displayorder = displayorder;
	}

	public Integer getFieldlength() {
		return this.fieldlength;
	}

	public void setFieldlength(Integer fieldlength) {
		this.fieldlength = fieldlength;
	}

	public String getFieldvalue() {
		return this.fieldvalue;
	}

	public void setFieldvalue(String fieldvalue) {
		this.fieldvalue = fieldvalue;
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

	public String getFielddatatype() {
		return this.fielddatatype;
	}

	public void setFielddatatype(String fielddatatype) {
		this.fielddatatype = fielddatatype;
	}

	public String getFieldalign() {
		return this.fieldalign;
	}

	public void setFieldalign(String fieldalign) {
		this.fieldalign = fieldalign;
	}

}