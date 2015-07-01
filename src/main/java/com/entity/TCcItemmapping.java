package com.entity;

/**
 * TCcItemmapping entity. @author MyEclipse Persistence Tools
 */

public class TCcItemmapping implements java.io.Serializable {

	// Fields

	private Long id;
	private String billid;
	private String billitemid;
	private String billitemidmapping;
	private String name;

	// Constructors

	/** default constructor */
	public TCcItemmapping() {
	}

	/** minimal constructor */
	public TCcItemmapping(Long id) {
		this.id = id;
	}

	/** full constructor */
	public TCcItemmapping(Long id, String billid, String billitemid,
			String billitemidmapping, String name) {
		this.id = id;
		this.billid = billid;
		this.billitemid = billitemid;
		this.billitemidmapping = billitemidmapping;
		this.name = name;
	}

	// Property accessors

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getBillid() {
		return this.billid;
	}

	public void setBillid(String billid) {
		this.billid = billid;
	}

	public String getBillitemid() {
		return this.billitemid;
	}

	public void setBillitemid(String billitemid) {
		this.billitemid = billitemid;
	}

	public String getBillitemidmapping() {
		return this.billitemidmapping;
	}

	public void setBillitemidmapping(String billitemidmapping) {
		this.billitemidmapping = billitemidmapping;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}