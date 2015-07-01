package com.entity;

/**
 * TSysProcessFile entity. @author MyEclipse Persistence Tools
 */

public class TSysProcessFile implements java.io.Serializable {

	// Fields

	private TSysProcessFileId id;

	// Constructors

	/** default constructor */
	public TSysProcessFile() {
	}

	/** full constructor */
	public TSysProcessFile(TSysProcessFileId id) {
		this.id = id;
	}

	// Property accessors

	public TSysProcessFileId getId() {
		return this.id;
	}

	public void setId(TSysProcessFileId id) {
		this.id = id;
	}

}