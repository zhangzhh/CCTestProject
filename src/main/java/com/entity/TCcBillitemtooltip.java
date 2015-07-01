package com.entity;

/**
 * TCcBillitemtooltip entity. @author MyEclipse Persistence Tools
 */

public class TCcBillitemtooltip implements java.io.Serializable {

	// Fields

	private Long billitemtooltipid;
	private Long billitemid;
	private Long languageid;
	private String tooltip;

	// Constructors

	/** default constructor */
	public TCcBillitemtooltip() {
	}

	/** minimal constructor */
	public TCcBillitemtooltip(Long billitemtooltipid) {
		this.billitemtooltipid = billitemtooltipid;
	}

	/** full constructor */
	public TCcBillitemtooltip(Long billitemtooltipid, Long billitemid,
			Long languageid, String tooltip) {
		this.billitemtooltipid = billitemtooltipid;
		this.billitemid = billitemid;
		this.languageid = languageid;
		this.tooltip = tooltip;
	}

	// Property accessors

	public Long getBillitemtooltipid() {
		return this.billitemtooltipid;
	}

	public void setBillitemtooltipid(Long billitemtooltipid) {
		this.billitemtooltipid = billitemtooltipid;
	}

	public Long getBillitemid() {
		return this.billitemid;
	}

	public void setBillitemid(Long billitemid) {
		this.billitemid = billitemid;
	}

	public Long getLanguageid() {
		return this.languageid;
	}

	public void setLanguageid(Long languageid) {
		this.languageid = languageid;
	}

	public String getTooltip() {
		return this.tooltip;
	}

	public void setTooltip(String tooltip) {
		this.tooltip = tooltip;
	}

}