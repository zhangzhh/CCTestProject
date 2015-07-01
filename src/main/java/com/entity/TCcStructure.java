package com.entity;

/**
 * TCcStructure entity. @author MyEclipse Persistence Tools
 */

public class TCcStructure implements java.io.Serializable {

	// Fields

	private Long structureid;
	private Long formid;
	private Long dimaccountid;
	private Long dimsubjectid;
	private Long dimcurrencyid;
	private Long dimprojectid;
	private Long dimsupplierid;
	private Long dimpostrankid;
	private Long dimregionid;
	private String budgetstate;
	private Long dim01id;
	private Long dim02id;
	private Long dim03id;
	private Long dim04id;
	private Long dim05id;
	private Long dim06id;
	private Long dim07id;
	private Long dim08id;
	private Long dim09id;
	private Long dim10id;

	// Constructors

	/** default constructor */
	public TCcStructure() {
	}

	/** minimal constructor */
	public TCcStructure(Long structureid) {
		this.structureid = structureid;
	}

	/** full constructor */
	public TCcStructure(Long structureid, Long formid, Long dimaccountid,
			Long dimsubjectid, Long dimcurrencyid, Long dimprojectid,
			Long dimsupplierid, Long dimpostrankid, Long dimregionid,
			String budgetstate, Long dim01id, Long dim02id, Long dim03id,
			Long dim04id, Long dim05id, Long dim06id, Long dim07id,
			Long dim08id, Long dim09id, Long dim10id) {
		this.structureid = structureid;
		this.formid = formid;
		this.dimaccountid = dimaccountid;
		this.dimsubjectid = dimsubjectid;
		this.dimcurrencyid = dimcurrencyid;
		this.dimprojectid = dimprojectid;
		this.dimsupplierid = dimsupplierid;
		this.dimpostrankid = dimpostrankid;
		this.dimregionid = dimregionid;
		this.budgetstate = budgetstate;
		this.dim01id = dim01id;
		this.dim02id = dim02id;
		this.dim03id = dim03id;
		this.dim04id = dim04id;
		this.dim05id = dim05id;
		this.dim06id = dim06id;
		this.dim07id = dim07id;
		this.dim08id = dim08id;
		this.dim09id = dim09id;
		this.dim10id = dim10id;
	}

	// Property accessors

	public Long getStructureid() {
		return this.structureid;
	}

	public void setStructureid(Long structureid) {
		this.structureid = structureid;
	}

	public Long getFormid() {
		return this.formid;
	}

	public void setFormid(Long formid) {
		this.formid = formid;
	}

	public Long getDimaccountid() {
		return this.dimaccountid;
	}

	public void setDimaccountid(Long dimaccountid) {
		this.dimaccountid = dimaccountid;
	}

	public Long getDimsubjectid() {
		return this.dimsubjectid;
	}

	public void setDimsubjectid(Long dimsubjectid) {
		this.dimsubjectid = dimsubjectid;
	}

	public Long getDimcurrencyid() {
		return this.dimcurrencyid;
	}

	public void setDimcurrencyid(Long dimcurrencyid) {
		this.dimcurrencyid = dimcurrencyid;
	}

	public Long getDimprojectid() {
		return this.dimprojectid;
	}

	public void setDimprojectid(Long dimprojectid) {
		this.dimprojectid = dimprojectid;
	}

	public Long getDimsupplierid() {
		return this.dimsupplierid;
	}

	public void setDimsupplierid(Long dimsupplierid) {
		this.dimsupplierid = dimsupplierid;
	}

	public Long getDimpostrankid() {
		return this.dimpostrankid;
	}

	public void setDimpostrankid(Long dimpostrankid) {
		this.dimpostrankid = dimpostrankid;
	}

	public Long getDimregionid() {
		return this.dimregionid;
	}

	public void setDimregionid(Long dimregionid) {
		this.dimregionid = dimregionid;
	}

	public String getBudgetstate() {
		return this.budgetstate;
	}

	public void setBudgetstate(String budgetstate) {
		this.budgetstate = budgetstate;
	}

	public Long getDim01id() {
		return this.dim01id;
	}

	public void setDim01id(Long dim01id) {
		this.dim01id = dim01id;
	}

	public Long getDim02id() {
		return this.dim02id;
	}

	public void setDim02id(Long dim02id) {
		this.dim02id = dim02id;
	}

	public Long getDim03id() {
		return this.dim03id;
	}

	public void setDim03id(Long dim03id) {
		this.dim03id = dim03id;
	}

	public Long getDim04id() {
		return this.dim04id;
	}

	public void setDim04id(Long dim04id) {
		this.dim04id = dim04id;
	}

	public Long getDim05id() {
		return this.dim05id;
	}

	public void setDim05id(Long dim05id) {
		this.dim05id = dim05id;
	}

	public Long getDim06id() {
		return this.dim06id;
	}

	public void setDim06id(Long dim06id) {
		this.dim06id = dim06id;
	}

	public Long getDim07id() {
		return this.dim07id;
	}

	public void setDim07id(Long dim07id) {
		this.dim07id = dim07id;
	}

	public Long getDim08id() {
		return this.dim08id;
	}

	public void setDim08id(Long dim08id) {
		this.dim08id = dim08id;
	}

	public Long getDim09id() {
		return this.dim09id;
	}

	public void setDim09id(Long dim09id) {
		this.dim09id = dim09id;
	}

	public Long getDim10id() {
		return this.dim10id;
	}

	public void setDim10id(Long dim10id) {
		this.dim10id = dim10id;
	}

}