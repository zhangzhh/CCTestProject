package com.entity;

import java.sql.Timestamp;

/**
 * TCcBillinvoice entity. @author MyEclipse Persistence Tools
 */

public class TCcBillinvoice implements java.io.Serializable {

	// Fields

	private Long billinvoiceid;
	private String invoicetype;
	private String invoicecode;
	private String invoicenumber;
	private String invoicecount;
	private Double naturalamount;
	private Double originalamount;
	private Double naturalfactamount;
	private Double originalfactamount;
	private Double naturalthispaymentamount;
	private Double originalthispaymentamount;
	private Double invoicetax;
	private Long createperson;
	private Long applydept;
	private String item01;
	private String item02;
	private String item03;
	private String item04;
	private String item05;
	private String item06;
	private String item07;
	private String item08;
	private String item09;
	private String item10;
	private String item11;
	private String item12;
	private Long applyperson;
	private String invoicerelatedetail;
	private Timestamp createdate;
	private Byte authenticatingstate;
	private Timestamp authenticatingdate;
	private Byte checkstate;
	private Timestamp checkdate;
	private Timestamp operationdate;
	private Double naturalamountnottax;
	private Double originalamountnottax;
	private Boolean isoverflag;
	private Long billmaindataid;

	// Constructors

	/** default constructor */
	public TCcBillinvoice() {
	}

	/** minimal constructor */
	public TCcBillinvoice(Long billinvoiceid) {
		this.billinvoiceid = billinvoiceid;
	}

	/** full constructor */
	public TCcBillinvoice(Long billinvoiceid, String invoicetype,
			String invoicecode, String invoicenumber, String invoicecount,
			Double naturalamount, Double originalamount,
			Double naturalfactamount, Double originalfactamount,
			Double naturalthispaymentamount, Double originalthispaymentamount,
			Double invoicetax, Long createperson, Long applydept,
			String item01, String item02, String item03, String item04,
			String item05, String item06, String item07, String item08,
			String item09, String item10, String item11, String item12,
			Long applyperson, String invoicerelatedetail, Timestamp createdate,
			Byte authenticatingstate, Timestamp authenticatingdate,
			Byte checkstate, Timestamp checkdate, Timestamp operationdate,
			Double naturalamountnottax, Double originalamountnottax,
			Boolean isoverflag, Long billmaindataid) {
		this.billinvoiceid = billinvoiceid;
		this.invoicetype = invoicetype;
		this.invoicecode = invoicecode;
		this.invoicenumber = invoicenumber;
		this.invoicecount = invoicecount;
		this.naturalamount = naturalamount;
		this.originalamount = originalamount;
		this.naturalfactamount = naturalfactamount;
		this.originalfactamount = originalfactamount;
		this.naturalthispaymentamount = naturalthispaymentamount;
		this.originalthispaymentamount = originalthispaymentamount;
		this.invoicetax = invoicetax;
		this.createperson = createperson;
		this.applydept = applydept;
		this.item01 = item01;
		this.item02 = item02;
		this.item03 = item03;
		this.item04 = item04;
		this.item05 = item05;
		this.item06 = item06;
		this.item07 = item07;
		this.item08 = item08;
		this.item09 = item09;
		this.item10 = item10;
		this.item11 = item11;
		this.item12 = item12;
		this.applyperson = applyperson;
		this.invoicerelatedetail = invoicerelatedetail;
		this.createdate = createdate;
		this.authenticatingstate = authenticatingstate;
		this.authenticatingdate = authenticatingdate;
		this.checkstate = checkstate;
		this.checkdate = checkdate;
		this.operationdate = operationdate;
		this.naturalamountnottax = naturalamountnottax;
		this.originalamountnottax = originalamountnottax;
		this.isoverflag = isoverflag;
		this.billmaindataid = billmaindataid;
	}

	// Property accessors

	public Long getBillinvoiceid() {
		return this.billinvoiceid;
	}

	public void setBillinvoiceid(Long billinvoiceid) {
		this.billinvoiceid = billinvoiceid;
	}

	public String getInvoicetype() {
		return this.invoicetype;
	}

	public void setInvoicetype(String invoicetype) {
		this.invoicetype = invoicetype;
	}

	public String getInvoicecode() {
		return this.invoicecode;
	}

	public void setInvoicecode(String invoicecode) {
		this.invoicecode = invoicecode;
	}

	public String getInvoicenumber() {
		return this.invoicenumber;
	}

	public void setInvoicenumber(String invoicenumber) {
		this.invoicenumber = invoicenumber;
	}

	public String getInvoicecount() {
		return this.invoicecount;
	}

	public void setInvoicecount(String invoicecount) {
		this.invoicecount = invoicecount;
	}

	public Double getNaturalamount() {
		return this.naturalamount;
	}

	public void setNaturalamount(Double naturalamount) {
		this.naturalamount = naturalamount;
	}

	public Double getOriginalamount() {
		return this.originalamount;
	}

	public void setOriginalamount(Double originalamount) {
		this.originalamount = originalamount;
	}

