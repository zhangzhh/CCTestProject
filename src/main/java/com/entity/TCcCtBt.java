package com.entity;

/**
 * TCcCtBt entity. @author MyEclipse Persistence Tools
 */

public class TCcCtBt implements java.io.Serializable {

	// Fields

	private Long id;
	private Long billId;
	private Long templateId;

	// Constructors

	/** default constructor */
	public TCcCtBt() {
	}

	/** minimal constructor */
	public TCcCtBt(Long id) {
		this.id = id;
	}

	/** full constructor */
	public TCcCtBt(Long id, Long billId, Long templateId) {
		this.id = id;
		this.billId = billId;
		this.templateId = templateId;
	}

	// Property accessors

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getBillId() {
		return this.billId;
	}

	public void setBillId(Long billId) {
		this.billId = billId;
	}

	public Long getTemplateId() {
		return this.templateId;
	}

	public void setTemplateId(Long templateId) {
		this.templateId = templateId;
	}

}