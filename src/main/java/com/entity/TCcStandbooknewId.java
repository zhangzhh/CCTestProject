package com.entity;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * TCcStandbooknewId entity. @author MyEclipse Persistence Tools
 */

public class TCcStandbooknewId implements java.io.Serializable {

	// Fields

	private String costtype;
	private String costtypecode;
	private String costcenter;
	private String storetype;
	private String year;
	private Double lastyearrealityamount;
	private Double thiscalculate;
	private String isreimbursement;
	private Double realityreimbursementamount;
	private Timestamp storecloseeddate;
	private String startmaintenance;
	private String endmaintenance;
	private String storecloseno;
	private Long costcentercode;
	private Long costtypecodeid;
	private BigDecimal id;
	private String mouth;
	private Long yearcode;
	private Long mouthcode;
	private Timestamp reimbursementtime;
	private String totalcode;
	private String holdingdocumenttype;
	private String iswithholding;
	private String withholdingdocumentno;
	private String iswithholdingsterilization;
	private String withholdingsterilizationno;
	private String isprepaid;
	private String prepaiddocumentno;
	private String isamortizatio;
	private String amortizatiodocumentno;
	private String housestarttime;
	private String houseendtime;
	private Timestamp withholdingcreattime;
	private Timestamp prepaidcreattime;
	private Timestamp amortizatiocreattime;
	private Timestamp rilizationcreattime;
	private String isclosestore;
	private String reimbursementno;
	private Double lastmount;
	private String isg;
	private String contractcode;
	private Long hecentercode;
	private String hecentercodename;
	private String selectmount;
	private String accountsubject;

	// Constructors

	/** default constructor */
	public TCcStandbooknewId() {
	}

	/** full constructor */
	public TCcStandbooknewId(String costtype, String costtypecode,
			String costcenter, String storetype, String year,
			Double lastyearrealityamount, Double thiscalculate,
			String isreimbursement, Double realityreimbursementamount,
			Timestamp storecloseeddate, String startmaintenance,
			String endmaintenance, String storecloseno, Long costcentercode,
			Long costtypecodeid, BigDecimal id, String mouth, Long yearcode,
			Long mouthcode, Timestamp reimbursementtime, String totalcode,
			String holdingdocumenttype, String iswithholding,
			String withholdingdocumentno, String iswithholdingsterilization,
			String withholdingsterilizationno, String isprepaid,
			String prepaiddocumentno, String isamortizatio,
			String amortizatiodocumentno, String housestarttime,
			String houseendtime, Timestamp withholdingcreattime,
			Timestamp prepaidcreattime, Timestamp amortizatiocreattime,
			Timestamp rilizationcreattime, String isclosestore,
			String reimbursementno, Double lastmount, String isg,
			String contractcode, Long hecentercode, String hecentercodename,
			String selectmount, String accountsubject) {
		this.costtype = costtype;
		this.costtypecode = costtypecode;
		this.costcenter = costcenter;
		this.storetype = storetype;
		this.year = year;
		this.lastyearrealityamount = lastyearrealityamount;
		this.thiscalculate = thiscalculate;
		this.isreimbursement = isreimbursement;
		this.realityreimbursementamount = realityreimbursementamount;
		this.storecloseeddate = storecloseeddate;
		this.startmaintenance = startmaintenance;
		this.endmaintenance = endmaintenance;
		this.storecloseno = storecloseno;
		this.costcentercode = costcentercode;
		this.costtypecodeid = costtypecodeid;
		this.id = id;
		this.mouth = mouth;
		this.yearcode = yearcode;
		this.mouthcode = mouthcode;
		this.reimbursementtime = reimbursementtime;
		this.totalcode = totalcode;
		this.holdingdocumenttype = holdingdocumenttype;
		this.iswithholding = iswithholding;
		this.withholdingdocumentno = withholdingdocumentno;
		this.iswithholdingsterilization = iswithholdingsterilization;
		this.withholdingsterilizationno = withholdingsterilizationno;
		this.isprepaid = isprepaid;
		this.prepaiddocumentno = prepaiddocumentno;
		this.isamortizatio = isamortizatio;
		this.amortizatiodocumentno = amortizatiodocumentno;
		this.housestarttime = housestarttime;
		this.houseendtime = houseendtime;
		this.withholdingcreattime = withholdingcreattime;
		this.prepaidcreattime = prepaidcreattime;
		this.amortizatiocreattime = amortizatiocreattime;
		this.rilizationcreattime = rilizationcreattime;
		this.isclosestore = isclosestore;
		this.reimbursementno = reimbursementno;
		this.lastmount = lastmount;
		this.isg = isg;
		this.contractcode = contractcode;
		this.hecentercode = hecentercode;
		this.hecentercodename = hecentercodename;
		this.selectmount = selectmount;
		this.accountsubject = accountsubject;
	}

