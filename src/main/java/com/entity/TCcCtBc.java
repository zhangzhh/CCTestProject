package com.entity;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * TCcCtBc entity. @author MyEclipse Persistence Tools
 */

public class TCcCtBc implements java.io.Serializable {

	// Fields

	private Long id;
	private Long billmaindataid;
	private Long billTemplateId;
	private BigDecimal orderNum;
	private Timestamp createDate;
	private Long creator;
	private String status;
	private String debitAmontField;
	private String creditAmontField;
	private String field11Name;
	private String field12Name;
	private String field13Name;
	private String field14Name;
	private String field15Name;
	private String field16Name;
	private String field17Name;
	private String field18Name;
	private String field19Name;
	private String field20Name;
	private String field11Value;
	private String field12Value;
	private String field13Value;
	private String field14Value;
	private String field15Value;
	private String field16Value;
	private String field17Value;
	private String field18Value;
	private String field19Value;
	private String field20Value;
	private String field1Name;
	private String field2Name;
	private String field3Name;
	private String field4Name;
	private String field5Name;
	private String field6Name;
	private String field7Name;
	private String field8Name;
	private String field9Name;
	private String field10Name;
	private String field1Value;
	private String field2Value;
	private String field3Value;
	private String field4Value;
	private String field5Value;
	private String field6Value;
	private String field7Value;
	private String field8Value;
	private String field9Value;
	private String field10Value;
	private Timestamp effectiveDate;
	private String certNo;
	private Timestamp certTime;
	private String certIp;

	// Constructors

	/** default constructor */
	public TCcCtBc() {
	}

	/** minimal constructor */
	public TCcCtBc(Long id, Long billmaindataid, Long billTemplateId,
			BigDecimal orderNum, Timestamp createDate, Long creator) {
		this.id = id;
		this.billmaindataid = billmaindataid;
		this.billTemplateId = billTemplateId;
		this.orderNum = orderNum;
		this.createDate = createDate;
		this.creator = creator;
	}

	/** full constructor */
	public TCcCtBc(Long id, Long billmaindataid, Long billTemplateId,
			BigDecimal orderNum, Timestamp createDate, Long creator,
			String status, String debitAmontField, String creditAmontField,
			String field11Name, String field12Name, String field13Name,
			String field14Name, String field15Name, String field16Name,
			String field17Name, String field18Name, String field19Name,
			String field20Name, String field11Value, String field12Value,
			String field13Value, String field14Value, String field15Value,
			String field16Value, String field17Value, String field18Value,
			String field19Value, String field20Value, String field1Name,
			String field2Name, String field3Name, String field4Name,
			String field5Name, String field6Name, String field7Name,
			String field8Name, String field9Name, String field10Name,
			String field1Value, String field2Value, String field3Value,
			String field4Value, String field5Value, String field6Value,
			String field7Value, String field8Value, String field9Value,
			String field10Value, Timestamp effectiveDate, String certNo,
			Timestamp certTime, String certIp) {
		this.id = id;
		this.billmaindataid = billmaindataid;
		this.billTemplateId = billTemplateId;
		this.orderNum = orderNum;
		this.createDate = createDate;
		this.creator = creator;
		this.status = status;
		this.debitAmontField = debitAmontField;
		this.creditAmontField = creditAmontField;
		this.field11Name = field11Name;
		this.field12Name = field12Name;
		this.field13Name = field13Name;
		this.field14Name = field14Name;
		this.field15Name = field15Name;
		this.field16Name = field16Name;
		this.field17Name = field17Name;
		this.field18Name = field18Name;
		this.field19Name = field19Name;
		this.field20Name = field20Name;
		this.field11Value = field11Value;
		this.field12Value = field12Value;
		this.field13Value = field13Value;
		this.field14Value = field14Value;
		this.field15Value = field15Value;
		this.field16Value = field16Value;
		this.field17Value = field17Value;
		this.field18Value = field18Value;
		this.field19Value = field19Value;
		this.field20Value = field20Value;
		this.field1Name = field1Name;
		this.field2Name = field2Name;
		this.field3Name = field3Name;
		this.field4Name = field4Name;
		this.field5Name = field5Name;
		this.field6Name = field6Name;
		this.field7Name = field7Name;
		this.field8Name = field8Name;
		this.field9Name = field9Name;
		this.field10Name = field10Name;
		this.field1Value = field1Value;
		this.field2Value = field2Value;
		this.field3Value = field3Value;
		this.field4Value = field4Value;
		this.field5Value = field5Value;
		this.field6Value = field6Value;
		this.field7Value = field7Value;
		this.field8Value = field8Value;
		this.field9Value = field9Value;
		this.field10Value = field10Value;
		this.effectiveDate = effectiveDate;
		this.certNo = certNo;
		this.certTime = certTime;
		this.certIp = certIp;
	}

