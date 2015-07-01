package com.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * TCcManagementrole entity. @author MyEclipse Persistence Tools
 */

public class TCcManagementrole implements java.io.Serializable {

	// Fields

	private Long managementroleid;
	private String rolename;
	private String enabled;
	private Set TCcManagementroledims = new HashSet(0);

	// Constructors

	/** default constructor */
	public TCcManagementrole() {
	}

	/** minimal constructor */
	public TCcManagementrole(Long managementroleid) {
		this.managementroleid = managementroleid;
	}

	/** full constructor */
	public TCcManagementrole(Long managementroleid, String rolename,
			String enabled, Set TCcManagementroledims) {
		this.managementroleid = managementroleid;
		this.rolename = rolename;
		this.enabled = enabled;
		this.TCcManagementroledims = TCcManagementroledims;
	}

	// Property accessors

	public Long getManagementroleid() {
		return this.managementroleid;
	}

	public void setManagementroleid(Long managementroleid) {
		this.managementroleid = managementroleid;
	}

	public String getRolename() {
		return this.rolename;
	}

	public void setRolename(String rolename) {
		this.rolename = rolename;
	}

	public String getEnabled() {
		return this.enabled;
	}

	public void setEnabled(String enabled) {
		this.enabled = enabled;
	}

	public Set getTCcManagementroledims() {
		return this.TCcManagementroledims;
	}

	public void setTCcManagementroledims(Set TCcManagementroledims) {
		this.TCcManagementroledims = TCcManagementroledims;
	}

}