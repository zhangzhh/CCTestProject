package com.entity;

import java.math.BigDecimal;

/**
 * TCcCtItem entity. @author MyEclipse Persistence Tools
 */

public class TCcCtItem implements java.io.Serializable {

	// Fields

	private Long id;
	private Long templateId;
	private BigDecimal orderNum;
	private String name;
	private String showInHead;
	private String showInDesign;
	private String type;
	private Long dimId;

	// Constructors

	/** default constructor */
	public TCcCtItem() {
	}

	/** minimal constructor */
	public TCcCtItem(Long id, Long templateId, BigDecimal orderNum,
			String name, String showInHead, String showInDesign, String type) {
		this.id = id;
		this.templateId = templateId;
		this.orderNum = orderNum;
		this.name = name;
		this.showInHead = showInHead;
		this.showInDesign = showInDesign;
		this.type = type;
	}

	/** full constructor */
	public TCcCtItem(Long id, Long templateId, BigDecimal orderNum,
			String name, String showInHead, String showInDesign, String type,
			Long dimId) {
		this.id = id;
		this.templateId = templateId;
		this.orderNum = orderNum;
		this.name = name;
		this.showInHead = showInHead;
		this.showInDesign = showInDesign;
		this.type = type;
		this.dimId = dimId;
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

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getShowInHead() {
		return this.showInHead;
	}

	public void setShowInHead(String showInHead) {
		this.showInHead = showInHead;
	}

	public String getShowInDesign() {
		return this.showInDesign;
	}

	public void setShowInDesign(String showInDesign) {
		this.showInDesign = showInDesign;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Long getDimId() {
		return this.dimId;
	}

	public void setDimId(Long dimId) {
		this.dimId = dimId;
	}

}