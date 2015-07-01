package com.entity;

import java.sql.Timestamp;

/**
 * TCcBillpaymentdataId entity. @author MyEclipse Persistence Tools
 */

public class TCcBillpaymentdataId implements java.io.Serializable {

	// Fields

	private Long billpaymentdataid;
	private Long billmaindataid;
	private Long prepaymentdataid;
	private Double originalcurrency;
	private String currencycode;
	private String currencyname;
	private Double naturalcurrency;
	private String paymentcompany;
	private String paymentbank;
	private String paymentbranch;
	private String paymentbankfullname;
	private String paymentprovince;
	private String paymentcity;
	private String paymentaccount;
	private String paymentaccountname;
	private String inceptbank;
	private String inceptbranch;
	private String inceptbankfullname;
	private String inceptprovince;
	private String inceptcity;
	private String inceptname;
	private String inceptaccount;
	private String inceptaccounttype;
	private String inceptaccountname;
	private String settlement;
	private Long balancetype;
	private String balancenumber;
	private Timestamp paymentdate;
	private Timestamp createtime;
	private String usefor;
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
	private String item13;
	private String item14;
	private String item15;
	private String item16;
	private String item17;
	private String item18;
	private String item19;
	private String item20;
	private String item21;
	private String item22;
	private String item23;
	private String item24;
	private String item25;
	private String item26;
	private String item27;
	private String item28;
	private String item29;
	private String item30;
	private String ischecked;
	private String paymentareanumber;
	private String inceptid;
	private String mystatus;
	private String paymentstatus;
	private String falurecase;
	private String paymentusr;
	private String continualnum;
	private String ispublicflag;
	private Double debitcurrency;
	private String debittype;
	private Long inceptobjectid;
	private String bankaccountownername;
	private Long billingcompany;
	private Long centerid;
	private String sendstatus;
	private String mystatusbat;

	// Constructors

	/** default constructor */
	public TCcBillpaymentdataId() {
	}

	/** minimal constructor */
	public TCcBillpaymentdataId(Long billpaymentdataid) {
		this.billpaymentdataid = billpaymentdataid;
	}

	/** full constructor */
	public TCcBillpaymentdataId(Long billpaymentdataid, Long billmaindataid,
			Long prepaymentdataid, Double originalcurrency,
			String currencycode, String currencyname, Double naturalcurrency,
			String paymentcompany, String paymentbank, String paymentbranch,
			String paymentbankfullname, String paymentprovince,
			String paymentcity, String paymentaccount,
			String paymentaccountname, String inceptbank, String inceptbranch,
			String inceptbankfullname, String inceptprovince,
			String inceptcity, String inceptname, String inceptaccount,
			String inceptaccounttype, String inceptaccountname,
			String settlement, Long balancetype, String balancenumber,
			Timestamp paymentdate, Timestamp createtime, String usefor,
			String item01, String item02, String item03, String item04,
			String item05, String item06, String item07, String item08,
			String item09, String item10, String item11, String item12,
			String item13, String item14, String item15, String item16,
			String item17, String item18, String item19, String item20,
			String item21, String item22, String item23, String item24,
			String item25, String item26, String item27, String item28,
			String item29, String item30, String ischecked,
			String paymentareanumber, String inceptid, String mystatus,
			String paymentstatus, String falurecase, String paymentusr,
			String continualnum, String ispublicflag, Double debitcurrency,
			String debittype, Long inceptobjectid, String bankaccountownername,
			Long billingcompany, Long centerid, String sendstatus,
			String mystatusbat) {
		this.billpaymentdataid = billpaymentdataid;
		this.billmaindataid = billmaindataid;
		this.prepaymentdataid = prepaymentdataid;
		this.originalcurrency = originalcurrency;
		this.currencycode = currencycode;
		this.currencyname = currencyname;
		this.naturalcurrency = naturalcurrency;
		this.paymentcompany = paymentcompany;
		this.paymentbank = paymentbank;
		this.paymentbranch = paymentbranch;
		this.paymentbankfullname = paymentbankfullname;
		this.paymentprovince = paymentprovince;
		this.paymentcity = paymentcity;
		this.paymentaccount = paymentaccount;
		this.paymentaccountname = paymentaccountname;
		this.inceptbank = inceptbank;
		this.inceptbranch = inceptbranch;
		this.inceptbankfullname = inceptbankfullname;
		this.inceptprovince = inceptprovince;
		this.inceptcity = inceptcity;
		this.inceptname = inceptname;
		this.inceptaccount = inceptaccount;
		this.inceptaccounttype = inceptaccounttype;
		this.inceptaccountname = inceptaccountname;
		this.settlement = settlement;
		this.balancetype = balancetype;
		this.balancenumber = balancenumber;
		this.paymentdate = paymentdate;
		this.createtime = createtime;
		this.usefor = usefor;
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
		this.item13 = item13;
		this.item14 = item14;
		this.item15 = item15;
		this.item16 = item16;
		this.item17 = item17;
		this.item18 = item18;
		this.item19 = item19;
		this.item20 = item20;
		this.item21 = item21;
		this.item22 = item22;
		this.item23 = item23;
		this.item24 = item24;
		this.item25 = item25;
		this.item26 = item26;
		this.item27 = item27;
		this.item28 = item28;
		this.item29 = item29;
		this.item30 = item30;
		this.ischecked = ischecked;
		this.paymentareanumber = paymentareanumber;
		this.inceptid = inceptid;
		this.mystatus = mystatus;
		this.paymentstatus = paymentstatus;
		this.falurecase = falurecase;
		this.paymentusr = paymentusr;
		this.continualnum = continualnum;
		this.ispublicflag = ispublicflag;
		this.debitcurrency = debitcurrency;
		this.debittype = debittype;
		this.inceptobjectid = inceptobjectid;
		this.bankaccountownername = bankaccountownername;
		this.billingcompany = billingcompany;
		this.centerid = centerid;
		this.sendstatus = sendstatus;
		this.mystatusbat = mystatusbat;
	}