	// Property accessors

	public String getCosttype() {
		return this.costtype;
	}

	public void setCosttype(String costtype) {
		this.costtype = costtype;
	}

	public String getCosttypecode() {
		return this.costtypecode;
	}

	public void setCosttypecode(String costtypecode) {
		this.costtypecode = costtypecode;
	}

	public String getCostcenter() {
		return this.costcenter;
	}

	public void setCostcenter(String costcenter) {
		this.costcenter = costcenter;
	}

	public String getStoretype() {
		return this.storetype;
	}

	public void setStoretype(String storetype) {
		this.storetype = storetype;
	}

	public String getYear() {
		return this.year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public Double getLastyearrealityamount() {
		return this.lastyearrealityamount;
	}

	public void setLastyearrealityamount(Double lastyearrealityamount) {
		this.lastyearrealityamount = lastyearrealityamount;
	}

	public Double getThiscalculate() {
		return this.thiscalculate;
	}

	public void setThiscalculate(Double thiscalculate) {
		this.thiscalculate = thiscalculate;
	}

	public String getIsreimbursement() {
		return this.isreimbursement;
	}

	public void setIsreimbursement(String isreimbursement) {
		this.isreimbursement = isreimbursement;
	}

	public Double getRealityreimbursementamount() {
		return this.realityreimbursementamount;
	}

	public void setRealityreimbursementamount(Double realityreimbursementamount) {
		this.realityreimbursementamount = realityreimbursementamount;
	}

	public Timestamp getStorecloseeddate() {
		return this.storecloseeddate;
	}

	public void setStorecloseeddate(Timestamp storecloseeddate) {
		this.storecloseeddate = storecloseeddate;
	}

	public String getStartmaintenance() {
		return this.startmaintenance;
	}

	public void setStartmaintenance(String startmaintenance) {
		this.startmaintenance = startmaintenance;
	}

	public String getEndmaintenance() {
		return this.endmaintenance;
	}

	public void setEndmaintenance(String endmaintenance) {
		this.endmaintenance = endmaintenance;
	}

	public String getStorecloseno() {
		return this.storecloseno;
	}

	public void setStorecloseno(String storecloseno) {
		this.storecloseno = storecloseno;
	}

	public Long getCostcentercode() {
		return this.costcentercode;
	}

	public void setCostcentercode(Long costcentercode) {
		this.costcentercode = costcentercode;
	}

	public Long getCosttypecodeid() {
		return this.costtypecodeid;
	}

	public void setCosttypecodeid(Long costtypecodeid) {
		this.costtypecodeid = costtypecodeid;
	}

	public BigDecimal getId() {
		return this.id;
	}

	public void setId(BigDecimal id) {
		this.id = id;
	}

	public String getMouth() {
		return this.mouth;
	}

	public void setMouth(String mouth) {
		this.mouth = mouth;
	}

	public Long getYearcode() {
		return this.yearcode;
	}

	public void setYearcode(Long yearcode) {
		this.yearcode = yearcode;
	}

	public Long getMouthcode() {
		return this.mouthcode;
	}

	public void setMouthcode(Long mouthcode) {
		this.mouthcode = mouthcode;
	}

	public Timestamp getReimbursementtime() {
		return this.reimbursementtime;
	}

	public void setReimbursementtime(Timestamp reimbursementtime) {
		this.reimbursementtime = reimbursementtime;
	}

	public String getTotalcode() {
		return this.totalcode;
	}

	public void setTotalcode(String totalcode) {
		this.totalcode = totalcode;
	}

	public String getHoldingdocumenttype() {
		return this.holdingdocumenttype;
	}

	public void setHoldingdocumenttype(String holdingdocumenttype) {
		this.holdingdocumenttype = holdingdocumenttype;
	}

	public String getIswithholding() {
		return this.iswithholding;
	}

	public void setIswithholding(String iswithholding) {
		this.iswithholding = iswithholding;
	}

	public String getWithholdingdocumentno() {
		return this.withholdingdocumentno;
	}

	public void setWithholdingdocumentno(String withholdingdocumentno) {
		this.withholdingdocumentno = withholdingdocumentno;
	}

	public String getIswithholdingsterilization() {
		return this.iswithholdingsterilization;
	}

	public void setIswithholdingsterilization(String iswithholdingsterilization) {
		this.iswithholdingsterilization = iswithholdingsterilization;
	}

	public String getWithholdingsterilizationno() {
		return this.withholdingsterilizationno;
	}

	public void setWithholdingsterilizationno(String withholdingsterilizationno) {
		this.withholdingsterilizationno = withholdingsterilizationno;
	}

	public String getIsprepaid() {
		return this.isprepaid;
	}

	public void setIsprepaid(String isprepaid) {
		this.isprepaid = isprepaid;
	}

	public String getPrepaiddocumentno() {
		return this.prepaiddocumentno;
	}

	public void setPrepaiddocumentno(String prepaiddocumentno) {
		this.prepaiddocumentno = prepaiddocumentno;
	}

	public String getIsamortizatio() {
		return this.isamortizatio;
	}

	public void setIsamortizatio(String isamortizatio) {
		this.isamortizatio = isamortizatio;
	}

	public String getAmortizatiodocumentno() {
		return this.amortizatiodocumentno;
	}

	public void setAmortizatiodocumentno(String amortizatiodocumentno) {
		this.amortizatiodocumentno = amortizatiodocumentno;
	}

	public String getHousestarttime() {
		return this.housestarttime;
	}

	public void setHousestarttime(String housestarttime) {
		this.housestarttime = housestarttime;
	}

	public String getHouseendtime() {
		return this.houseendtime;
	}

	public void setHouseendtime(String houseendtime) {
		this.houseendtime = houseendtime;
	}

	public Timestamp getWithholdingcreattime() {
		return this.withholdingcreattime;
	}

	public void setWithholdingcreattime(Timestamp withholdingcreattime) {
		this.withholdingcreattime = withholdingcreattime;
	}

	public Timestamp getPrepaidcreattime() {
		return this.prepaidcreattime;
	}

	public void setPrepaidcreattime(Timestamp prepaidcreattime) {
		this.prepaidcreattime = prepaidcreattime;
	}

	public Timestamp getAmortizatiocreattime() {
		return this.amortizatiocreattime;
	}

	public void setAmortizatiocreattime(Timestamp amortizatiocreattime) {
		this.amortizatiocreattime = amortizatiocreattime;
	}

	public Timestamp getRilizationcreattime() {
		return this.rilizationcreattime;
	}

	public void setRilizationcreattime(Timestamp rilizationcreattime) {
		this.rilizationcreattime = rilizationcreattime;
	}

	public String getIsclosestore() {
		return this.isclosestore;
	}

	public void setIsclosestore(String isclosestore) {
		this.isclosestore = isclosestore;
	}

	public String getReimbursementno() {
		return this.reimbursementno;
	}

	public void setReimbursementno(String reimbursementno) {
		this.reimbursementno = reimbursementno;
	}

	public Double getLastmount() {
		return this.lastmount;
	}

	public void setLastmount(Double lastmount) {
		this.lastmount = lastmount;
	}

	public String getIsg() {
		return this.isg;
	}

	public void setIsg(String isg) {
		this.isg = isg;
	}

	public String getContractcode() {
		return this.contractcode;
	}

	public void setContractcode(String contractcode) {
		this.contractcode = contractcode;
	}

	public Long getHecentercode() {
		return this.hecentercode;
	}

	public void setHecentercode(Long hecentercode) {
		this.hecentercode = hecentercode;
	}

	public String getHecentercodename() {
		return this.hecentercodename;
	}

	public void setHecentercodename(String hecentercodename) {
		this.hecentercodename = hecentercodename;
	}

	public String getSelectmount() {
		return this.selectmount;
	}

	public void setSelectmount(String selectmount) {
		this.selectmount = selectmount;
	}

	public String getAccountsubject() {
		return this.accountsubject;
	}

	public void setAccountsubject(String accountsubject) {
		this.accountsubject = accountsubject;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TCcStandbooknewId))
			return false;
		TCcStandbooknewId castOther = (TCcStandbooknewId) other;

