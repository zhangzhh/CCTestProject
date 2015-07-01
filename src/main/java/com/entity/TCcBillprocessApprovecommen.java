package com.entity;

import java.sql.Timestamp;

/**
 * TCcBillprocessApprovecommen entity. @author MyEclipse Persistence Tools
 */

public class TCcBillprocessApprovecommen implements java.io.Serializable {

	// Fields

	private Long approvecommentid;
	private Long billmaindataid;
	private Long taskid;
	private String processname;
	private String processactivityname;
	private Long approverid;
	private Timestamp approvedatetime;
	private String appcomment;
	private String passornot;
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

	// Constructors

	/** default constructor */
	public TCcBillprocessApprovecommen() {
	}

	/** minimal constructor */
	public TCcBillprocessApprovecommen(Long approvecommentid) {
		this.approvecommentid = approvecommentid;
	}

	/** full constructor */
	public TCcBillprocessApprovecommen(Long approvecommentid,
			Long billmaindataid, Long taskid, String processname,
			String processactivityname, Long approverid,
			Timestamp approvedatetime, String appcomment, String passornot,
			String item01, String item02, String item03, String item04,
			String item05, String item06, String item07, String item08,
			String item09, String item10, String item11, String item12,
			String item13, String item14, String item15, String item16,
			String item17, String item18, String item19, String item20) {
		this.approvecommentid = approvecommentid;
		this.billmaindataid = billmaindataid;
		this.taskid = taskid;
		this.processname = processname;
		this.processactivityname = processactivityname;
		this.approverid = approverid;
		this.approvedatetime = approvedatetime;
		this.appcomment = appcomment;
		this.passornot = passornot;
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
	}

	// Property accessors

	public Long getApprovecommentid() {
		return this.approvecommentid;
	}

	public void setApprovecommentid(Long approvecommentid) {
		this.approvecommentid = approvecommentid;
	}

	public Long getBillmaindataid() {
		return this.billmaindataid;
	}

	public void setBillmaindataid(Long billmaindataid) {
		this.billmaindataid = billmaindataid;
	}

	public Long getTaskid() {
		return this.taskid;
	}

	public void setTaskid(Long taskid) {
		this.taskid = taskid;
	}

	public String getProcessname() {
		return this.processname;
	}

	public void setProcessname(String processname) {
		this.processname = processname;
	}

	public String getProcessactivityname() {
		return this.processactivityname;
	}

	public void setProcessactivityname(String processactivityname) {
		this.processactivityname = processactivityname;
	}

	public Long getApproverid() {
		return this.approverid;
	}

	public void setApproverid(Long approverid) {
		this.approverid = approverid;
	}

	public Timestamp getApprovedatetime() {
		return this.approvedatetime;
	}

	public void setApprovedatetime(Timestamp approvedatetime) {
		this.approvedatetime = approvedatetime;
	}

	public String getAppcomment() {
		return this.appcomment;
	}

	public void setAppcomment(String appcomment) {
		this.appcomment = appcomment;
	}

	public String getPassornot() {
		return this.passornot;
	}

	public void setPassornot(String passornot) {
		this.passornot = passornot;
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

}