package com.entity;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * TCcBillmaindata entity. @author MyEclipse Persistence Tools
 */

public class TCcBillmaindata implements java.io.Serializable {

	// Fields

	private Long billmaindataid;
	private Long formid;
	private Long billid;
	private BigDecimal currentstate;
	private String billnumber;
	private String billbarcode;
	private Timestamp createtime;
	private Timestamp occurtime;
	private String createusernum;
	private Long createuser;
	private Long createuserdepartment;
	private Long createuserpost;
	private String requisitionusernum;
	private Long requisitionuser;
	private Long requisitionuserdepartment;
	private Long requisitionuserpost;
	private Long requisitionusercompany;
	private Long dealuser;
	private String dealusertel;
	private Long currencyid;
	private Long ncurrencyid;
	private Double exchangerate;
	private BigDecimal voucherstate;
	private Double naturalamount;
	private Double originalamount;
	private String naturalamountuppercase;
	private String originalamountuppercase;
	private BigDecimal attachmentcount;
	private String contractnumber;
	private Long priority;
	private Timestamp needpaydate;
	private Long signuser1;
	private Timestamp signdate1;
	private Long signuser2;
	private Timestamp signdate2;
	private String invoicestate;
	private String memo;
	private BigDecimal billtype;
	private BigDecimal budgettype;
	private BigDecimal donebudget;
	private Double paymentoriginalamount;
	private String paymentoriginalamountuppercase;
	private Double paymentnaturalamount;
	private String paymentnaturalamountuppercase;
	private Double cashtotal;
	private String cashtotaluppercase;
	private Double writeofftotal;
	private String writeofftotaluppercase;
	private Double monthtotal;
	private String monthtotaluppercase;
	private Double applyoriginalamount;
	private String applyoriginalamountuppercase;
	private Double applynaturalamount;
	private String applynaturalamountuppercase;
	private Double offoriginalamount;
	private Double offnaturalamount;
	private String offoriginalamountuppercase;
	private String offnaturalamountuppercase;
	private String requisitionusercreditgrade;
	private String correspondingitemname;
	private String sapvoucherno;
	private String requisitionusermail;
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
	private String item31;
	private String item32;
	private String item33;
	private String item34;
	private String item35;
	private String item36;
	private String item37;
	private String item38;
	private String item39;
	private String item40;
	private String item41;
	private String item42;
	private String item43;
	private String item44;
	private String item45;
	private String item46;
	private String item47;
	private String item48;
	private String item49;
	private String item50;
	private String item51;
	private String item52;
	private String item53;
	private String item54;
	private String item55;
	private String item56;
	private String item57;
	private String item58;
	private String item59;
	private String item60;
	private String item61;
	private String item62;
	private String item63;
	private String item64;
	private String item65;
	private String item66;
	private String item67;
	private String item68;
	private String item69;
	private String item70;
	private String item71;
	private String item72;
	private String item73;
	private String item74;
	private String item75;
	private String item76;
	private String item77;
	private String item78;
	private String item79;
	private String item80;
	private String item81;
	private String item82;
	private String item83;
	private String item84;
	private String item85;
	private String item86;
	private String item87;
	private String item88;
	private String item89;
	private String item90;
	private String item91;
	private String item92;
	private String item93;
	private String item94;
	private String item95;
	private String item96;
	private String item97;
	private String item98;
	private String item99;
	private String item100;
	private String item101;
	private String item102;
	private String item103;
	private String item104;
	private String item105;
	private String item106;
	private String item107;
	private String item108;
	private String item109;
	private String item110;
	private String item111;
	private String item112;
	private String item113;
	private String item114;
	private String item115;
	private String item116;
	private String item117;
	private String item118;
	private String item119;
	private String item120;
	private String item121;
	private String item122;
	private String item123;
	private String item124;
	private String item125;
	private String item126;
	private String item127;
	private String item128;
	private String item129;
	private String item130;

	// Constructors

	/** default constructor */
	public TCcBillmaindata() {
	}

	/** minimal constructor */
	public TCcBillmaindata(Long billmaindataid) {
		this.billmaindataid = billmaindataid;
	}

