package com.entity;

import java.sql.Timestamp;

/**
 * TSysProcessFileId entity. @author MyEclipse Persistence Tools
 */

public class TSysProcessFileId implements java.io.Serializable {

	// Fields

	private Long fileid;
	private String filename;
	private String newfilename;
	private Timestamp createtime;

	// Constructors

	/** default constructor */
	public TSysProcessFileId() {
	}

	/** minimal constructor */
	public TSysProcessFileId(Long fileid) {
		this.fileid = fileid;
	}

	/** full constructor */
	public TSysProcessFileId(Long fileid, String filename, String newfilename,
			Timestamp createtime) {
		this.fileid = fileid;
		this.filename = filename;
		this.newfilename = newfilename;
		this.createtime = createtime;
	}

	// Property accessors

	public Long getFileid() {
		return this.fileid;
	}

	public void setFileid(Long fileid) {
		this.fileid = fileid;
	}

	public String getFilename() {
		return this.filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public String getNewfilename() {
		return this.newfilename;
	}

	public void setNewfilename(String newfilename) {
		this.newfilename = newfilename;
	}

	public Timestamp getCreatetime() {
		return this.createtime;
	}

	public void setCreatetime(Timestamp createtime) {
		this.createtime = createtime;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TSysProcessFileId))
			return false;
		TSysProcessFileId castOther = (TSysProcessFileId) other;

		return ((this.getFileid() == castOther.getFileid()) || (this
				.getFileid() != null && castOther.getFileid() != null && this
				.getFileid().equals(castOther.getFileid())))
				&& ((this.getFilename() == castOther.getFilename()) || (this
						.getFilename() != null
						&& castOther.getFilename() != null && this
						.getFilename().equals(castOther.getFilename())))
				&& ((this.getNewfilename() == castOther.getNewfilename()) || (this
						.getNewfilename() != null
						&& castOther.getNewfilename() != null && this
						.getNewfilename().equals(castOther.getNewfilename())))
				&& ((this.getCreatetime() == castOther.getCreatetime()) || (this
						.getCreatetime() != null
						&& castOther.getCreatetime() != null && this
						.getCreatetime().equals(castOther.getCreatetime())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getFileid() == null ? 0 : this.getFileid().hashCode());
		result = 37 * result
				+ (getFilename() == null ? 0 : this.getFilename().hashCode());
		result = 37
				* result
				+ (getNewfilename() == null ? 0 : this.getNewfilename()
						.hashCode());
		result = 37
				* result
				+ (getCreatetime() == null ? 0 : this.getCreatetime()
						.hashCode());
		return result;
	}

}