	// Property accessors

	public Long getBillpaymentdataid() {
		return this.billpaymentdataid;
	}

	public void setBillpaymentdataid(Long billpaymentdataid) {
		this.billpaymentdataid = billpaymentdataid;
	}

	public Long getBillmaindataid() {
		return this.billmaindataid;
	}

	public void setBillmaindataid(Long billmaindataid) {
		this.billmaindataid = billmaindataid;
	}

	public Long getPrepaymentdataid() {
		return this.prepaymentdataid;
	}

	public void setPrepaymentdataid(Long prepaymentdataid) {
		this.prepaymentdataid = prepaymentdataid;
	}

	public Double getOriginalcurrency() {
		return this.originalcurrency;
	}

	public void setOriginalcurrency(Double originalcurrency) {
		this.originalcurrency = originalcurrency;
	}

	public String getCurrencycode() {
		return this.currencycode;
	}

	public void setCurrencycode(String currencycode) {
		this.currencycode = currencycode;
	}

	public String getCurrencyname() {
		return this.currencyname;
	}

	public void setCurrencyname(String currencyname) {
		this.currencyname = currencyname;
	}

	public Double getNaturalcurrency() {
		return this.naturalcurrency;
	}

	public void setNaturalcurrency(Double naturalcurrency) {
		this.naturalcurrency = naturalcurrency;
	}

	public String getPaymentcompany() {
		return this.paymentcompany;
	}

	public void setPaymentcompany(String paymentcompany) {
		this.paymentcompany = paymentcompany;
	}

	public String getPaymentbank() {
		return this.paymentbank;
	}

	public void setPaymentbank(String paymentbank) {
		this.paymentbank = paymentbank;
	}

	public String getPaymentbranch() {
		return this.paymentbranch;
	}

	public void setPaymentbranch(String paymentbranch) {
		this.paymentbranch = paymentbranch;
	}

	public String getPaymentbankfullname() {
		return this.paymentbankfullname;
	}

	public void setPaymentbankfullname(String paymentbankfullname) {
		this.paymentbankfullname = paymentbankfullname;
	}

	public String getPaymentprovince() {
		return this.paymentprovince;
	}

	public void setPaymentprovince(String paymentprovince) {
		this.paymentprovince = paymentprovince;
	}

	public String getPaymentcity() {
		return this.paymentcity;
	}

	public void setPaymentcity(String paymentcity) {
		this.paymentcity = paymentcity;
	}

	public String getPaymentaccount() {
		return this.paymentaccount;
	}

	public void setPaymentaccount(String paymentaccount) {
		this.paymentaccount = paymentaccount;
	}

	public String getPaymentaccountname() {
		return this.paymentaccountname;
	}

	public void setPaymentaccountname(String paymentaccountname) {
		this.paymentaccountname = paymentaccountname;
	}

	public String getInceptbank() {
		return this.inceptbank;
	}

	public void setInceptbank(String inceptbank) {
		this.inceptbank = inceptbank;
	}

	public String getInceptbranch() {
		return this.inceptbranch;
	}

	public void setInceptbranch(String inceptbranch) {
		this.inceptbranch = inceptbranch;
	}

	public String getInceptbankfullname() {
		return this.inceptbankfullname;
	}

	public void setInceptbankfullname(String inceptbankfullname) {
		this.inceptbankfullname = inceptbankfullname;
	}

	public String getInceptprovince() {
		return this.inceptprovince;
	}

	public void setInceptprovince(String inceptprovince) {
		this.inceptprovince = inceptprovince;
	}

	public String getInceptcity() {
		return this.inceptcity;
	}

	public void setInceptcity(String inceptcity) {
		this.inceptcity = inceptcity;
	}

	public String getInceptname() {
		return this.inceptname;
	}

	public void setInceptname(String inceptname) {
		this.inceptname = inceptname;
	}

	public String getInceptaccount() {
		return this.inceptaccount;
	}

	public void setInceptaccount(String inceptaccount) {
		this.inceptaccount = inceptaccount;
	}

	public String getInceptaccounttype() {
		return this.inceptaccounttype;
	}

	public void setInceptaccounttype(String inceptaccounttype) {
		this.inceptaccounttype = inceptaccounttype;
	}

	public String getInceptaccountname() {
		return this.inceptaccountname;
	}

	public void setInceptaccountname(String inceptaccountname) {
		this.inceptaccountname = inceptaccountname;
	}

	public String getSettlement() {
		return this.settlement;
	}

