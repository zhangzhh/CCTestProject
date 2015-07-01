package com.entity;

/**
 * TSysUser entity. @author MyEclipse Persistence Tools
 */

public class TSysUser implements java.io.Serializable {

	// Fields

	private Long userid;
	private String loginname;
	private String loginpwd;
	private String status;
	private String offlineenable;
	private String personnelcode;
	private String personnelname;
	private String email;
	private String phone;
	private Long rank;
	private String openingbank;
	private String accountname;
	private String accountvalue;
	private Long supervisor;
	private String mobilestatus;
	private String attr01;
	private String attr02;
	private String attr03;
	private String attr04;
	private String attr05;
	private String postnameCode;
	private String hrrank;
	private String isad;
	private String hrpostcodes;
	private String hrrankcodes;
	private String readcontract;
	private String writecontract;
	private Long directleader;

	// Constructors

	/** default constructor */
	public TSysUser() {
	}

	/** minimal constructor */
	public TSysUser(Long userid) {
		this.userid = userid;
	}

	/** full constructor */
	public TSysUser(Long userid, String loginname, String loginpwd,
			String status, String offlineenable, String personnelcode,
			String personnelname, String email, String phone, Long rank,
			String openingbank, String accountname, String accountvalue,
			Long supervisor, String mobilestatus, String attr01, String attr02,
			String attr03, String attr04, String attr05, String postnameCode,
			String hrrank, String isad, String hrpostcodes, String hrrankcodes,
			String readcontract, String writecontract, Long directleader) {
		this.userid = userid;
		this.loginname = loginname;
		this.loginpwd = loginpwd;
		this.status = status;
		this.offlineenable = offlineenable;
		this.personnelcode = personnelcode;
		this.personnelname = personnelname;
		this.email = email;
		this.phone = phone;
		this.rank = rank;
		this.openingbank = openingbank;
		this.accountname = accountname;
		this.accountvalue = accountvalue;
		this.supervisor = supervisor;
		this.mobilestatus = mobilestatus;
		this.attr01 = attr01;
		this.attr02 = attr02;
		this.attr03 = attr03;
		this.attr04 = attr04;
		this.attr05 = attr05;
		this.postnameCode = postnameCode;
		this.hrrank = hrrank;
		this.isad = isad;
		this.hrpostcodes = hrpostcodes;
		this.hrrankcodes = hrrankcodes;
		this.readcontract = readcontract;
		this.writecontract = writecontract;
		this.directleader = directleader;
	}

	// Property accessors

	public Long getUserid() {
		return this.userid;
	}

	public void setUserid(Long userid) {
		this.userid = userid;
	}

	public String getLoginname() {
		return this.loginname;
	}

	public void setLoginname(String loginname) {
		this.loginname = loginname;
	}

	public String getLoginpwd() {
		return this.loginpwd;
	}

	public void setLoginpwd(String loginpwd) {
		this.loginpwd = loginpwd;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getOfflineenable() {
		return this.offlineenable;
	}

	public void setOfflineenable(String offlineenable) {
		this.offlineenable = offlineenable;
	}

	public String getPersonnelcode() {
		return this.personnelcode;
	}

	public void setPersonnelcode(String personnelcode) {
		this.personnelcode = personnelcode;
	}

	public String getPersonnelname() {
		return this.personnelname;
	}

	public void setPersonnelname(String personnelname) {
		this.personnelname = personnelname;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Long getRank() {
		return this.rank;
	}

	public void setRank(Long rank) {
		this.rank = rank;
	}

	public String getOpeningbank() {
		return this.openingbank;
	}

	public void setOpeningbank(String openingbank) {
		this.openingbank = openingbank;
	}

	public String getAccountname() {
		return this.accountname;
	}

	public void setAccountname(String accountname) {
		this.accountname = accountname;
	}

	public String getAccountvalue() {
		return this.accountvalue;
	}

	public void setAccountvalue(String accountvalue) {
		this.accountvalue = accountvalue;
	}

	public Long getSupervisor() {
		return this.supervisor;
	}

	public void setSupervisor(Long supervisor) {
		this.supervisor = supervisor;
	}

	public String getMobilestatus() {
		return this.mobilestatus;
	}

	public void setMobilestatus(String mobilestatus) {
		this.mobilestatus = mobilestatus;
	}

	public String getAttr01() {
		return this.attr01;
	}

	public void setAttr01(String attr01) {
		this.attr01 = attr01;
	}

	public String getAttr02() {
		return this.attr02;
	}

	public void setAttr02(String attr02) {
		this.attr02 = attr02;
	}

	public String getAttr03() {
		return this.attr03;
	}

	public void setAttr03(String attr03) {
		this.attr03 = attr03;
	}

	public String getAttr04() {
		return this.attr04;
	}

	public void setAttr04(String attr04) {
		this.attr04 = attr04;
	}

	public String getAttr05() {
		return this.attr05;
	}

	public void setAttr05(String attr05) {
		this.attr05 = attr05;
	}

	public String getPostnameCode() {
		return this.postnameCode;
	}

	public void setPostnameCode(String postnameCode) {
		this.postnameCode = postnameCode;
	}

	public String getHrrank() {
		return this.hrrank;
	}

	public void setHrrank(String hrrank) {
		this.hrrank = hrrank;
	}

	public String getIsad() {
		return this.isad;
	}

	public void setIsad(String isad) {
		this.isad = isad;
	}

	public String getHrpostcodes() {
		return this.hrpostcodes;
	}

	public void setHrpostcodes(String hrpostcodes) {
		this.hrpostcodes = hrpostcodes;
	}

	public String getHrrankcodes() {
		return this.hrrankcodes;
	}

	public void setHrrankcodes(String hrrankcodes) {
		this.hrrankcodes = hrrankcodes;
	}

	public String getReadcontract() {
		return this.readcontract;
	}

	public void setReadcontract(String readcontract) {
		this.readcontract = readcontract;
	}

	public String getWritecontract() {
		return this.writecontract;
	}

	public void setWritecontract(String writecontract) {
		this.writecontract = writecontract;
	}

	public Long getDirectleader() {
		return this.directleader;
	}

	public void setDirectleader(Long directleader) {
		this.directleader = directleader;
	}

}