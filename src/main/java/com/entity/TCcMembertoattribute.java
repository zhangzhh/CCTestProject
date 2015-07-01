package com.entity;

/**
 * TCcMembertoattribute entity. @author MyEclipse Persistence Tools
 */

public class TCcMembertoattribute implements java.io.Serializable {

	// Fields

	private TCcMembertoattributeId id;
	private TCcAttrmember TCcAttrmember;
	private TCcMember TCcMember;
	private TCcAttrdimension TCcAttrdimension;

	// Constructors

	/** default constructor */
	public TCcMembertoattribute() {
	}

	/** minimal constructor */
	public TCcMembertoattribute(TCcMembertoattributeId id) {
		this.id = id;
	}

	/** full constructor */
	public TCcMembertoattribute(TCcMembertoattributeId id,
			TCcAttrmember TCcAttrmember, TCcMember TCcMember,
			TCcAttrdimension TCcAttrdimension) {
		this.id = id;
		this.TCcAttrmember = TCcAttrmember;
		this.TCcMember = TCcMember;
		this.TCcAttrdimension = TCcAttrdimension;
	}

	// Property accessors

	public TCcMembertoattributeId getId() {
		return this.id;
	}

	public void setId(TCcMembertoattributeId id) {
		this.id = id;
	}

	public TCcAttrmember getTCcAttrmember() {
		return this.TCcAttrmember;
	}

	public void setTCcAttrmember(TCcAttrmember TCcAttrmember) {
		this.TCcAttrmember = TCcAttrmember;
	}

	public TCcMember getTCcMember() {
		return this.TCcMember;
	}

	public void setTCcMember(TCcMember TCcMember) {
		this.TCcMember = TCcMember;
	}

	public TCcAttrdimension getTCcAttrdimension() {
		return this.TCcAttrdimension;
	}

	public void setTCcAttrdimension(TCcAttrdimension TCcAttrdimension) {
		this.TCcAttrdimension = TCcAttrdimension;
	}

}