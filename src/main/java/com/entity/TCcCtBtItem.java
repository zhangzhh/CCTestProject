package com.entity;

import java.math.BigDecimal;

/**
 * TCcCtBtItem entity. @author MyEclipse Persistence Tools
 */

public class TCcCtBtItem implements java.io.Serializable {

	// Fields

	private Long id;
	private Long billTemplateId;
	private BigDecimal ctItemId;
	private Long btRuleId;
	private Long dimId;
	private String flag;

	// Constructors

	/** default constructor */
	public TCcCtBtItem() {
	}

	/** minimal constructor */
	public TCcCtBtItem(Long id, Long billTemplateId, BigDecimal ctItemId) {
		this.id = id;
		this.billTemplateId = billTemplateId;
		this.ctItemId = ctItemId;
	}

	/** full constructor */
	public TCcCtBtItem(Long id, Long billTemplateId, BigDecimal ctItemId,
			Long btRuleId, Long dimId, String flag) {
		this.id = id;
		this.billTemplateId = billTemplateId;
		this.ctItemId = ctItemId;
		this.btRuleId = btRuleId;
		this.dimId = dimId;
		this.flag = flag;
	}

	// Property accessors

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getBillTemplateId() {
		return this.billTemplateId;
	}

	public void setBillTemplateId(Long billTemplateId) {
		this.billTemplateId = billTemplateId;
	}

	public BigDecimal getCtItemId() {
		return this.ctItemId;
	}

	public void setCtItemId(BigDecimal ctItemId) {
		this.ctItemId = ctItemId;
	}

	public Long getBtRuleId() {
		return this.btRuleId;
	}

	public void setBtRuleId(Long btRuleId) {
		this.btRuleId = btRuleId;
	}

	public Long getDimId() {
		return this.dimId;
	}

	public void setDimId(Long dimId) {
		this.dimId = dimId;
	}

	public String getFlag() {
		return this.flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

}