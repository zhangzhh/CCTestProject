package com.entity;

import java.sql.Timestamp;

/**
 * TCcBillreceiptId entity. @author MyEclipse Persistence Tools
 */

public class TCcBillreceiptId implements java.io.Serializable {

	// Fields

	private Long id;
	private String billnumber;
	private Timestamp receipttime;
	private String receiptuser;
	private String receiptstatus;
	private String rejectreason;
	private String couriercompany;
	private String couriernumber;
	private String beizhu;

	// Constructors

	/** default constructor */
	public TCcBillreceiptId() {
	}

	/** minimal constructor */
	public TCcBillreceiptId(Long id) {
		this.id = id;
	}

	/** full constructor */
	public TCcBillreceiptId(Long id, String billnumber, Timestamp receipttime,
			String receiptuser, String receiptstatus, String rejectreason,
			String couriercompany, String couriernumber, String beizhu) {
		this.id = id;
		this.billnumber = billnumber;
		this.receipttime = receipttime;
		this.receiptuser = receiptuser;
		this.receiptstatus = receiptstatus;
		this.rejectreason = rejectreason;
		this.couriercompany = couriercompany;
		this.couriernumber = couriernumber;
		this.beizhu = beizhu;
	}

	// Property accessors

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getBillnumber() {
		return this.billnumber;
	}

	public void setBillnumber(String billnumber) {
		this.billnumber = billnumber;
	}

	public Timestamp getReceipttime() {
		return this.receipttime;
	}

	public void setReceipttime(Timestamp receipttime) {
		this.receipttime = receipttime;
	}

	public String getReceiptuser() {
		return this.receiptuser;
	}

	public void setReceiptuser(String receiptuser) {
		this.receiptuser = receiptuser;
	}

	public String getReceiptstatus() {
		return this.receiptstatus;
	}

	public void setReceiptstatus(String receiptstatus) {
		this.receiptstatus = receiptstatus;
	}

	public String getRejectreason() {
		return this.rejectreason;
	}

	public void setRejectreason(String rejectreason) {
		this.rejectreason = rejectreason;
	}

	public String getCouriercompany() {
		return this.couriercompany;
	}

	public void setCouriercompany(String couriercompany) {
		this.couriercompany = couriercompany;
	}

	public String getCouriernumber() {
		return this.couriernumber;
	}

	public void setCouriernumber(String couriernumber) {
		this.couriernumber = couriernumber;
	}

	public String getBeizhu() {
		return this.beizhu;
	}

	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TCcBillreceiptId))
			return false;
		TCcBillreceiptId castOther = (TCcBillreceiptId) other;

		return ((this.getId() == castOther.getId()) || (this.getId() != null
				&& castOther.getId() != null && this.getId().equals(
				castOther.getId())))
				&& ((this.getBillnumber() == castOther.getBillnumber()) || (this
						.getBillnumber() != null
						&& castOther.getBillnumber() != null && this
						.getBillnumber().equals(castOther.getBillnumber())))
				&& ((this.getReceipttime() == castOther.getReceipttime()) || (this
						.getReceipttime() != null
						&& castOther.getReceipttime() != null && this
						.getReceipttime().equals(castOther.getReceipttime())))
				&& ((this.getReceiptuser() == castOther.getReceiptuser()) || (this
						.getReceiptuser() != null
						&& castOther.getReceiptuser() != null && this
						.getReceiptuser().equals(castOther.getReceiptuser())))
				&& ((this.getReceiptstatus() == castOther.getReceiptstatus()) || (this
						.getReceiptstatus() != null
						&& castOther.getReceiptstatus() != null && this
						.getReceiptstatus()
						.equals(castOther.getReceiptstatus())))
				&& ((this.getRejectreason() == castOther.getRejectreason()) || (this
						.getRejectreason() != null
						&& castOther.getRejectreason() != null && this
						.getRejectreason().equals(castOther.getRejectreason())))
				&& ((this.getCouriercompany() == castOther.getCouriercompany()) || (this
						.getCouriercompany() != null
						&& castOther.getCouriercompany() != null && this
						.getCouriercompany().equals(
								castOther.getCouriercompany())))
				&& ((this.getCouriernumber() == castOther.getCouriernumber()) || (this
						.getCouriernumber() != null
						&& castOther.getCouriernumber() != null && this
						.getCouriernumber()
						.equals(castOther.getCouriernumber())))
				&& ((this.getBeizhu() == castOther.getBeizhu()) || (this
						.getBeizhu() != null && castOther.getBeizhu() != null && this
						.getBeizhu().equals(castOther.getBeizhu())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getId() == null ? 0 : this.getId().hashCode());
		result = 37
				* result
				+ (getBillnumber() == null ? 0 : this.getBillnumber()
						.hashCode());
		result = 37
				* result
				+ (getReceipttime() == null ? 0 : this.getReceipttime()
						.hashCode());
		result = 37
				* result
				+ (getReceiptuser() == null ? 0 : this.getReceiptuser()
						.hashCode());
		result = 37
				* result
				+ (getReceiptstatus() == null ? 0 : this.getReceiptstatus()
						.hashCode());
		result = 37
				* result
				+ (getRejectreason() == null ? 0 : this.getRejectreason()
						.hashCode());
		result = 37
				* result
				+ (getCouriercompany() == null ? 0 : this.getCouriercompany()
						.hashCode());
		result = 37
				* result
				+ (getCouriernumber() == null ? 0 : this.getCouriernumber()
						.hashCode());
		result = 37 * result
				+ (getBeizhu() == null ? 0 : this.getBeizhu().hashCode());
		return result;
	}

}