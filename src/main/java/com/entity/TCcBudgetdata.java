package com.entity;

import java.math.BigDecimal;

/**
 * TCcBudgetdata entity. @author MyEclipse Persistence Tools
 */

public class TCcBudgetdata implements java.io.Serializable {

	// Fields

	private Long budgetdataid;
	private Long structureid;
	private BigDecimal datatype;
	private Long yearid;
	private Double totalyear;
	private Double q1;
	private Double q2;
	private Double q3;
	private Double q4;
	private Double m1;
	private Double m2;
	private Double m3;
	private Double m4;
	private Double m5;
	private Double m6;
	private Double m7;
	private Double m8;
	private Double m9;
	private Double m10;
	private Double m11;
	private Double m12;
	private Double t1;
	private Double t2;
	private Double t3;
	private Double t4;
	private Double t5;
	private Double t6;
	private Double t7;
	private Double t8;
	private Double t9;
	private Double t10;
	private Double t11;
	private Double t12;
	private String budgetcode;
	private Double initialbudget;

	// Constructors

	/** default constructor */
	public TCcBudgetdata() {
	}

	/** minimal constructor */
	public TCcBudgetdata(Long budgetdataid) {
		this.budgetdataid = budgetdataid;
	}

	/** full constructor */
	public TCcBudgetdata(Long budgetdataid, Long structureid,
			BigDecimal datatype, Long yearid, Double totalyear, Double q1,
			Double q2, Double q3, Double q4, Double m1, Double m2, Double m3,
			Double m4, Double m5, Double m6, Double m7, Double m8, Double m9,
			Double m10, Double m11, Double m12, Double t1, Double t2,
			Double t3, Double t4, Double t5, Double t6, Double t7, Double t8,
			Double t9, Double t10, Double t11, Double t12, String budgetcode,
			Double initialbudget) {
		this.budgetdataid = budgetdataid;
		this.structureid = structureid;
		this.datatype = datatype;
		this.yearid = yearid;
		this.totalyear = totalyear;
		this.q1 = q1;
		this.q2 = q2;
		this.q3 = q3;
		this.q4 = q4;
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
		this.m4 = m4;
		this.m5 = m5;
		this.m6 = m6;
		this.m7 = m7;
		this.m8 = m8;
		this.m9 = m9;
		this.m10 = m10;
		this.m11 = m11;
		this.m12 = m12;
		this.t1 = t1;
		this.t2 = t2;
		this.t3 = t3;
		this.t4 = t4;
		this.t5 = t5;
		this.t6 = t6;
		this.t7 = t7;
		this.t8 = t8;
		this.t9 = t9;
		this.t10 = t10;
		this.t11 = t11;
		this.t12 = t12;
		this.budgetcode = budgetcode;
		this.initialbudget = initialbudget;
	}

	// Property accessors

	public Long getBudgetdataid() {
		return this.budgetdataid;
	}

	public void setBudgetdataid(Long budgetdataid) {
		this.budgetdataid = budgetdataid;
	}

	public Long getStructureid() {
		return this.structureid;
	}

	public void setStructureid(Long structureid) {
		this.structureid = structureid;
	}

	public BigDecimal getDatatype() {
		return this.datatype;
	}

	public void setDatatype(BigDecimal datatype) {
		this.datatype = datatype;
	}

	public Long getYearid() {
		return this.yearid;
	}

	public void setYearid(Long yearid) {
		this.yearid = yearid;
	}

	public Double getTotalyear() {
		return this.totalyear;
	}

	public void setTotalyear(Double totalyear) {
		this.totalyear = totalyear;
	}

	public Double getQ1() {
		return this.q1;
	}

	public void setQ1(Double q1) {
		this.q1 = q1;
	}

	public Double getQ2() {
		return this.q2;
	}

	public void setQ2(Double q2) {
		this.q2 = q2;
	}

	public Double getQ3() {
		return this.q3;
	}

	public void setQ3(Double q3) {
		this.q3 = q3;
	}

	public Double getQ4() {
		return this.q4;
	}

	public void setQ4(Double q4) {
		this.q4 = q4;
	}

	public Double getM1() {
		return this.m1;
	}

	public void setM1(Double m1) {
		this.m1 = m1;
	}

	public Double getM2() {
		return this.m2;
	}

	public void setM2(Double m2) {
		this.m2 = m2;
	}

	public Double getM3() {
		return this.m3;
	}

	public void setM3(Double m3) {
		this.m3 = m3;
	}

	public Double getM4() {
		return this.m4;
	}

	public void setM4(Double m4) {
		this.m4 = m4;
	}

	public Double getM5() {
		return this.m5;
	}

	public void setM5(Double m5) {
		this.m5 = m5;
	}

	public Double getM6() {
		return this.m6;
	}

	public void setM6(Double m6) {
		this.m6 = m6;
	}

	public Double getM7() {
		return this.m7;
	}

	public void setM7(Double m7) {
		this.m7 = m7;
	}

	public Double getM8() {
		return this.m8;
	}

	public void setM8(Double m8) {
		this.m8 = m8;
	}

	public Double getM9() {
		return this.m9;
	}

	public void setM9(Double m9) {
		this.m9 = m9;
	}

	public Double getM10() {
		return this.m10;
	}

	public void setM10(Double m10) {
		this.m10 = m10;
	}

	public Double getM11() {
		return this.m11;
	}

	public void setM11(Double m11) {
		this.m11 = m11;
	}

	public Double getM12() {
		return this.m12;
	}

	public void setM12(Double m12) {
		this.m12 = m12;
	}

	public Double getT1() {
		return this.t1;
	}

	public void setT1(Double t1) {
		this.t1 = t1;
	}

	public Double getT2() {
		return this.t2;
	}

	public void setT2(Double t2) {
		this.t2 = t2;
	}

	public Double getT3() {
		return this.t3;
	}

	public void setT3(Double t3) {
		this.t3 = t3;
	}

	public Double getT4() {
		return this.t4;
	}

	public void setT4(Double t4) {
		this.t4 = t4;
	}

	public Double getT5() {
		return this.t5;
	}

	public void setT5(Double t5) {
		this.t5 = t5;
	}

	public Double getT6() {
		return this.t6;
	}

	public void setT6(Double t6) {
		this.t6 = t6;
	}

	public Double getT7() {
		return this.t7;
	}

	public void setT7(Double t7) {
		this.t7 = t7;
	}

	public Double getT8() {
		return this.t8;
	}

	public void setT8(Double t8) {
		this.t8 = t8;
	}

	public Double getT9() {
		return this.t9;
	}

	public void setT9(Double t9) {
		this.t9 = t9;
	}

	public Double getT10() {
		return this.t10;
	}

	public void setT10(Double t10) {
		this.t10 = t10;
	}

	public Double getT11() {
		return this.t11;
	}

	public void setT11(Double t11) {
		this.t11 = t11;
	}

	public Double getT12() {
		return this.t12;
	}

	public void setT12(Double t12) {
		this.t12 = t12;
	}

	public String getBudgetcode() {
		return this.budgetcode;
	}

	public void setBudgetcode(String budgetcode) {
		this.budgetcode = budgetcode;
	}

	public Double getInitialbudget() {
		return this.initialbudget;
	}

	public void setInitialbudget(Double initialbudget) {
		this.initialbudget = initialbudget;
	}

}