		return ((this.getCosttype() == castOther.getCosttype()) || (this
				.getCosttype() != null && castOther.getCosttype() != null && this
				.getCosttype().equals(castOther.getCosttype())))
				&& ((this.getCosttypecode() == castOther.getCosttypecode()) || (this
						.getCosttypecode() != null
						&& castOther.getCosttypecode() != null && this
						.getCosttypecode().equals(castOther.getCosttypecode())))
				&& ((this.getCostcenter() == castOther.getCostcenter()) || (this
						.getCostcenter() != null
						&& castOther.getCostcenter() != null && this
						.getCostcenter().equals(castOther.getCostcenter())))
				&& ((this.getStoretype() == castOther.getStoretype()) || (this
						.getStoretype() != null
						&& castOther.getStoretype() != null && this
						.getStoretype().equals(castOther.getStoretype())))
				&& ((this.getYear() == castOther.getYear()) || (this.getYear() != null
						&& castOther.getYear() != null && this.getYear()
						.equals(castOther.getYear())))
				&& ((this.getLastyearrealityamount() == castOther
						.getLastyearrealityamount()) || (this
						.getLastyearrealityamount() != null
						&& castOther.getLastyearrealityamount() != null && this
						.getLastyearrealityamount().equals(
								castOther.getLastyearrealityamount())))
				&& ((this.getThiscalculate() == castOther.getThiscalculate()) || (this
						.getThiscalculate() != null
						&& castOther.getThiscalculate() != null && this
						.getThiscalculate()
						.equals(castOther.getThiscalculate())))
				&& ((this.getIsreimbursement() == castOther
						.getIsreimbursement()) || (this.getIsreimbursement() != null
						&& castOther.getIsreimbursement() != null && this
						.getIsreimbursement().equals(
								castOther.getIsreimbursement())))
				&& ((this.getRealityreimbursementamount() == castOther
						.getRealityreimbursementamount()) || (this
						.getRealityreimbursementamount() != null
						&& castOther.getRealityreimbursementamount() != null && this
						.getRealityreimbursementamount().equals(
								castOther.getRealityreimbursementamount())))
				&& ((this.getStorecloseeddate() == castOther
						.getStorecloseeddate()) || (this.getStorecloseeddate() != null
						&& castOther.getStorecloseeddate() != null && this
						.getStorecloseeddate().equals(
								castOther.getStorecloseeddate())))
				&& ((this.getStartmaintenance() == castOther
						.getStartmaintenance()) || (this.getStartmaintenance() != null
						&& castOther.getStartmaintenance() != null && this
						.getStartmaintenance().equals(
								castOther.getStartmaintenance())))
				&& ((this.getEndmaintenance() == castOther.getEndmaintenance()) || (this
						.getEndmaintenance() != null
						&& castOther.getEndmaintenance() != null && this
						.getEndmaintenance().equals(
								castOther.getEndmaintenance())))
				&& ((this.getStorecloseno() == castOther.getStorecloseno()) || (this
						.getStorecloseno() != null
						&& castOther.getStorecloseno() != null && this
						.getStorecloseno().equals(castOther.getStorecloseno())))
				&& ((this.getCostcentercode() == castOther.getCostcentercode()) || (this
						.getCostcentercode() != null
						&& castOther.getCostcentercode() != null && this
						.getCostcentercode().equals(
								castOther.getCostcentercode())))
				&& ((this.getCosttypecodeid() == castOther.getCosttypecodeid()) || (this
						.getCosttypecodeid() != null
						&& castOther.getCosttypecodeid() != null && this
						.getCosttypecodeid().equals(
								castOther.getCosttypecodeid())))
				&& ((this.getId() == castOther.getId()) || (this.getId() != null
						&& castOther.getId() != null && this.getId().equals(
						castOther.getId())))
				&& ((this.getMouth() == castOther.getMouth()) || (this
						.getMouth() != null && castOther.getMouth() != null && this
						.getMouth().equals(castOther.getMouth())))
				&& ((this.getYearcode() == castOther.getYearcode()) || (this
						.getYearcode() != null
						&& castOther.getYearcode() != null && this
						.getYearcode().equals(castOther.getYearcode())))
				&& ((this.getMouthcode() == castOther.getMouthcode()) || (this
						.getMouthcode() != null
						&& castOther.getMouthcode() != null && this
						.getMouthcode().equals(castOther.getMouthcode())))
				&& ((this.getReimbursementtime() == castOther
						.getReimbursementtime()) || (this
						.getReimbursementtime() != null
						&& castOther.getReimbursementtime() != null && this
						.getReimbursementtime().equals(
								castOther.getReimbursementtime())))
				&& ((this.getTotalcode() == castOther.getTotalcode()) || (this
						.getTotalcode() != null
						&& castOther.getTotalcode() != null && this
						.getTotalcode().equals(castOther.getTotalcode())))
				&& ((this.getHoldingdocumenttype() == castOther
						.getHoldingdocumenttype()) || (this
						.getHoldingdocumenttype() != null
						&& castOther.getHoldingdocumenttype() != null && this
						.getHoldingdocumenttype().equals(
								castOther.getHoldingdocumenttype())))
				&& ((this.getIswithholding() == castOther.getIswithholding()) || (this
						.getIswithholding() != null
						&& castOther.getIswithholding() != null && this
						.getIswithholding()
						.equals(castOther.getIswithholding())))
				&& ((this.getWithholdingdocumentno() == castOther
						.getWithholdingdocumentno()) || (this
						.getWithholdingdocumentno() != null
						&& castOther.getWithholdingdocumentno() != null && this
						.getWithholdingdocumentno().equals(
								castOther.getWithholdingdocumentno())))
				&& ((this.getIswithholdingsterilization() == castOther
						.getIswithholdingsterilization()) || (this
						.getIswithholdingsterilization() != null
						&& castOther.getIswithholdingsterilization() != null && this
						.getIswithholdingsterilization().equals(
								castOther.getIswithholdingsterilization())))
				&& ((this.getWithholdingsterilizationno() == castOther
						.getWithholdingsterilizationno()) || (this
						.getWithholdingsterilizationno() != null
						&& castOther.getWithholdingsterilizationno() != null && this
						.getWithholdingsterilizationno().equals(
								castOther.getWithholdingsterilizationno())))
				&& ((this.getIsprepaid() == castOther.getIsprepaid()) || (this
						.getIsprepaid() != null
						&& castOther.getIsprepaid() != null && this
						.getIsprepaid().equals(castOther.getIsprepaid())))
				&& ((this.getPrepaiddocumentno() == castOther
						.getPrepaiddocumentno()) || (this
						.getPrepaiddocumentno() != null
						&& castOther.getPrepaiddocumentno() != null && this
						.getPrepaiddocumentno().equals(
								castOther.getPrepaiddocumentno())))
				&& ((this.getIsamortizatio() == castOther.getIsamortizatio()) || (this
						.getIsamortizatio() != null
						&& castOther.getIsamortizatio() != null && this
						.getIsamortizatio()
						.equals(castOther.getIsamortizatio())))
				&& ((this.getAmortizatiodocumentno() == castOther
						.getAmortizatiodocumentno()) || (this
						.getAmortizatiodocumentno() != null
						&& castOther.getAmortizatiodocumentno() != null && this
						.getAmortizatiodocumentno().equals(
								castOther.getAmortizatiodocumentno())))
				&& ((this.getHousestarttime() == castOther.getHousestarttime()) || (this
						.getHousestarttime() != null
						&& castOther.getHousestarttime() != null && this
						.getHousestarttime().equals(
								castOther.getHousestarttime())))
				&& ((this.getHouseendtime() == castOther.getHouseendtime()) || (this
						.getHouseendtime() != null
						&& castOther.getHouseendtime() != null && this
						.getHouseendtime().equals(castOther.getHouseendtime())))
				&& ((this.getWithholdingcreattime() == castOther
						.getWithholdingcreattime()) || (this
						.getWithholdingcreattime() != null
						&& castOther.getWithholdingcreattime() != null && this
						.getWithholdingcreattime().equals(
								castOther.getWithholdingcreattime())))
				&& ((this.getPrepaidcreattime() == castOther
						.getPrepaidcreattime()) || (this.getPrepaidcreattime() != null
						&& castOther.getPrepaidcreattime() != null && this
						.getPrepaidcreattime().equals(
								castOther.getPrepaidcreattime())))
				&& ((this.getAmortizatiocreattime() == castOther
						.getAmortizatiocreattime()) || (this
						.getAmortizatiocreattime() != null
						&& castOther.getAmortizatiocreattime() != null && this
						.getAmortizatiocreattime().equals(
								castOther.getAmortizatiocreattime())))
				&& ((this.getRilizationcreattime() == castOther
						.getRilizationcreattime()) || (this
						.getRilizationcreattime() != null
						&& castOther.getRilizationcreattime() != null && this
						.getRilizationcreattime().equals(
								castOther.getRilizationcreattime())))
				&& ((this.getIsclosestore() == castOther.getIsclosestore()) || (this
						.getIsclosestore() != null
						&& castOther.getIsclosestore() != null && this
						.getIsclosestore().equals(castOther.getIsclosestore())))
				&& ((this.getReimbursementno() == castOther
						.getReimbursementno()) || (this.getReimbursementno() != null
						&& castOther.getReimbursementno() != null && this
						.getReimbursementno().equals(
								castOther.getReimbursementno())))
				&& ((this.getLastmount() == castOther.getLastmount()) || (this
						.getLastmount() != null
						&& castOther.getLastmount() != null && this
						.getLastmount().equals(castOther.getLastmount())))
				&& ((this.getIsg() == castOther.getIsg()) || (this.getIsg() != null
						&& castOther.getIsg() != null && this.getIsg().equals(
						castOther.getIsg())))
				&& ((this.getContractcode() == castOther.getContractcode()) || (this
						.getContractcode() != null
						&& castOther.getContractcode() != null && this
						.getContractcode().equals(castOther.getContractcode())))
				&& ((this.getHecentercode() == castOther.getHecentercode()) || (this
						.getHecentercode() != null
						&& castOther.getHecentercode() != null && this
						.getHecentercode().equals(castOther.getHecentercode())))
				&& ((this.getHecentercodename() == castOther
						.getHecentercodename()) || (this.getHecentercodename() != null
						&& castOther.getHecentercodename() != null && this
						.getHecentercodename().equals(
								castOther.getHecentercodename())))
				&& ((this.getSelectmount() == castOther.getSelectmount()) || (this
						.getSelectmount() != null
						&& castOther.getSelectmount() != null && this
						.getSelectmount().equals(castOther.getSelectmount())))
				&& ((this.getAccountsubject() == castOther.getAccountsubject()) || (this
						.getAccountsubject() != null
						&& castOther.getAccountsubject() != null && this
						.getAccountsubject().equals(
								castOther.getAccountsubject())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getCosttype() == null ? 0 : this.getCosttype().hashCode());
		result = 37
				* result
				+ (getCosttypecode() == null ? 0 : this.getCosttypecode()
						.hashCode());
		result = 37
				* result
				+ (getCostcenter() == null ? 0 : this.getCostcenter()
						.hashCode());
		result = 37 * result
				+ (getStoretype() == null ? 0 : this.getStoretype().hashCode());
		result = 37 * result
				+ (getYear() == null ? 0 : this.getYear().hashCode());
		result = 37
				* result
				+ (getLastyearrealityamount() == null ? 0 : this
						.getLastyearrealityamount().hashCode());
		result = 37
				* result
				+ (getThiscalculate() == null ? 0 : this.getThiscalculate()
						.hashCode());
		result = 37
				* result
				+ (getIsreimbursement() == null ? 0 : this.getIsreimbursement()
						.hashCode());
		result = 37
				* result
				+ (getRealityreimbursementamount() == null ? 0 : this
						.getRealityreimbursementamount().hashCode());
		result = 37
				* result
				+ (getStorecloseeddate() == null ? 0 : this
						.getStorecloseeddate().hashCode());
		result = 37
				* result
				+ (getStartmaintenance() == null ? 0 : this
						.getStartmaintenance().hashCode());
		result = 37
				* result
				+ (getEndmaintenance() == null ? 0 : this.getEndmaintenance()
						.hashCode());
		result = 37
				* result
				+ (getStorecloseno() == null ? 0 : this.getStorecloseno()
						.hashCode());
		result = 37
				* result
				+ (getCostcentercode() == null ? 0 : this.getCostcentercode()
						.hashCode());
		result = 37
				* result
				+ (getCosttypecodeid() == null ? 0 : this.getCosttypecodeid()
						.hashCode());
		result = 37 * result + (getId() == null ? 0 : this.getId().hashCode());
		result = 37 * result
				+ (getMouth() == null ? 0 : this.getMouth().hashCode());
		result = 37 * result
				+ (getYearcode() == null ? 0 : this.getYearcode().hashCode());
		result = 37 * result
				+ (getMouthcode() == null ? 0 : this.getMouthcode().hashCode());
		result = 37
				* result
				+ (getReimbursementtime() == null ? 0 : this
						.getReimbursementtime().hashCode());
		result = 37 * result
				+ (getTotalcode() == null ? 0 : this.getTotalcode().hashCode());
		result = 37
				* result
				+ (getHoldingdocumenttype() == null ? 0 : this
						.getHoldingdocumenttype().hashCode());
		result = 37
				* result
				+ (getIswithholding() == null ? 0 : this.getIswithholding()
						.hashCode());
		result = 37
				* result
				+ (getWithholdingdocumentno() == null ? 0 : this
						.getWithholdingdocumentno().hashCode());
		result = 37
				* result
				+ (getIswithholdingsterilization() == null ? 0 : this
						.getIswithholdingsterilization().hashCode());
		result = 37
				* result
				+ (getWithholdingsterilizationno() == null ? 0 : this
						.getWithholdingsterilizationno().hashCode());
		result = 37 * result
				+ (getIsprepaid() == null ? 0 : this.getIsprepaid().hashCode());
		result = 37
				* result
				+ (getPrepaiddocumentno() == null ? 0 : this
						.getPrepaiddocumentno().hashCode());
		result = 37
				* result
				+ (getIsamortizatio() == null ? 0 : this.getIsamortizatio()
						.hashCode());
		result = 37
				* result
				+ (getAmortizatiodocumentno() == null ? 0 : this
						.getAmortizatiodocumentno().hashCode());
		result = 37
				* result
				+ (getHousestarttime() == null ? 0 : this.getHousestarttime()
						.hashCode());
		result = 37
				* result
				+ (getHouseendtime() == null ? 0 : this.getHouseendtime()
						.hashCode());
		result = 37
				* result
				+ (getWithholdingcreattime() == null ? 0 : this
						.getWithholdingcreattime().hashCode());
		result = 37
				* result
				+ (getPrepaidcreattime() == null ? 0 : this
						.getPrepaidcreattime().hashCode());
		result = 37
				* result
				+ (getAmortizatiocreattime() == null ? 0 : this
						.getAmortizatiocreattime().hashCode());
		result = 37
				* result
				+ (getRilizationcreattime() == null ? 0 : this
						.getRilizationcreattime().hashCode());
		result = 37
				* result
				+ (getIsclosestore() == null ? 0 : this.getIsclosestore()
						.hashCode());
		result = 37
				* result
				+ (getReimbursementno() == null ? 0 : this.getReimbursementno()
						.hashCode());
		result = 37 * result
				+ (getLastmount() == null ? 0 : this.getLastmount().hashCode());
		result = 37 * result
				+ (getIsg() == null ? 0 : this.getIsg().hashCode());
		result = 37
				* result
				+ (getContractcode() == null ? 0 : this.getContractcode()
						.hashCode());
		result = 37
				* result
				+ (getHecentercode() == null ? 0 : this.getHecentercode()
						.hashCode());
		result = 37
				* result
				+ (getHecentercodename() == null ? 0 : this
						.getHecentercodename().hashCode());
		result = 37
				* result
				+ (getSelectmount() == null ? 0 : this.getSelectmount()
						.hashCode());
		result = 37
				* result
				+ (getAccountsubject() == null ? 0 : this.getAccountsubject()
						.hashCode());
		return result;
	}

}