package com.entity;

import java.sql.Timestamp;

/**
 * TCcBillgeneralBh entity. @author MyEclipse Persistence Tools
 */

public class TCcBillgeneralBh implements java.io.Serializable {

	// Fields

	private String id;
	private String batchId;
	private String state;
	private Timestamp happendate;
	private Long num;
	private String requisitionuser;
	private String remark1;
	private String remark2;
	private String remark3;
	private String remark4;
	private String remark5;

	// Constructors

	/** default constructor */
	public TCcBillgeneralBh() {
	}

	/** minimal constructor */
	public TCcBillgeneralBh(String id) {
		this.id = id;
	}

	/** full constructor */
	public TCcBillgeneralBh(String id, String batchId, String state,
			Timestamp happendate, Long num, String requisitionuser,
			String remark1, String remark2, String remark3, String remark4,
			String remark5) {
		this.id = id;
		this.batchId = batchId;
		this.state = state;
		this.happendate = happendate;
		this.num = num;
		this.requisitionuser = requisitionuser;
		this.remark1 = remark1;
		this.remark2 = remark2;
		this.remark3 = remark3;
		this.remark4 = remark4;
		this.remark5 = remark5;
	}

	// Property accessors

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getBatchId() {
		return this.batchId;
	}

	public void setBatchId(String batchId) {
		this.batchId = batchId;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Timestamp getHappendate() {
		return this.happendate;
	}

	public void setHappendate(Timestamp happendate) {
		this.happendate = happendate;
	}

	public Long getNum() {
		return this.num;
	}

	public void setNum(Long num) {
		this.num = num;
	}

	public String getRequisitionuser() {
		return this.requisitionuser;
	}

	public void setRequisitionuser(String requisitionuser) {
		this.requisitionuser = requisitionuser;
	}

	public String getRemark1() {
		return this.remark1;
	}

	public void setRemark1(String remark1) {
		this.remark1 = remark1;
	}

	public String getRemark2() {
		return this.remark2;
	}

	public void setRemark2(String remark2) {
		this.remark2 = remark2;
	}

	public String getRemark3() {
		return this.remark3;
	}

	public void setRemark3(String remark3) {
		this.remark3 = remark3;
	}

	public String getRemark4() {
		return this.remark4;
	}

	public void setRemark4(String remark4) {
		this.remark4 = remark4;
	}

	public String getRemark5() {
		return this.remark5;
	}

	public void setRemark5(String remark5) {
		this.remark5 = remark5;
	}

}