package com.entity;

/**
 * TSysEbankfield entity. @author MyEclipse Persistence Tools
 */

public class TSysEbankfield implements java.io.Serializable {

	// Fields

	private Long ebankfieldid;
	private Long ebankpatternid;
	private String fieldname;
	private Long fieldvalueid;
	private Long displayorder;
	private Integer fieldlength;

	// Constructors

	/** default constructor */
	public TSysEbankfield() {
	}

	/** minimal constructor */
	public TSysEbankfield(Long ebankfieldid) {
		this.ebankfieldid = ebankfieldid;
	}

	/** full constructor */
	public TSysEbankfield(Long ebankfieldid, Long ebankpatternid,
			String fieldname, Long fieldvalueid, Long displayorder,
			Integer fieldlength) {
		this.ebankfieldid = ebankfieldid;
		this.ebankpatternid = ebankpatternid;
		this.fieldname = fieldname;
		this.fieldvalueid = fieldvalueid;
		this.displayorder = displayorder;
		this.fieldlength = fieldlength;
	}

	// Property accessors

	public Long getEbankfieldid() {
		return this.ebankfieldid;
	}

	public void setEbankfieldid(Long ebankfieldid) {
		this.ebankfieldid = ebankfieldid;
	}

	public Long getEbankpatternid() {
		return this.ebankpatternid;
	}

	public void setEbankpatternid(Long ebankpatternid) {
		this.ebankpatternid = ebankpatternid;
	}

	public String getFieldname() {
		return this.fieldname;
	}

	public void setFieldname(String fieldname) {
		this.fieldname = fieldname;
	}

	public Long getFieldvalueid() {
		return this.fieldvalueid;
	}

	public void setFieldvalueid(Long fieldvalueid) {
		this.fieldvalueid = fieldvalueid;
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

}