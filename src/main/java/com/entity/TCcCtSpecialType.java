package com.entity;

/**
 * TCcCtSpecialType entity. @author MyEclipse Persistence Tools
 */

public class TCcCtSpecialType implements java.io.Serializable {

	// Fields

	private Long id;
	private String code;
	private String name;
	private String refField;
	private String refTable;
	private String showField;

	// Constructors

	/** default constructor */
	public TCcCtSpecialType() {
	}

	/** full constructor */
	public TCcCtSpecialType(Long id, String code, String name, String refField,
			String refTable, String showField) {
		this.id = id;
		this.code = code;
		this.name = name;
		this.refField = refField;
		this.refTable = refTable;
		this.showField = showField;
	}

	// Property accessors

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRefField() {
		return this.refField;
	}

	public void setRefField(String refField) {
		this.refField = refField;
	}

	public String getRefTable() {
		return this.refTable;
	}

	public void setRefTable(String refTable) {
		this.refTable = refTable;
	}

	public String getShowField() {
		return this.showField;
	}

	public void setShowField(String showField) {
		this.showField = showField;
	}

}