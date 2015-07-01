package com.entity;

/**
 * TSysLog entity. @author MyEclipse Persistence Tools
 */

public class TSysLog implements java.io.Serializable {

	// Fields

	private Long logid;
	private String operateuser;
	private String logtype;
	private String ip;
	private String operatetime;
	private String description;
	private String oldvalue;
	private String newvalue;
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

	// Constructors

	/** default constructor */
	public TSysLog() {
	}

	/** minimal constructor */
	public TSysLog(Long logid) {
		this.logid = logid;
	}

	/** full constructor */
	public TSysLog(Long logid, String operateuser, String logtype, String ip,
			String operatetime, String description, String oldvalue,
			String newvalue, String item01, String item02, String item03,
			String item04, String item05, String item06, String item07,
			String item08, String item09, String item10) {
		this.logid = logid;
		this.operateuser = operateuser;
		this.logtype = logtype;
		this.ip = ip;
		this.operatetime = operatetime;
		this.description = description;
		this.oldvalue = oldvalue;
		this.newvalue = newvalue;
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
	}

	// Property accessors

	public Long getLogid() {
		return this.logid;
	}

	public void setLogid(Long logid) {
		this.logid = logid;
	}

	public String getOperateuser() {
		return this.operateuser;
	}

	public void setOperateuser(String operateuser) {
		this.operateuser = operateuser;
	}

	public String getLogtype() {
		return this.logtype;
	}

	public void setLogtype(String logtype) {
		this.logtype = logtype;
	}

	public String getIp() {
		return this.ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getOperatetime() {
		return this.operatetime;
	}

	public void setOperatetime(String operatetime) {
		this.operatetime = operatetime;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getOldvalue() {
		return this.oldvalue;
	}

	public void setOldvalue(String oldvalue) {
		this.oldvalue = oldvalue;
	}

	public String getNewvalue() {
		return this.newvalue;
	}

	public void setNewvalue(String newvalue) {
		this.newvalue = newvalue;
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

}