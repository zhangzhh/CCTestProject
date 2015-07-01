package com.entity;

import java.math.BigDecimal;

/**
 * TCcCtItemDefine entity. @author MyEclipse Persistence Tools
 */

public class TCcCtItemDefine implements java.io.Serializable {

	// Fields

	private Long id;
	private Long templateDetailId;
	private BigDecimal orderNum;
	private String type;
	private String value;
	private String showValue;
	private String formatType;
	private BigDecimal maxLength;
	private String align;
	private String completeLetter;
	private BigDecimal length;
	private String seperator;
	private String format;
	private BigDecimal scale;
	private String decimalPoint;
	private String thousandSeperator;
	private BigDecimal sizePerGroup;

	// Constructors

	/** default constructor */
	public TCcCtItemDefine() {
	}

	/** minimal constructor */
	public TCcCtItemDefine(Long id) {
		this.id = id;
	}

	/** full constructor */
	public TCcCtItemDefine(Long id, Long templateDetailId, BigDecimal orderNum,
			String type, String value, String showValue, String formatType,
			BigDecimal maxLength, String align, String completeLetter,
			BigDecimal length, String seperator, String format,
			BigDecimal scale, String decimalPoint, String thousandSeperator,
			BigDecimal sizePerGroup) {
		this.id = id;
		this.templateDetailId = templateDetailId;
		this.orderNum = orderNum;
		this.type = type;
		this.value = value;
		this.showValue = showValue;
		this.formatType = formatType;
		this.maxLength = maxLength;
		this.align = align;
		this.completeLetter = completeLetter;
		this.length = length;
		this.seperator = seperator;
		this.format = format;
		this.scale = scale;
		this.decimalPoint = decimalPoint;
		this.thousandSeperator = thousandSeperator;
		this.sizePerGroup = sizePerGroup;
	}

	// Property accessors

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getTemplateDetailId() {
		return this.templateDetailId;
	}

	public void setTemplateDetailId(Long templateDetailId) {
		this.templateDetailId = templateDetailId;
	}

	public BigDecimal getOrderNum() {
		return this.orderNum;
	}

	public void setOrderNum(BigDecimal orderNum) {
		this.orderNum = orderNum;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getShowValue() {
		return this.showValue;
	}

	public void setShowValue(String showValue) {
		this.showValue = showValue;
	}

	public String getFormatType() {
		return this.formatType;
	}

	public void setFormatType(String formatType) {
		this.formatType = formatType;
	}

	public BigDecimal getMaxLength() {
		return this.maxLength;
	}

	public void setMaxLength(BigDecimal maxLength) {
		this.maxLength = maxLength;
	}

	public String getAlign() {
		return this.align;
	}

	public void setAlign(String align) {
		this.align = align;
	}

	public String getCompleteLetter() {
		return this.completeLetter;
	}

	public void setCompleteLetter(String completeLetter) {
		this.completeLetter = completeLetter;
	}

	public BigDecimal getLength() {
		return this.length;
	}

	public void setLength(BigDecimal length) {
		this.length = length;
	}

	public String getSeperator() {
		return this.seperator;
	}

	public void setSeperator(String seperator) {
		this.seperator = seperator;
	}

	public String getFormat() {
		return this.format;
	}

	public void setFormat(String format) {
		this.format = format;
	}

	public BigDecimal getScale() {
		return this.scale;
	}

	public void setScale(BigDecimal scale) {
		this.scale = scale;
	}

	public String getDecimalPoint() {
		return this.decimalPoint;
	}

	public void setDecimalPoint(String decimalPoint) {
		this.decimalPoint = decimalPoint;
	}

	public String getThousandSeperator() {
		return this.thousandSeperator;
	}

	public void setThousandSeperator(String thousandSeperator) {
		this.thousandSeperator = thousandSeperator;
	}

	public BigDecimal getSizePerGroup() {
		return this.sizePerGroup;
	}

	public void setSizePerGroup(BigDecimal sizePerGroup) {
		this.sizePerGroup = sizePerGroup;
	}

}