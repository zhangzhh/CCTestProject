package com.entity;

/**
 * TSysDefinedControl entity. @author MyEclipse Persistence Tools
 */

public class TSysDefinedControl implements java.io.Serializable {

	// Fields

	private Long userid;
	private Long controlname;
	private Long controlprodeploy;
	private Long controlemail;
	private Long controlemailrate;
	private String controlagency;
	private String controlagencypeopleid;
	private String controlagencypeopledeptid;
	private String controlagencypeople;
	private String controlhomepageid;
	private String controlhomepagename;
	private String approvalcomments;

	// Constructors

	/** default constructor */
	public TSysDefinedControl() {
	}

	/** minimal constructor */
	public TSysDefinedControl(Long userid) {
		this.userid = userid;
	}

	/** full constructor */
	public TSysDefinedControl(Long userid, Long controlname,
			Long controlprodeploy, Long controlemail, Long controlemailrate,
			String controlagency, String controlagencypeopleid,
			String controlagencypeopledeptid, String controlagencypeople,
			String controlhomepageid, String controlhomepagename,
			String approvalcomments) {
		this.userid = userid;
		this.controlname = controlname;
		this.controlprodeploy = controlprodeploy;
		this.controlemail = controlemail;
		this.controlemailrate = controlemailrate;
		this.controlagency = controlagency;
		this.controlagencypeopleid = controlagencypeopleid;
		this.controlagencypeopledeptid = controlagencypeopledeptid;
		this.controlagencypeople = controlagencypeople;
		this.controlhomepageid = controlhomepageid;
		this.controlhomepagename = controlhomepagename;
		this.approvalcomments = approvalcomments;
	}

	// Property accessors

	public Long getUserid() {
		return this.userid;
	}

	public void setUserid(Long userid) {
		this.userid = userid;
	}

	public Long getControlname() {
		return this.controlname;
	}

	public void setControlname(Long controlname) {
		this.controlname = controlname;
	}

	public Long getControlprodeploy() {
		return this.controlprodeploy;
	}

	public void setControlprodeploy(Long controlprodeploy) {
		this.controlprodeploy = controlprodeploy;
	}

	public Long getControlemail() {
		return this.controlemail;
	}

	public void setControlemail(Long controlemail) {
		this.controlemail = controlemail;
	}

	public Long getControlemailrate() {
		return this.controlemailrate;
	}

	public void setControlemailrate(Long controlemailrate) {
		this.controlemailrate = controlemailrate;
	}

	public String getControlagency() {
		return this.controlagency;
	}

	public void setControlagency(String controlagency) {
		this.controlagency = controlagency;
	}

	public String getControlagencypeopleid() {
		return this.controlagencypeopleid;
	}

	public void setControlagencypeopleid(String controlagencypeopleid) {
		this.controlagencypeopleid = controlagencypeopleid;
	}

	public String getControlagencypeopledeptid() {
		return this.controlagencypeopledeptid;
	}

	public void setControlagencypeopledeptid(String controlagencypeopledeptid) {
		this.controlagencypeopledeptid = controlagencypeopledeptid;
	}

	public String getControlagencypeople() {
		return this.controlagencypeople;
	}

	public void setControlagencypeople(String controlagencypeople) {
		this.controlagencypeople = controlagencypeople;
	}

	public String getControlhomepageid() {
		return this.controlhomepageid;
	}

	public void setControlhomepageid(String controlhomepageid) {
		this.controlhomepageid = controlhomepageid;
	}

	public String getControlhomepagename() {
		return this.controlhomepagename;
	}

	public void setControlhomepagename(String controlhomepagename) {
		this.controlhomepagename = controlhomepagename;
	}

	public String getApprovalcomments() {
		return this.approvalcomments;
	}

	public void setApprovalcomments(String approvalcomments) {
		this.approvalcomments = approvalcomments;
	}

}