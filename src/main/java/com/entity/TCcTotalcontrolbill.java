package com.entity;

/**
 * TCcTotalcontrolbill entity. @author MyEclipse Persistence Tools
 */

public class TCcTotalcontrolbill implements java.io.Serializable {

	// Fields

	private Long id;
	private Long position;
	private String billformula;
	private String billformulalabel;
	private String enabled;
	private String controlname;

	// Constructors

	/** default constructor */
	public TCcTotalcontrolbill() {
	}

	/** minimal constructor */
	public TCcTotalcontrolbill(Long id) {
		this.id = id;
	}

	/** full constructor */
	public TCcTotalcontrolbill(Long id, Long position, String billformula,
			String billformulalabel, String enabled, String controlname) {
		this.id = id;
		this.position = position;
		this.billformula = billformula;
		this.billformulalabel = billformulalabel;
		this.enabled = enabled;
		this.controlname = controlname;
	}

	// Property accessors

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getPosition() {
		return this.position;
	}

	public void setPosition(Long position) {
		this.position = position;
	}

	public String getBillformula() {
		return this.billformula;
	}

	public void setBillformula(String billformula) {
		this.billformula = billformula;
	}

	public String getBillformulalabel() {
		return this.billformulalabel;
	}

	public void setBillformulalabel(String billformulalabel) {
		this.billformulalabel = billformulalabel;
	}

	public String getEnabled() {
		return this.enabled;
	}

	public void setEnabled(String enabled) {
		this.enabled = enabled;
	}

	public String getControlname() {
		return this.controlname;
	}

	public void setControlname(String controlname) {
		this.controlname = controlname;
	}

}