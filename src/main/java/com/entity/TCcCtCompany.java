package com.entity;

/**
 * TCcCtCompany entity. @author MyEclipse Persistence Tools
 */

public class TCcCtCompany implements java.io.Serializable {

	// Fields

	private Long id;
	private Long templateId;
	private Long companyId;

	// Constructors

	/** default constructor */
	public TCcCtCompany() {
	}

	/** minimal constructor */
	public TCcCtCompany(Long id) {
		this.id = id;
	}

	/** full constructor */
	public TCcCtCompany(Long id, Long templateId, Long companyId) {
		this.id = id;
		this.templateId = templateId;
		this.companyId = companyId;
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

	public Long getCompanyId() {
		return this.companyId;
	}

	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
	}

}