package com.entity;

/**
 * TCcFormdimension entity. @author MyEclipse Persistence Tools
 */

public class TCcFormdimension implements java.io.Serializable {

	// Fields

	private Long formdimensionid;
	private Long formid;
	private Long dimid;
	private String dimensionmemberformula;
	private String enabledtotalcontrol;
	private String totalcontrolformula;
	private String enabled;

	// Constructors

	/** default constructor */
	public TCcFormdimension() {
	}

	/** minimal constructor */
	public TCcFormdimension(Long formdimensionid) {
		this.formdimensionid = formdimensionid;
	}

	/** full constructor */
	public TCcFormdimension(Long formdimensionid, Long formid, Long dimid,
			String dimensionmemberformula, String enabledtotalcontrol,
			String totalcontrolformula, String enabled) {
		this.formdimensionid = formdimensionid;
		this.formid = formid;
		this.dimid = dimid;
		this.dimensionmemberformula = dimensionmemberformula;
		this.enabledtotalcontrol = enabledtotalcontrol;
		this.totalcontrolformula = totalcontrolformula;
		this.enabled = enabled;
	}

	// Property accessors

	public Long getFormdimensionid() {
		return this.formdimensionid;
	}

	public void setFormdimensionid(Long formdimensionid) {
		this.formdimensionid = formdimensionid;
	}

	public Long getFormid() {
		return this.formid;
	}

	public void setFormid(Long formid) {
		this.formid = formid;
	}

	public Long getDimid() {
		return this.dimid;
	}

	public void setDimid(Long dimid) {
		this.dimid = dimid;
	}

	public String getDimensionmemberformula() {
		return this.dimensionmemberformula;
	}

	public void setDimensionmemberformula(String dimensionmemberformula) {
		this.dimensionmemberformula = dimensionmemberformula;
	}

	public String getEnabledtotalcontrol() {
		return this.enabledtotalcontrol;
	}

	public void setEnabledtotalcontrol(String enabledtotalcontrol) {
		this.enabledtotalcontrol = enabledtotalcontrol;
	}

	public String getTotalcontrolformula() {
		return this.totalcontrolformula;
	}

	public void setTotalcontrolformula(String totalcontrolformula) {
		this.totalcontrolformula = totalcontrolformula;
	}

	public String getEnabled() {
		return this.enabled;
	}

	public void setEnabled(String enabled) {
		this.enabled = enabled;
	}

}