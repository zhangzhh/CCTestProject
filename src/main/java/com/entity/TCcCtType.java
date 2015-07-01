package com.entity;

/**
 * TCcCtType entity. @author MyEclipse Persistence Tools
 */

public class TCcCtType implements java.io.Serializable {

	// Fields

	private Long id;
	private Long templateId;
	private String name;

	// Constructors

	/** default constructor */
	public TCcCtType() {
	}

	/** full constructor */
	public TCcCtType(Long id, Long templateId, String name) {
		this.id = id;
		this.templateId = templateId;
		this.name = name;
	}

	// Property accessors

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getTemplateId() {
		return this.templateId;
	}

	public void setTemplateId(Long templateId) {
		this.templateId = templateId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}