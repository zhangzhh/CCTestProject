package com.entity;

/**
 * TCcManagementroledetail entity. @author MyEclipse Persistence Tools
 */

public class TCcManagementroledetail implements java.io.Serializable {

	// Fields

	private Long managementroledetailid;
	private String rindex;
	private Long dimid;
	private Long roleid;
	private String text;
	private String formula;

	// Constructors

	/** default constructor */
	public TCcManagementroledetail() {
	}

	/** minimal constructor */
	public TCcManagementroledetail(Long managementroledetailid) {
		this.managementroledetailid = managementroledetailid;
	}

	/** full constructor */
	public TCcManagementroledetail(Long managementroledetailid, String rindex,
			Long dimid, Long roleid, String text, String formula) {
		this.managementroledetailid = managementroledetailid;
		this.rindex = rindex;
		this.dimid = dimid;
		this.roleid = roleid;
		this.text = text;
		this.formula = formula;
	}

	// Property accessors

	public Long getManagementroledetailid() {
		return this.managementroledetailid;
	}

	public void setManagementroledetailid(Long managementroledetailid) {
		this.managementroledetailid = managementroledetailid;
	}

	public String getRindex() {
		return this.rindex;
	}

	public void setRindex(String rindex) {
		this.rindex = rindex;
	}

	public Long getDimid() {
		return this.dimid;
	}

	public void setDimid(Long dimid) {
		this.dimid = dimid;
	}

	public Long getRoleid() {
		return this.roleid;
	}

	public void setRoleid(Long roleid) {
		this.roleid = roleid;
	}

	public String getText() {
		return this.text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getFormula() {
		return this.formula;
	}

	public void setFormula(String formula) {
		this.formula = formula;
	}

}