	// Property accessors

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getBillmaindataid() {
		return this.billmaindataid;
	}

	public void setBillmaindataid(Long billmaindataid) {
		this.billmaindataid = billmaindataid;
	}

	public Long getBillTemplateId() {
		return this.billTemplateId;
	}

	public void setBillTemplateId(Long billTemplateId) {
		this.billTemplateId = billTemplateId;
	}

	public BigDecimal getOrderNum() {
		return this.orderNum;
	}

	public void setOrderNum(BigDecimal orderNum) {
		this.orderNum = orderNum;
	}

	public Timestamp getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Timestamp createDate) {
		this.createDate = createDate;
	}

	public Long getCreator() {
		return this.creator;
	}

	public void setCreator(Long creator) {
		this.creator = creator;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getDebitAmontField() {
		return this.debitAmontField;
	}

	public void setDebitAmontField(String debitAmontField) {
		this.debitAmontField = debitAmontField;
	}

	public String getCreditAmontField() {
		return this.creditAmontField;
	}

	public void setCreditAmontField(String creditAmontField) {
		this.creditAmontField = creditAmontField;
	}

	public String getField11Name() {
		return this.field11Name;
	}

	public void setField11Name(String field11Name) {
		this.field11Name = field11Name;
	}

	public String getField12Name() {
		return this.field12Name;
	}

	public void setField12Name(String field12Name) {
		this.field12Name = field12Name;
	}

	public String getField13Name() {
		return this.field13Name;
	}

	public void setField13Name(String field13Name) {
		this.field13Name = field13Name;
	}

	public String getField14Name() {
		return this.field14Name;
	}

	public void setField14Name(String field14Name) {
		this.field14Name = field14Name;
	}

	public String getField15Name() {
		return this.field15Name;
	}

	public void setField15Name(String field15Name) {
		this.field15Name = field15Name;
	}

	public String getField16Name() {
		return this.field16Name;
	}

	public void setField16Name(String field16Name) {
		this.field16Name = field16Name;
	}

	public String getField17Name() {
		return this.field17Name;
	}

	public void setField17Name(String field17Name) {
		this.field17Name = field17Name;
	}

	public String getField18Name() {
		return this.field18Name;
	}

	public void setField18Name(String field18Name) {
		this.field18Name = field18Name;
	}

	public String getField19Name() {
		return this.field19Name;
	}

	public void setField19Name(String field19Name) {
		this.field19Name = field19Name;
	}

	public String getField20Name() {
		return this.field20Name;
	}

	public void setField20Name(String field20Name) {
		this.field20Name = field20Name;
	}

	public String getField11Value() {
		return this.field11Value;
	}

	public void setField11Value(String field11Value) {
		this.field11Value = field11Value;
	}

	public String getField12Value() {
		return this.field12Value;
	}

	public void setField12Value(String field12Value) {
		this.field12Value = field12Value;
	}

	public String getField13Value() {
		return this.field13Value;
	}

	public void setField13Value(String field13Value) {
		this.field13Value = field13Value;
	}

	public String getField14Value() {
		return this.field14Value;
	}

	public void setField14Value(String field14Value) {
		this.field14Value = field14Value;
	}

	public String getField15Value() {
		return this.field15Value;
	}

	public void setField15Value(String field15Value) {
		this.field15Value = field15Value;
	}

	public String getField16Value() {
		return this.field16Value;
	}

	public void setField16Value(String field16Value) {
		this.field16Value = field16Value;
	}

	public String getField17Value() {
		return this.field17Value;
	}

	public void setField17Value(String field17Value) {
		this.field17Value = field17Value;
	}

	public String getField18Value() {
		return this.field18Value;
	}

	public void setField18Value(String field18Value) {
		this.field18Value = field18Value;
	}

	public String getField19Value() {
		return this.field19Value;
	}

	public void setField19Value(String field19Value) {
		this.field19Value = field19Value;
	}

	public String getField20Value() {
		return this.field20Value;
	}

	public void setField20Value(String field20Value) {
		this.field20Value = field20Value;
	}

	public String getField1Name() {
		return this.field1Name;
	}

	public void setField1Name(String field1Name) {
		this.field1Name = field1Name;
	}

	public String getField2Name() {
		return this.field2Name;
	}

	public void setField2Name(String field2Name) {
		this.field2Name = field2Name;
	}

	public String getField3Name() {
		return this.field3Name;
	}

	public void setField3Name(String field3Name) {
		this.field3Name = field3Name;
	}

	public String getField4Name() {
		return this.field4Name;
	}

	public void setField4Name(String field4Name) {
		this.field4Name = field4Name;
	}

	public String getField5Name() {
		return this.field5Name;
	}

	public void setField5Name(String field5Name) {
		this.field5Name = field5Name;
	}

	public String getField6Name() {
		return this.field6Name;
	}

	public void setField6Name(String field6Name) {
		this.field6Name = field6Name;
	}

	public String getField7Name() {
		return this.field7Name;
	}

	public void setField7Name(String field7Name) {
		this.field7Name = field7Name;
	}

	public String getField8Name() {
		return this.field8Name;
	}

	public void setField8Name(String field8Name) {
		this.field8Name = field8Name;
	}

	public String getField9Name() {
		return this.field9Name;
	}

	public void setField9Name(String field9Name) {
		this.field9Name = field9Name;
	}

	public String getField10Name() {
		return this.field10Name;
	}

	public void setField10Name(String field10Name) {
		this.field10Name = field10Name;
	}

	public String getField1Value() {
		return this.field1Value;
	}

	public void setField1Value(String field1Value) {
		this.field1Value = field1Value;
	}

	public String getField2Value() {
		return this.field2Value;
	}

	public void setField2Value(String field2Value) {
		this.field2Value = field2Value;
	}

	public String getField3Value() {
		return this.field3Value;
	}

	public void setField3Value(String field3Value) {
		this.field3Value = field3Value;
	}

	public String getField4Value() {
		return this.field4Value;
	}

	public void setField4Value(String field4Value) {
		this.field4Value = field4Value;
	}

	public String getField5Value() {
		return this.field5Value;
	}

	public void setField5Value(String field5Value) {
		this.field5Value = field5Value;
	}

	public String getField6Value() {
		return this.field6Value;
	}

	public void setField6Value(String field6Value) {
		this.field6Value = field6Value;
	}

	public String getField7Value() {
		return this.field7Value;
	}

	public void setField7Value(String field7Value) {
		this.field7Value = field7Value;
	}

	public String getField8Value() {
		return this.field8Value;
	}

	public void setField8Value(String field8Value) {
		this.field8Value = field8Value;
	}

	public String getField9Value() {
		return this.field9Value;
	}

	public void setField9Value(String field9Value) {
		this.field9Value = field9Value;
	}

	public String getField10Value() {
		return this.field10Value;
	}

	public void setField10Value(String field10Value) {
		this.field10Value = field10Value;
	}

	public Timestamp getEffectiveDate() {
		return this.effectiveDate;
	}

	public void setEffectiveDate(Timestamp effectiveDate) {
		this.effectiveDate = effectiveDate;
	}

	public String getCertNo() {
		return this.certNo;
	}

	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

	public Timestamp getCertTime() {
		return this.certTime;
	}

	public void setCertTime(Timestamp certTime) {
		this.certTime = certTime;
	}

	public String getCertIp() {
		return this.certIp;
	}

	public void setCertIp(String certIp) {
		this.certIp = certIp;
	}

}