	/** full constructor */
	public TCcBillmaindata(Long billmaindataid, Long formid, Long billid,
			BigDecimal currentstate, String billnumber, String billbarcode,
			Timestamp createtime, Timestamp occurtime, String createusernum,
			Long createuser, Long createuserdepartment, Long createuserpost,
			String requisitionusernum, Long requisitionuser,
			Long requisitionuserdepartment, Long requisitionuserpost,
			Long requisitionusercompany, Long dealuser, String dealusertel,
			Long currencyid, Long ncurrencyid, Double exchangerate,
			BigDecimal voucherstate, Double naturalamount,
			Double originalamount, String naturalamountuppercase,
			String originalamountuppercase, BigDecimal attachmentcount,
			String contractnumber, Long priority, Timestamp needpaydate,
			Long signuser1, Timestamp signdate1, Long signuser2,
			Timestamp signdate2, String invoicestate, String memo,
			BigDecimal billtype, BigDecimal budgettype, BigDecimal donebudget,
			Double paymentoriginalamount,
			String paymentoriginalamountuppercase, Double paymentnaturalamount,
			String paymentnaturalamountuppercase, Double cashtotal,
			String cashtotaluppercase, Double writeofftotal,
			String writeofftotaluppercase, Double monthtotal,
			String monthtotaluppercase, Double applyoriginalamount,
			String applyoriginalamountuppercase, Double applynaturalamount,
			String applynaturalamountuppercase, Double offoriginalamount,
			Double offnaturalamount, String offoriginalamountuppercase,
			String offnaturalamountuppercase,
			String requisitionusercreditgrade, String correspondingitemname,
			String sapvoucherno, String requisitionusermail, String item01,
			String item02, String item03, String item04, String item05,
			String item06, String item07, String item08, String item09,
			String item10, String item11, String item12, String item13,
			String item14, String item15, String item16, String item17,
			String item18, String item19, String item20, String item21,
			String item22, String item23, String item24, String item25,
			String item26, String item27, String item28, String item29,
			String item30, String item31, String item32, String item33,
			String item34, String item35, String item36, String item37,
			String item38, String item39, String item40, String item41,
			String item42, String item43, String item44, String item45,
			String item46, String item47, String item48, String item49,
			String item50, String item51, String item52, String item53,
			String item54, String item55, String item56, String item57,
			String item58, String item59, String item60, String item61,
			String item62, String item63, String item64, String item65,
			String item66, String item67, String item68, String item69,
			String item70, String item71, String item72, String item73,
			String item74, String item75, String item76, String item77,
			String item78, String item79, String item80, String item81,
			String item82, String item83, String item84, String item85,
			String item86, String item87, String item88, String item89,
			String item90, String item91, String item92, String item93,
			String item94, String item95, String item96, String item97,
			String item98, String item99, String item100, String item101,
			String item102, String item103, String item104, String item105,
			String item106, String item107, String item108, String item109,
			String item110, String item111, String item112, String item113,
			String item114, String item115, String item116, String item117,
			String item118, String item119, String item120, String item121,
			String item122, String item123, String item124, String item125,
			String item126, String item127, String item128, String item129,
			String item130) {
		this.billmaindataid = billmaindataid;
		this.formid = formid;
		this.billid = billid;
		this.currentstate = currentstate;
		this.billnumber = billnumber;
		this.billbarcode = billbarcode;
		this.createtime = createtime;
		this.occurtime = occurtime;
		this.createusernum = createusernum;
		this.createuser = createuser;
		this.createuserdepartment = createuserdepartment;
		this.createuserpost = createuserpost;
		this.requisitionusernum = requisitionusernum;
		this.requisitionuser = requisitionuser;
		this.requisitionuserdepartment = requisitionuserdepartment;
		this.requisitionuserpost = requisitionuserpost;
		this.requisitionusercompany = requisitionusercompany;
		this.dealuser = dealuser;
		this.dealusertel = dealusertel;
		this.currencyid = currencyid;
		this.ncurrencyid = ncurrencyid;
		this.exchangerate = exchangerate;
		this.voucherstate = voucherstate;
		this.naturalamount = naturalamount;
		this.originalamount = originalamount;
		this.naturalamountuppercase = naturalamountuppercase;
		this.originalamountuppercase = originalamountuppercase;
		this.attachmentcount = attachmentcount;
		this.contractnumber = contractnumber;
		this.priority = priority;
		this.needpaydate = needpaydate;
		this.signuser1 = signuser1;
		this.signdate1 = signdate1;
		this.signuser2 = signuser2;
		this.signdate2 = signdate2;
		this.invoicestate = invoicestate;
		this.memo = memo;
		this.billtype = billtype;
		this.budgettype = budgettype;
		this.donebudget = donebudget;
		this.paymentoriginalamount = paymentoriginalamount;
		this.paymentoriginalamountuppercase = paymentoriginalamountuppercase;
		this.paymentnaturalamount = paymentnaturalamount;
		this.paymentnaturalamountuppercase = paymentnaturalamountuppercase;
		this.cashtotal = cashtotal;
		this.cashtotaluppercase = cashtotaluppercase;
		this.writeofftotal = writeofftotal;
		this.writeofftotaluppercase = writeofftotaluppercase;
		this.monthtotal = monthtotal;
		this.monthtotaluppercase = monthtotaluppercase;
		this.applyoriginalamount = applyoriginalamount;
		this.applyoriginalamountuppercase = applyoriginalamountuppercase;
		this.applynaturalamount = applynaturalamount;
		this.applynaturalamountuppercase = applynaturalamountuppercase;
		this.offoriginalamount = offoriginalamount;
		this.offnaturalamount = offnaturalamount;
		this.offoriginalamountuppercase = offoriginalamountuppercase;
		this.offnaturalamountuppercase = offnaturalamountuppercase;
		this.requisitionusercreditgrade = requisitionusercreditgrade;
		this.correspondingitemname = correspondingitemname;
		this.sapvoucherno = sapvoucherno;
		this.requisitionusermail = requisitionusermail;
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
		this.item31 = item31;
		this.item32 = item32;
		this.item33 = item33;
		this.item34 = item34;
		this.item35 = item35;
		this.item36 = item36;
		this.item37 = item37;
		this.item38 = item38;
		this.item39 = item39;
		this.item40 = item40;
		this.item41 = item41;
		this.item42 = item42;
		this.item43 = item43;
		this.item44 = item44;
		this.item45 = item45;
		this.item46 = item46;
		this.item47 = item47;
		this.item48 = item48;
		this.item49 = item49;
		this.item50 = item50;
		this.item51 = item51;
		this.item52 = item52;
		this.item53 = item53;
		this.item54 = item54;
		this.item55 = item55;
		this.item56 = item56;
		this.item57 = item57;
		this.item58 = item58;
		this.item59 = item59;
		this.item60 = item60;
		this.item61 = item61;
		this.item62 = item62;
		this.item63 = item63;
		this.item64 = item64;
		this.item65 = item65;
		this.item66 = item66;
		this.item67 = item67;
		this.item68 = item68;
		this.item69 = item69;
		this.item70 = item70;
		this.item71 = item71;
		this.item72 = item72;
		this.item73 = item73;
		this.item74 = item74;
		this.item75 = item75;
		this.item76 = item76;
		this.item77 = item77;
		this.item78 = item78;
		this.item79 = item79;
		this.item80 = item80;
		this.item81 = item81;
		this.item82 = item82;
		this.item83 = item83;
		this.item84 = item84;
		this.item85 = item85;
		this.item86 = item86;
		this.item87 = item87;
		this.item88 = item88;
		this.item89 = item89;
		this.item90 = item90;
		this.item91 = item91;
		this.item92 = item92;
		this.item93 = item93;
		this.item94 = item94;
		this.item95 = item95;
		this.item96 = item96;
		this.item97 = item97;
		this.item98 = item98;
		this.item99 = item99;
		this.item100 = item100;
		this.item101 = item101;
		this.item102 = item102;
		this.item103 = item103;
		this.item104 = item104;
		this.item105 = item105;
		this.item106 = item106;
		this.item107 = item107;
		this.item108 = item108;
		this.item109 = item109;
		this.item110 = item110;
		this.item111 = item111;
		this.item112 = item112;
		this.item113 = item113;
		this.item114 = item114;
		this.item115 = item115;
		this.item116 = item116;
		this.item117 = item117;
		this.item118 = item118;
		this.item119 = item119;
		this.item120 = item120;
		this.item121 = item121;
		this.item122 = item122;
		this.item123 = item123;
		this.item124 = item124;
		this.item125 = item125;
		this.item126 = item126;
		this.item127 = item127;
		this.item128 = item128;
		this.item129 = item129;
		this.item130 = item130;
	}

