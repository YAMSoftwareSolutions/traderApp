package net.traders.to;

public class MeterialDescriptionTO {
	//
	private String meterialDescription;
	private String quantity;
	private String unit;
	private Double amount;
	//
	public String getMeterialDescription() {
		return meterialDescription;
	}
	public void setMeterialDescription(String meterialDescription) {
		this.meterialDescription = meterialDescription;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
}
