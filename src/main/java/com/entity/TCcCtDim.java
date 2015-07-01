package com.entity;

/**
 * TCcCtDim entity. @author MyEclipse Persistence Tools
 */

public class TCcCtDim implements java.io.Serializable {

	// Fields

	private Long id;
	private Long templateId;
	private String name;
	private Long mainDimId;
	private Long factor1;
	private Long factor2;
	private Long factor3;
	private Long factor4;
	private Long factor5;
	private Long outDimId;
	private String useControlDetail;

	// Constructors

	/** default constructor */
	public TCcCtDim() {
	}

	/** minimal constructor */
	public TCcCtDim(Long id, Long templateId, String name, Long mainDimId,
			Long outDimId) {
		this.id = id;
		this.templateId = templateId;
		this.name = name;
		this.mainDimId = mainDimId;
		this.outDimId = outDimId;
	}

	/** full constructor */
	public TCcCtDim(Long id, Long templateId, String name, Long mainDimId,
			Long factor1, Long factor2, Long factor3, Long factor4,
			Long factor5, Long outDimId, String useControlDetail) {
		this.id = id;
		this.templateId = templateId;
		this.name = name;
		this.mainDimId = mainDimId;
		this.factor1 = factor1;
		this.factor2 = factor2;
		this.factor3 = factor3;
		this.factor4 = factor4;
		this.factor5 = factor5;
		this.outDimId = outDimId;
		this.useControlDetail = useControlDetail;
	}

	// Property accessors

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getTemplateId() {
		return this.templateId;
	}

	public void setTemplateId(Long templateId) {
		this.templateId = templateId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getMainDimId() {
		return this.mainDimId;
	}

	public void setMainDimId(Long mainDimId) {
		this.mainDimId = mainDimId;
	}

	public Long getFactor1() {
		return this.factor1;
	}

	public void setFactor1(Long factor1) {
		this.factor1 = factor1;
	}

	public Long getFactor2() {
		return this.factor2;
	}

	public void setFactor2(Long factor2) {
		this.factor2 = factor2;
	}

	public Long getFactor3() {
		return this.factor3;
	}

	public void setFactor3(Long factor3) {
		this.factor3 = factor3;
	}

	public Long getFactor4() {
		return this.factor4;
	}

	public void setFactor4(Long factor4) {
		this.factor4 = factor4;
	}

	public Long getFactor5() {
		return this.factor5;
	}

	public void setFactor5(Long factor5) {
		this.factor5 = factor5;
	}

	public Long getOutDimId() {
		return this.outDimId;
	}

	public void setOutDimId(Long outDimId) {
		this.outDimId = outDimId;
	}

	public String getUseControlDetail() {
		return this.useControlDetail;
	}

	public void setUseControlDetail(String useControlDetail) {
		this.useControlDetail = useControlDetail;
	}

}