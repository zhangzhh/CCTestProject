package com.entity;

import java.math.BigDecimal;

/**
 * TCcBillrepaymentdata entity. @author MyEclipse Persistence Tools
 */

public class TCcBillrepaymentdata implements java.io.Serializable {

	// Fields

	private Long billrepaymentdataid;
	private Long billmaindataid;
	private Long prebillrepaymentdataid;
	private BigDecimal repaymenttype;
	private Long currencyid;
	private Double originalcurrency;
	private Double naturalcurrency;
	private String repaymentbank;
	private String repaymentbranch;
	private String repaymentaccount;
	private String repaymentaddress;
	private String repaymentprovince;
	private String repaymentcity;
	private String repaymentaccountname;
	private String repayfor;
	private Double exchangerate;
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
	private String item29;
	private String item30;
	private String repaymentno;

	// Constructors

	/** default constructor */
	public TCcBillrepaymentdata() {
	}

	/** minimal constructor */
	public TCcBillrepaymentdata(Long billrepaymentdataid) {
		this.billrepaymentdataid = billrepaymentdataid;
	}

	/** full constructor */
	public TCcBillrepaymentdata(Long billrepaymentdataid, Long billmaindataid,
			Long prebillrepaymentdataid, BigDecimal repaymenttype,
			Long currencyid, Double originalcurrency, Double naturalcurrency,
			String repaymentbank, String repaymentbranch,
			String repaymentaccount, String repaymentaddress,
			String repaymentprovince, String repaymentcity,
			String repaymentaccountname, String repayfor, Double exchangerate,
			String item01, String item02, String item03, String item04,
			String item05, String item06, String item07, String item08,
			String item09, String item10, String item11, String item12,
			String item13, String item14, String item15, String item16,
			String item17, String item18, String item19, String item20,
			String item21, String item22, String item23, String item24,
			String item25, String item26, String item27, String item29,
			String item30, String repaymentno) {
		this.billrepaymentdataid = billrepaymentdataid;
		this.billmaindataid = billmaindataid;
		this.prebillrepaymentdataid = prebillrepaymentdataid;
		this.repaymenttype = repaymenttype;
		this.currencyid = currencyid;
		this.originalcurrency = originalcurrency;
		this.naturalcurrency = naturalcurrency;
		this.repaymentbank = repaymentbank;
		this.repaymentbranch = repaymentbranch;
		this.repaymentaccount = repaymentaccount;
		this.repaymentaddress = repaymentaddress;
		this.repaymentprovince = repaymentprovince;
		this.repaymentcity = repaymentcity;
		this.repaymentaccountname = repaymentaccountname;
		this.repayfor = repayfor;
		this.exchangerate = exchangerate;
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
		this.item29 = item29;
		this.item30 = item30;
		this.repaymentno = repaymentno;
	}

	// Property accessors

	public Long getBillrepaymentdataid() {
		return this.billrepaymentdataid;
	}

	public void setBillrepaymentdataid(Long billrepaymentdataid) {
		this.billrepaymentdataid = billrepaymentdataid;
	}

	public Long getBillmaindataid() {
		return this.billmaindataid;
	}

	public void setBillmaindataid(Long billmaindataid) {
		this.billmaindataid = billmaindataid;
	}

	public Long getPrebillrepaymentdataid() {
		return this.prebillrepaymentdataid;
	}

	public void setPrebillrepaymentdataid(Long prebillrepaymentdataid) {
		this.prebillrepaymentdataid = prebillrepaymentdataid;
	}

	public BigDecimal getRepaymenttype() {
		return this.repaymenttype;
	}

	public void setRepaymenttype(BigDecimal repaymenttype) {
		this.repaymenttype = repaymenttype;
	}

	public Long getCurrencyid() {
		return this.currencyid;
	}

	public void setCurrencyid(Long currencyid) {
		this.currencyid = currencyid;
	}

	public Double getOriginalcurrency() {
		return this.originalcurrency;
	}

	public void setOriginalcurrency(Double originalcurrency) {
		this.originalcurrency = originalcurrency;
	}

	public Double getNaturalcurrency() {
		return this.naturalcurrency;
	}

	public void setNaturalcurrency(Double naturalcurrency) {
		this.naturalcurrency = naturalcurrency;
	}

	public String getRepaymentbank() {
		return this.repaymentbank;
	}

	public void setRepaymentbank(String repaymentbank) {
		this.repaymentbank = repaymentbank;
	}

	public String getRepaymentbranch() {
		return this.repaymentbranch;
	}

	public void setRepaymentbranch(String repaymentbranch) {
		this.repaymentbranch = repaymentbranch;
	}

	public String getRepaymentaccount() {
		return this.repaymentaccount;
	}

	public void setRepaymentaccount(String repaymentaccount) {
		this.repaymentaccount = repaymentaccount;
	}

	public String getRepaymentaddress() {
		return this.repaymentaddress;
	}

	public void setRepaymentaddress(String repaymentaddress) {
		this.repaymentaddress = repaymentaddress;
	}

	public String getRepaymentprovince() {
		return this.repaymentprovince;
	}

	public void setRepaymentprovince(String repaymentprovince) {
		this.repaymentprovince = repaymentprovince;
	}

	public String getRepaymentcity() {
		return this.repaymentcity;
	}

	public void setRepaymentcity(String repaymentcity) {
		this.repaymentcity = repaymentcity;
	}

	public String getRepaymentaccountname() {
		return this.repaymentaccountname;
	}

	public void setRepaymentaccountname(String repaymentaccountname) {
		this.repaymentaccountname = repaymentaccountname;
	}

	public String getRepayfor() {
		return this.repayfor;
	}

	public void setRepayfor(String repayfor) {
		this.repayfor = repayfor;
	}

	public Double getExchangerate() {
		return this.exchangerate;
	}

	public void setExchangerate(Double exchangerate) {
		this.exchangerate = exchangerate;
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

	public String getRepaymentno() {
		return this.repaymentno;
	}

	public void setRepaymentno(String repaymentno) {
		this.repaymentno = repaymentno;
	}

}