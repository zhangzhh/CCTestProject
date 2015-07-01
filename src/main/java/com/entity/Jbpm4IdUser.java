package com.entity;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * Jbpm4IdUser entity. @author MyEclipse Persistence Tools
 */

public class Jbpm4IdUser implements java.io.Serializable {

	// Fields

	private BigDecimal dbid;
	private Long dbversion;
	private String id;
	private String password;
	private String givenname;
	private String familyname;
	private String businessemail;
	private Set jbpm4IdMemberships = new HashSet(0);

	// Constructors

	/** default constructor */
	public Jbpm4IdUser() {
	}

	/** minimal constructor */
	public Jbpm4IdUser(BigDecimal dbid, Long dbversion) {
		this.dbid = dbid;
		this.dbversion = dbversion;
	}

	/** full constructor */
	public Jbpm4IdUser(BigDecimal dbid, Long dbversion, String id,
			String password, String givenname, String familyname,
			String businessemail, Set jbpm4IdMemberships) {
		this.dbid = dbid;
		this.dbversion = dbversion;
		this.id = id;
		this.password = password;
		this.givenname = givenname;
		this.familyname = familyname;
		this.businessemail = businessemail;
		this.jbpm4IdMemberships = jbpm4IdMemberships;
	}

	// Property accessors

	public BigDecimal getDbid() {
		return this.dbid;
	}

	public void setDbid(BigDecimal dbid) {
		this.dbid = dbid;
	}

	public Long getDbversion() {
		return this.dbversion;
	}

	public void setDbversion(Long dbversion) {
		this.dbversion = dbversion;
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getGivenname() {
		return this.givenname;
	}

	public void setGivenname(String givenname) {
		this.givenname = givenname;
	}

	public String getFamilyname() {
		return this.familyname;
	}

	public void setFamilyname(String familyname) {
		this.familyname = familyname;
	}

	public String getBusinessemail() {
		return this.businessemail;
	}

	public void setBusinessemail(String businessemail) {
		this.businessemail = businessemail;
	}

	public Set getJbpm4IdMemberships() {
		return this.jbpm4IdMemberships;
	}

	public void setJbpm4IdMemberships(Set jbpm4IdMemberships) {
		this.jbpm4IdMemberships = jbpm4IdMemberships;
	}

}