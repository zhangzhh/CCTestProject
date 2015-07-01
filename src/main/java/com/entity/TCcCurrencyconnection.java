package com.entity;

/**
 * TCcCurrencyconnection entity. @author MyEclipse Persistence Tools
 */

public class TCcCurrencyconnection implements java.io.Serializable {

	// Fields

	private Long connectionid;
	private Long origincurrencyid;
	private Long targetcurrencyid;

	// Constructors

	/** default constructor */
	public TCcCurrencyconnection() {
	}

	/** minimal constructor */
	public TCcCurrencyconnection(Long connectionid) {
		this.connectionid = connectionid;
	}

	/** full constructor */
	public TCcCurrencyconnection(Long connectionid, Long origincurrencyid,
			Long targetcurrencyid) {
		this.connectionid = connectionid;
		this.origincurrencyid = origincurrencyid;
		this.targetcurrencyid = targetcurrencyid;
	}

	// Property accessors

	public Long getConnectionid() {
		return this.connectionid;
	}

	public void setConnectionid(Long connectionid) {
		this.connectionid = connectionid;
	}

	public Long getOrigincurrencyid() {
		return this.origincurrencyid;
	}

	public void setOrigincurrencyid(Long origincurrencyid) {
		this.origincurrencyid = origincurrencyid;
	}

	public Long getTargetcurrencyid() {
		return this.targetcurrencyid;
	}

	public void setTargetcurrencyid(Long targetcurrencyid) {
		this.targetcurrencyid = targetcurrencyid;
	}

}