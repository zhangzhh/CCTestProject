package com.entity;

import java.util.Arrays;

/**
 * TCcBilllogoId entity. @author MyEclipse Persistence Tools
 */

public class TCcBilllogoId implements java.io.Serializable {

	// Fields

	private String billid;
	private String name;
	private byte[] billlogo;

	// Constructors

	/** default constructor */
	public TCcBilllogoId() {
	}

	/** minimal constructor */
	public TCcBilllogoId(String name) {
		this.name = name;
	}

	/** full constructor */
	public TCcBilllogoId(String billid, String name, byte[] billlogo) {
		this.billid = billid;
		this.name = name;
		this.billlogo = billlogo;
	}

	// Property accessors

	public String getBillid() {
		return this.billid;
	}

	public void setBillid(String billid) {
		this.billid = billid;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public byte[] getBilllogo() {
		return this.billlogo;
	}

	public void setBilllogo(byte[] billlogo) {
		this.billlogo = billlogo;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TCcBilllogoId))
			return false;
		TCcBilllogoId castOther = (TCcBilllogoId) other;

		return ((this.getBillid() == castOther.getBillid()) || (this
				.getBillid() != null && castOther.getBillid() != null && this
				.getBillid().equals(castOther.getBillid())))
				&& ((this.getName() == castOther.getName()) || (this.getName() != null
						&& castOther.getName() != null && this.getName()
						.equals(castOther.getName())))
				&& ((this.getBilllogo() == castOther.getBilllogo()) || (this
						.getBilllogo() != null
						&& castOther.getBilllogo() != null && Arrays.equals(
						this.getBilllogo(), castOther.getBilllogo())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getBillid() == null ? 0 : this.getBillid().hashCode());
		result = 37 * result
				+ (getName() == null ? 0 : this.getName().hashCode());
		int billlogoHashcode = 0;
		byte[] billlogoProperty = this.getBilllogo();
		if (billlogoProperty != null) {
			billlogoHashcode = 1;
			for (int i = 0; i < billlogoProperty.length; i++) {
				billlogoHashcode = 37 * billlogoHashcode + billlogoProperty[i];
			}
		}

		result = 37 * result + billlogoHashcode;

		return result;
	}

}