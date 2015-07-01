package com.entity;

/**
 * TSysDefinedSys entity. @author MyEclipse Persistence Tools
 */

public class TSysDefinedSys implements java.io.Serializable {

	// Fields

	private Long userid;
	private String sysprodeploy;
	private Long syshomepageid;
	private String syshomepagename;

	// Constructors

	/** default constructor */
	public TSysDefinedSys() {
	}

	/** minimal constructor */
	public TSysDefinedSys(Long userid) {
		this.userid = userid;
	}

	/** full constructor */
	public TSysDefinedSys(Long userid, String sysprodeploy, Long syshomepageid,
			String syshomepagename) {
		this.userid = userid;
		this.sysprodeploy = sysprodeploy;
		this.syshomepageid = syshomepageid;
		this.syshomepagename = syshomepagename;
	}

	// Property accessors

	public Long getUserid() {
		return this.userid;
	}

	public void setUserid(Long userid) {
		this.userid = userid;
	}

	public String getSysprodeploy() {
		return this.sysprodeploy;
	}

	public void setSysprodeploy(String sysprodeploy) {
		this.sysprodeploy = sysprodeploy;
	}

	public Long getSyshomepageid() {
		return this.syshomepageid;
	}

	public void setSyshomepageid(Long syshomepageid) {
		this.syshomepageid = syshomepageid;
	}

	public String getSyshomepagename() {
		return this.syshomepagename;
	}

	public void setSyshomepagename(String syshomepagename) {
		this.syshomepagename = syshomepagename;
	}

}