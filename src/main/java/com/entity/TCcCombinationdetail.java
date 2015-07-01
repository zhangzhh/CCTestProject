package com.entity;

/**
 * TCcCombinationdetail entity. @author MyEclipse Persistence Tools
 */

public class TCcCombinationdetail implements java.io.Serializable {

	// Fields

	private Long combinationdetailid;
	private String combinationids;
	private String combinationnames;

	// Constructors

	/** default constructor */
	public TCcCombinationdetail() {
	}

	/** minimal constructor */
	public TCcCombinationdetail(Long combinationdetailid) {
		this.combinationdetailid = combinationdetailid;
	}

	/** full constructor */
	public TCcCombinationdetail(Long combinationdetailid,
			String combinationids, String combinationnames) {
		this.combinationdetailid = combinationdetailid;
		this.combinationids = combinationids;
		this.combinationnames = combinationnames;
	}

	// Property accessors

	public Long getCombinationdetailid() {
		return this.combinationdetailid;
	}

	public void setCombinationdetailid(Long combinationdetailid) {
		this.combinationdetailid = combinationdetailid;
	}

	public String getCombinationids() {
		return this.combinationids;
	}

	public void setCombinationids(String combinationids) {
		this.combinationids = combinationids;
	}

	public String getCombinationnames() {
		return this.combinationnames;
	}

	public void setCombinationnames(String combinationnames) {
		this.combinationnames = combinationnames;
	}

}