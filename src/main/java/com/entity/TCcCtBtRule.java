package com.entity;

/**
 * TCcCtBtRule entity. @author MyEclipse Persistence Tools
 */

public class TCcCtBtRule implements java.io.Serializable {

	// Fields

	private Long id;
	private Long billTemplateId;
	private String name;
	private String type;
	private String dataSource;
	private String componentType;
	private String summaryflag;

	// Constructors

	/** default constructor */
	public TCcCtBtRule() {
	}

	/** minimal constructor */
	public TCcCtBtRule(Long id, Long billTemplateId, String name, String type,
			String dataSource) {
		this.id = id;
		this.billTemplateId = billTemplateId;
		this.name = name;
		this.type = type;
		this.dataSource = dataSource;
	}

	/** full constructor */
	public TCcCtBtRule(Long id, Long billTemplateId, String name, String type,
			String dataSource, String componentType, String summaryflag) {
		this.id = id;
		this.billTemplateId = billTemplateId;
		this.name = name;
		this.type = type;
		this.dataSource = dataSource;
		this.componentType = componentType;
		this.summaryflag = summaryflag;
	}

	// Property accessors

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getBillTemplateId() {
		return this.billTemplateId;
	}

	public void setBillTemplateId(Long billTemplateId) {
		this.billTemplateId = billTemplateId;
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

	public String getDataSource() {
		return this.dataSource;
	}

	public void setDataSource(String dataSource) {
		this.dataSource = dataSource;
	}

	public String getComponentType() {
		return this.componentType;
	}

	public void setComponentType(String componentType) {
		this.componentType = componentType;
	}

	public String getSummaryflag() {
		return this.summaryflag;
	}

	public void setSummaryflag(String summaryflag) {
		this.summaryflag = summaryflag;
	}

}