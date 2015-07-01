package com.entity;

/**
 * TSysPost entity. @author MyEclipse Persistence Tools
 */

public class TSysPost implements java.io.Serializable {

	// Fields

	private Long postid;
	private String postcode;
	private String postname;

	// Constructors

	/** default constructor */
	public TSysPost() {
	}

	/** minimal constructor */
	public TSysPost(Long postid) {
		this.postid = postid;
	}

	/** full constructor */
	public TSysPost(Long postid, String postcode, String postname) {
		this.postid = postid;
		this.postcode = postcode;
		this.postname = postname;
	}

	// Property accessors

	public Long getPostid() {
		return this.postid;
	}

	public void setPostid(Long postid) {
		this.postid = postid;
	}

	public String getPostcode() {
		return this.postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	public String getPostname() {
		return this.postname;
	}

	public void setPostname(String postname) {
		this.postname = postname;
	}

}