	// Property accessors

	public Long getBillmaindataid() {
		return this.billmaindataid;
	}

	public void setBillmaindataid(Long billmaindataid) {
		this.billmaindataid = billmaindataid;
	}

	public Long getFormid() {
		return this.formid;
	}

	public void setFormid(Long formid) {
		this.formid = formid;
	}

	public Long getBillid() {
		return this.billid;
	}

	public void setBillid(Long billid) {
		this.billid = billid;
	}

	public BigDecimal getCurrentstate() {
		return this.currentstate;
	}

	public void setCurrentstate(BigDecimal currentstate) {
		this.currentstate = currentstate;
	}

	public String getBillnumber() {
		return this.billnumber;
	}

	public void setBillnumber(String billnumber) {
		this.billnumber = billnumber;
	}

	public String getBillbarcode() {
		return this.billbarcode;
	}

	public void setBillbarcode(String billbarcode) {
		this.billbarcode = billbarcode;
	}

	public Timestamp getCreatetime() {
		return this.createtime;
	}

	public void setCreatetime(Timestamp createtime) {
		this.createtime = createtime;
	}

	public Timestamp getOccurtime() {
		return this.occurtime;
	}

	public void setOccurtime(Timestamp occurtime) {
		this.occurtime = occurtime;
	}