	public Double getNaturalfactamount() {
		return this.naturalfactamount;
	}

	public void setNaturalfactamount(Double naturalfactamount) {
		this.naturalfactamount = naturalfactamount;
	}

	public Double getOriginalfactamount() {
		return this.originalfactamount;
	}

	public void setOriginalfactamount(Double originalfactamount) {
		this.originalfactamount = originalfactamount;
	}

	public Double getNaturalthispaymentamount() {
		return this.naturalthispaymentamount;
	}

	public void setNaturalthispaymentamount(Double naturalthispaymentamount) {
		this.naturalthispaymentamount = naturalthispaymentamount;
	}

	public Double getOriginalthispaymentamount() {
		return this.originalthispaymentamount;
	}

	public void setOriginalthispaymentamount(Double originalthispaymentamount) {
		this.originalthispaymentamount = originalthispaymentamount;
	}

	public Double getInvoicetax() {
		return this.invoicetax;
	}

	public void setInvoicetax(Double invoicetax) {
		this.invoicetax = invoicetax;
	}

	public Long getCreateperson() {
		return this.createperson;
	}

	public void setCreateperson(Long createperson) {
		this.createperson = createperson;
	}

	public Long getApplydept() {
		return this.applydept;
	}

	public void setApplydept(Long applydept) {
		this.applydept = applydept;
	}

	public String getItem01() {
		return this.item01;
	}

	public void setItem01(String item01) {
		this.item01 = item01;
	}

	public String getItem02() {
		return this.item02;
	}

	public void setItem02(String item02) {
		this.item02 = item02;
	}

	public String getItem03() {
		return this.item03;
	}

	public void setItem03(String item03) {
		this.item03 = item03;
	}

	public String getItem04() {
		return this.item04;
	}

	public void setItem04(String item04) {
		this.item04 = item04;
	}

	public String getItem05() {
		return this.item05;
	}

	public void setItem05(String item05) {
		this.item05 = item05;
	}

	public String getItem06() {
		return this.item06;
	}

	public void setItem06(String item06) {
		this.item06 = item06;
	}

	public String getItem07() {
		return this.item07;
	}

	public void setItem07(String item07) {
		this.item07 = item07;
	}

	public String getItem08() {
		return this.item08;
	}

	public void setItem08(String item08) {
		this.item08 = item08;
	}

	public String getItem09() {
		return this.item09;
	}

	public void setItem09(String item09) {
		this.item09 = item09;
	}

	public String getItem10() {
		return this.item10;
	}

	public void setItem10(String item10) {
		this.item10 = item10;
	}

	public String getItem11() {
		return this.item11;
	}

	public void setItem11(String item11) {
		this.item11 = item11;
	}

	public String getItem12() {
		return this.item12;
	}

	public void setItem12(String item12) {
		this.item12 = item12;
	}

	public Long getApplyperson() {
		return this.applyperson;
	}

	public void setApplyperson(Long applyperson) {
		this.applyperson = applyperson;
	}

	public String getInvoicerelatedetail() {
		return this.invoicerelatedetail;
	}

	public void setInvoicerelatedetail(String invoicerelatedetail) {
		this.invoicerelatedetail = invoicerelatedetail;
	}

	public Timestamp getCreatedate() {
		return this.createdate;
	}

	public void setCreatedate(Timestamp createdate) {
		this.createdate = createdate;
	}

	public Byte getAuthenticatingstate() {
		return this.authenticatingstate;
	}

	public void setAuthenticatingstate(Byte authenticatingstate) {
		this.authenticatingstate = authenticatingstate;
	}

	public Timestamp getAuthenticatingdate() {
		return this.authenticatingdate;
	}

	public void setAuthenticatingdate(Timestamp authenticatingdate) {
		this.authenticatingdate = authenticatingdate;
	}

	public Byte getCheckstate() {
		return this.checkstate;
	}

	public void setCheckstate(Byte checkstate) {
		this.checkstate = checkstate;
	}

	public Timestamp getCheckdate() {
		return this.checkdate;
	}

	public void setCheckdate(Timestamp checkdate) {
		this.checkdate = checkdate;
	}

	public Timestamp getOperationdate() {
		return this.operationdate;
	}

	public void setOperationdate(Timestamp operationdate) {
		this.operationdate = operationdate;
	}

	public Double getNaturalamountnottax() {
		return this.naturalamountnottax;
	}

	public void setNaturalamountnottax(Double naturalamountnottax) {
		this.naturalamountnottax = naturalamountnottax;
	}

	public Double getOriginalamountnottax() {
		return this.originalamountnottax;
	}

	public void setOriginalamountnottax(Double originalamountnottax) {
		this.originalamountnottax = originalamountnottax;
	}

	public Boolean getIsoverflag() {
		return this.isoverflag;
	}

	public void setIsoverflag(Boolean isoverflag) {
		this.isoverflag = isoverflag;
	}

	public Long getBillmaindataid() {
		return this.billmaindataid;
	}

	public void setBillmaindataid(Long billmaindataid) {
		this.billmaindataid = billmaindataid;
	}

}