	public void setSettlement(String settlement) {
		this.settlement = settlement;
	}

	public Long getBalancetype() {
		return this.balancetype;
	}

	public void setBalancetype(Long balancetype) {
		this.balancetype = balancetype;
	}

	public String getBalancenumber() {
		return this.balancenumber;
	}

	public void setBalancenumber(String balancenumber) {
		this.balancenumber = balancenumber;
	}

	public Timestamp getPaymentdate() {
		return this.paymentdate;
	}

	public void setPaymentdate(Timestamp paymentdate) {
		this.paymentdate = paymentdate;
	}

	public Timestamp getCreatetime() {
		return this.createtime;
	}

	public void setCreatetime(Timestamp createtime) {
		this.createtime = createtime;
	}

	public String getUsefor() {
		return this.usefor;
	}

	public void setUsefor(String usefor) {
		this.usefor = usefor;
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

	public String getItem13() {
		return this.item13;
	}

	public void setItem13(String item13) {
		this.item13 = item13;
	}

	public String getItem14() {
		return this.item14;
	}

	public void setItem14(String item14) {
		this.item14 = item14;
	}

	public String getItem15() {
		return this.item15;
	}

	public void setItem15(String item15) {
		this.item15 = item15;
	}

	public String getItem16() {
		return this.item16;
	}

	public void setItem16(String item16) {
		this.item16 = item16;
	}

	public String getItem17() {
		return this.item17;
	}

	public void setItem17(String item17) {
		this.item17 = item17;
	}

	public String getItem18() {
		return this.item18;
	}

	public void setItem18(String item18) {
		this.item18 = item18;
	}

	public String getItem19() {
		return this.item19;
	}

	public void setItem19(String item19) {
		this.item19 = item19;
	}

	public String getItem20() {
		return this.item20;
	}

	public void setItem20(String item20) {
		this.item20 = item20;
	}

	public String getItem21() {
		return this.item21;
	}

	public void setItem21(String item21) {
		this.item21 = item21;
	}

	public String getItem22() {
		return this.item22;
	}

	public void setItem22(String item22) {
		this.item22 = item22;
	}

	public String getItem23() {
		return this.item23;
	}

	public void setItem23(String item23) {
		this.item23 = item23;
	}

	public String getItem24() {
		return this.item24;
	}

	public void setItem24(String item24) {
		this.item24 = item24;
	}

	public String getItem25() {
		return this.item25;
	}

	public void setItem25(String item25) {
		this.item25 = item25;
	}

	public String getItem26() {
		return this.item26;
	}

	public void setItem26(String item26) {
		this.item26 = item26;
	}

	public String getItem27() {
		return this.item27;
	}

	public void setItem27(String item27) {
		this.item27 = item27;
	}

	public String getItem28() {
		return this.item28;
	}

	public void setItem28(String item28) {
		this.item28 = item28;
	}

	public String getItem29() {
		return this.item29;
	}

	public void setItem29(String item29) {
		this.item29 = item29;
	}

	public String getItem30() {
		return this.item30;
	}

	public void setItem30(String item30) {
		this.item30 = item30;
	}

	public String getIschecked() {
		return this.ischecked;
	}

	public void setIschecked(String ischecked) {
		this.ischecked = ischecked;
	}

	public String getPaymentareanumber() {
		return this.paymentareanumber;
	}

	public void setPaymentareanumber(String paymentareanumber) {
		this.paymentareanumber = paymentareanumber;
	}

	public String getInceptid() {
		return this.inceptid;
	}

	public void setInceptid(String inceptid) {
		this.inceptid = inceptid;
	}

	public String getMystatus() {
		return this.mystatus;
	}

	public void setMystatus(String mystatus) {
		this.mystatus = mystatus;
	}

	public String getPaymentstatus() {
		return this.paymentstatus;
	}

	public void setPaymentstatus(String paymentstatus) {
		this.paymentstatus = paymentstatus;
	}

	public String getFalurecase() {
		return this.falurecase;
	}

	public void setFalurecase(String falurecase) {
		this.falurecase = falurecase;
	}

	public String getPaymentusr() {
		return this.paymentusr;
	}

	public void setPaymentusr(String paymentusr) {
		this.paymentusr = paymentusr;
	}

	public String getContinualnum() {
		return this.continualnum;
	}

	public void setContinualnum(String continualnum) {
		this.continualnum = continualnum;
	}

	public String getIspublicflag() {
		return this.ispublicflag;
	}

	public void setIspublicflag(String ispublicflag) {
		this.ispublicflag = ispublicflag;
	}

	public Double getDebitcurrency() {
		return this.debitcurrency;
	}

	public void setDebitcurrency(Double debitcurrency) {
		this.debitcurrency = debitcurrency;
	}

	public String getDebittype() {
		return this.debittype;
	}

	public void setDebittype(String debittype) {
		this.debittype = debittype;
	}

	public Long getInceptobjectid() {
		return this.inceptobjectid;
	}

	public void setInceptobjectid(Long inceptobjectid) {
		this.inceptobjectid = inceptobjectid;
	}

	public String getBankaccountownername() {
		return this.bankaccountownername;
	}

	public void setBankaccountownername(String bankaccountownername) {
		this.bankaccountownername = bankaccountownername;
	}

	public Long getBillingcompany() {
		return this.billingcompany;
	}

	public void setBillingcompany(Long billingcompany) {
		this.billingcompany = billingcompany;
	}

	public Long getCenterid() {
		return this.centerid;
	}

	public void setCenterid(Long centerid) {
		this.centerid = centerid;
	}

	public String getSendstatus() {
		return this.sendstatus;
	}

	public void setSendstatus(String sendstatus) {
		this.sendstatus = sendstatus;
	}

	public String getMystatusbat() {
		return this.mystatusbat;
	}

	public void setMystatusbat(String mystatusbat) {
		this.mystatusbat = mystatusbat;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TCcBillpaymentdataId))
			return false;
		TCcBillpaymentdataId castOther = (TCcBillpaymentdataId) other;

