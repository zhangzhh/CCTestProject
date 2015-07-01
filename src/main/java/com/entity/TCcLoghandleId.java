package com.entity;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * TCcLoghandleId entity. @author MyEclipse Persistence Tools
 */

public class TCcLoghandleId implements java.io.Serializable {

	// Fields

	private BigDecimal logid;
	private BigDecimal handletype;
	private BigDecimal handlemodel;
	private String handlenotice;
	private Timestamp createdate;
	private BigDecimal handleuser;
	private String handleuserip;
	private String formname;
	private String formno;
	private String item1;
	private String item2;
	private String item3;
	private String item4;
	private String item5;
	private String item6;
	private String item7;
	private String item8;
	private String item9;
	private String item10;

	// Constructors

	/** default constructor */
	public TCcLoghandleId() {
	}

	/** minimal constructor */
	public TCcLoghandleId(BigDecimal logid) {
		this.logid = logid;
	}

	/** full constructor */
	public TCcLoghandleId(BigDecimal logid, BigDecimal handletype,
			BigDecimal handlemodel, String handlenotice, Timestamp createdate,
			BigDecimal handleuser, String handleuserip, String formname,
			String formno, String item1, String item2, String item3,
			String item4, String item5, String item6, String item7,
			String item8, String item9, String item10) {
		this.logid = logid;
		this.handletype = handletype;
		this.handlemodel = handlemodel;
		this.handlenotice = handlenotice;
		this.createdate = createdate;
		this.handleuser = handleuser;
		this.handleuserip = handleuserip;
		this.formname = formname;
		this.formno = formno;
		this.item1 = item1;
		this.item2 = item2;
		this.item3 = item3;
		this.item4 = item4;
		this.item5 = item5;
		this.item6 = item6;
		this.item7 = item7;
		this.item8 = item8;
		this.item9 = item9;
		this.item10 = item10;
	}

	// Property accessors

	public BigDecimal getLogid() {
		return this.logid;
	}

	public void setLogid(BigDecimal logid) {
		this.logid = logid;
	}

	public BigDecimal getHandletype() {
		return this.handletype;
	}

	public void setHandletype(BigDecimal handletype) {
		this.handletype = handletype;
	}

	public BigDecimal getHandlemodel() {
		return this.handlemodel;
	}

	public void setHandlemodel(BigDecimal handlemodel) {
		this.handlemodel = handlemodel;
	}

	public String getHandlenotice() {
		return this.handlenotice;
	}

	public void setHandlenotice(String handlenotice) {
		this.handlenotice = handlenotice;
	}

	public Timestamp getCreatedate() {
		return this.createdate;
	}

	public void setCreatedate(Timestamp createdate) {
		this.createdate = createdate;
	}

	public BigDecimal getHandleuser() {
		return this.handleuser;
	}

	public void setHandleuser(BigDecimal handleuser) {
		this.handleuser = handleuser;
	}

	public String getHandleuserip() {
		return this.handleuserip;
	}

	public void setHandleuserip(String handleuserip) {
		this.handleuserip = handleuserip;
	}

	public String getFormname() {
		return this.formname;
	}

	public void setFormname(String formname) {
		this.formname = formname;
	}

	public String getFormno() {
		return this.formno;
	}

	public void setFormno(String formno) {
		this.formno = formno;
	}

	public String getItem1() {
		return this.item1;
	}

	public void setItem1(String item1) {
		this.item1 = item1;
	}

	public String getItem2() {
		return this.item2;
	}

	public void setItem2(String item2) {
		this.item2 = item2;
	}

	public String getItem3() {
		return this.item3;
	}

	public void setItem3(String item3) {
		this.item3 = item3;
	}

	public String getItem4() {
		return this.item4;
	}

	public void setItem4(String item4) {
		this.item4 = item4;
	}

	public String getItem5() {
		return this.item5;
	}

	public void setItem5(String item5) {
		this.item5 = item5;
	}

	public String getItem6() {
		return this.item6;
	}

	public void setItem6(String item6) {
		this.item6 = item6;
	}

	public String getItem7() {
		return this.item7;
	}

	public void setItem7(String item7) {
		this.item7 = item7;
	}

	public String getItem8() {
		return this.item8;
	}

	public void setItem8(String item8) {
		this.item8 = item8;
	}

	public String getItem9() {
		return this.item9;
	}

	public void setItem9(String item9) {
		this.item9 = item9;
	}

	public String getItem10() {
		return this.item10;
	}

