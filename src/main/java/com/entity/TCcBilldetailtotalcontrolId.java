package com.entity;

/**
 * TCcBilldetailtotalcontrolId entity. @author MyEclipse Persistence Tools
 */

public class TCcBilldetailtotalcontrolId implements java.io.Serializable {

	// Fields

	private Long id;
	private Long billdetaildataid;
	private Long totalcontrolid;
	private String state;
	private Double monthfact;
	private Double monthbudget;
	private Double quarterfact;
	private Double quarterbudget;
	private Double accumulativefact;
	private Double accumulativebudget;
	private Double yearfact;
	private Double yearbudget;
	private String totalcontrolname;

	// Constructors

	/** default constructor */
	public TCcBilldetailtotalcontrolId() {
	}

	/** full constructor */
	public TCcBilldetailtotalcontrolId(Long id, Long billdetaildataid,
			Long totalcontrolid, String state, Double monthfact,
			Double monthbudget, Double quarterfact, Double quarterbudget,
			Double accumulativefact, Double accumulativebudget,
			Double yearfact, Double yearbudget, String totalcontrolname) {
		this.id = id;
		this.billdetaildataid = billdetaildataid;
		this.totalcontrolid = totalcontrolid;
		this.state = state;
		this.monthfact = monthfact;
		this.monthbudget = monthbudget;
		this.quarterfact = quarterfact;
		this.quarterbudget = quarterbudget;
		this.accumulativefact = accumulativefact;
		this.accumulativebudget = accumulativebudget;
		this.yearfact = yearfact;
		this.yearbudget = yearbudget;
		this.totalcontrolname = totalcontrolname;
	}

	// Property accessors

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getBilldetaildataid() {
		return this.billdetaildataid;
	}

	public void setBilldetaildataid(Long billdetaildataid) {
		this.billdetaildataid = billdetaildataid;
	}

	public Long getTotalcontrolid() {
		return this.totalcontrolid;
	}

	public void setTotalcontrolid(Long totalcontrolid) {
		this.totalcontrolid = totalcontrolid;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Double getMonthfact() {
		return this.monthfact;
	}

	public void setMonthfact(Double monthfact) {
		this.monthfact = monthfact;
	}

	public Double getMonthbudget() {
		return this.monthbudget;
	}

	public void setMonthbudget(Double monthbudget) {
		this.monthbudget = monthbudget;
	}

	public Double getQuarterfact() {
		return this.quarterfact;
	}

	public void setQuarterfact(Double quarterfact) {
		this.quarterfact = quarterfact;
	}

	public Double getQuarterbudget() {
		return this.quarterbudget;
	}

	public void setQuarterbudget(Double quarterbudget) {
		this.quarterbudget = quarterbudget;
	}

	public Double getAccumulativefact() {
		return this.accumulativefact;
	}

	public void setAccumulativefact(Double accumulativefact) {
		this.accumulativefact = accumulativefact;
	}

	public Double getAccumulativebudget() {
		return this.accumulativebudget;
	}

	public void setAccumulativebudget(Double accumulativebudget) {
		this.accumulativebudget = accumulativebudget;
	}

	public Double getYearfact() {
		return this.yearfact;
	}

	public void setYearfact(Double yearfact) {
		this.yearfact = yearfact;
	}

	public Double getYearbudget() {
		return this.yearbudget;
	}

	public void setYearbudget(Double yearbudget) {
		this.yearbudget = yearbudget;
	}

	public String getTotalcontrolname() {
		return this.totalcontrolname;
	}

	public void setTotalcontrolname(String totalcontrolname) {
		this.totalcontrolname = totalcontrolname;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TCcBilldetailtotalcontrolId))
			return false;
		TCcBilldetailtotalcontrolId castOther = (TCcBilldetailtotalcontrolId) other;

