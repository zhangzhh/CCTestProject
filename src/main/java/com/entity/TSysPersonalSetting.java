package com.entity;

/**
 * TSysPersonalSetting entity. @author MyEclipse Persistence Tools
 */

public class TSysPersonalSetting implements java.io.Serializable {

	// Fields

	private Long id;
	private Long userid;
	private String propertyname;
	private String propertyvalue;

	// Constructors

	/** default constructor */
	public TSysPersonalSetting() {
	}

	/** minimal constructor */
	public TSysPersonalSetting(Long id) {
		this.id = id;
	}

	/** full constructor */
	public TSysPersonalSetting(Long id, Long userid, String propertyname,
			String propertyvalue) {
		this.id = id;
		this.userid = userid;
		this.propertyname = propertyname;
		this.propertyvalue = propertyvalue;
	}

	// Property accessors

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getUserid() {
		return this.userid;
	}

	public void setUserid(Long userid) {
		this.userid = userid;
	}

	public String getPropertyname() {
		return this.propertyname;
	}

	public void setPropertyname(String propertyname) {
		this.propertyname = propertyname;
	}

	public String getPropertyvalue() {
		return this.propertyvalue;
	}

	public void setPropertyvalue(String propertyvalue) {
		this.propertyvalue = propertyvalue;
	}

}