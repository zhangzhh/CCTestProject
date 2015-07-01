package com.entity;

import java.math.BigDecimal;

/**
 * TCcBankaccount entity. @author MyEclipse Persistence Tools
 */

public class TCcBankaccount implements java.io.Serializable {

	// Fields

	private Long bankaccountid;
	private TCcBank TCcBank;
	private String openingbank;
	private String openingbranch;
	private String accountname;
	private String accountvalue;
	private String isdefault;
	private BigDecimal usein;
	private Long objectid;
	private String bankno;
	private String memo1;
	private String memo2;
	private String memo3;
	private String memo4;
	private String memo5;
	private Long settlement;

	// Constructors

	/** default constructor */
	public TCcBankaccount() {
	}

	/** minimal constructor */
	public TCcBankaccount(Long bankaccountid) {
		this.bankaccountid = bankaccountid;
	}

	/** full constructor */
	public TCcBankaccount(Long bankaccountid, TCcBank TCcBank,
			String openingbank, String openingbranch, String accountname,
			String accountvalue, String isdefault, BigDecimal usein,
			Long objectid, String bankno, String memo1, String memo2,
			String memo3, String memo4, String memo5, Long settlement) {
		this.bankaccountid = bankaccountid;
		this.TCcBank = TCcBank;
		this.openingbank = openingbank;
		this.openingbranch = openingbranch;
		this.accountname = accountname;
		this.accountvalue = accountvalue;
		this.isdefault = isdefault;
		this.usein = usein;
		this.objectid = objectid;
		this.bankno = bankno;
		this.memo1 = memo1;
		this.memo2 = memo2;
		this.memo3 = memo3;
		this.memo4 = memo4;
		this.memo5 = memo5;
		this.settlement = settlement;
	}

	// Property accessors

	public Long getBankaccountid() {
		return this.bankaccountid;
	}

	public void setBankaccountid(Long bankaccountid) {
		this.bankaccountid = bankaccountid;
	}

	public TCcBank getTCcBank() {
		return this.TCcBank;
	}

	public void setTCcBank(TCcBank TCcBank) {
		this.TCcBank = TCcBank;
	}

	public String getOpeningbank() {
		return this.openingbank;
	}

	public void setOpeningbank(String openingbank) {
		this.openingbank = openingbank;
	}

	public String getOpeningbranch() {
		return this.openingbranch;
	}

	public void setOpeningbranch(String openingbranch) {
		this.openingbranch = openingbranch;
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

	public String getIsdefault() {
		return this.isdefault;
	}

	public void setIsdefault(String isdefault) {
		this.isdefault = isdefault;
	}

	public BigDecimal getUsein() {
		return this.usein;
	}

	public void setUsein(BigDecimal usein) {
		this.usein = usein;
	}

	public Long getObjectid() {
		return this.objectid;
	}

	public void setObjectid(Long objectid) {
		this.objectid = objectid;
	}

	public String getBankno() {
		return this.bankno;
	}

	public void setBankno(String bankno) {
		this.bankno = bankno;
	}

	public String getMemo1() {
		return this.memo1;
	}

	public void setMemo1(String memo1) {
		this.memo1 = memo1;
	}

	public String getMemo2() {
		return this.memo2;
	}

	public void setMemo2(String memo2) {
		this.memo2 = memo2;
	}

	public String getMemo3() {
		return this.memo3;
	}

	public void setMemo3(String memo3) {
		this.memo3 = memo3;
	}

	public String getMemo4() {
		return this.memo4;
	}

	public void setMemo4(String memo4) {
		this.memo4 = memo4;
	}

	public String getMemo5() {
		return this.memo5;
	}

	public void setMemo5(String memo5) {
		this.memo5 = memo5;
	}

	public Long getSettlement() {
		return this.settlement;
	}

	public void setSettlement(Long settlement) {
		this.settlement = settlement;
	}

}