		return ((this.getId() == castOther.getId()) || (this.getId() != null
				&& castOther.getId() != null && this.getId().equals(
				castOther.getId())))
				&& ((this.getBilldetaildataid() == castOther
						.getBilldetaildataid()) || (this.getBilldetaildataid() != null
						&& castOther.getBilldetaildataid() != null && this
						.getBilldetaildataid().equals(
								castOther.getBilldetaildataid())))
				&& ((this.getTotalcontrolid() == castOther.getTotalcontrolid()) || (this
						.getTotalcontrolid() != null
						&& castOther.getTotalcontrolid() != null && this
						.getTotalcontrolid().equals(
								castOther.getTotalcontrolid())))
				&& ((this.getState() == castOther.getState()) || (this
						.getState() != null && castOther.getState() != null && this
						.getState().equals(castOther.getState())))
				&& ((this.getMonthfact() == castOther.getMonthfact()) || (this
						.getMonthfact() != null
						&& castOther.getMonthfact() != null && this
						.getMonthfact().equals(castOther.getMonthfact())))
				&& ((this.getMonthbudget() == castOther.getMonthbudget()) || (this
						.getMonthbudget() != null
						&& castOther.getMonthbudget() != null && this
						.getMonthbudget().equals(castOther.getMonthbudget())))
				&& ((this.getQuarterfact() == castOther.getQuarterfact()) || (this
						.getQuarterfact() != null
						&& castOther.getQuarterfact() != null && this
						.getQuarterfact().equals(castOther.getQuarterfact())))
				&& ((this.getQuarterbudget() == castOther.getQuarterbudget()) || (this
						.getQuarterbudget() != null
						&& castOther.getQuarterbudget() != null && this
						.getQuarterbudget()
						.equals(castOther.getQuarterbudget())))
				&& ((this.getAccumulativefact() == castOther
						.getAccumulativefact()) || (this.getAccumulativefact() != null
						&& castOther.getAccumulativefact() != null && this
						.getAccumulativefact().equals(
								castOther.getAccumulativefact())))
				&& ((this.getAccumulativebudget() == castOther
						.getAccumulativebudget()) || (this
						.getAccumulativebudget() != null
						&& castOther.getAccumulativebudget() != null && this
						.getAccumulativebudget().equals(
								castOther.getAccumulativebudget())))
				&& ((this.getYearfact() == castOther.getYearfact()) || (this
						.getYearfact() != null
						&& castOther.getYearfact() != null && this
						.getYearfact().equals(castOther.getYearfact())))
				&& ((this.getYearbudget() == castOther.getYearbudget()) || (this
						.getYearbudget() != null
						&& castOther.getYearbudget() != null && this
						.getYearbudget().equals(castOther.getYearbudget())))
				&& ((this.getTotalcontrolname() == castOther
						.getTotalcontrolname()) || (this.getTotalcontrolname() != null
						&& castOther.getTotalcontrolname() != null && this
						.getTotalcontrolname().equals(
								castOther.getTotalcontrolname())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getId() == null ? 0 : this.getId().hashCode());
		result = 37
				* result
				+ (getBilldetaildataid() == null ? 0 : this
						.getBilldetaildataid().hashCode());
		result = 37
				* result
				+ (getTotalcontrolid() == null ? 0 : this.getTotalcontrolid()
						.hashCode());
		result = 37 * result
				+ (getState() == null ? 0 : this.getState().hashCode());
		result = 37 * result
				+ (getMonthfact() == null ? 0 : this.getMonthfact().hashCode());
		result = 37
				* result
				+ (getMonthbudget() == null ? 0 : this.getMonthbudget()
						.hashCode());
		result = 37
				* result
				+ (getQuarterfact() == null ? 0 : this.getQuarterfact()
						.hashCode());
		result = 37
				* result
				+ (getQuarterbudget() == null ? 0 : this.getQuarterbudget()
						.hashCode());
		result = 37
				* result
				+ (getAccumulativefact() == null ? 0 : this
						.getAccumulativefact().hashCode());
		result = 37
				* result
				+ (getAccumulativebudget() == null ? 0 : this
						.getAccumulativebudget().hashCode());
		result = 37 * result
				+ (getYearfact() == null ? 0 : this.getYearfact().hashCode());
		result = 37
				* result
				+ (getYearbudget() == null ? 0 : this.getYearbudget()
						.hashCode());
		result = 37
				* result
				+ (getTotalcontrolname() == null ? 0 : this
						.getTotalcontrolname().hashCode());
		return result;
	}

}