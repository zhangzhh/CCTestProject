package com.entity;

/**
 * TSysEbankpattern entity. @author MyEclipse Persistence Tools
 */

public class TSysEbankpattern implements java.io.Serializable {

	// Fields

	private Long ebankpatternid;
	private Long bankid;
	private Long modeid;
	private String patternname;

	// Constructors

	/** default constructor */
	public TSysEbankpattern() {
	}

	/** minimal constructor */
	public TSysEbankpattern(Long ebankpatternid) {
		this.ebankpatternid = ebankpatternid;
	}

	/** full constructor */
	public TSysEbankpattern(Long ebankpatternid, Long bankid, Long modeid,
			String patternname) {
		this.ebankpatternid = ebankpatternid;
		this.bankid = bankid;
		this.modeid = modeid;
		this.patternname = patternname;
	}

	// Property accessors

	public Long getEbankpatternid() {
		return this.ebankpatternid;
	}

	public void setEbankpatternid(Long ebankpatternid) {
		this.ebankpatternid = ebankpatternid;
	}

	public Long getBankid() {
		return this.bankid;
	}

	public void setBankid(Long bankid) {
		this.bankid = bankid;
	}

	public Long getModeid() {
		return this.modeid;
	}

	public void setModeid(Long modeid) {
		this.modeid = modeid;
	}

	public String getPatternname() {
		return this.patternname;
	}

	public void setPatternname(String patternname) {
		this.patternname = patternname;
	}

}