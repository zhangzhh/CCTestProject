package com.entity;

import java.math.BigDecimal;

/**
 * TCcCtFileNameItem entity. @author MyEclipse Persistence Tools
 */

public class TCcCtFileNameItem implements java.io.Serializable {

	// Fields

	private BigDecimal id;
	private BigDecimal fileNameId;
	private String value;
	private String showValue;
	private BigDecimal orderNum;
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
	private String type;

	// Constructors

	/** default constructor */
	public TCcCtFileNameItem() {
	}

	/** minimal constructor */
	public TCcCtFileNameItem(BigDecimal id, BigDecimal fileNameId,
			String value, String showValue) {
		this.id = id;
		this.fileNameId = fileNameId;
		this.value = value;
		this.showValue = showValue;
	}

	/** full constructor */
	public TCcCtFileNameItem(BigDecimal id, BigDecimal fileNameId,
			String value, String showValue, BigDecimal orderNum,
			String formatType, BigDecimal maxLength, String align,
			String completeLetter, BigDecimal length, String seperator,
			String format, BigDecimal scale, String decimalPoint,
			String thousandSeperator, BigDecimal sizePerGroup, String type) {
		this.id = id;
		this.fileNameId = fileNameId;
		this.value = value;
		this.showValue = showValue;
		this.orderNum = orderNum;
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
		this.type = type;
	}

	// Property accessors

	public BigDecimal getId() {
		return this.id;
	}

	public void setId(BigDecimal id) {
		this.id = id;
	}

	public BigDecimal getFileNameId() {
		return this.fileNameId;
	}

	public void setFileNameId(BigDecimal fileNameId) {
		this.fileNameId = fileNameId;
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

	public BigDecimal getOrderNum() {
		return this.orderNum;
	}

	public void setOrderNum(BigDecimal orderNum) {
		this.orderNum = orderNum;
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

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

}