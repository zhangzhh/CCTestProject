package com.entity;

/**
 * TSysDataaccesstype entity. @author MyEclipse Persistence Tools
 */

public class TSysDataaccesstype implements java.io.Serializable {

	// Fields

	private Long dataaccesstypeid;
	private String dataaccesstypecode;
	private String dataaccesstypename;
	private String isused;
	private String accessmode;
	private Long objectid;

	// Constructors

	/** default constructor */
	public TSysDataaccesstype() {
	}

	/** minimal constructor */
	public TSysDataaccesstype(Long dataaccesstypeid) {
		this.dataaccesstypeid = dataaccesstypeid;
	}

	/** full constructor */
	public TSysDataaccesstype(Long dataaccesstypeid, String dataaccesstypecode,
			String dataaccesstypename, String isused, String accessmode,
			Long objectid) {
		this.dataaccesstypeid = dataaccesstypeid;
		this.dataaccesstypecode = dataaccesstypecode;
		this.dataaccesstypename = dataaccesstypename;
		this.isused = isused;
		this.accessmode = accessmode;
		this.objectid = objectid;
	}

	// Property accessors

	public Long getDataaccesstypeid() {
		return this.dataaccesstypeid;
	}

	public void setDataaccesstypeid(Long dataaccesstypeid) {
		this.dataaccesstypeid = dataaccesstypeid;
	}

	public String getDataaccesstypecode() {
		return this.dataaccesstypecode;
	}

	public void setDataaccesstypecode(String dataaccesstypecode) {
		this.dataaccesstypecode = dataaccesstypecode;
	}

	public String getDataaccesstypename() {
		return this.dataaccesstypename;
	}

	public void setDataaccesstypename(String dataaccesstypename) {
		this.dataaccesstypename = dataaccesstypename;
	}

	public String getIsused() {
		return this.isused;
	}

	public void setIsused(String isused) {
		this.isused = isused;
	}

	public String getAccessmode() {
		return this.accessmode;
	}

	public void setAccessmode(String accessmode) {
		this.accessmode = accessmode;
	}

	public Long getObjectid() {
		return this.objectid;
	}

	public void setObjectid(Long objectid) {
		this.objectid = objectid;
	}

}