package com.entity;

/**
 * TSelectDef entity. @author MyEclipse Persistence Tools
 */

public class TSelectDef implements java.io.Serializable {

	// Fields

	private Long id;
	private String catalog;
	private String namefield;
	private String valuefield;
	private String tablename;
	private String filters;
	private String sql;

	// Constructors

	/** default constructor */
	public TSelectDef() {
	}

	/** minimal constructor */
	public TSelectDef(Long id, String catalog) {
		this.id = id;
		this.catalog = catalog;
	}

	/** full constructor */
	public TSelectDef(Long id, String catalog, String namefield,
			String valuefield, String tablename, String filters, String sql) {
		this.id = id;
		this.catalog = catalog;
		this.namefield = namefield;
		this.valuefield = valuefield;
		this.tablename = tablename;
		this.filters = filters;
		this.sql = sql;
	}

	// Property accessors

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCatalog() {
		return this.catalog;
	}

	public void setCatalog(String catalog) {
		this.catalog = catalog;
	}

	public String getNamefield() {
		return this.namefield;
	}

	public void setNamefield(String namefield) {
		this.namefield = namefield;
	}

	public String getValuefield() {
		return this.valuefield;
	}

	public void setValuefield(String valuefield) {
		this.valuefield = valuefield;
	}

	public String getTablename() {
		return this.tablename;
	}

	public void setTablename(String tablename) {
		this.tablename = tablename;
	}

	public String getFilters() {
		return this.filters;
	}

	public void setFilters(String filters) {
		this.filters = filters;
	}

	public String getSql() {
		return this.sql;
	}

	public void setSql(String sql) {
		this.sql = sql;
	}

}