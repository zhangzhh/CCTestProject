package com.entity;

/**
 * TCcExpensestructure entity. @author MyEclipse Persistence Tools
 */

public class TCcExpensestructure implements java.io.Serializable {

	// Fields

	private Long expensestructureid;
	private TCcExpenseaccount TCcExpenseaccount;
	private Long combinationdetailid;
	private Long dimsubjectid;
	private Long dimaccountid;
	private Long dimcurrencyid;
	private Long dimprojectid;
	private Long dimsupplierid;
	private Long dimpostrankid;
	private Long dimregionid;
	private Long dimyearid;
	private Long dimperiodid;
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
	private Double controlvalue;

	// Constructors

	/** default constructor */
	public TCcExpensestructure() {
	}

	/** minimal constructor */
	public TCcExpensestructure(Long expensestructureid) {
		this.expensestructureid = expensestructureid;
	}

	/** full constructor */
	public TCcExpensestructure(Long expensestructureid,
			TCcExpenseaccount TCcExpenseaccount, Long combinationdetailid,
			Long dimsubjectid, Long dimaccountid, Long dimcurrencyid,
			Long dimprojectid, Long dimsupplierid, Long dimpostrankid,
			Long dimregionid, Long dimyearid, Long dimperiodid, Long dim01id,
			Long dim02id, Long dim03id, Long dim04id, Long dim05id,
			Long dim06id, Long dim07id, Long dim08id, Long dim09id,
			Long dim10id, Double controlvalue) {
		this.expensestructureid = expensestructureid;
		this.TCcExpenseaccount = TCcExpenseaccount;
		this.combinationdetailid = combinationdetailid;
		this.dimsubjectid = dimsubjectid;
		this.dimaccountid = dimaccountid;
		this.dimcurrencyid = dimcurrencyid;
		this.dimprojectid = dimprojectid;
		this.dimsupplierid = dimsupplierid;
		this.dimpostrankid = dimpostrankid;
		this.dimregionid = dimregionid;
		this.dimyearid = dimyearid;
		this.dimperiodid = dimperiodid;
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
		this.controlvalue = controlvalue;
	}

	// Property accessors

	public Long getExpensestructureid() {
		return this.expensestructureid;
	}

	public void setExpensestructureid(Long expensestructureid) {
		this.expensestructureid = expensestructureid;
	}

	public TCcExpenseaccount getTCcExpenseaccount() {
		return this.TCcExpenseaccount;
	}

	public void setTCcExpenseaccount(TCcExpenseaccount TCcExpenseaccount) {
		this.TCcExpenseaccount = TCcExpenseaccount;
	}

	public Long getCombinationdetailid() {
		return this.combinationdetailid;
	}

	public void setCombinationdetailid(Long combinationdetailid) {
		this.combinationdetailid = combinationdetailid;
	}

	public Long getDimsubjectid() {
		return this.dimsubjectid;
	}

	public void setDimsubjectid(Long dimsubjectid) {
		this.dimsubjectid = dimsubjectid;
	}

	public Long getDimaccountid() {
		return this.dimaccountid;
	}

	public void setDimaccountid(Long dimaccountid) {
		this.dimaccountid = dimaccountid;
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

	public Long getDimyearid() {
		return this.dimyearid;
	}

	public void setDimyearid(Long dimyearid) {
		this.dimyearid = dimyearid;
	}

	public Long getDimperiodid() {
		return this.dimperiodid;
	}

	public void setDimperiodid(Long dimperiodid) {
		this.dimperiodid = dimperiodid;
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

	public Double getControlvalue() {
		return this.controlvalue;
	}

	public void setControlvalue(Double controlvalue) {
		this.controlvalue = controlvalue;
	}

}