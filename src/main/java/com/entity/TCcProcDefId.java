package com.entity;

/**
 * TCcProcDefId entity. @author MyEclipse Persistence Tools
 */

public class TCcProcDefId implements java.io.Serializable {

	// Fields

	private Long id;
	private String procname;
	private String procdesc;
	private String starttime;
	private Boolean execfreq;
	private String isused;

	// Constructors

	/** default constructor */
	public TCcProcDefId() {
	}

	/** minimal constructor */
	public TCcProcDefId(Long id) {
		this.id = id;
	}

	/** full constructor */
	public TCcProcDefId(Long id, String procname, String procdesc,
			String starttime, Boolean execfreq, String isused) {
		this.id = id;
		this.procname = procname;
		this.procdesc = procdesc;
		this.starttime = starttime;
		this.execfreq = execfreq;
		this.isused = isused;
	}

	// Property accessors

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getProcname() {
		return this.procname;
	}

	public void setProcname(String procname) {
		this.procname = procname;
	}

	public String getProcdesc() {
		return this.procdesc;
	}

	public void setProcdesc(String procdesc) {
		this.procdesc = procdesc;
	}

	public String getStarttime() {
		return this.starttime;
	}

	public void setStarttime(String starttime) {
		this.starttime = starttime;
	}

	public Boolean getExecfreq() {
		return this.execfreq;
	}

	public void setExecfreq(Boolean execfreq) {
		this.execfreq = execfreq;
	}

	public String getIsused() {
		return this.isused;
	}

	public void setIsused(String isused) {
		this.isused = isused;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TCcProcDefId))
			return false;
		TCcProcDefId castOther = (TCcProcDefId) other;

		return ((this.getId() == castOther.getId()) || (this.getId() != null
				&& castOther.getId() != null && this.getId().equals(
				castOther.getId())))
				&& ((this.getProcname() == castOther.getProcname()) || (this
						.getProcname() != null
						&& castOther.getProcname() != null && this
						.getProcname().equals(castOther.getProcname())))
				&& ((this.getProcdesc() == castOther.getProcdesc()) || (this
						.getProcdesc() != null
						&& castOther.getProcdesc() != null && this
						.getProcdesc().equals(castOther.getProcdesc())))
				&& ((this.getStarttime() == castOther.getStarttime()) || (this
						.getStarttime() != null
						&& castOther.getStarttime() != null && this
						.getStarttime().equals(castOther.getStarttime())))
				&& ((this.getExecfreq() == castOther.getExecfreq()) || (this
						.getExecfreq() != null
						&& castOther.getExecfreq() != null && this
						.getExecfreq().equals(castOther.getExecfreq())))
				&& ((this.getIsused() == castOther.getIsused()) || (this
						.getIsused() != null && castOther.getIsused() != null && this
						.getIsused().equals(castOther.getIsused())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getId() == null ? 0 : this.getId().hashCode());
		result = 37 * result
				+ (getProcname() == null ? 0 : this.getProcname().hashCode());
		result = 37 * result
				+ (getProcdesc() == null ? 0 : this.getProcdesc().hashCode());
		result = 37 * result
				+ (getStarttime() == null ? 0 : this.getStarttime().hashCode());
		result = 37 * result
				+ (getExecfreq() == null ? 0 : this.getExecfreq().hashCode());
		result = 37 * result
				+ (getIsused() == null ? 0 : this.getIsused().hashCode());
		return result;
	}

}