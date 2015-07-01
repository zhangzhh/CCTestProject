package com.entity;

import java.sql.Timestamp;

/**
 * CcFormFavor entity. @author MyEclipse Persistence Tools
 */

public class CcFormFavor implements java.io.Serializable {

	// Fields

	private Long id;
	private String key;
	private String name;
	private String type;
	private Long creator;
	private Timestamp createtime;
	private Long billid;
	private Long templeteid;
	private Long orgentityid;
	private String orgentityname;
	private String memo;
	private String jsondata;

	// Constructors

	/** default constructor */
	public CcFormFavor() {
	}

	/** minimal constructor */
	public CcFormFavor(Long id, String key) {
		this.id = id;
		this.key = key;
	}

	/** full constructor */
	public CcFormFavor(Long id, String key, String name, String type,
			Long creator, Timestamp createtime, Long billid, Long templeteid,
			Long orgentityid, String orgentityname, String memo, String jsondata) {
		this.id = id;
		this.key = key;
		this.name = name;
		this.type = type;
		this.creator = creator;
		this.createtime = createtime;
		this.billid = billid;
		this.templeteid = templeteid;
		this.orgentityid = orgentityid;
		this.orgentityname = orgentityname;
		this.memo = memo;
		this.jsondata = jsondata;
	}

	// Property accessors

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getKey() {
		return this.key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Long getCreator() {
		return this.creator;
	}

	public void setCreator(Long creator) {
		this.creator = creator;
	}

	public Timestamp getCreatetime() {
		return this.createtime;
	}

	public void setCreatetime(Timestamp createtime) {
		this.createtime = createtime;
	}

	public Long getBillid() {
		return this.billid;
	}

	public void setBillid(Long billid) {
		this.billid = billid;
	}

	public Long getTempleteid() {
		return this.templeteid;
	}

	public void setTempleteid(Long templeteid) {
		this.templeteid = templeteid;
	}

	public Long getOrgentityid() {
		return this.orgentityid;
	}

	public void setOrgentityid(Long orgentityid) {
		this.orgentityid = orgentityid;
	}

	public String getOrgentityname() {
		return this.orgentityname;
	}

	public void setOrgentityname(String orgentityname) {
		this.orgentityname = orgentityname;
	}

	public String getMemo() {
		return this.memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getJsondata() {
		return this.jsondata;
	}

	public void setJsondata(String jsondata) {
		this.jsondata = jsondata;
	}

}