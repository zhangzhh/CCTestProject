package com.entity;

/**
 * TCcItemformuladetail entity. @author MyEclipse Persistence Tools
 */

public class TCcItemformuladetail implements java.io.Serializable {

	// Fields

	private Long itemformudetailid;
	private Long mainid;
	private Long maintype;
	private Long displayorder;
	private Long formutype;
	private String formuvalue;
	private String formatstring;
	private String targetid;

	// Constructors

	/** default constructor */
	public TCcItemformuladetail() {
	}

	/** minimal constructor */
	public TCcItemformuladetail(Long itemformudetailid, Long mainid,
			Long maintype, Long displayorder, Long formutype, String formuvalue) {
		this.itemformudetailid = itemformudetailid;
		this.mainid = mainid;
		this.maintype = maintype;
		this.displayorder = displayorder;
		this.formutype = formutype;
		this.formuvalue = formuvalue;
	}

	/** full constructor */
	public TCcItemformuladetail(Long itemformudetailid, Long mainid,
			Long maintype, Long displayorder, Long formutype,
			String formuvalue, String formatstring, String targetid) {
		this.itemformudetailid = itemformudetailid;
		this.mainid = mainid;
		this.maintype = maintype;
		this.displayorder = displayorder;
		this.formutype = formutype;
		this.formuvalue = formuvalue;
		this.formatstring = formatstring;
		this.targetid = targetid;
	}

	// Property accessors

	public Long getItemformudetailid() {
		return this.itemformudetailid;
	}

	public void setItemformudetailid(Long itemformudetailid) {
		this.itemformudetailid = itemformudetailid;
	}

	public Long getMainid() {
		return this.mainid;
	}

	public void setMainid(Long mainid) {
		this.mainid = mainid;
	}

	public Long getMaintype() {
		return this.maintype;
	}

	public void setMaintype(Long maintype) {
		this.maintype = maintype;
	}

	public Long getDisplayorder() {
		return this.displayorder;
	}

	public void setDisplayorder(Long displayorder) {
		this.displayorder = displayorder;
	}

	public Long getFormutype() {
		return this.formutype;
	}

	public void setFormutype(Long formutype) {
		this.formutype = formutype;
	}

	public String getFormuvalue() {
		return this.formuvalue;
	}

	public void setFormuvalue(String formuvalue) {
		this.formuvalue = formuvalue;
	}

	public String getFormatstring() {
		return this.formatstring;
	}

	public void setFormatstring(String formatstring) {
		this.formatstring = formatstring;
	}

	public String getTargetid() {
		return this.targetid;
	}

	public void setTargetid(String targetid) {
		this.targetid = targetid;
	}

}