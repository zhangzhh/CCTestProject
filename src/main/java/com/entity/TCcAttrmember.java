package com.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * TCcAttrmember entity. @author MyEclipse Persistence Tools
 */

public class TCcAttrmember implements java.io.Serializable {

	// Fields

	private Long attrmemberid;
	private String value;
	private Long attrid;
	private Set TCcMembertoattributes = new HashSet(0);

	// Constructors

	/** default constructor */
	public TCcAttrmember() {
	}

	/** minimal constructor */
	public TCcAttrmember(Long attrmemberid) {
		this.attrmemberid = attrmemberid;
	}

	/** full constructor */
	public TCcAttrmember(Long attrmemberid, String value, Long attrid,
			Set TCcMembertoattributes) {
		this.attrmemberid = attrmemberid;
		this.value = value;
		this.attrid = attrid;
		this.TCcMembertoattributes = TCcMembertoattributes;
	}

	// Property accessors

	public Long getAttrmemberid() {
		return this.attrmemberid;
	}

	public void setAttrmemberid(Long attrmemberid) {
		this.attrmemberid = attrmemberid;
	}

	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public Long getAttrid() {
		return this.attrid;
	}

	public void setAttrid(Long attrid) {
		this.attrid = attrid;
	}

	public Set getTCcMembertoattributes() {
		return this.TCcMembertoattributes;
	}

	public void setTCcMembertoattributes(Set TCcMembertoattributes) {
		this.TCcMembertoattributes = TCcMembertoattributes;
	}

}