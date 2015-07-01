package com.entity;

/**
 * TCcCtMemberRelation entity. @author MyEclipse Persistence Tools
 */

public class TCcCtMemberRelation implements java.io.Serializable {

	// Fields

	private Long id;
	private Long templateOutDimId;
	private String outDimMember;
	private String outDimMemberName;

	// Constructors

	/** default constructor */
	public TCcCtMemberRelation() {
	}

	/** minimal constructor */
	public TCcCtMemberRelation(Long id, String outDimMember,
			String outDimMemberName) {
		this.id = id;
		this.outDimMember = outDimMember;
		this.outDimMemberName = outDimMemberName;
	}

	/** full constructor */
	public TCcCtMemberRelation(Long id, Long templateOutDimId,
			String outDimMember, String outDimMemberName) {
		this.id = id;
		this.templateOutDimId = templateOutDimId;
		this.outDimMember = outDimMember;
		this.outDimMemberName = outDimMemberName;
	}

	// Property accessors

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getTemplateOutDimId() {
		return this.templateOutDimId;
	}

	public void setTemplateOutDimId(Long templateOutDimId) {
		this.templateOutDimId = templateOutDimId;
	}

	public String getOutDimMember() {
		return this.outDimMember;
	}

	public void setOutDimMember(String outDimMember) {
		this.outDimMember = outDimMember;
	}

	public String getOutDimMemberName() {
		return this.outDimMemberName;
	}

	public void setOutDimMemberName(String outDimMemberName) {
		this.outDimMemberName = outDimMemberName;
	}

}