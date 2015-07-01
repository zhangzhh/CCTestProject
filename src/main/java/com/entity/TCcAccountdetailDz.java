package com.entity;

import java.sql.Timestamp;

/**
 * TCcAccountdetailDz entity. @author MyEclipse Persistence Tools
 */

public class TCcAccountdetailDz implements java.io.Serializable {

	// Fields

	private Long id;
	private Long billmaindataid;
	private Long billdetaildataid;
	private String billno;
	private String billtype;
	private String memo;
	private Long formid;
	private Long structureid;
	private Long requisitionuser;
	private Long leadtobillid;
	private Long leadtobilldetailid;
	private String leadtobillno;
	private String leadtobilltype;
	private String dimcurrency;
	private Double naturalcurrency;
	private Double occurcurrentcy;
	private String occurtype;
	private Double balancecurrentcy;
	private Long optiontypeid;
	private String optiontypename;
	private Timestamp happeneddate;
	private Timestamp createdate;

	// Constructors

	/** default constructor */
	public TCcAccountdetailDz() {
	}

	/** minimal constructor */
	public TCcAccountdetailDz(Long id) {
		this.id = id;
	}

	/** full constructor */
	public TCcAccountdetailDz(Long id, Long billmaindataid,
			Long billdetaildataid, String billno, String billtype, String memo,
			Long formid, Long structureid, Long requisitionuser,
			Long leadtobillid, Long leadtobilldetailid, String leadtobillno,
			String leadtobilltype, String dimcurrency, Double naturalcurrency,
			Double occurcurrentcy, String occurtype, Double balancecurrentcy,
			Long optiontypeid, String optiontypename, Timestamp happeneddate,
			Timestamp createdate) {
		this.id = id;
		this.billmaindataid = billmaindataid;
		this.billdetaildataid = billdetaildataid;
		this.billno = billno;
		this.billtype = billtype;
		this.memo = memo;
		this.formid = formid;
		this.structureid = structureid;
		this.requisitionuser = requisitionuser;
		this.leadtobillid = leadtobillid;
		this.leadtobilldetailid = leadtobilldetailid;
		this.leadtobillno = leadtobillno;
		this.leadtobilltype = leadtobilltype;
		this.dimcurrency = dimcurrency;
		this.naturalcurrency = naturalcurrency;
		this.occurcurrentcy = occurcurrentcy;
		this.occurtype = occurtype;
		this.balancecurrentcy = balancecurrentcy;
		this.optiontypeid = optiontypeid;
		this.optiontypename = optiontypename;
		this.happeneddate = happeneddate;
		this.createdate = createdate;
	}

	// Property accessors

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getBillmaindataid() {
		return this.billmaindataid;
	}

	public void setBillmaindataid(Long billmaindataid) {
		this.billmaindataid = billmaindataid;
	}

	public Long getBilldetaildataid() {
		return this.billdetaildataid;
	}

	public void setBilldetaildataid(Long billdetaildataid) {
		this.billdetaildataid = billdetaildataid;
	}

	public String getBillno() {
		return this.billno;
	}

	public void setBillno(String billno) {
		this.billno = billno;
	}

	public String getBilltype() {
		return this.billtype;
	}

	public void setBilltype(String billtype) {
		this.billtype = billtype;
	}

	public String getMemo() {
		return this.memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public Long getFormid() {
		return this.formid;
	}

	public void setFormid(Long formid) {
		this.formid = formid;
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

	public Long getLeadtobillid() {
		return this.leadtobillid;
	}

	public void setLeadtobillid(Long leadtobillid) {
		this.leadtobillid = leadtobillid;
	}

	public Long getLeadtobilldetailid() {
		return this.leadtobilldetailid;
	}

	public void setLeadtobilldetailid(Long leadtobilldetailid) {
		this.leadtobilldetailid = leadtobilldetailid;
	}

	public String getLeadtobillno() {
		return this.leadtobillno;
	}

	public void setLeadtobillno(String leadtobillno) {
		this.leadtobillno = leadtobillno;
	}

	public String getLeadtobilltype() {
		return this.leadtobilltype;
	}

	public void setLeadtobilltype(String leadtobilltype) {
		this.leadtobilltype = leadtobilltype;
	}

	public String getDimcurrency() {
		return this.dimcurrency;
	}

	public void setDimcurrency(String dimcurrency) {
		this.dimcurrency = dimcurrency;
	}

	public Double getNaturalcurrency() {
		return this.naturalcurrency;
	}

	public void setNaturalcurrency(Double naturalcurrency) {
		this.naturalcurrency = naturalcurrency;
	}

	public Double getOccurcurrentcy() {
		return this.occurcurrentcy;
	}

	public void setOccurcurrentcy(Double occurcurrentcy) {
		this.occurcurrentcy = occurcurrentcy;
	}

	public String getOccurtype() {
		return this.occurtype;
	}

	public void setOccurtype(String occurtype) {
		this.occurtype = occurtype;
	}

	public Double getBalancecurrentcy() {
		return this.balancecurrentcy;
	}

	public void setBalancecurrentcy(Double balancecurrentcy) {
		this.balancecurrentcy = balancecurrentcy;
	}

	public Long getOptiontypeid() {
		return this.optiontypeid;
	}

	public void setOptiontypeid(Long optiontypeid) {
		this.optiontypeid = optiontypeid;
	}

	public String getOptiontypename() {
		return this.optiontypename;
	}

	public void setOptiontypename(String optiontypename) {
		this.optiontypename = optiontypename;
	}

	public Timestamp getHappeneddate() {
		return this.happeneddate;
	}

	public void setHappeneddate(Timestamp happeneddate) {
		this.happeneddate = happeneddate;
	}

	public Timestamp getCreatedate() {
		return this.createdate;
	}

	public void setCreatedate(Timestamp createdate) {
		this.createdate = createdate;
	}

}