	public String getCreateusernum() {
		return this.createusernum;
	}

	public void setCreateusernum(String createusernum) {
		this.createusernum = createusernum;
	}

	public Long getCreateuser() {
		return this.createuser;
	}

	public void setCreateuser(Long createuser) {
		this.createuser = createuser;
	}

	public Long getCreateuserdepartment() {
		return this.createuserdepartment;
	}

	public void setCreateuserdepartment(Long createuserdepartment) {
		this.createuserdepartment = createuserdepartment;
	}

	public Long getCreateuserpost() {
		return this.createuserpost;
	}

	public void setCreateuserpost(Long createuserpost) {
		this.createuserpost = createuserpost;
	}

	public String getRequisitionusernum() {
		return this.requisitionusernum;
	}

	public void setRequisitionusernum(String requisitionusernum) {
		this.requisitionusernum = requisitionusernum;
	}

	public Long getRequisitionuser() {
		return this.requisitionuser;
	}

	public void setRequisitionuser(Long requisitionuser) {
		this.requisitionuser = requisitionuser;
	}

	public Long getRequisitionuserdepartment() {
		return this.requisitionuserdepartment;
	}

	public void setRequisitionuserdepartment(Long requisitionuserdepartment) {
		this.requisitionuserdepartment = requisitionuserdepartment;
	}

	public Long getRequisitionuserpost() {
		return this.requisitionuserpost;
	}

	public void setRequisitionuserpost(Long requisitionuserpost) {
		this.requisitionuserpost = requisitionuserpost;
	}

	public Long getRequisitionusercompany() {
		return this.requisitionusercompany;
	}

	public void setRequisitionusercompany(Long requisitionusercompany) {
		this.requisitionusercompany = requisitionusercompany;
	}

	public Long getDealuser() {
		return this.dealuser;
	}

	public void setDealuser(Long dealuser) {
		this.dealuser = dealuser;
	}

	public String getDealusertel() {
		return this.dealusertel;
	}

	public void setDealusertel(String dealusertel) {
		this.dealusertel = dealusertel;
	}

	public Long getCurrencyid() {
		return this.currencyid;
	}

	public void setCurrencyid(Long currencyid) {
		this.currencyid = currencyid;
	}

	public Long getNcurrencyid() {
		return this.ncurrencyid;
	}

	public void setNcurrencyid(Long ncurrencyid) {
		this.ncurrencyid = ncurrencyid;
	}

	public Double getExchangerate() {
		return this.exchangerate;
	}

	public void setExchangerate(Double exchangerate) {
		this.exchangerate = exchangerate;
	}

	public BigDecimal getVoucherstate() {
		return this.voucherstate;
	}

