package com.entity;

/**
 * TCcMobilemodelId entity. @author MyEclipse Persistence Tools
 */

public class TCcMobilemodelId implements java.io.Serializable {

	// Fields

	private Long modelid;
	private String modelname;
	private String modelflag;

	// Constructors

	/** default constructor */
	public TCcMobilemodelId() {
	}

	/** full constructor */
	public TCcMobilemodelId(Long modelid, String modelname, String modelflag) {
		this.modelid = modelid;
		this.modelname = modelname;
		this.modelflag = modelflag;
	}

	// Property accessors

	public Long getModelid() {
		return this.modelid;
	}

	public void setModelid(Long modelid) {
		this.modelid = modelid;
	}

	public String getModelname() {
		return this.modelname;
	}

	public void setModelname(String modelname) {
		this.modelname = modelname;
	}

	public String getModelflag() {
		return this.modelflag;
	}

	public void setModelflag(String modelflag) {
		this.modelflag = modelflag;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TCcMobilemodelId))
			return false;
		TCcMobilemodelId castOther = (TCcMobilemodelId) other;

		return ((this.getModelid() == castOther.getModelid()) || (this
				.getModelid() != null && castOther.getModelid() != null && this
				.getModelid().equals(castOther.getModelid())))
				&& ((this.getModelname() == castOther.getModelname()) || (this
						.getModelname() != null
						&& castOther.getModelname() != null && this
						.getModelname().equals(castOther.getModelname())))
				&& ((this.getModelflag() == castOther.getModelflag()) || (this
						.getModelflag() != null
						&& castOther.getModelflag() != null && this
						.getModelflag().equals(castOther.getModelflag())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getModelid() == null ? 0 : this.getModelid().hashCode());
		result = 37 * result
				+ (getModelname() == null ? 0 : this.getModelname().hashCode());
		result = 37 * result
				+ (getModelflag() == null ? 0 : this.getModelflag().hashCode());
		return result;
	}

}