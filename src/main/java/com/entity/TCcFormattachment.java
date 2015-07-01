package com.entity;

import java.sql.Timestamp;

/**
 * TCcFormattachment entity. @author MyEclipse Persistence Tools
 */

public class TCcFormattachment implements java.io.Serializable {

	// Fields

	private Long id;
	private String formid;
	private String attachementurl;
	private Timestamp dates;
	private String remark;
	private Double picwidth;
	private Double picheight;

	// Constructors

	/** default constructor */
	public TCcFormattachment() {
	}

	/** minimal constructor */
	public TCcFormattachment(Long id) {
		this.id = id;
	}

	/** full constructor */
	public TCcFormattachment(Long id, String formid, String attachementurl,
			Timestamp dates, String remark, Double picwidth, Double picheight) {
		this.id = id;
		this.formid = formid;
		this.attachementurl = attachementurl;
		this.dates = dates;
		this.remark = remark;
		this.picwidth = picwidth;
		this.picheight = picheight;
	}

	// Property accessors

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFormid() {
		return this.formid;
	}

	public void setFormid(String formid) {
		this.formid = formid;
	}

	public String getAttachementurl() {
		return this.attachementurl;
	}

	public void setAttachementurl(String attachementurl) {
		this.attachementurl = attachementurl;
	}

	public Timestamp getDates() {
		return this.dates;
	}

	public void setDates(Timestamp dates) {
		this.dates = dates;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Double getPicwidth() {
		return this.picwidth;
	}

	public void setPicwidth(Double picwidth) {
		this.picwidth = picwidth;
	}

	public Double getPicheight() {
		return this.picheight;
	}

	public void setPicheight(Double picheight) {
		this.picheight = picheight;
	}

}