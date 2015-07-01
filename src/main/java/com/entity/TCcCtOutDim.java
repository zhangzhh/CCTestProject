package com.entity;

/**
 * TCcCtOutDim entity. @author MyEclipse Persistence Tools
 */

public class TCcCtOutDim implements java.io.Serializable {

	// Fields

	private Long id;
	private String name;
	private Long templateId;

	// Constructors

	/** default constructor */
	public TCcCtOutDim() {
	}

	/** full constructor */
	public TCcCtOutDim(Long id, String name, Long templateId) {
		this.id = id;
		this.name = name;
		this.templateId = templateId;
	}

	// Property accessors

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getTemplateId() {
		return this.templateId;
	}

	public void setTemplateId(Long templateId) {
		this.templateId = templateId;
	}

}