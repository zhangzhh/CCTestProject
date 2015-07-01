package com.entity;

/**
 * TSysLogQuerycongdition entity. @author MyEclipse Persistence Tools
 */

public class TSysLogQuerycongdition implements java.io.Serializable {

	// Fields

	private Long id;
	private String logtype;
	private String fieldtitle;
	private Long displayorder;
	private Integer fieldlength;
	private String fieldvalue;
	private String fielddatatype;

	// Constructors

	/** default constructor */
	public TSysLogQuerycongdition() {
	}

	/** minimal constructor */
	public TSysLogQuerycongdition(Long id) {
		this.id = id;
	}

	/** full constructor */
	public TSysLogQuerycongdition(Long id, String logtype, String fieldtitle,
			Long displayorder, Integer fieldlength, String fieldvalue,
			String fielddatatype) {
		this.id = id;
		this.logtype = logtype;
		this.fieldtitle = fieldtitle;
		this.displayorder = displayorder;
		this.fieldlength = fieldlength;
		this.fieldvalue = fieldvalue;
		this.fielddatatype = fielddatatype;
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

	public String getFielddatatype() {
		return this.fielddatatype;
	}

	public void setFielddatatype(String fielddatatype) {
		this.fielddatatype = fielddatatype;
	}

}