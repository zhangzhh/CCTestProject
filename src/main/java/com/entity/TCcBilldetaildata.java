package com.entity;

import java.sql.Timestamp;

/**
 * TCcBilldetaildata entity. @author MyEclipse Persistence Tools
 */

public class TCcBilldetaildata implements java.io.Serializable {

	// Fields

	private Long billdetaildataid;
	private Long billmaindataid;
	private Double dynamicbillavailable;
	private String dynamicbillno;
	private Long currencyid;
	private Long structureid;
	private Long requisitionuser;
	private Long requisitioncompany;
	private String memo;
	private Long dimaccount;
	private Long dimsubject;
	private Long dimcurrency;
	private Long dimproject;
	private Long dimsupplier;
	private Long dimpostrank;
	private Long dimregion;
	private Long dimperiod;
	private Long dim01;
	private Long dim02;
	private Long dim03;
	private Long dim04;
	private Long dim05;
	private Long dim06;
	private Long dim07;
	private Long dim08;
	private Long dim09;
	private Long dim10;
	private Double naturalcurrency;
	private Double originalcurrency;
	private Double naturalapplycurrency;
	private Double originalapplycurrency;
	private Double offoriginalcurrency;
	private Double offnaturalcurrency;
	private String naturalcurrencyuppercase;
	private String originalcurrencyuppercase;
	private Double monthbalancedetail;
	private Double totalbalancedetail;
	private Double yearbalancedetail;
	private Double monthbalanceamount;
	private Double totalbalanceamount;
	private Double yearbalanceamount;
	private Double yearbudgetamount;
	private Double totalbudgetamount;
	private Double monthbudgetamount;
	private Double yearbudgetdetail;
	private Double totalbudgetdetail;
	private Double monthbudgetdetail;
	private Double yearactualamount;
	private Double totalactualamount;
	private Double monthactualamount;
	private Double yearactualdetail;
	private Double totalactualdetail;
	private Double monthactualdetail;
	private String invoicenumber;
	private Double deductproportional;
	private Double realitybudget;
	private Double exchangerate;
	private Timestamp createtime;
	private Double frombudget;
	private Double fromdynamic;
	private Double naturalcurrencyold;
	private Long computationcompany;
	private Long computationscostcenter;
	private Long computationaccount;
	private Long prepayfundcompany;
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
	private String item131;
	private String item132;
	private String item133;
	private String item134;
	private String item135;
	private String item136;
	private String item137;
	private String item138;
	private String item139;
	private String item140;
	private String item141;
	private String item142;
	private String item143;
	private String item144;
	private String item145;
	private String item146;
	private String item147;
	private String item148;
	private String item149;
	private String item150;
	private String item151;
	private String item152;
	private String item153;
	private String item154;
	private String item155;
	private String item156;
	private String item157;
	private String item158;
	private String item159;
	private String item160;
	private String item161;
	private String item162;
	private String item163;
	private String item164;
	private String item165;
	private String item166;
	private String item167;
	private String item168;
	private String item169;
	private String item170;
	private String item171;
	private String item172;
	private String item173;
	private String item174;
	private String item175;
	private String item176;
	private String item177;
	private String item178;
	private String item179;
	private String item180;
	private String item181;
	private String item182;
	private String item183;
	private String item184;
	private String item185;
	private String item186;
	private String item187;
	private String item188;
	private String item189;
	private String item190;
	private String item191;
	private String item192;
	private String item193;
	private String item194;
	private String item195;
	private String item196;
	private String item197;
	private String item198;
	private String item199;
	private String item200;
	private Long dynamicdetailid;
	private Long dynamicfinishuser;
	private Timestamp dynamicfinishtime;
	private Double dynamicactualamount;
	private Long dynamicisfinish;
	private Byte dynamicuserd;
	private Long dynamicfinished;
	private Long advancefinishuser;
	private Timestamp advancefinishtime;
	private Long advancefinished;
	private Double advanceactualamount;
	private String commonbillno;
	private String viewbudgetdata;
	private String budgetcode;
	private String detailnumber;
	private String budgetdatadiff;

	// Constructors

	/** default constructor */
	public TCcBilldetaildata() {
	}

	/** minimal constructor */
	public TCcBilldetaildata(Long billdetaildataid) {
		this.billdetaildataid = billdetaildataid;
	}

