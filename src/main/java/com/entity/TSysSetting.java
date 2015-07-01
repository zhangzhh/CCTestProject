package com.entity;

/**
 * TSysSetting entity. @author MyEclipse Persistence Tools
 */

public class TSysSetting implements java.io.Serializable {

	// Fields

	private Long id;
	private String code;
	private String name;
	private String value;
	private String type;
	private String status;
	private String description;
	private String remark;

	// Constructors

	/** default constructor */
	public TSysSetting() {
	}

	/** minimal constructor */
	public TSysSetting(Long id) {
		this.id = id;
	}

	/** full constructor */
	public TSysSetting(Long id, String code, String name, String value,
			String type, String status, String description, String remark) {
		this.id = id;
		this.code = code;
		this.name = name;
		this.value = value;
		this.type = type;
		this.status = status;
		this.description = description;
		this.remark = remark;
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

	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}