	public void setVoucherstate(BigDecimal voucherstate) {
		this.voucherstate = voucherstate;
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

	public String getNaturalamountuppercase() {
		return this.naturalamountuppercase;
	}

	public void setNaturalamountuppercase(String naturalamountuppercase) {
		this.naturalamountuppercase = naturalamountuppercase;
	}

	public String getOriginalamountuppercase() {
		return this.originalamountuppercase;
	}

	public void setOriginalamountuppercase(String originalamountuppercase) {
		this.originalamountuppercase = originalamountuppercase;
	}

	public BigDecimal getAttachmentcount() {
		return this.attachmentcount;
	}

	public void setAttachmentcount(BigDecimal attachmentcount) {
		this.attachmentcount = attachmentcount;
	}

	public String getContractnumber() {
		return this.contractnumber;
	}

	public void setContractnumber(String contractnumber) {
		this.contractnumber = contractnumber;
	}

	public Long getPriority() {
		return this.priority;
	}

	public void setPriority(Long priority) {
		this.priority = priority;
	}

	public Timestamp getNeedpaydate() {
		return this.needpaydate;
	}

	public void setNeedpaydate(Timestamp needpaydate) {
		this.needpaydate = needpaydate;
	}

	public Long getSignuser1() {
		return this.signuser1;
	}

	public void setSignuser1(Long signuser1) {
		this.signuser1 = signuser1;
	}

	public Timestamp getSigndate1() {
		return this.signdate1;
	}

	public void setSigndate1(Timestamp signdate1) {
		this.signdate1 = signdate1;
	}

	public Long getSignuser2() {
		return this.signuser2;
	}

	public void setSignuser2(Long signuser2) {
		this.signuser2 = signuser2;
	}

	public Timestamp getSigndate2() {
		return this.signdate2;
	}

	public void setSigndate2(Timestamp signdate2) {
		this.signdate2 = signdate2;
	}

	public String getInvoicestate() {
		return this.invoicestate;
	}

	public void setInvoicestate(String invoicestate) {
		this.invoicestate = invoicestate;
	}

	public String getMemo() {
		return this.memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public BigDecimal getBilltype() {
		return this.billtype;
	}

	public void setBilltype(BigDecimal billtype) {
		this.billtype = billtype;
	}

	public BigDecimal getBudgettype() {
		return this.budgettype;
	}

	public void setBudgettype(BigDecimal budgettype) {
		this.budgettype = budgettype;
	}

	public BigDecimal getDonebudget() {
		return this.donebudget;
	}

	public void setDonebudget(BigDecimal donebudget) {
		this.donebudget = donebudget;
	}

	public Double getPaymentoriginalamount() {
		return this.paymentoriginalamount;
	}

	public void setPaymentoriginalamount(Double paymentoriginalamount) {
		this.paymentoriginalamount = paymentoriginalamount;
	}

	public String getPaymentoriginalamountuppercase() {
		return this.paymentoriginalamountuppercase;
	}

	public void setPaymentoriginalamountuppercase(
			String paymentoriginalamountuppercase) {
		this.paymentoriginalamountuppercase = paymentoriginalamountuppercase;
	}

	public Double getPaymentnaturalamount() {
		return this.paymentnaturalamount;
	}

	public void setPaymentnaturalamount(Double paymentnaturalamount) {
		this.paymentnaturalamount = paymentnaturalamount;
	}

	public String getPaymentnaturalamountuppercase() {
		return this.paymentnaturalamountuppercase;
	}

	public void setPaymentnaturalamountuppercase(
			String paymentnaturalamountuppercase) {
		this.paymentnaturalamountuppercase = paymentnaturalamountuppercase;
	}

	public Double getCashtotal() {
		return this.cashtotal;
	}

	public void setCashtotal(Double cashtotal) {
		this.cashtotal = cashtotal;
	}

	public String getCashtotaluppercase() {
		return this.cashtotaluppercase;
	}

	public void setCashtotaluppercase(String cashtotaluppercase) {
		this.cashtotaluppercase = cashtotaluppercase;
	}

	public Double getWriteofftotal() {
		return this.writeofftotal;
	}

	public void setWriteofftotal(Double writeofftotal) {
		this.writeofftotal = writeofftotal;
	}

	public String getWriteofftotaluppercase() {
		return this.writeofftotaluppercase;
	}

	public void setWriteofftotaluppercase(String writeofftotaluppercase) {
		this.writeofftotaluppercase = writeofftotaluppercase;
	}

	public Double getMonthtotal() {
		return this.monthtotal;
	}

	public void setMonthtotal(Double monthtotal) {
		this.monthtotal = monthtotal;
	}

	public String getMonthtotaluppercase() {
		return this.monthtotaluppercase;
	}

	public void setMonthtotaluppercase(String monthtotaluppercase) {
		this.monthtotaluppercase = monthtotaluppercase;
	}

	public Double getApplyoriginalamount() {
		return this.applyoriginalamount;
	}

	public void setApplyoriginalamount(Double applyoriginalamount) {
		this.applyoriginalamount = applyoriginalamount;
	}

	public String getApplyoriginalamountuppercase() {
		return this.applyoriginalamountuppercase;
	}

	public void setApplyoriginalamountuppercase(
			String applyoriginalamountuppercase) {
		this.applyoriginalamountuppercase = applyoriginalamountuppercase;
	}

	public Double getApplynaturalamount() {
		return this.applynaturalamount;
	}

	public void setApplynaturalamount(Double applynaturalamount) {
		this.applynaturalamount = applynaturalamount;
	}

	public String getApplynaturalamountuppercase() {
		return this.applynaturalamountuppercase;
	}

	public void setApplynaturalamountuppercase(
			String applynaturalamountuppercase) {
		this.applynaturalamountuppercase = applynaturalamountuppercase;
	}

	public Double getOfforiginalamount() {
		return this.offoriginalamount;
	}

	public void setOfforiginalamount(Double offoriginalamount) {
		this.offoriginalamount = offoriginalamount;
	}

	public Double getOffnaturalamount() {
		return this.offnaturalamount;
	}

	public void setOffnaturalamount(Double offnaturalamount) {
		this.offnaturalamount = offnaturalamount;
	}

	public String getOfforiginalamountuppercase() {
		return this.offoriginalamountuppercase;
	}

	public void setOfforiginalamountuppercase(String offoriginalamountuppercase) {
		this.offoriginalamountuppercase = offoriginalamountuppercase;
	}

	public String getOffnaturalamountuppercase() {
		return this.offnaturalamountuppercase;
	}

	public void setOffnaturalamountuppercase(String offnaturalamountuppercase) {
		this.offnaturalamountuppercase = offnaturalamountuppercase;
	}

	public String getRequisitionusercreditgrade() {
		return this.requisitionusercreditgrade;
	}

	public void setRequisitionusercreditgrade(String requisitionusercreditgrade) {
		this.requisitionusercreditgrade = requisitionusercreditgrade;
	}

	public String getCorrespondingitemname() {
		return this.correspondingitemname;
	}

	public void setCorrespondingitemname(String correspondingitemname) {
		this.correspondingitemname = correspondingitemname;
	}

	public String getSapvoucherno() {
		return this.sapvoucherno;
	}

	public void setSapvoucherno(String sapvoucherno) {
		this.sapvoucherno = sapvoucherno;
	}

	public String getRequisitionusermail() {
		return this.requisitionusermail;
	}

	public void setRequisitionusermail(String requisitionusermail) {
		this.requisitionusermail = requisitionusermail;
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

	public String getItem31() {
		return this.item31;
	}

	public void setItem31(String item31) {
		this.item31 = item31;
	}

	public String getItem32() {
		return this.item32;
	}

	public void setItem32(String item32) {
		this.item32 = item32;
	}

	public String getItem33() {
		return this.item33;
	}

	public void setItem33(String item33) {
		this.item33 = item33;
	}

	public String getItem34() {
		return this.item34;
	}

	public void setItem34(String item34) {
		this.item34 = item34;
	}

	public String getItem35() {
		return this.item35;
	}

	public void setItem35(String item35) {
		this.item35 = item35;
	}

	public String getItem36() {
		return this.item36;
	}

	public void setItem36(String item36) {
		this.item36 = item36;
	}

	public String getItem37() {
		return this.item37;
	}

	public void setItem37(String item37) {
		this.item37 = item37;
	}

	public String getItem38() {
		return this.item38;
	}

	public void setItem38(String item38) {
		this.item38 = item38;
	}

	public String getItem39() {
		return this.item39;
	}

	public void setItem39(String item39) {
		this.item39 = item39;
	}

	public String getItem40() {
		return this.item40;
	}

	public void setItem40(String item40) {
		this.item40 = item40;
	}

	public String getItem41() {
		return this.item41;
	}

	public void setItem41(String item41) {
		this.item41 = item41;
	}

	public String getItem42() {
		return this.item42;
	}

	public void setItem42(String item42) {
		this.item42 = item42;
	}

	public String getItem43() {
		return this.item43;
	}

	public void setItem43(String item43) {
		this.item43 = item43;
	}

	public String getItem44() {
		return this.item44;
	}

	public void setItem44(String item44) {
		this.item44 = item44;
	}

	public String getItem45() {
		return this.item45;
	}

	public void setItem45(String item45) {
		this.item45 = item45;
	}

	public String getItem46() {
		return this.item46;
	}

	public void setItem46(String item46) {
		this.item46 = item46;
	}

	public String getItem47() {
		return this.item47;
	}

	public void setItem47(String item47) {
		this.item47 = item47;
	}

	public String getItem48() {
		return this.item48;
	}

	public void setItem48(String item48) {
		this.item48 = item48;
	}

	public String getItem49() {
		return this.item49;
	}

	public void setItem49(String item49) {
		this.item49 = item49;
	}

	public String getItem50() {
		return this.item50;
	}

	public void setItem50(String item50) {
		this.item50 = item50;
	}

	public String getItem51() {
		return this.item51;
	}

	public void setItem51(String item51) {
		this.item51 = item51;
	}

	public String getItem52() {
		return this.item52;
	}

	public void setItem52(String item52) {
		this.item52 = item52;
	}

	public String getItem53() {
		return this.item53;
	}

	public void setItem53(String item53) {
		this.item53 = item53;
	}

	public String getItem54() {
		return this.item54;
	}

	public void setItem54(String item54) {
		this.item54 = item54;
	}

	public String getItem55() {
		return this.item55;
	}

	public void setItem55(String item55) {
		this.item55 = item55;
	}

	public String getItem56() {
		return this.item56;
	}

	public void setItem56(String item56) {
		this.item56 = item56;
	}

	public String getItem57() {
		return this.item57;
	}

	public void setItem57(String item57) {
		this.item57 = item57;
	}

	public String getItem58() {
		return this.item58;
	}

	public void setItem58(String item58) {
		this.item58 = item58;
	}

	public String getItem59() {
		return this.item59;
	}

	public void setItem59(String item59) {
		this.item59 = item59;
	}

	public String getItem60() {
		return this.item60;
	}

	public void setItem60(String item60) {
		this.item60 = item60;
	}

	public String getItem61() {
		return this.item61;
	}

	public void setItem61(String item61) {
		this.item61 = item61;
	}

	public String getItem62() {
		return this.item62;
	}

	public void setItem62(String item62) {
		this.item62 = item62;
	}

	public String getItem63() {
		return this.item63;
	}

	public void setItem63(String item63) {
		this.item63 = item63;
	}

	public String getItem64() {
		return this.item64;
	}

	public void setItem64(String item64) {
		this.item64 = item64;
	}

	public String getItem65() {
		return this.item65;
	}

	public void setItem65(String item65) {
		this.item65 = item65;
	}

	public String getItem66() {
		return this.item66;
	}

	public void setItem66(String item66) {
		this.item66 = item66;
	}

	public String getItem67() {
		return this.item67;
	}

	public void setItem67(String item67) {
		this.item67 = item67;
	}

	public String getItem68() {
		return this.item68;
	}

	public void setItem68(String item68) {
		this.item68 = item68;
	}

	public String getItem69() {
		return this.item69;
	}

	public void setItem69(String item69) {
		this.item69 = item69;
	}

	public String getItem70() {
		return this.item70;
	}

	public void setItem70(String item70) {
		this.item70 = item70;
	}

	public String getItem71() {
		return this.item71;
	}

	public void setItem71(String item71) {
		this.item71 = item71;
	}

	public String getItem72() {
		return this.item72;
	}

	public void setItem72(String item72) {
		this.item72 = item72;
	}

	public String getItem73() {
		return this.item73;
	}

	public void setItem73(String item73) {
		this.item73 = item73;
	}

	public String getItem74() {
		return this.item74;
	}

	public void setItem74(String item74) {
		this.item74 = item74;
	}

	public String getItem75() {
		return this.item75;
	}

	public void setItem75(String item75) {
		this.item75 = item75;
	}

	public String getItem76() {
		return this.item76;
	}

	public void setItem76(String item76) {
		this.item76 = item76;
	}

	public String getItem77() {
		return this.item77;
	}

	public void setItem77(String item77) {
		this.item77 = item77;
	}

	public String getItem78() {
		return this.item78;
	}

	public void setItem78(String item78) {
		this.item78 = item78;
	}

	public String getItem79() {
		return this.item79;
	}

	public void setItem79(String item79) {
		this.item79 = item79;
	}

	public String getItem80() {
		return this.item80;
	}

	public void setItem80(String item80) {
		this.item80 = item80;
	}

	public String getItem81() {
		return this.item81;
	}

	public void setItem81(String item81) {
		this.item81 = item81;
	}

	public String getItem82() {
		return this.item82;
	}

	public void setItem82(String item82) {
		this.item82 = item82;
	}

	public String getItem83() {
		return this.item83;
	}

	public void setItem83(String item83) {
		this.item83 = item83;
	}

	public String getItem84() {
		return this.item84;
	}

	public void setItem84(String item84) {
		this.item84 = item84;
	}

	public String getItem85() {
		return this.item85;
	}

	public void setItem85(String item85) {
		this.item85 = item85;
	}

	public String getItem86() {
		return this.item86;
	}

	public void setItem86(String item86) {
		this.item86 = item86;
	}

	public String getItem87() {
		return this.item87;
	}

	public void setItem87(String item87) {
		this.item87 = item87;
	}

	public String getItem88() {
		return this.item88;
	}

	public void setItem88(String item88) {
		this.item88 = item88;
	}

	public String getItem89() {
		return this.item89;
	}

	public void setItem89(String item89) {
		this.item89 = item89;
	}

	public String getItem90() {
		return this.item90;
	}

	public void setItem90(String item90) {
		this.item90 = item90;
	}

	public String getItem91() {
		return this.item91;
	}

	public void setItem91(String item91) {
		this.item91 = item91;
	}

	public String getItem92() {
		return this.item92;
	}

	public void setItem92(String item92) {
		this.item92 = item92;
	}

	public String getItem93() {
		return this.item93;
	}

	public void setItem93(String item93) {
		this.item93 = item93;
	}

	public String getItem94() {
		return this.item94;
	}

	public void setItem94(String item94) {
		this.item94 = item94;
	}

	public String getItem95() {
		return this.item95;
	}

	public void setItem95(String item95) {
		this.item95 = item95;
	}

	public String getItem96() {
		return this.item96;
	}

	public void setItem96(String item96) {
		this.item96 = item96;
	}

	public String getItem97() {
		return this.item97;
	}

	public void setItem97(String item97) {
		this.item97 = item97;
	}

	public String getItem98() {
		return this.item98;
	}

	public void setItem98(String item98) {
		this.item98 = item98;
	}

	public String getItem99() {
		return this.item99;
	}

	public void setItem99(String item99) {
		this.item99 = item99;
	}

	public String getItem100() {
		return this.item100;
	}

	public void setItem100(String item100) {
		this.item100 = item100;
	}

	public String getItem101() {
		return this.item101;
	}

	public void setItem101(String item101) {
		this.item101 = item101;
	}

	public String getItem102() {
		return this.item102;
	}

	public void setItem102(String item102) {
		this.item102 = item102;
	}

	public String getItem103() {
		return this.item103;
	}

	public void setItem103(String item103) {
		this.item103 = item103;
	}

	public String getItem104() {
		return this.item104;
	}

	public void setItem104(String item104) {
		this.item104 = item104;
	}

	public String getItem105() {
		return this.item105;
	}

	public void setItem105(String item105) {
		this.item105 = item105;
	}

	public String getItem106() {
		return this.item106;
	}

	public void setItem106(String item106) {
		this.item106 = item106;
	}

	public String getItem107() {
		return this.item107;
	}

	public void setItem107(String item107) {
		this.item107 = item107;
	}

	public String getItem108() {
		return this.item108;
	}

	public void setItem108(String item108) {
		this.item108 = item108;
	}

	public String getItem109() {
		return this.item109;
	}

	public void setItem109(String item109) {
		this.item109 = item109;
	}

	public String getItem110() {
		return this.item110;
	}

	public void setItem110(String item110) {
		this.item110 = item110;
	}

	public String getItem111() {
		return this.item111;
	}

	public void setItem111(String item111) {
		this.item111 = item111;
	}

	public String getItem112() {
		return this.item112;
	}

	public void setItem112(String item112) {
		this.item112 = item112;
	}

	public String getItem113() {
		return this.item113;
	}

	public void setItem113(String item113) {
		this.item113 = item113;
	}

	public String getItem114() {
		return this.item114;
	}

	public void setItem114(String item114) {
		this.item114 = item114;
	}

	public String getItem115() {
		return this.item115;
	}

	public void setItem115(String item115) {
		this.item115 = item115;
	}

	public String getItem116() {
		return this.item116;
	}

	public void setItem116(String item116) {
		this.item116 = item116;
	}

	public String getItem117() {
		return this.item117;
	}

	public void setItem117(String item117) {
		this.item117 = item117;
	}

	public String getItem118() {
		return this.item118;
	}

	public void setItem118(String item118) {
		this.item118 = item118;
	}

	public String getItem119() {
		return this.item119;
	}

	public void setItem119(String item119) {
		this.item119 = item119;
	}

	public String getItem120() {
		return this.item120;
	}

	public void setItem120(String item120) {
		this.item120 = item120;
	}

	public String getItem121() {
		return this.item121;
	}

	public void setItem121(String item121) {
		this.item121 = item121;
	}

	public String getItem122() {
		return this.item122;
	}

	public void setItem122(String item122) {
		this.item122 = item122;
	}

	public String getItem123() {
		return this.item123;
	}

	public void setItem123(String item123) {
		this.item123 = item123;
	}

	public String getItem124() {
		return this.item124;
	}

	public void setItem124(String item124) {
		this.item124 = item124;
	}

	public String getItem125() {
		return this.item125;
	}

	public void setItem125(String item125) {
		this.item125 = item125;
	}

	public String getItem126() {
		return this.item126;
	}

	public void setItem126(String item126) {
		this.item126 = item126;
	}

	public String getItem127() {
		return this.item127;
	}

	public void setItem127(String item127) {
		this.item127 = item127;
	}

	public String getItem128() {
		return this.item128;
	}

	public void setItem128(String item128) {
		this.item128 = item128;
	}

	public String getItem129() {
		return this.item129;
	}

	public void setItem129(String item129) {
		this.item129 = item129;
	}

	public String getItem130() {
		return this.item130;
	}

	public void setItem130(String item130) {
		this.item130 = item130;
	}

}