package com.entity;

/**
 * TCcDimCostcenterId entity. @author MyEclipse Persistence Tools
 */

public class TCcDimCostcenterId implements java.io.Serializable {

	// Fields

	private String ccid;
	private String kokrs;
	private String kostl;
	private String datab;
	private String datbi;
	private String ktext;
	private String ltext;
	private String verak;
	private String kosar;
	private String khinr;
	private String bukrs;
	private String delFlag;
	private String prctr;

	// Constructors

	/** default constructor */
	public TCcDimCostcenterId() {
	}

	/** minimal constructor */
	public TCcDimCostcenterId(String ccid) {
		this.ccid = ccid;
	}

	/** full constructor */
	public TCcDimCostcenterId(String ccid, String kokrs, String kostl,
			String datab, String datbi, String ktext, String ltext,
			String verak, String kosar, String khinr, String bukrs,
			String delFlag, String prctr) {
		this.ccid = ccid;
		this.kokrs = kokrs;
		this.kostl = kostl;
		this.datab = datab;
		this.datbi = datbi;
		this.ktext = ktext;
		this.ltext = ltext;
		this.verak = verak;
		this.kosar = kosar;
		this.khinr = khinr;
		this.bukrs = bukrs;
		this.delFlag = delFlag;
		this.prctr = prctr;
	}

	// Property accessors

	public String getCcid() {
		return this.ccid;
	}

	public void setCcid(String ccid) {
		this.ccid = ccid;
	}

	public String getKokrs() {
		return this.kokrs;
	}

	public void setKokrs(String kokrs) {
		this.kokrs = kokrs;
	}

	public String getKostl() {
		return this.kostl;
	}

	public void setKostl(String kostl) {
		this.kostl = kostl;
	}

	public String getDatab() {
		return this.datab;
	}

	public void setDatab(String datab) {
		this.datab = datab;
	}

	public String getDatbi() {
		return this.datbi;
	}

	public void setDatbi(String datbi) {
		this.datbi = datbi;
	}

	public String getKtext() {
		return this.ktext;
	}

	public void setKtext(String ktext) {
		this.ktext = ktext;
	}

	public String getLtext() {
		return this.ltext;
	}

	public void setLtext(String ltext) {
		this.ltext = ltext;
	}

	public String getVerak() {
		return this.verak;
	}

	public void setVerak(String verak) {
		this.verak = verak;
	}

	public String getKosar() {
		return this.kosar;
	}

	public void setKosar(String kosar) {
		this.kosar = kosar;
	}

	public String getKhinr() {
		return this.khinr;
	}

	public void setKhinr(String khinr) {
		this.khinr = khinr;
	}

	public String getBukrs() {
		return this.bukrs;
	}

	public void setBukrs(String bukrs) {
		this.bukrs = bukrs;
	}

	public String getDelFlag() {
		return this.delFlag;
	}

	public void setDelFlag(String delFlag) {
		this.delFlag = delFlag;
	}

	public String getPrctr() {
		return this.prctr;
	}

	public void setPrctr(String prctr) {
		this.prctr = prctr;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TCcDimCostcenterId))
			return false;
		TCcDimCostcenterId castOther = (TCcDimCostcenterId) other;

		return ((this.getCcid() == castOther.getCcid()) || (this.getCcid() != null
				&& castOther.getCcid() != null && this.getCcid().equals(
				castOther.getCcid())))
				&& ((this.getKokrs() == castOther.getKokrs()) || (this
						.getKokrs() != null && castOther.getKokrs() != null && this
						.getKokrs().equals(castOther.getKokrs())))
				&& ((this.getKostl() == castOther.getKostl()) || (this
						.getKostl() != null && castOther.getKostl() != null && this
						.getKostl().equals(castOther.getKostl())))
				&& ((this.getDatab() == castOther.getDatab()) || (this
						.getDatab() != null && castOther.getDatab() != null && this
						.getDatab().equals(castOther.getDatab())))
				&& ((this.getDatbi() == castOther.getDatbi()) || (this
						.getDatbi() != null && castOther.getDatbi() != null && this
						.getDatbi().equals(castOther.getDatbi())))
				&& ((this.getKtext() == castOther.getKtext()) || (this
						.getKtext() != null && castOther.getKtext() != null && this
						.getKtext().equals(castOther.getKtext())))
				&& ((this.getLtext() == castOther.getLtext()) || (this
						.getLtext() != null && castOther.getLtext() != null && this
						.getLtext().equals(castOther.getLtext())))
				&& ((this.getVerak() == castOther.getVerak()) || (this
						.getVerak() != null && castOther.getVerak() != null && this
						.getVerak().equals(castOther.getVerak())))
				&& ((this.getKosar() == castOther.getKosar()) || (this
						.getKosar() != null && castOther.getKosar() != null && this
						.getKosar().equals(castOther.getKosar())))
				&& ((this.getKhinr() == castOther.getKhinr()) || (this
						.getKhinr() != null && castOther.getKhinr() != null && this
						.getKhinr().equals(castOther.getKhinr())))
				&& ((this.getBukrs() == castOther.getBukrs()) || (this
						.getBukrs() != null && castOther.getBukrs() != null && this
						.getBukrs().equals(castOther.getBukrs())))
				&& ((this.getDelFlag() == castOther.getDelFlag()) || (this
						.getDelFlag() != null && castOther.getDelFlag() != null && this
						.getDelFlag().equals(castOther.getDelFlag())))
				&& ((this.getPrctr() == castOther.getPrctr()) || (this
						.getPrctr() != null && castOther.getPrctr() != null && this
						.getPrctr().equals(castOther.getPrctr())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getCcid() == null ? 0 : this.getCcid().hashCode());
		result = 37 * result
				+ (getKokrs() == null ? 0 : this.getKokrs().hashCode());
		result = 37 * result
				+ (getKostl() == null ? 0 : this.getKostl().hashCode());
		result = 37 * result
				+ (getDatab() == null ? 0 : this.getDatab().hashCode());
		result = 37 * result
				+ (getDatbi() == null ? 0 : this.getDatbi().hashCode());
		result = 37 * result
				+ (getKtext() == null ? 0 : this.getKtext().hashCode());
		result = 37 * result
				+ (getLtext() == null ? 0 : this.getLtext().hashCode());
		result = 37 * result
				+ (getVerak() == null ? 0 : this.getVerak().hashCode());
		result = 37 * result
				+ (getKosar() == null ? 0 : this.getKosar().hashCode());
		result = 37 * result
				+ (getKhinr() == null ? 0 : this.getKhinr().hashCode());
		result = 37 * result
				+ (getBukrs() == null ? 0 : this.getBukrs().hashCode());
		result = 37 * result
				+ (getDelFlag() == null ? 0 : this.getDelFlag().hashCode());
		result = 37 * result
				+ (getPrctr() == null ? 0 : this.getPrctr().hashCode());
		return result;
	}

}