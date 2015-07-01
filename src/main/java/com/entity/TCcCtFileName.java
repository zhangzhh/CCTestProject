package com.entity;

import java.math.BigDecimal;

/**
 * TCcCtFileName entity. @author MyEclipse Persistence Tools
 */

public class TCcCtFileName implements java.io.Serializable {

	// Fields

	private Long id;
	private Long templateId;
	private BigDecimal orderNum;
	private String type;
	private String value;

	// Constructors

	/** default constructor */
	public TCcCtFileName() {
	}

	/** full constructor */
	public TCcCtFileName(Long id, Long templateId, BigDecimal orderNum,
			String type, String value) {
		this.id = id;
		this.templateId = templateId;
		this.orderNum = orderNum;
		this.type = type;
		this.value = value;
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

	public BigDecimal getOrderNum() {
		return this.orderNum;
	}

	public void setOrderNum(BigDecimal orderNum) {
		this.orderNum = orderNum;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}