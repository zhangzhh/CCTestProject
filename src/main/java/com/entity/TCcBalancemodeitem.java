package com.entity;

/**
 * TCcBalancemodeitem entity. @author MyEclipse Persistence Tools
 */

public class TCcBalancemodeitem implements java.io.Serializable {

	// Fields

	private Long balancemodeitemid;
	private Long balancemodeid;
	private Long itemid;
	private String isnull;
	private String overbudget;
	private String info;
	private String isused;

	// Constructors

	/** default constructor */
	public TCcBalancemodeitem() {
	}

	/** minimal constructor */
	public TCcBalancemodeitem(Long balancemodeitemid) {
		this.balancemodeitemid = balancemodeitemid;
	}

	/** full constructor */
	public TCcBalancemodeitem(Long balancemodeitemid, Long balancemodeid,
			Long itemid, String isnull, String overbudget, String info,
			String isused) {
		this.balancemodeitemid = balancemodeitemid;
		this.balancemodeid = balancemodeid;
		this.itemid = itemid;
		this.isnull = isnull;
		this.overbudget = overbudget;
		this.info = info;
		this.isused = isused;
	}

	// Property accessors

	public Long getBalancemodeitemid() {
		return this.balancemodeitemid;
	}

	public void setBalancemodeitemid(Long balancemodeitemid) {
		this.balancemodeitemid = balancemodeitemid;
	}

	public Long getBalancemodeid() {
		return this.balancemodeid;
	}

	public void setBalancemodeid(Long balancemodeid) {
		this.balancemodeid = balancemodeid;
	}

	public Long getItemid() {
		return this.itemid;
	}

	public void setItemid(Long itemid) {
		this.itemid = itemid;
	}

	public String getIsnull() {
		return this.isnull;
	}

	public void setIsnull(String isnull) {
		this.isnull = isnull;
	}

	public String getOverbudget() {
		return this.overbudget;
	}

	public void setOverbudget(String overbudget) {
		this.overbudget = overbudget;
	}

	public String getInfo() {
		return this.info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public String getIsused() {
		return this.isused;
	}

	public void setIsused(String isused) {
		this.isused = isused;
	}

}