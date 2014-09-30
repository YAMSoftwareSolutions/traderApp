package net.traders.orm;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Table(name="meterialDescriptionOrm")
@Entity
public class MeterialDescriptionOrm {
	//
	@Id
	@GeneratedValue
	@Column(name="meterialDescriptionid")
	private int id;
	private String meterialDescription;
	private String quantity;
	private String unit;
	private Double amount;
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="trader_id",nullable=false)
	private TraderOrm traderOrm;
	//
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public TraderOrm getTraderOrm() {
		return traderOrm;
	}
	public String getMeterialDescription() {
		return meterialDescription;
	}
	public void setTraderOrm(TraderOrm traderOrm) {
		this.traderOrm = traderOrm;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
}
