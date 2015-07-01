package com.entity;

/**
 * TCcExpensestructureTmp02Id entity. @author MyEclipse Persistence Tools
 */

public class TCcExpensestructureTmp02Id implements java.io.Serializable {

	// Fields

	private String hrzw;
	private String ccqy;
	private String ccfs;
	private Double kzbz;
	private String corp;

	// Constructors

	/** default constructor */
	public TCcExpensestructureTmp02Id() {
	}

	/** full constructor */
	public TCcExpensestructureTmp02Id(String hrzw, String ccqy, String ccfs,
			Double kzbz, String corp) {
		this.hrzw = hrzw;
		this.ccqy = ccqy;
		this.ccfs = ccfs;
		this.kzbz = kzbz;
		this.corp = corp;
	}

	// Property accessors

	public String getHrzw() {
		return this.hrzw;
	}

	public void setHrzw(String hrzw) {
		this.hrzw = hrzw;
	}

	public String getCcqy() {
		return this.ccqy;
	}

	public void setCcqy(String ccqy) {
		this.ccqy = ccqy;
	}

	public String getCcfs() {
		return this.ccfs;
	}

	public void setCcfs(String ccfs) {
		this.ccfs = ccfs;
	}

	public Double getKzbz() {
		return this.kzbz;
	}

	public void setKzbz(Double kzbz) {
		this.kzbz = kzbz;
	}

	public String getCorp() {
		return this.corp;
	}

	public void setCorp(String corp) {
		this.corp = corp;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TCcExpensestructureTmp02Id))
			return false;
		TCcExpensestructureTmp02Id castOther = (TCcExpensestructureTmp02Id) other;

		return ((this.getHrzw() == castOther.getHrzw()) || (this.getHrzw() != null
				&& castOther.getHrzw() != null && this.getHrzw().equals(
				castOther.getHrzw())))
				&& ((this.getCcqy() == castOther.getCcqy()) || (this.getCcqy() != null
						&& castOther.getCcqy() != null && this.getCcqy()
						.equals(castOther.getCcqy())))
				&& ((this.getCcfs() == castOther.getCcfs()) || (this.getCcfs() != null
						&& castOther.getCcfs() != null && this.getCcfs()
						.equals(castOther.getCcfs())))
				&& ((this.getKzbz() == castOther.getKzbz()) || (this.getKzbz() != null
						&& castOther.getKzbz() != null && this.getKzbz()
						.equals(castOther.getKzbz())))
				&& ((this.getCorp() == castOther.getCorp()) || (this.getCorp() != null
						&& castOther.getCorp() != null && this.getCorp()
						.equals(castOther.getCorp())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getHrzw() == null ? 0 : this.getHrzw().hashCode());
		result = 37 * result
				+ (getCcqy() == null ? 0 : this.getCcqy().hashCode());
		result = 37 * result
				+ (getCcfs() == null ? 0 : this.getCcfs().hashCode());
		result = 37 * result
				+ (getKzbz() == null ? 0 : this.getKzbz().hashCode());
		result = 37 * result
				+ (getCorp() == null ? 0 : this.getCorp().hashCode());
		return result;
	}

}