		return ((this.getBillpaymentdataid() == castOther
				.getBillpaymentdataid()) || (this.getBillpaymentdataid() != null
				&& castOther.getBillpaymentdataid() != null && this
				.getBillpaymentdataid()
				.equals(castOther.getBillpaymentdataid())))
				&& ((this.getBillmaindataid() == castOther.getBillmaindataid()) || (this
						.getBillmaindataid() != null
						&& castOther.getBillmaindataid() != null && this
						.getBillmaindataid().equals(
								castOther.getBillmaindataid())))
				&& ((this.getPrepaymentdataid() == castOther
						.getPrepaymentdataid()) || (this.getPrepaymentdataid() != null
						&& castOther.getPrepaymentdataid() != null && this
						.getPrepaymentdataid().equals(
								castOther.getPrepaymentdataid())))
				&& ((this.getOriginalcurrency() == castOther
						.getOriginalcurrency()) || (this.getOriginalcurrency() != null
						&& castOther.getOriginalcurrency() != null && this
						.getOriginalcurrency().equals(
								castOther.getOriginalcurrency())))
				&& ((this.getCurrencycode() == castOther.getCurrencycode()) || (this
						.getCurrencycode() != null
						&& castOther.getCurrencycode() != null && this
						.getCurrencycode().equals(castOther.getCurrencycode())))
				&& ((this.getCurrencyname() == castOther.getCurrencyname()) || (this
						.getCurrencyname() != null
						&& castOther.getCurrencyname() != null && this
						.getCurrencyname().equals(castOther.getCurrencyname())))
				&& ((this.getNaturalcurrency() == castOther
						.getNaturalcurrency()) || (this.getNaturalcurrency() != null
						&& castOther.getNaturalcurrency() != null && this
						.getNaturalcurrency().equals(
								castOther.getNaturalcurrency())))
				&& ((this.getPaymentcompany() == castOther.getPaymentcompany()) || (this
						.getPaymentcompany() != null
						&& castOther.getPaymentcompany() != null && this
						.getPaymentcompany().equals(
								castOther.getPaymentcompany())))
				&& ((this.getPaymentbank() == castOther.getPaymentbank()) || (this
						.getPaymentbank() != null
						&& castOther.getPaymentbank() != null && this
						.getPaymentbank().equals(castOther.getPaymentbank())))
				&& ((this.getPaymentbranch() == castOther.getPaymentbranch()) || (this
						.getPaymentbranch() != null
						&& castOther.getPaymentbranch() != null && this
						.getPaymentbranch()
						.equals(castOther.getPaymentbranch())))
				&& ((this.getPaymentbankfullname() == castOther
						.getPaymentbankfullname()) || (this
						.getPaymentbankfullname() != null
						&& castOther.getPaymentbankfullname() != null && this
						.getPaymentbankfullname().equals(
								castOther.getPaymentbankfullname())))
				&& ((this.getPaymentprovince() == castOther
						.getPaymentprovince()) || (this.getPaymentprovince() != null
						&& castOther.getPaymentprovince() != null && this
						.getPaymentprovince().equals(
								castOther.getPaymentprovince())))
				&& ((this.getPaymentcity() == castOther.getPaymentcity()) || (this
						.getPaymentcity() != null
						&& castOther.getPaymentcity() != null && this
						.getPaymentcity().equals(castOther.getPaymentcity())))
				&& ((this.getPaymentaccount() == castOther.getPaymentaccount()) || (this
						.getPaymentaccount() != null
						&& castOther.getPaymentaccount() != null && this
						.getPaymentaccount().equals(
								castOther.getPaymentaccount())))
				&& ((this.getPaymentaccountname() == castOther
						.getPaymentaccountname()) || (this
						.getPaymentaccountname() != null
						&& castOther.getPaymentaccountname() != null && this
						.getPaymentaccountname().equals(
								castOther.getPaymentaccountname())))
				&& ((this.getInceptbank() == castOther.getInceptbank()) || (this
						.getInceptbank() != null
						&& castOther.getInceptbank() != null && this
						.getInceptbank().equals(castOther.getInceptbank())))
				&& ((this.getInceptbranch() == castOther.getInceptbranch()) || (this
						.getInceptbranch() != null
						&& castOther.getInceptbranch() != null && this
						.getInceptbranch().equals(castOther.getInceptbranch())))
				&& ((this.getInceptbankfullname() == castOther
						.getInceptbankfullname()) || (this
						.getInceptbankfullname() != null
						&& castOther.getInceptbankfullname() != null && this
						.getInceptbankfullname().equals(
								castOther.getInceptbankfullname())))
				&& ((this.getInceptprovince() == castOther.getInceptprovince()) || (this
						.getInceptprovince() != null
						&& castOther.getInceptprovince() != null && this
						.getInceptprovince().equals(
								castOther.getInceptprovince())))
				&& ((this.getInceptcity() == castOther.getInceptcity()) || (this
						.getInceptcity() != null
						&& castOther.getInceptcity() != null && this
						.getInceptcity().equals(castOther.getInceptcity())))
				&& ((this.getInceptname() == castOther.getInceptname()) || (this
						.getInceptname() != null
						&& castOther.getInceptname() != null && this
						.getInceptname().equals(castOther.getInceptname())))
				&& ((this.getInceptaccount() == castOther.getInceptaccount()) || (this
						.getInceptaccount() != null
						&& castOther.getInceptaccount() != null && this
						.getInceptaccount()
						.equals(castOther.getInceptaccount())))
				&& ((this.getInceptaccounttype() == castOther
						.getInceptaccounttype()) || (this
						.getInceptaccounttype() != null
						&& castOther.getInceptaccounttype() != null && this
						.getInceptaccounttype().equals(
								castOther.getInceptaccounttype())))
				&& ((this.getInceptaccountname() == castOther
						.getInceptaccountname()) || (this
						.getInceptaccountname() != null
						&& castOther.getInceptaccountname() != null && this
						.getInceptaccountname().equals(
								castOther.getInceptaccountname())))
				&& ((this.getSettlement() == castOther.getSettlement()) || (this
						.getSettlement() != null
						&& castOther.getSettlement() != null && this
						.getSettlement().equals(castOther.getSettlement())))
				&& ((this.getBalancetype() == castOther.getBalancetype()) || (this
						.getBalancetype() != null
						&& castOther.getBalancetype() != null && this
						.getBalancetype().equals(castOther.getBalancetype())))
				&& ((this.getBalancenumber() == castOther.getBalancenumber()) || (this
						.getBalancenumber() != null
						&& castOther.getBalancenumber() != null && this
						.getBalancenumber()
						.equals(castOther.getBalancenumber())))
				&& ((this.getPaymentdate() == castOther.getPaymentdate()) || (this
						.getPaymentdate() != null
						&& castOther.getPaymentdate() != null && this
						.getPaymentdate().equals(castOther.getPaymentdate())))
				&& ((this.getCreatetime() == castOther.getCreatetime()) || (this
						.getCreatetime() != null
						&& castOther.getCreatetime() != null && this
						.getCreatetime().equals(castOther.getCreatetime())))
				&& ((this.getUsefor() == castOther.getUsefor()) || (this
						.getUsefor() != null && castOther.getUsefor() != null && this
						.getUsefor().equals(castOther.getUsefor())))
				&& ((this.getItem01() == castOther.getItem01()) || (this
						.getItem01() != null && castOther.getItem01() != null && this
						.getItem01().equals(castOther.getItem01())))
				&& ((this.getItem02() == castOther.getItem02()) || (this
						.getItem02() != null && castOther.getItem02() != null && this
						.getItem02().equals(castOther.getItem02())))
				&& ((this.getItem03() == castOther.getItem03()) || (this
						.getItem03() != null && castOther.getItem03() != null && this
						.getItem03().equals(castOther.getItem03())))
				&& ((this.getItem04() == castOther.getItem04()) || (this
						.getItem04() != null && castOther.getItem04() != null && this
						.getItem04().equals(castOther.getItem04())))
				&& ((this.getItem05() == castOther.getItem05()) || (this
						.getItem05() != null && castOther.getItem05() != null && this
						.getItem05().equals(castOther.getItem05())))
				&& ((this.getItem06() == castOther.getItem06()) || (this
						.getItem06() != null && castOther.getItem06() != null && this
						.getItem06().equals(castOther.getItem06())))
				&& ((this.getItem07() == castOther.getItem07()) || (this
						.getItem07() != null && castOther.getItem07() != null && this
						.getItem07().equals(castOther.getItem07())))
				&& ((this.getItem08() == castOther.getItem08()) || (this
						.getItem08() != null && castOther.getItem08() != null && this
						.getItem08().equals(castOther.getItem08())))
				&& ((this.getItem09() == castOther.getItem09()) || (this
						.getItem09() != null && castOther.getItem09() != null && this
						.getItem09().equals(castOther.getItem09())))
				&& ((this.getItem10() == castOther.getItem10()) || (this
						.getItem10() != null && castOther.getItem10() != null && this
						.getItem10().equals(castOther.getItem10())))
				&& ((this.getItem11() == castOther.getItem11()) || (this
						.getItem11() != null && castOther.getItem11() != null && this
						.getItem11().equals(castOther.getItem11())))
				&& ((this.getItem12() == castOther.getItem12()) || (this
						.getItem12() != null && castOther.getItem12() != null && this
						.getItem12().equals(castOther.getItem12())))
				&& ((this.getItem13() == castOther.getItem13()) || (this
						.getItem13() != null && castOther.getItem13() != null && this
						.getItem13().equals(castOther.getItem13())))
				&& ((this.getItem14() == castOther.getItem14()) || (this
						.getItem14() != null && castOther.getItem14() != null && this
						.getItem14().equals(castOther.getItem14())))
				&& ((this.getItem15() == castOther.getItem15()) || (this
						.getItem15() != null && castOther.getItem15() != null && this
						.getItem15().equals(castOther.getItem15())))
				&& ((this.getItem16() == castOther.getItem16()) || (this
						.getItem16() != null && castOther.getItem16() != null && this
						.getItem16().equals(castOther.getItem16())))
				&& ((this.getItem17() == castOther.getItem17()) || (this
						.getItem17() != null && castOther.getItem17() != null && this
						.getItem17().equals(castOther.getItem17())))
				&& ((this.getItem18() == castOther.getItem18()) || (this
						.getItem18() != null && castOther.getItem18() != null && this
						.getItem18().equals(castOther.getItem18())))
				&& ((this.getItem19() == castOther.getItem19()) || (this
						.getItem19() != null && castOther.getItem19() != null && this
						.getItem19().equals(castOther.getItem19())))
				&& ((this.getItem20() == castOther.getItem20()) || (this
						.getItem20() != null && castOther.getItem20() != null && this
						.getItem20().equals(castOther.getItem20())))
				&& ((this.getItem21() == castOther.getItem21()) || (this
						.getItem21() != null && castOther.getItem21() != null && this
						.getItem21().equals(castOther.getItem21())))
				&& ((this.getItem22() == castOther.getItem22()) || (this
						.getItem22() != null && castOther.getItem22() != null && this
						.getItem22().equals(castOther.getItem22())))
				&& ((this.getItem23() == castOther.getItem23()) || (this
						.getItem23() != null && castOther.getItem23() != null && this
						.getItem23().equals(castOther.getItem23())))
				&& ((this.getItem24() == castOther.getItem24()) || (this
						.getItem24() != null && castOther.getItem24() != null && this
						.getItem24().equals(castOther.getItem24())))
				&& ((this.getItem25() == castOther.getItem25()) || (this
						.getItem25() != null && castOther.getItem25() != null && this
						.getItem25().equals(castOther.getItem25())))
				&& ((this.getItem26() == castOther.getItem26()) || (this
						.getItem26() != null && castOther.getItem26() != null && this
						.getItem26().equals(castOther.getItem26())))
				&& ((this.getItem27() == castOther.getItem27()) || (this
						.getItem27() != null && castOther.getItem27() != null && this
						.getItem27().equals(castOther.getItem27())))
				&& ((this.getItem28() == castOther.getItem28()) || (this
						.getItem28() != null && castOther.getItem28() != null && this
						.getItem28().equals(castOther.getItem28())))
				&& ((this.getItem29() == castOther.getItem29()) || (this
						.getItem29() != null && castOther.getItem29() != null && this
						.getItem29().equals(castOther.getItem29())))
				&& ((this.getItem30() == castOther.getItem30()) || (this
						.getItem30() != null && castOther.getItem30() != null && this
						.getItem30().equals(castOther.getItem30())))
				&& ((this.getIschecked() == castOther.getIschecked()) || (this
						.getIschecked() != null
						&& castOther.getIschecked() != null && this
						.getIschecked().equals(castOther.getIschecked())))
				&& ((this.getPaymentareanumber() == castOther
						.getPaymentareanumber()) || (this
						.getPaymentareanumber() != null
						&& castOther.getPaymentareanumber() != null && this
						.getPaymentareanumber().equals(
								castOther.getPaymentareanumber())))
				&& ((this.getInceptid() == castOther.getInceptid()) || (this
						.getInceptid() != null
						&& castOther.getInceptid() != null && this
						.getInceptid().equals(castOther.getInceptid())))
				&& ((this.getMystatus() == castOther.getMystatus()) || (this
						.getMystatus() != null
						&& castOther.getMystatus() != null && this
						.getMystatus().equals(castOther.getMystatus())))
				&& ((this.getPaymentstatus() == castOther.getPaymentstatus()) || (this
						.getPaymentstatus() != null
						&& castOther.getPaymentstatus() != null && this
						.getPaymentstatus()
						.equals(castOther.getPaymentstatus())))
				&& ((this.getFalurecase() == castOther.getFalurecase()) || (this
						.getFalurecase() != null
						&& castOther.getFalurecase() != null && this
						.getFalurecase().equals(castOther.getFalurecase())))
				&& ((this.getPaymentusr() == castOther.getPaymentusr()) || (this
						.getPaymentusr() != null
						&& castOther.getPaymentusr() != null && this
						.getPaymentusr().equals(castOther.getPaymentusr())))
				&& ((this.getContinualnum() == castOther.getContinualnum()) || (this
						.getContinualnum() != null
						&& castOther.getContinualnum() != null && this
						.getContinualnum().equals(castOther.getContinualnum())))
				&& ((this.getIspublicflag() == castOther.getIspublicflag()) || (this
						.getIspublicflag() != null
						&& castOther.getIspublicflag() != null && this
						.getIspublicflag().equals(castOther.getIspublicflag())))
				&& ((this.getDebitcurrency() == castOther.getDebitcurrency()) || (this
						.getDebitcurrency() != null
						&& castOther.getDebitcurrency() != null && this
						.getDebitcurrency()
						.equals(castOther.getDebitcurrency())))
				&& ((this.getDebittype() == castOther.getDebittype()) || (this
						.getDebittype() != null
						&& castOther.getDebittype() != null && this
						.getDebittype().equals(castOther.getDebittype())))
				&& ((this.getInceptobjectid() == castOther.getInceptobjectid()) || (this
						.getInceptobjectid() != null
						&& castOther.getInceptobjectid() != null && this
						.getInceptobjectid().equals(
								castOther.getInceptobjectid())))
				&& ((this.getBankaccountownername() == castOther
						.getBankaccountownername()) || (this
						.getBankaccountownername() != null
						&& castOther.getBankaccountownername() != null && this
						.getBankaccountownername().equals(
								castOther.getBankaccountownername())))
				&& ((this.getBillingcompany() == castOther.getBillingcompany()) || (this
						.getBillingcompany() != null
						&& castOther.getBillingcompany() != null && this
						.getBillingcompany().equals(
								castOther.getBillingcompany())))
				&& ((this.getCenterid() == castOther.getCenterid()) || (this
						.getCenterid() != null
						&& castOther.getCenterid() != null && this
						.getCenterid().equals(castOther.getCenterid())))
				&& ((this.getSendstatus() == castOther.getSendstatus()) || (this
						.getSendstatus() != null
						&& castOther.getSendstatus() != null && this
						.getSendstatus().equals(castOther.getSendstatus())))
				&& ((this.getMystatusbat() == castOther.getMystatusbat()) || (this
						.getMystatusbat() != null
						&& castOther.getMystatusbat() != null && this
						.getMystatusbat().equals(castOther.getMystatusbat())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getBillpaymentdataid() == null ? 0 : this
						.getBillpaymentdataid().hashCode());
		result = 37
				* result
				+ (getBillmaindataid() == null ? 0 : this.getBillmaindataid()
						.hashCode());
		result = 37
				* result
				+ (getPrepaymentdataid() == null ? 0 : this
						.getPrepaymentdataid().hashCode());
		result = 37
				* result
				+ (getOriginalcurrency() == null ? 0 : this
						.getOriginalcurrency().hashCode());
		result = 37
				* result
				+ (getCurrencycode() == null ? 0 : this.getCurrencycode()
						.hashCode());
		result = 37
				* result
				+ (getCurrencyname() == null ? 0 : this.getCurrencyname()
						.hashCode());
		result = 37
				* result
				+ (getNaturalcurrency() == null ? 0 : this.getNaturalcurrency()
						.hashCode());
		result = 37
				* result
				+ (getPaymentcompany() == null ? 0 : this.getPaymentcompany()
						.hashCode());
		result = 37
				* result
				+ (getPaymentbank() == null ? 0 : this.getPaymentbank()
						.hashCode());
		result = 37
				* result
				+ (getPaymentbranch() == null ? 0 : this.getPaymentbranch()
						.hashCode());
		result = 37
				* result
				+ (getPaymentbankfullname() == null ? 0 : this
						.getPaymentbankfullname().hashCode());
		result = 37
				* result
				+ (getPaymentprovince() == null ? 0 : this.getPaymentprovince()
						.hashCode());
		result = 37
				* result
				+ (getPaymentcity() == null ? 0 : this.getPaymentcity()
						.hashCode());
		result = 37
				* result
				+ (getPaymentaccount() == null ? 0 : this.getPaymentaccount()
						.hashCode());
		result = 37
				* result
				+ (getPaymentaccountname() == null ? 0 : this
						.getPaymentaccountname().hashCode());
		result = 37
				* result
				+ (getInceptbank() == null ? 0 : this.getInceptbank()
						.hashCode());
		result = 37
				* result
				+ (getInceptbranch() == null ? 0 : this.getInceptbranch()
						.hashCode());
		result = 37
				* result
				+ (getInceptbankfullname() == null ? 0 : this
						.getInceptbankfullname().hashCode());
		result = 37
				* result
				+ (getInceptprovince() == null ? 0 : this.getInceptprovince()
						.hashCode());
		result = 37
				* result
				+ (getInceptcity() == null ? 0 : this.getInceptcity()
						.hashCode());
		result = 37
				* result
				+ (getInceptname() == null ? 0 : this.getInceptname()
						.hashCode());
		result = 37
				* result
				+ (getInceptaccount() == null ? 0 : this.getInceptaccount()
						.hashCode());
		result = 37
				* result
				+ (getInceptaccounttype() == null ? 0 : this
						.getInceptaccounttype().hashCode());
		result = 37
				* result
				+ (getInceptaccountname() == null ? 0 : this
						.getInceptaccountname().hashCode());
		result = 37
				* result
				+ (getSettlement() == null ? 0 : this.getSettlement()
						.hashCode());
		result = 37
				* result
				+ (getBalancetype() == null ? 0 : this.getBalancetype()
						.hashCode());
		result = 37
				* result
				+ (getBalancenumber() == null ? 0 : this.getBalancenumber()
						.hashCode());
		result = 37
				* result
				+ (getPaymentdate() == null ? 0 : this.getPaymentdate()
						.hashCode());
		result = 37
				* result
				+ (getCreatetime() == null ? 0 : this.getCreatetime()
						.hashCode());
		result = 37 * result
				+ (getUsefor() == null ? 0 : this.getUsefor().hashCode());
		result = 37 * result
				+ (getItem01() == null ? 0 : this.getItem01().hashCode());
		result = 37 * result
				+ (getItem02() == null ? 0 : this.getItem02().hashCode());
		result = 37 * result
				+ (getItem03() == null ? 0 : this.getItem03().hashCode());
		result = 37 * result
				+ (getItem04() == null ? 0 : this.getItem04().hashCode());
		result = 37 * result
				+ (getItem05() == null ? 0 : this.getItem05().hashCode());
		result = 37 * result
				+ (getItem06() == null ? 0 : this.getItem06().hashCode());
		result = 37 * result
				+ (getItem07() == null ? 0 : this.getItem07().hashCode());
		result = 37 * result
				+ (getItem08() == null ? 0 : this.getItem08().hashCode());
		result = 37 * result
				+ (getItem09() == null ? 0 : this.getItem09().hashCode());
		result = 37 * result
				+ (getItem10() == null ? 0 : this.getItem10().hashCode());
		result = 37 * result
				+ (getItem11() == null ? 0 : this.getItem11().hashCode());
		result = 37 * result
				+ (getItem12() == null ? 0 : this.getItem12().hashCode());
		result = 37 * result
				+ (getItem13() == null ? 0 : this.getItem13().hashCode());
		result = 37 * result
				+ (getItem14() == null ? 0 : this.getItem14().hashCode());
		result = 37 * result
				+ (getItem15() == null ? 0 : this.getItem15().hashCode());
		result = 37 * result
				+ (getItem16() == null ? 0 : this.getItem16().hashCode());
		result = 37 * result
				+ (getItem17() == null ? 0 : this.getItem17().hashCode());
		result = 37 * result
				+ (getItem18() == null ? 0 : this.getItem18().hashCode());
		result = 37 * result
				+ (getItem19() == null ? 0 : this.getItem19().hashCode());
		result = 37 * result
				+ (getItem20() == null ? 0 : this.getItem20().hashCode());
		result = 37 * result
				+ (getItem21() == null ? 0 : this.getItem21().hashCode());
		result = 37 * result
				+ (getItem22() == null ? 0 : this.getItem22().hashCode());
		result = 37 * result
				+ (getItem23() == null ? 0 : this.getItem23().hashCode());
		result = 37 * result
				+ (getItem24() == null ? 0 : this.getItem24().hashCode());
		result = 37 * result
				+ (getItem25() == null ? 0 : this.getItem25().hashCode());
		result = 37 * result
				+ (getItem26() == null ? 0 : this.getItem26().hashCode());
		result = 37 * result
				+ (getItem27() == null ? 0 : this.getItem27().hashCode());
		result = 37 * result
				+ (getItem28() == null ? 0 : this.getItem28().hashCode());
		result = 37 * result
				+ (getItem29() == null ? 0 : this.getItem29().hashCode());
		result = 37 * result
				+ (getItem30() == null ? 0 : this.getItem30().hashCode());
		result = 37 * result
				+ (getIschecked() == null ? 0 : this.getIschecked().hashCode());
		result = 37
				* result
				+ (getPaymentareanumber() == null ? 0 : this
						.getPaymentareanumber().hashCode());
		result = 37 * result
				+ (getInceptid() == null ? 0 : this.getInceptid().hashCode());
		result = 37 * result
				+ (getMystatus() == null ? 0 : this.getMystatus().hashCode());
		result = 37
				* result
				+ (getPaymentstatus() == null ? 0 : this.getPaymentstatus()
						.hashCode());
		result = 37
				* result
				+ (getFalurecase() == null ? 0 : this.getFalurecase()
						.hashCode());
		result = 37
				* result
				+ (getPaymentusr() == null ? 0 : this.getPaymentusr()
						.hashCode());
		result = 37
				* result
				+ (getContinualnum() == null ? 0 : this.getContinualnum()
						.hashCode());
		result = 37
				* result
				+ (getIspublicflag() == null ? 0 : this.getIspublicflag()
						.hashCode());
		result = 37
				* result
				+ (getDebitcurrency() == null ? 0 : this.getDebitcurrency()
						.hashCode());
		result = 37 * result
				+ (getDebittype() == null ? 0 : this.getDebittype().hashCode());
		result = 37
				* result
				+ (getInceptobjectid() == null ? 0 : this.getInceptobjectid()
						.hashCode());
		result = 37
				* result
				+ (getBankaccountownername() == null ? 0 : this
						.getBankaccountownername().hashCode());
		result = 37
				* result
				+ (getBillingcompany() == null ? 0 : this.getBillingcompany()
						.hashCode());
		result = 37 * result
				+ (getCenterid() == null ? 0 : this.getCenterid().hashCode());
		result = 37
				* result
				+ (getSendstatus() == null ? 0 : this.getSendstatus()
						.hashCode());
		result = 37
				* result
				+ (getMystatusbat() == null ? 0 : this.getMystatusbat()
						.hashCode());
		return result;
	}

}