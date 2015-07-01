package com.entity;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * TSysMenu entity. @author MyEclipse Persistence Tools
 */

public class TSysMenu implements java.io.Serializable {

	// Fields

	private Long menuid;
	private String menucode;
	private String menuname;
	private Long parentid;
	private String url;
	private String isleaf;
	private String isused;
	private BigDecimal position;
	private Set TSysFunctionoperations = new HashSet(0);

	// Constructors

	/** default constructor */
	public TSysMenu() {
	}

	/** minimal constructor */
	public TSysMenu(Long menuid) {
		this.menuid = menuid;
	}

	/** full constructor */
	public TSysMenu(Long menuid, String menucode, String menuname,
			Long parentid, String url, String isleaf, String isused,
			BigDecimal position, Set TSysFunctionoperations) {
		this.menuid = menuid;
		this.menucode = menucode;
		this.menuname = menuname;
		this.parentid = parentid;
		this.url = url;
		this.isleaf = isleaf;
		this.isused = isused;
		this.position = position;
		this.TSysFunctionoperations = TSysFunctionoperations;
	}

	// Property accessors

	public Long getMenuid() {
		return this.menuid;
	}

	public void setMenuid(Long menuid) {
		this.menuid = menuid;
	}

	public String getMenucode() {
		return this.menucode;
	}

	public void setMenucode(String menucode) {
		this.menucode = menucode;
	}

	public String getMenuname() {
		return this.menuname;
	}

	public void setMenuname(String menuname) {
		this.menuname = menuname;
	}

	public Long getParentid() {
		return this.parentid;
	}

	public void setParentid(Long parentid) {
		this.parentid = parentid;
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getIsleaf() {
		return this.isleaf;
	}

	public void setIsleaf(String isleaf) {
		this.isleaf = isleaf;
	}

	public String getIsused() {
		return this.isused;
	}

	public void setIsused(String isused) {
		this.isused = isused;
	}

	public BigDecimal getPosition() {
		return this.position;
	}

	public void setPosition(BigDecimal position) {
		this.position = position;
	}

	public Set getTSysFunctionoperations() {
		return this.TSysFunctionoperations;
	}

	public void setTSysFunctionoperations(Set TSysFunctionoperations) {
		this.TSysFunctionoperations = TSysFunctionoperations;
	}

}