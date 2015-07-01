package com.entity;

import java.math.BigDecimal;

/**
 * TCcBillreversaldata entity. @author MyEclipse Persistence Tools
 */

public class TCcBillreversaldata implements java.io.Serializable {

	// Fields

	private Long reversaldataid;
	private Long billmaindataid;
	private Long reversalbilldetaildataid;
	private Double avaliablecurrency;
	private Double originalcurrency;
	private Double totalamount;
	private Double cashpayment;
	private Double repayment;
	private Double repaymentcurrency;
	private Double loancurrency;
	private BigDecimal paysatate;
	private String memo;
	private Double naturalcurrency;
	private Long currencyid;
	private Double exchangerate;

	// Constructors

	/** default constructor */
	public TCcBillreversaldata() {
	}

	/** minimal constructor */
	public TCcBillreversaldata(Long reversaldataid) {
		this.reversaldataid = reversaldataid;
	}

	/** full constructor */
	public TCcBillreversaldata(Long reversaldataid, Long billmaindataid,
			Long reversalbilldetaildataid, Double avaliablecurrency,
			Double originalcurrency, Double totalamount, Double cashpayment,
			Double repayment, Double repaymentcurrency, Double loancurrency,
			BigDecimal paysatate, String memo, Double naturalcurrency,
			Long currencyid, Double exchangerate) {
		this.reversaldataid = reversaldataid;
		this.billmaindataid = billmaindataid;
		this.reversalbilldetaildataid = reversalbilldetaildataid;
		this.avaliablecurrency = avaliablecurrency;
		this.originalcurrency = originalcurrency;
		this.totalamount = totalamount;
		this.cashpayment = cashpayment;
		this.repayment = repayment;
		this.repaymentcurrency = repaymentcurrency;
		this.loancurrency = loancurrency;
		this.paysatate = paysatate;
		this.memo = memo;
		this.naturalcurrency = naturalcurrency;
		this.currencyid = currencyid;
		this.exchangerate = exchangerate;
	}

	// Property accessors

	public Long getReversaldataid() {
		return this.reversaldataid;
	}

	public void setReversaldataid(Long reversaldataid) {
		this.reversaldataid = reversaldataid;
	}

	public Long getBillmaindataid() {
		return this.billmaindataid;
	}

	public void setBillmaindataid(Long billmaindataid) {
		this.billmaindataid = billmaindataid;
	}

	public Long getReversalbilldetaildataid() {
		return this.reversalbilldetaildataid;
	}

	public void setReversalbilldetaildataid(Long reversalbilldetaildataid) {
		this.reversalbilldetaildataid = reversalbilldetaildataid;
	}

	public Double getAvaliablecurrency() {
		return this.avaliablecurrency;
	}

	public void setAvaliablecurrency(Double avaliablecurrency) {
		this.avaliablecurrency = avaliablecurrency;
	}

	public Double getOriginalcurrency() {
		return this.originalcurrency;
	}

	public void setOriginalcurrency(Double originalcurrency) {
		this.originalcurrency = originalcurrency;
	}

	public Double getTotalamount() {
		return this.totalamount;
	}

	public void setTotalamount(Double totalamount) {
		this.totalamount = totalamount;
	}

	public Double getCashpayment() {
		return this.cashpayment;
	}

	public void setCashpayment(Double cashpayment) {
		this.cashpayment = cashpayment;
	}

	public Double getRepayment() {
		return this.repayment;
	}

	public void setRepayment(Double repayment) {
		this.repayment = repayment;
	}

	public Double getRepaymentcurrency() {
		return this.repaymentcurrency;
	}

	public void setRepaymentcurrency(Double repaymentcurrency) {
		this.repaymentcurrency = repaymentcurrency;
	}

	public Double getLoancurrency() {
		return this.loancurrency;
	}

	public void setLoancurrency(Double loancurrency) {
		this.loancurrency = loancurrency;
	}

	public BigDecimal getPaysatate() {
		return this.paysatate;
	}

	public void setPaysatate(BigDecimal paysatate) {
		this.paysatate = paysatate;
	}

	public String getMemo() {
		return this.memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public Double getNaturalcurrency() {
		return this.naturalcurrency;
	}

	public void setNaturalcurrency(Double naturalcurrency) {
		this.naturalcurrency = naturalcurrency;
	}

	public Long getCurrencyid() {
		return this.currencyid;
	}

	public void setCurrencyid(Long currencyid) {
		this.currencyid = currencyid;
	}

	public Double getExchangerate() {
		return this.exchangerate;
	}

	public void setExchangerate(Double exchangerate) {
		this.exchangerate = exchangerate;
	}

}