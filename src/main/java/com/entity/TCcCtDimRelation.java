package com.entity;

/**
 * TCcCtDimRelation entity. @author MyEclipse Persistence Tools
 */

public class TCcCtDimRelation implements java.io.Serializable {

	// Fields

	private Long id;
	private String mainDimCondition;
	private String factor1Condition;
	private String factor2Condition;
	private String factor3Condition;
	private String factor4Condition;
	private String factor5Condition;
	private Long ctDimId;
	private Long outDimMemberId;
	private Long controlDetailId;

	// Constructors

	/** default constructor */
	public TCcCtDimRelation() {
	}

	/** minimal constructor */
	public TCcCtDimRelation(Long id, String mainDimCondition, Long ctDimId) {
		this.id = id;
		this.mainDimCondition = mainDimCondition;
		this.ctDimId = ctDimId;
	}

	/** full constructor */
	public TCcCtDimRelation(Long id, String mainDimCondition,
			String factor1Condition, String factor2Condition,
			String factor3Condition, String factor4Condition,
			String factor5Condition, Long ctDimId, Long outDimMemberId,
			Long controlDetailId) {
		this.id = id;
		this.mainDimCondition = mainDimCondition;
		this.factor1Condition = factor1Condition;
		this.factor2Condition = factor2Condition;
		this.factor3Condition = factor3Condition;
		this.factor4Condition = factor4Condition;
		this.factor5Condition = factor5Condition;
		this.ctDimId = ctDimId;
		this.outDimMemberId = outDimMemberId;
		this.controlDetailId = controlDetailId;
	}

	// Property accessors

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMainDimCondition() {
		return this.mainDimCondition;
	}

	public void setMainDimCondition(String mainDimCondition) {
		this.mainDimCondition = mainDimCondition;
	}

	public String getFactor1Condition() {
		return this.factor1Condition;
	}

	public void setFactor1Condition(String factor1Condition) {
		this.factor1Condition = factor1Condition;
	}

	public String getFactor2Condition() {
		return this.factor2Condition;
	}

	public void setFactor2Condition(String factor2Condition) {
		this.factor2Condition = factor2Condition;
	}

	public String getFactor3Condition() {
		return this.factor3Condition;
	}

	public void setFactor3Condition(String factor3Condition) {
		this.factor3Condition = factor3Condition;
	}

	public String getFactor4Condition() {
		return this.factor4Condition;
	}

	public void setFactor4Condition(String factor4Condition) {
		this.factor4Condition = factor4Condition;
	}

	public String getFactor5Condition() {
		return this.factor5Condition;
	}

	public void setFactor5Condition(String factor5Condition) {
		this.factor5Condition = factor5Condition;
	}

	public Long getCtDimId() {
		return this.ctDimId;
	}

	public void setCtDimId(Long ctDimId) {
		this.ctDimId = ctDimId;
	}

	public Long getOutDimMemberId() {
		return this.outDimMemberId;
	}

	public void setOutDimMemberId(Long outDimMemberId) {
		this.outDimMemberId = outDimMemberId;
	}

	public Long getControlDetailId() {
		return this.controlDetailId;
	}

	public void setControlDetailId(Long controlDetailId) {
		this.controlDetailId = controlDetailId;
	}

}