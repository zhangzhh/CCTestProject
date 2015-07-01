package com.entity;

/**
 * TCcCt entity. @author MyEclipse Persistence Tools
 */

public class TCcCt implements java.io.Serializable {

	// Fields

	private Long id;
	private String code;
	private String name;

	// Constructors

	/** default constructor */
	public TCcCt() {
	}

	/** minimal constructor */
	public TCcCt(Long id) {
		this.id = id;
	}

	/** full constructor */
	public TCcCt(Long id, String code, String name) {
		this.id = id;
		this.code = code;
		this.name = name;
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

}