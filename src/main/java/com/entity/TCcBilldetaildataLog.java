package com.entity;

import java.sql.Timestamp;

/**
 * TCcBilldetaildataLog entity. @author MyEclipse Persistence Tools
 */

public class TCcBilldetaildataLog implements java.io.Serializable {

	// Fields

	private Long id;
	private Long billdetaildataid;
	private Long billmaindataid;
	private Double naturalcurrency;
	private Long modifyuser;
	private Timestamp modifytime;
	private Byte state;

	// Constructors

	/** default constructor */
	public TCcBilldetaildataLog() {
	}

	/** minimal constructor */
	public TCcBilldetaildataLog(Long id) {
		this.id = id;
	}

	/** full constructor */
	public TCcBilldetaildataLog(Long id, Long billdetaildataid,
			Long billmaindataid, Double naturalcurrency, Long modifyuser,
			Timestamp modifytime, Byte state) {
		this.id = id;
		this.billdetaildataid = billdetaildataid;
		this.billmaindataid = billmaindataid;
		this.naturalcurrency = naturalcurrency;
		this.modifyuser = modifyuser;
		this.modifytime = modifytime;
		this.state = state;
	}

	// Property accessors

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getBilldetaildataid() {
		return this.billdetaildataid;
	}

	public void setBilldetaildataid(Long billdetaildataid) {
		this.billdetaildataid = billdetaildataid;
	}

	public Long getBillmaindataid() {
		return this.billmaindataid;
	}

	public void setBillmaindataid(Long billmaindataid) {
		this.billmaindataid = billmaindataid;
	}

	public Double getNaturalcurrency() {
		return this.naturalcurrency;
	}

	public void setNaturalcurrency(Double naturalcurrency) {
		this.naturalcurrency = naturalcurrency;
	}

	public Long getModifyuser() {
		return this.modifyuser;
	}

	public void setModifyuser(Long modifyuser) {
		this.modifyuser = modifyuser;
	}

	public Timestamp getModifytime() {
		return this.modifytime;
	}

	public void setModifytime(Timestamp modifytime) {
		this.modifytime = modifytime;
	}

	public Byte getState() {
		return this.state;
	}

	public void setState(Byte state) {
		this.state = state;
	}

}