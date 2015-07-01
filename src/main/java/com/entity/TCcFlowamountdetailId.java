package com.entity;

/**
 * TCcFlowamountdetailId entity. @author MyEclipse Persistence Tools
 */

public class TCcFlowamountdetailId implements java.io.Serializable {

	// Fields

	private Long numericaldetailid;
	private String linenum;
	private Long num;
	private Long flowamountid;
	private Long dimid;
	private String formula;
	private String formulatext;

	// Constructors

	/** default constructor */
	public TCcFlowamountdetailId() {
	}

	/** minimal constructor */
	public TCcFlowamountdetailId(Long numericaldetailid) {
		this.numericaldetailid = numericaldetailid;
	}

	/** full constructor */
	public TCcFlowamountdetailId(Long numericaldetailid, String linenum,
			Long num, Long flowamountid, Long dimid, String formula,
			String formulatext) {
		this.numericaldetailid = numericaldetailid;
		this.linenum = linenum;
		this.num = num;
		this.flowamountid = flowamountid;
		this.dimid = dimid;
		this.formula = formula;
		this.formulatext = formulatext;
	}

	// Property accessors

	public Long getNumericaldetailid() {
		return this.numericaldetailid;
	}

	public void setNumericaldetailid(Long numericaldetailid) {
		this.numericaldetailid = numericaldetailid;
	}

	public String getLinenum() {
		return this.linenum;
	}

	public void setLinenum(String linenum) {
		this.linenum = linenum;
	}

	public Long getNum() {
		return this.num;
	}

	public void setNum(Long num) {
		this.num = num;
	}

	public Long getFlowamountid() {
		return this.flowamountid;
	}

	public void setFlowamountid(Long flowamountid) {
		this.flowamountid = flowamountid;
	}

	public Long getDimid() {
		return this.dimid;
	}

	public void setDimid(Long dimid) {
		this.dimid = dimid;
	}

	public String getFormula() {
		return this.formula;
	}

	public void setFormula(String formula) {
		this.formula = formula;
	}

	public String getFormulatext() {
		return this.formulatext;
	}

	public void setFormulatext(String formulatext) {
		this.formulatext = formulatext;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TCcFlowamountdetailId))
			return false;
		TCcFlowamountdetailId castOther = (TCcFlowamountdetailId) other;

		return ((this.getNumericaldetailid() == castOther
				.getNumericaldetailid()) || (this.getNumericaldetailid() != null
				&& castOther.getNumericaldetailid() != null && this
				.getNumericaldetailid()
				.equals(castOther.getNumericaldetailid())))
				&& ((this.getLinenum() == castOther.getLinenum()) || (this
						.getLinenum() != null && castOther.getLinenum() != null && this
						.getLinenum().equals(castOther.getLinenum())))
				&& ((this.getNum() == castOther.getNum()) || (this.getNum() != null
						&& castOther.getNum() != null && this.getNum().equals(
						castOther.getNum())))
				&& ((this.getFlowamountid() == castOther.getFlowamountid()) || (this
						.getFlowamountid() != null
						&& castOther.getFlowamountid() != null && this
						.getFlowamountid().equals(castOther.getFlowamountid())))
				&& ((this.getDimid() == castOther.getDimid()) || (this
						.getDimid() != null && castOther.getDimid() != null && this
						.getDimid().equals(castOther.getDimid())))
				&& ((this.getFormula() == castOther.getFormula()) || (this
						.getFormula() != null && castOther.getFormula() != null && this
						.getFormula().equals(castOther.getFormula())))
				&& ((this.getFormulatext() == castOther.getFormulatext()) || (this
						.getFormulatext() != null
						&& castOther.getFormulatext() != null && this
						.getFormulatext().equals(castOther.getFormulatext())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getNumericaldetailid() == null ? 0 : this
						.getNumericaldetailid().hashCode());
		result = 37 * result
				+ (getLinenum() == null ? 0 : this.getLinenum().hashCode());
		result = 37 * result
				+ (getNum() == null ? 0 : this.getNum().hashCode());
		result = 37
				* result
				+ (getFlowamountid() == null ? 0 : this.getFlowamountid()
						.hashCode());
		result = 37 * result
				+ (getDimid() == null ? 0 : this.getDimid().hashCode());
		result = 37 * result
				+ (getFormula() == null ? 0 : this.getFormula().hashCode());
		result = 37
				* result
				+ (getFormulatext() == null ? 0 : this.getFormulatext()
						.hashCode());
		return result;
	}

}