	public void setItem10(String item10) {
		this.item10 = item10;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TCcLoghandleId))
			return false;
		TCcLoghandleId castOther = (TCcLoghandleId) other;

		return ((this.getLogid() == castOther.getLogid()) || (this.getLogid() != null
				&& castOther.getLogid() != null && this.getLogid().equals(
				castOther.getLogid())))
				&& ((this.getHandletype() == castOther.getHandletype()) || (this
						.getHandletype() != null
						&& castOther.getHandletype() != null && this
						.getHandletype().equals(castOther.getHandletype())))
				&& ((this.getHandlemodel() == castOther.getHandlemodel()) || (this
						.getHandlemodel() != null
						&& castOther.getHandlemodel() != null && this
						.getHandlemodel().equals(castOther.getHandlemodel())))
				&& ((this.getHandlenotice() == castOther.getHandlenotice()) || (this
						.getHandlenotice() != null
						&& castOther.getHandlenotice() != null && this
						.getHandlenotice().equals(castOther.getHandlenotice())))
				&& ((this.getCreatedate() == castOther.getCreatedate()) || (this
						.getCreatedate() != null
						&& castOther.getCreatedate() != null && this
						.getCreatedate().equals(castOther.getCreatedate())))
				&& ((this.getHandleuser() == castOther.getHandleuser()) || (this
						.getHandleuser() != null
						&& castOther.getHandleuser() != null && this
						.getHandleuser().equals(castOther.getHandleuser())))
				&& ((this.getHandleuserip() == castOther.getHandleuserip()) || (this
						.getHandleuserip() != null
						&& castOther.getHandleuserip() != null && this
						.getHandleuserip().equals(castOther.getHandleuserip())))
				&& ((this.getFormname() == castOther.getFormname()) || (this
						.getFormname() != null
						&& castOther.getFormname() != null && this
						.getFormname().equals(castOther.getFormname())))
				&& ((this.getFormno() == castOther.getFormno()) || (this
						.getFormno() != null && castOther.getFormno() != null && this
						.getFormno().equals(castOther.getFormno())))
				&& ((this.getItem1() == castOther.getItem1()) || (this
						.getItem1() != null && castOther.getItem1() != null && this
						.getItem1().equals(castOther.getItem1())))
				&& ((this.getItem2() == castOther.getItem2()) || (this
						.getItem2() != null && castOther.getItem2() != null && this
						.getItem2().equals(castOther.getItem2())))
				&& ((this.getItem3() == castOther.getItem3()) || (this
						.getItem3() != null && castOther.getItem3() != null && this
						.getItem3().equals(castOther.getItem3())))
				&& ((this.getItem4() == castOther.getItem4()) || (this
						.getItem4() != null && castOther.getItem4() != null && this
						.getItem4().equals(castOther.getItem4())))
				&& ((this.getItem5() == castOther.getItem5()) || (this
						.getItem5() != null && castOther.getItem5() != null && this
						.getItem5().equals(castOther.getItem5())))
				&& ((this.getItem6() == castOther.getItem6()) || (this
						.getItem6() != null && castOther.getItem6() != null && this
						.getItem6().equals(castOther.getItem6())))
				&& ((this.getItem7() == castOther.getItem7()) || (this
						.getItem7() != null && castOther.getItem7() != null && this
						.getItem7().equals(castOther.getItem7())))
				&& ((this.getItem8() == castOther.getItem8()) || (this
						.getItem8() != null && castOther.getItem8() != null && this
						.getItem8().equals(castOther.getItem8())))
				&& ((this.getItem9() == castOther.getItem9()) || (this
						.getItem9() != null && castOther.getItem9() != null && this
						.getItem9().equals(castOther.getItem9())))
				&& ((this.getItem10() == castOther.getItem10()) || (this
						.getItem10() != null && castOther.getItem10() != null && this
						.getItem10().equals(castOther.getItem10())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getLogid() == null ? 0 : this.getLogid().hashCode());
		result = 37
				* result
				+ (getHandletype() == null ? 0 : this.getHandletype()
						.hashCode());
		result = 37
				* result
				+ (getHandlemodel() == null ? 0 : this.getHandlemodel()
						.hashCode());
		result = 37
				* result
				+ (getHandlenotice() == null ? 0 : this.getHandlenotice()
						.hashCode());
		result = 37
				* result
				+ (getCreatedate() == null ? 0 : this.getCreatedate()
						.hashCode());
		result = 37
				* result
				+ (getHandleuser() == null ? 0 : this.getHandleuser()
						.hashCode());
		result = 37
				* result
				+ (getHandleuserip() == null ? 0 : this.getHandleuserip()
						.hashCode());
		result = 37 * result
				+ (getFormname() == null ? 0 : this.getFormname().hashCode());
		result = 37 * result
				+ (getFormno() == null ? 0 : this.getFormno().hashCode());
		result = 37 * result
				+ (getItem1() == null ? 0 : this.getItem1().hashCode());
		result = 37 * result
				+ (getItem2() == null ? 0 : this.getItem2().hashCode());
		result = 37 * result
				+ (getItem3() == null ? 0 : this.getItem3().hashCode());
		result = 37 * result
				+ (getItem4() == null ? 0 : this.getItem4().hashCode());
		result = 37 * result
				+ (getItem5() == null ? 0 : this.getItem5().hashCode());
		result = 37 * result
				+ (getItem6() == null ? 0 : this.getItem6().hashCode());
		result = 37 * result
				+ (getItem7() == null ? 0 : this.getItem7().hashCode());
		result = 37 * result
				+ (getItem8() == null ? 0 : this.getItem8().hashCode());
		result = 37 * result
				+ (getItem9() == null ? 0 : this.getItem9().hashCode());
		result = 37 * result
				+ (getItem10() == null ? 0 : this.getItem10().hashCode());
		return result;
	}

}