	/** full constructor */
	public TCcBilldetaildata(Long billdetaildataid, Long billmaindataid,
			Double dynamicbillavailable, String dynamicbillno, Long currencyid,
			Long structureid, Long requisitionuser, Long requisitioncompany,
			String memo, Long dimaccount, Long dimsubject, Long dimcurrency,
			Long dimproject, Long dimsupplier, Long dimpostrank,
			Long dimregion, Long dimperiod, Long dim01, Long dim02, Long dim03,
			Long dim04, Long dim05, Long dim06, Long dim07, Long dim08,
			Long dim09, Long dim10, Double naturalcurrency,
			Double originalcurrency, Double naturalapplycurrency,
			Double originalapplycurrency, Double offoriginalcurrency,
			Double offnaturalcurrency, String naturalcurrencyuppercase,
			String originalcurrencyuppercase, Double monthbalancedetail,
			Double totalbalancedetail, Double yearbalancedetail,
			Double monthbalanceamount, Double totalbalanceamount,
			Double yearbalanceamount, Double yearbudgetamount,
			Double totalbudgetamount, Double monthbudgetamount,
			Double yearbudgetdetail, Double totalbudgetdetail,
			Double monthbudgetdetail, Double yearactualamount,
			Double totalactualamount, Double monthactualamount,
			Double yearactualdetail, Double totalactualdetail,
			Double monthactualdetail, String invoicenumber,
			Double deductproportional, Double realitybudget,
			Double exchangerate, Timestamp createtime, Double frombudget,
			Double fromdynamic, Double naturalcurrencyold,
			Long computationcompany, Long computationscostcenter,
			Long computationaccount, Long prepayfundcompany, String item01,
			String item02, String item03, String item04, String item05,
			String item06, String item07, String item08, String item09,
			String item10, String item11, String item12, String item13,
			String item14, String item15, String item16, String item17,
			String item18, String item19, String item20, String item21,
			String item22, String item23, String item24, String item25,
			String item26, String item27, String item28, String item29,
			String item30,
			Long dynamicdetailid, Long dynamicfinishuser,
			Timestamp dynamicfinishtime, Double dynamicactualamount,
			Long dynamicisfinish, Byte dynamicuserd, Long dynamicfinished,
			Long advancefinishuser, Timestamp advancefinishtime,
			Long advancefinished, Double advanceactualamount,
			String commonbillno, String viewbudgetdata, String budgetcode,
			String detailnumber, String budgetdatadiff) {
		this.billdetaildataid = billdetaildataid;
		this.billmaindataid = billmaindataid;
		this.dynamicbillavailable = dynamicbillavailable;
		this.dynamicbillno = dynamicbillno;
		this.currencyid = currencyid;
		this.structureid = structureid;
		this.requisitionuser = requisitionuser;
		this.requisitioncompany = requisitioncompany;
		this.memo = memo;
		this.dimaccount = dimaccount;
		this.dimsubject = dimsubject;
		this.dimcurrency = dimcurrency;
		this.dimproject = dimproject;
		this.dimsupplier = dimsupplier;
		this.dimpostrank = dimpostrank;
		this.dimregion = dimregion;
		this.dimperiod = dimperiod;
		this.dim01 = dim01;
		this.dim02 = dim02;
		this.dim03 = dim03;
		this.dim04 = dim04;
		this.dim05 = dim05;
		this.dim06 = dim06;
		this.dim07 = dim07;
		this.dim08 = dim08;
		this.dim09 = dim09;
		this.dim10 = dim10;
		this.naturalcurrency = naturalcurrency;
		this.originalcurrency = originalcurrency;
		this.naturalapplycurrency = naturalapplycurrency;
		this.originalapplycurrency = originalapplycurrency;
		this.offoriginalcurrency = offoriginalcurrency;
		this.offnaturalcurrency = offnaturalcurrency;
		this.naturalcurrencyuppercase = naturalcurrencyuppercase;
		this.originalcurrencyuppercase = originalcurrencyuppercase;
		this.monthbalancedetail = monthbalancedetail;
		this.totalbalancedetail = totalbalancedetail;
		this.yearbalancedetail = yearbalancedetail;
		this.monthbalanceamount = monthbalanceamount;
		this.totalbalanceamount = totalbalanceamount;
		this.yearbalanceamount = yearbalanceamount;
		this.yearbudgetamount = yearbudgetamount;
		this.totalbudgetamount = totalbudgetamount;
		this.monthbudgetamount = monthbudgetamount;
		this.yearbudgetdetail = yearbudgetdetail;
		this.totalbudgetdetail = totalbudgetdetail;
		this.monthbudgetdetail = monthbudgetdetail;
		this.yearactualamount = yearactualamount;
		this.totalactualamount = totalactualamount;
		this.monthactualamount = monthactualamount;
		this.yearactualdetail = yearactualdetail;
		this.totalactualdetail = totalactualdetail;
		this.monthactualdetail = monthactualdetail;
		this.invoicenumber = invoicenumber;
		this.deductproportional = deductproportional;
		this.realitybudget = realitybudget;
		this.exchangerate = exchangerate;
		this.createtime = createtime;
		this.frombudget = frombudget;
		this.fromdynamic = fromdynamic;
		this.naturalcurrencyold = naturalcurrencyold;
		this.computationcompany = computationcompany;
		this.computationscostcenter = computationscostcenter;
		this.computationaccount = computationaccount;
		this.prepayfundcompany = prepayfundcompany;
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
		this.item131 = item131;
		this.item132 = item132;
		this.item133 = item133;
		this.item134 = item134;
		this.item135 = item135;
		this.item136 = item136;
		this.item137 = item137;
		this.item138 = item138;
		this.item139 = item139;
		this.item140 = item140;
		this.item141 = item141;
		this.item142 = item142;
		this.item143 = item143;
		this.item144 = item144;
		this.item145 = item145;
		this.item146 = item146;
		this.item147 = item147;
		this.item148 = item148;
		this.item149 = item149;
		this.item150 = item150;
		this.item151 = item151;
		this.item152 = item152;
		this.item153 = item153;
		this.item154 = item154;
		this.item155 = item155;
		this.item156 = item156;
		this.item157 = item157;
		this.item158 = item158;
		this.item159 = item159;
		this.item160 = item160;
		this.item161 = item161;
		this.item162 = item162;
		this.item163 = item163;
		this.item164 = item164;
		this.item165 = item165;
		this.item166 = item166;
		this.item167 = item167;
		this.item168 = item168;
		this.item169 = item169;
		this.item170 = item170;
		this.item171 = item171;
		this.item172 = item172;
		this.item173 = item173;
		this.item174 = item174;
		this.item175 = item175;
		this.item176 = item176;
		this.item177 = item177;
		this.item178 = item178;
		this.item179 = item179;
		this.item180 = item180;
		this.item181 = item181;
		this.item182 = item182;
		this.item183 = item183;
		this.item184 = item184;
		this.item185 = item185;
		this.item186 = item186;
		this.item187 = item187;
		this.item188 = item188;
		this.item189 = item189;
		this.item190 = item190;
		this.item191 = item191;
		this.item192 = item192;
		this.item193 = item193;
		this.item194 = item194;
		this.item195 = item195;
		this.item196 = item196;
		this.item197 = item197;
		this.item198 = item198;
		this.item199 = item199;
		this.item200 = item200;
		this.dynamicdetailid = dynamicdetailid;
		this.dynamicfinishuser = dynamicfinishuser;
		this.dynamicfinishtime = dynamicfinishtime;
		this.dynamicactualamount = dynamicactualamount;
		this.dynamicisfinish = dynamicisfinish;
		this.dynamicuserd = dynamicuserd;
		this.dynamicfinished = dynamicfinished;
		this.advancefinishuser = advancefinishuser;
		this.advancefinishtime = advancefinishtime;
		this.advancefinished = advancefinished;
		this.advanceactualamount = advanceactualamount;
		this.commonbillno = commonbillno;
		this.viewbudgetdata = viewbudgetdata;
		this.budgetcode = budgetcode;
		this.detailnumber = detailnumber;
		this.budgetdatadiff = budgetdatadiff;
	}

