package com.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * TCcMember entity. @author MyEclipse Persistence Tools
 */

public class TCcMember implements java.io.Serializable {

	// Fields

	private Long memberid;
	private Long dimid;
	private Set TCcMembertoattributes = new HashSet(0);

	// Constructors

	/** default constructor */
	public TCcMember() {
	}

	/** minimal constructor */
	public TCcMember(Long memberid) {
		this.memberid = memberid;
	}

	/** full constructor */
	public TCcMember(Long memberid, Long dimid, Set TCcMembertoattributes) {
		this.memberid = memberid;
		this.dimid = dimid;
		this.TCcMembertoattributes = TCcMembertoattributes;
	}

	// Property accessors

	public Long getMemberid() {
		return this.memberid;
	}

	public void setMemberid(Long memberid) {
		this.memberid = memberid;
	}

	public Long getDimid() {
		return this.dimid;
	}

	public void setDimid(Long dimid) {
		this.dimid = dimid;
	}

	public Set getTCcMembertoattributes() {
		return this.TCcMembertoattributes;
	}

	public void setTCcMembertoattributes(Set TCcMembertoattributes) {
		this.TCcMembertoattributes = TCcMembertoattributes;
	}

}