package com.entity;

import java.sql.Timestamp;

/**
 * TCcExchangerate entity. @author MyEclipse Persistence Tools
 */

public class TCcExchangerate implements java.io.Serializable {

	// Fields

	private Long exchangerateid;
	private Long connectionid;
	private Double exchangerate;
	private Timestamp validtime;

	// Constructors

	/** default constructor */
	public TCcExchangerate() {
	}

	/** minimal constructor */
	public TCcExchangerate(Long exchangerateid) {
		this.exchangerateid = exchangerateid;
	}

	/** full constructor */
	public TCcExchangerate(Long exchangerateid, Long connectionid,
			Double exchangerate, Timestamp validtime) {
		this.exchangerateid = exchangerateid;
		this.connectionid = connectionid;
		this.exchangerate = exchangerate;
		this.validtime = validtime;
	}

	// Property accessors

	public Long getExchangerateid() {
		return this.exchangerateid;
	}

	public void setExchangerateid(Long exchangerateid) {
		this.exchangerateid = exchangerateid;
	}

	public Long getConnectionid() {
		return this.connectionid;
	}

	public void setConnectionid(Long connectionid) {
		this.connectionid = connectionid;
	}

	public Double getExchangerate() {
		return this.exchangerate;
	}

	public void setExchangerate(Double exchangerate) {
		this.exchangerate = exchangerate;
	}

	public Timestamp getValidtime() {
		return this.validtime;
	}

	public void setValidtime(Timestamp validtime) {
		this.validtime = validtime;
	}

}