	// Property accessors

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

	public Double getDynamicbillavailable() {
		return this.dynamicbillavailable;
	}

	public void setDynamicbillavailable(Double dynamicbillavailable) {
		this.dynamicbillavailable = dynamicbillavailable;
	}

	public String getDynamicbillno() {
		return this.dynamicbillno;
	}

	public void setDynamicbillno(String dynamicbillno) {
		this.dynamicbillno = dynamicbillno;
	}

	public Long getCurrencyid() {
		return this.currencyid;
	}

	public void setCurrencyid(Long currencyid) {
		this.currencyid = currencyid;
	}

	public Long getStructureid() {
		return this.structureid;
	}

	public void setStructureid(Long structureid) {
		this.structureid = structureid;
	}

	public Long getRequisitionuser() {
		return this.requisitionuser;
	}

	public void setRequisitionuser(Long requisitionuser) {
		this.requisitionuser = requisitionuser;
	}

	public Long getRequisitioncompany() {
		return this.requisitioncompany;
	}

	public void setRequisitioncompany(Long requisitioncompany) {
		this.requisitioncompany = requisitioncompany;
	}

	public String getMemo() {
		return this.memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public Long getDimaccount() {
		return this.dimaccount;
	}

	public void setDimaccount(Long dimaccount) {
		this.dimaccount = dimaccount;
	}

	public Long getDimsubject() {
		return this.dimsubject;
	}

	public void setDimsubject(Long dimsubject) {
		this.dimsubject = dimsubject;
	}

	public Long getDimcurrency() {
		return this.dimcurrency;
	}

	public void setDimcurrency(Long dimcurrency) {
		this.dimcurrency = dimcurrency;
	}

	public Long getDimproject() {
		return this.dimproject;
	}

	public void setDimproject(Long dimproject) {
		this.dimproject = dimproject;
	}

	public Long getDimsupplier() {
		return this.dimsupplier;
	}

	public void setDimsupplier(Long dimsupplier) {
		this.dimsupplier = dimsupplier;
	}

	public Long getDimpostrank() {
		return this.dimpostrank;
	}

	public void setDimpostrank(Long dimpostrank) {
		this.dimpostrank = dimpostrank;
	}

	public Long getDimregion() {
		return this.dimregion;
	}

	public void setDimregion(Long dimregion) {
		this.dimregion = dimregion;
	}

	public Long getDimperiod() {
		return this.dimperiod;
	}

	public void setDimperiod(Long dimperiod) {
		this.dimperiod = dimperiod;
	}

	public Long getDim01() {
		return this.dim01;
	}

	public void setDim01(Long dim01) {
		this.dim01 = dim01;
	}

	public Long getDim02() {
		return this.dim02;
	}

	public void setDim02(Long dim02) {
		this.dim02 = dim02;
	}

	public Long getDim03() {
		return this.dim03;
	}

	public void setDim03(Long dim03) {
		this.dim03 = dim03;
	}

	public Long getDim04() {
		return this.dim04;
	}

	public void setDim04(Long dim04) {
		this.dim04 = dim04;
	}

	public Long getDim05() {
		return this.dim05;
	}

	public void setDim05(Long dim05) {
		this.dim05 = dim05;
	}

	public Long getDim06() {
		return this.dim06;
	}

	public void setDim06(Long dim06) {
		this.dim06 = dim06;
	}

	public Long getDim07() {
		return this.dim07;
	}

	public void setDim07(Long dim07) {
		this.dim07 = dim07;
	}

	public Long getDim08() {
		return this.dim08;
	}

	public void setDim08(Long dim08) {
		this.dim08 = dim08;
	}

	public Long getDim09() {
		return this.dim09;
	}

	public void setDim09(Long dim09) {
		this.dim09 = dim09;
	}

	public Long getDim10() {
		return this.dim10;
	}

	public void setDim10(Long dim10) {
		this.dim10 = dim10;
	}

	public Double getNaturalcurrency() {
		return this.naturalcurrency;
	}

	public void setNaturalcurrency(Double naturalcurrency) {
		this.naturalcurrency = naturalcurrency;
	}

	public Double getOriginalcurrency() {
		return this.originalcurrency;
	}

	public void setOriginalcurrency(Double originalcurrency) {
		this.originalcurrency = originalcurrency;
	}

	public Double getNaturalapplycurrency() {
		return this.naturalapplycurrency;
	}

	public void setNaturalapplycurrency(Double naturalapplycurrency) {
		this.naturalapplycurrency = naturalapplycurrency;
	}

	public Double getOriginalapplycurrency() {
		return this.originalapplycurrency;
	}

	public void setOriginalapplycurrency(Double originalapplycurrency) {
		this.originalapplycurrency = originalapplycurrency;
	}

	public Double getOfforiginalcurrency() {
		return this.offoriginalcurrency;
	}

	public void setOfforiginalcurrency(Double offoriginalcurrency) {
		this.offoriginalcurrency = offoriginalcurrency;
	}

	public Double getOffnaturalcurrency() {
		return this.offnaturalcurrency;
	}

	public void setOffnaturalcurrency(Double offnaturalcurrency) {
		this.offnaturalcurrency = offnaturalcurrency;
	}

	public String getNaturalcurrencyuppercase() {
		return this.naturalcurrencyuppercase;
	}

	public void setNaturalcurrencyuppercase(String naturalcurrencyuppercase) {
		this.naturalcurrencyuppercase = naturalcurrencyuppercase;
	}

	public String getOriginalcurrencyuppercase() {
		return this.originalcurrencyuppercase;
	}

	public void setOriginalcurrencyuppercase(String originalcurrencyuppercase) {
		this.originalcurrencyuppercase = originalcurrencyuppercase;
	}

	public Double getMonthbalancedetail() {
		return this.monthbalancedetail;
	}

	public void setMonthbalancedetail(Double monthbalancedetail) {
		this.monthbalancedetail = monthbalancedetail;
	}

	public Double getTotalbalancedetail() {
		return this.totalbalancedetail;
	}

	public void setTotalbalancedetail(Double totalbalancedetail) {
		this.totalbalancedetail = totalbalancedetail;
	}

	public Double getYearbalancedetail() {
		return this.yearbalancedetail;
	}

	public void setYearbalancedetail(Double yearbalancedetail) {
		this.yearbalancedetail = yearbalancedetail;
	}

	public Double getMonthbalanceamount() {
		return this.monthbalanceamount;
	}

	public void setMonthbalanceamount(Double monthbalanceamount) {
		this.monthbalanceamount = monthbalanceamount;
	}

	public Double getTotalbalanceamount() {
		return this.totalbalanceamount;
	}

	public void setTotalbalanceamount(Double totalbalanceamount) {
		this.totalbalanceamount = totalbalanceamount;
	}

	public Double getYearbalanceamount() {
		return this.yearbalanceamount;
	}

	public void setYearbalanceamount(Double yearbalanceamount) {
		this.yearbalanceamount = yearbalanceamount;
	}

	public Double getYearbudgetamount() {
		return this.yearbudgetamount;
	}

	public void setYearbudgetamount(Double yearbudgetamount) {
		this.yearbudgetamount = yearbudgetamount;
	}

	public Double getTotalbudgetamount() {
		return this.totalbudgetamount;
	}

	public void setTotalbudgetamount(Double totalbudgetamount) {
		this.totalbudgetamount = totalbudgetamount;
	}

	public Double getMonthbudgetamount() {
		return this.monthbudgetamount;
	}

	public void setMonthbudgetamount(Double monthbudgetamount) {
		this.monthbudgetamount = monthbudgetamount;
	}

	public Double getYearbudgetdetail() {
		return this.yearbudgetdetail;
	}

	public void setYearbudgetdetail(Double yearbudgetdetail) {
		this.yearbudgetdetail = yearbudgetdetail;
	}

	public Double getTotalbudgetdetail() {
		return this.totalbudgetdetail;
	}

	public void setTotalbudgetdetail(Double totalbudgetdetail) {
		this.totalbudgetdetail = totalbudgetdetail;
	}

	public Double getMonthbudgetdetail() {
		return this.monthbudgetdetail;
	}

	public void setMonthbudgetdetail(Double monthbudgetdetail) {
		this.monthbudgetdetail = monthbudgetdetail;
	}

	public Double getYearactualamount() {
		return this.yearactualamount;
	}

	public void setYearactualamount(Double yearactualamount) {
		this.yearactualamount = yearactualamount;
	}

	public Double getTotalactualamount() {
		return this.totalactualamount;
	}

	public void setTotalactualamount(Double totalactualamount) {
		this.totalactualamount = totalactualamount;
	}

	public Double getMonthactualamount() {
		return this.monthactualamount;
	}

	public void setMonthactualamount(Double monthactualamount) {
		this.monthactualamount = monthactualamount;
	}

	public Double getYearactualdetail() {
		return this.yearactualdetail;
	}

	public void setYearactualdetail(Double yearactualdetail) {
		this.yearactualdetail = yearactualdetail;
	}

	public Double getTotalactualdetail() {
		return this.totalactualdetail;
	}

	public void setTotalactualdetail(Double totalactualdetail) {
		this.totalactualdetail = totalactualdetail;
	}

	public Double getMonthactualdetail() {
		return this.monthactualdetail;
	}

	public void setMonthactualdetail(Double monthactualdetail) {
		this.monthactualdetail = monthactualdetail;
	}

	public String getInvoicenumber() {
		return this.invoicenumber;
	}

	public void setInvoicenumber(String invoicenumber) {
		this.invoicenumber = invoicenumber;
	}

	public Double getDeductproportional() {
		return this.deductproportional;
	}

	public void setDeductproportional(Double deductproportional) {
		this.deductproportional = deductproportional;
	}

	public Double getRealitybudget() {
		return this.realitybudget;
	}

	public void setRealitybudget(Double realitybudget) {
		this.realitybudget = realitybudget;
	}

	public Double getExchangerate() {
		return this.exchangerate;
	}

	public void setExchangerate(Double exchangerate) {
		this.exchangerate = exchangerate;
	}

	public Timestamp getCreatetime() {
		return this.createtime;
	}

	public void setCreatetime(Timestamp createtime) {
		this.createtime = createtime;
	}

	public Double getFrombudget() {
		return this.frombudget;
	}

	public void setFrombudget(Double frombudget) {
		this.frombudget = frombudget;
	}

	public Double getFromdynamic() {
		return this.fromdynamic;
	}

	public void setFromdynamic(Double fromdynamic) {
		this.fromdynamic = fromdynamic;
	}

	public Double getNaturalcurrencyold() {
		return this.naturalcurrencyold;
	}

	public void setNaturalcurrencyold(Double naturalcurrencyold) {
		this.naturalcurrencyold = naturalcurrencyold;
	}

	public Long getComputationcompany() {
		return this.computationcompany;
	}

	public void setComputationcompany(Long computationcompany) {
		this.computationcompany = computationcompany;
	}

	public Long getComputationscostcenter() {
		return this.computationscostcenter;
	}

	public void setComputationscostcenter(Long computationscostcenter) {
		this.computationscostcenter = computationscostcenter;
	}

	public Long getComputationaccount() {
		return this.computationaccount;
	}

	public void setComputationaccount(Long computationaccount) {
		this.computationaccount = computationaccount;
	}

	public Long getPrepayfundcompany() {
		return this.prepayfundcompany;
	}

	public void setPrepayfundcompany(Long prepayfundcompany) {
		this.prepayfundcompany = prepayfundcompany;
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

	public String getItem131() {
		return this.item131;
	}

	public void setItem131(String item131) {
		this.item131 = item131;
	}

	public String getItem132() {
		return this.item132;
	}

	public void setItem132(String item132) {
		this.item132 = item132;
	}

	public String getItem133() {
		return this.item133;
	}

	public void setItem133(String item133) {
		this.item133 = item133;
	}

	public String getItem134() {
		return this.item134;
	}

	public void setItem134(String item134) {
		this.item134 = item134;
	}

	public String getItem135() {
		return this.item135;
	}

	public void setItem135(String item135) {
		this.item135 = item135;
	}

	public String getItem136() {
		return this.item136;
	}

	public void setItem136(String item136) {
		this.item136 = item136;
	}

	public String getItem137() {
		return this.item137;
	}

	public void setItem137(String item137) {
		this.item137 = item137;
	}

	public String getItem138() {
		return this.item138;
	}

	public void setItem138(String item138) {
		this.item138 = item138;
	}

	public String getItem139() {
		return this.item139;
	}

	public void setItem139(String item139) {
		this.item139 = item139;
	}

	public String getItem140() {
		return this.item140;
	}

	public void setItem140(String item140) {
		this.item140 = item140;
	}

	public String getItem141() {
		return this.item141;
	}

	public void setItem141(String item141) {
		this.item141 = item141;
	}

	public String getItem142() {
		return this.item142;
	}

	public void setItem142(String item142) {
		this.item142 = item142;
	}

	public String getItem143() {
		return this.item143;
	}

	public void setItem143(String item143) {
		this.item143 = item143;
	}

	public String getItem144() {
		return this.item144;
	}

	public void setItem144(String item144) {
		this.item144 = item144;
	}

	public String getItem145() {
		return this.item145;
	}

	public void setItem145(String item145) {
		this.item145 = item145;
	}

	public String getItem146() {
		return this.item146;
	}

	public void setItem146(String item146) {
		this.item146 = item146;
	}

	public String getItem147() {
		return this.item147;
	}

	public void setItem147(String item147) {
		this.item147 = item147;
	}

	public String getItem148() {
		return this.item148;
	}

	public void setItem148(String item148) {
		this.item148 = item148;
	}

	public String getItem149() {
		return this.item149;
	}

	public void setItem149(String item149) {
		this.item149 = item149;
	}

	public String getItem150() {
		return this.item150;
	}

	public void setItem150(String item150) {
		this.item150 = item150;
	}

	public String getItem151() {
		return this.item151;
	}

	public void setItem151(String item151) {
		this.item151 = item151;
	}

	public String getItem152() {
		return this.item152;
	}

	public void setItem152(String item152) {
		this.item152 = item152;
	}

	public String getItem153() {
		return this.item153;
	}

	public void setItem153(String item153) {
		this.item153 = item153;
	}

	public String getItem154() {
		return this.item154;
	}

	public void setItem154(String item154) {
		this.item154 = item154;
	}

	public String getItem155() {
		return this.item155;
	}

	public void setItem155(String item155) {
		this.item155 = item155;
	}

	public String getItem156() {
		return this.item156;
	}

	public void setItem156(String item156) {
		this.item156 = item156;
	}

	public String getItem157() {
		return this.item157;
	}

	public void setItem157(String item157) {
		this.item157 = item157;
	}

	public String getItem158() {
		return this.item158;
	}

	public void setItem158(String item158) {
		this.item158 = item158;
	}

	public String getItem159() {
		return this.item159;
	}

	public void setItem159(String item159) {
		this.item159 = item159;
	}

	public String getItem160() {
		return this.item160;
	}

	public void setItem160(String item160) {
		this.item160 = item160;
	}

	public String getItem161() {
		return this.item161;
	}

	public void setItem161(String item161) {
		this.item161 = item161;
	}

	public String getItem162() {
		return this.item162;
	}

	public void setItem162(String item162) {
		this.item162 = item162;
	}

	public String getItem163() {
		return this.item163;
	}

	public void setItem163(String item163) {
		this.item163 = item163;
	}

	public String getItem164() {
		return this.item164;
	}

	public void setItem164(String item164) {
		this.item164 = item164;
	}

	public String getItem165() {
		return this.item165;
	}

	public void setItem165(String item165) {
		this.item165 = item165;
	}

	public String getItem166() {
		return this.item166;
	}

	public void setItem166(String item166) {
		this.item166 = item166;
	}

	public String getItem167() {
		return this.item167;
	}

	public void setItem167(String item167) {
		this.item167 = item167;
	}

	public String getItem168() {
		return this.item168;
	}

	public void setItem168(String item168) {
		this.item168 = item168;
	}

	public String getItem169() {
		return this.item169;
	}

	public void setItem169(String item169) {
		this.item169 = item169;
	}

	public String getItem170() {
		return this.item170;
	}

	public void setItem170(String item170) {
		this.item170 = item170;
	}

	public String getItem171() {
		return this.item171;
	}

	public void setItem171(String item171) {
		this.item171 = item171;
	}

	public String getItem172() {
		return this.item172;
	}

	public void setItem172(String item172) {
		this.item172 = item172;
	}

	public String getItem173() {
		return this.item173;
	}

	public void setItem173(String item173) {
		this.item173 = item173;
	}

	public String getItem174() {
		return this.item174;
	}

	public void setItem174(String item174) {
		this.item174 = item174;
	}

	public String getItem175() {
		return this.item175;
	}

	public void setItem175(String item175) {
		this.item175 = item175;
	}

	public String getItem176() {
		return this.item176;
	}

	public void setItem176(String item176) {
		this.item176 = item176;
	}

	public String getItem177() {
		return this.item177;
	}

	public void setItem177(String item177) {
		this.item177 = item177;
	}

	public String getItem178() {
		return this.item178;
	}

	public void setItem178(String item178) {
		this.item178 = item178;
	}

	public String getItem179() {
		return this.item179;
	}

	public void setItem179(String item179) {
		this.item179 = item179;
	}

	public String getItem180() {
		return this.item180;
	}

	public void setItem180(String item180) {
		this.item180 = item180;
	}

	public String getItem181() {
		return this.item181;
	}

	public void setItem181(String item181) {
		this.item181 = item181;
	}

	public String getItem182() {
		return this.item182;
	}

	public void setItem182(String item182) {
		this.item182 = item182;
	}

	public String getItem183() {
		return this.item183;
	}

	public void setItem183(String item183) {
		this.item183 = item183;
	}

	public String getItem184() {
		return this.item184;
	}

	public void setItem184(String item184) {
		this.item184 = item184;
	}

	public String getItem185() {
		return this.item185;
	}

	public void setItem185(String item185) {
		this.item185 = item185;
	}

	public String getItem186() {
		return this.item186;
	}

	public void setItem186(String item186) {
		this.item186 = item186;
	}

	public String getItem187() {
		return this.item187;
	}

	public void setItem187(String item187) {
		this.item187 = item187;
	}

	public String getItem188() {
		return this.item188;
	}

	public void setItem188(String item188) {
		this.item188 = item188;
	}

	public String getItem189() {
		return this.item189;
	}

	public void setItem189(String item189) {
		this.item189 = item189;
	}

	public String getItem190() {
		return this.item190;
	}

	public void setItem190(String item190) {
		this.item190 = item190;
	}

	public String getItem191() {
		return this.item191;
	}

	public void setItem191(String item191) {
		this.item191 = item191;
	}

	public String getItem192() {
		return this.item192;
	}

	public void setItem192(String item192) {
		this.item192 = item192;
	}

	public String getItem193() {
		return this.item193;
	}

	public void setItem193(String item193) {
		this.item193 = item193;
	}

	public String getItem194() {
		return this.item194;
	}

	public void setItem194(String item194) {
		this.item194 = item194;
	}

	public String getItem195() {
		return this.item195;
	}

	public void setItem195(String item195) {
		this.item195 = item195;
	}

	public String getItem196() {
		return this.item196;
	}

	public void setItem196(String item196) {
		this.item196 = item196;
	}

	public String getItem197() {
		return this.item197;
	}

	public void setItem197(String item197) {
		this.item197 = item197;
	}

	public String getItem198() {
		return this.item198;
	}

	public void setItem198(String item198) {
		this.item198 = item198;
	}

	public String getItem199() {
		return this.item199;
	}

	public void setItem199(String item199) {
		this.item199 = item199;
	}

	public String getItem200() {
		return this.item200;
	}

	public void setItem200(String item200) {
		this.item200 = item200;
	}

	public Long getDynamicdetailid() {
		return this.dynamicdetailid;
	}

	public void setDynamicdetailid(Long dynamicdetailid) {
		this.dynamicdetailid = dynamicdetailid;
	}

	public Long getDynamicfinishuser() {
		return this.dynamicfinishuser;
	}

	public void setDynamicfinishuser(Long dynamicfinishuser) {
		this.dynamicfinishuser = dynamicfinishuser;
	}

	public Timestamp getDynamicfinishtime() {
		return this.dynamicfinishtime;
	}

	public void setDynamicfinishtime(Timestamp dynamicfinishtime) {
		this.dynamicfinishtime = dynamicfinishtime;
	}

	public Double getDynamicactualamount() {
		return this.dynamicactualamount;
	}

	public void setDynamicactualamount(Double dynamicactualamount) {
		this.dynamicactualamount = dynamicactualamount;
	}

	public Long getDynamicisfinish() {
		return this.dynamicisfinish;
	}

	public void setDynamicisfinish(Long dynamicisfinish) {
		this.dynamicisfinish = dynamicisfinish;
	}

	public Byte getDynamicuserd() {
		return this.dynamicuserd;
	}

	public void setDynamicuserd(Byte dynamicuserd) {
		this.dynamicuserd = dynamicuserd;
	}

	public Long getDynamicfinished() {
		return this.dynamicfinished;
	}

	public void setDynamicfinished(Long dynamicfinished) {
		this.dynamicfinished = dynamicfinished;
	}

	public Long getAdvancefinishuser() {
		return this.advancefinishuser;
	}

	public void setAdvancefinishuser(Long advancefinishuser) {
		this.advancefinishuser = advancefinishuser;
	}

	public Timestamp getAdvancefinishtime() {
		return this.advancefinishtime;
	}

	public void setAdvancefinishtime(Timestamp advancefinishtime) {
		this.advancefinishtime = advancefinishtime;
	}

	public Long getAdvancefinished() {
		return this.advancefinished;
	}

	public void setAdvancefinished(Long advancefinished) {
		this.advancefinished = advancefinished;
	}

	public Double getAdvanceactualamount() {
		return this.advanceactualamount;
	}

	public void setAdvanceactualamount(Double advanceactualamount) {
		this.advanceactualamount = advanceactualamount;
	}

	public String getCommonbillno() {
		return this.commonbillno;
	}

	public void setCommonbillno(String commonbillno) {
		this.commonbillno = commonbillno;
	}

	public String getViewbudgetdata() {
		return this.viewbudgetdata;
	}

	public void setViewbudgetdata(String viewbudgetdata) {
		this.viewbudgetdata = viewbudgetdata;
	}

	public String getBudgetcode() {
		return this.budgetcode;
	}

	public void setBudgetcode(String budgetcode) {
		this.budgetcode = budgetcode;
	}

	public String getDetailnumber() {
		return this.detailnumber;
	}

	public void setDetailnumber(String detailnumber) {
		this.detailnumber = detailnumber;
	}

	public String getBudgetdatadiff() {
		return this.budgetdatadiff;
	}

	public void setBudgetdatadiff(String budgetdatadiff) {
		this.budgetdatadiff = budgetdatadiff;
	}

}