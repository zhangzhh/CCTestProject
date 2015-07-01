package com.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * TCcBank entity. @author MyEclipse Persistence Tools
 */

public class TCcBank implements java.io.Serializable {

	// Fields

	private Long bankid;
	private String bankname;
	private Set TCcBankaccounts = new HashSet(0);

	// Constructors

	/** default constructor */
	public TCcBank() {
	}

	/** minimal constructor */
	public TCcBank(Long bankid) {
		this.bankid = bankid;
	}

	/** full constructor */
	public TCcBank(Long bankid, String bankname, Set TCcBankaccounts) {
		this.bankid = bankid;
		this.bankname = bankname;
		this.TCcBankaccounts = TCcBankaccounts;
	}

	// Property accessors

	public Long getBankid() {
		return this.bankid;
	}

	public void setBankid(Long bankid) {
		this.bankid = bankid;
	}

	public String getBankname() {
		return this.bankname;
	}

	public void setBankname(String bankname) {
		this.bankname = bankname;
	}

	public Set getTCcBankaccounts() {
		return this.TCcBankaccounts;
	}

	public void setTCcBankaccounts(Set TCcBankaccounts) {
		this.TCcBankaccounts = TCcBankaccounts;
	}

}