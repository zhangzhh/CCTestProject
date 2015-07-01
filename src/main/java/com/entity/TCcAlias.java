package com.entity;

/**
 * TCcAlias entity. @author MyEclipse Persistence Tools
 */

public class TCcAlias implements java.io.Serializable {

	// Fields

	private Long aliasid;
	private String aliasname;
	private String ismultilanguage;

	// Constructors

	/** default constructor */
	public TCcAlias() {
	}

	/** minimal constructor */
	public TCcAlias(Long aliasid) {
		this.aliasid = aliasid;
	}

	/** full constructor */
	public TCcAlias(Long aliasid, String aliasname, String ismultilanguage) {
		this.aliasid = aliasid;
		this.aliasname = aliasname;
		this.ismultilanguage = ismultilanguage;
	}

	// Property accessors

	public Long getAliasid() {
		return this.aliasid;
	}

	public void setAliasid(Long aliasid) {
		this.aliasid = aliasid;
	}

	public String getAliasname() {
		return this.aliasname;
	}

	public void setAliasname(String aliasname) {
		this.aliasname = aliasname;
	}

	public String getIsmultilanguage() {
		return this.ismultilanguage;
	}

	public void setIsmultilanguage(String ismultilanguage) {
		this.ismultilanguage = ismultilanguage;
	}

}