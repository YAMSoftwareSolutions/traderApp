package net.traders.orm;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Table(name="traderOrm")
@Entity
public class TraderOrm {
	//
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="trader_id",unique=true,nullable=false)
	private int id;
	
	private String name;
	private String address;
	private String phoneNumber;
	private String invoiceNumber;
	private String vehicleNumber;
	private String partyTINNo;
	private Double TotalAmount;
	private Double tax;
	private Double total;
	@OneToMany(fetch=FetchType.LAZY,mappedBy="traderOrm",cascade={CascadeType.ALL},targetEntity=MeterialDescriptionOrm.class)
	private Collection<MeterialDescriptionOrm> objMeterialDescriptionOrms=new ArrayList<MeterialDescriptionOrm>();

	//
	public String getName() {
		return name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getInvoiceNumber() {
		return invoiceNumber;
	}
	public void setInvoiceNumber(String invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}
	public String getVehicleNumber() {
		return vehicleNumber;
	}
	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}
	public String getPartyTINNo() {
		return partyTINNo;
	}
	public void setPartyTINNo(String partyTINNo) {
		this.partyTINNo = partyTINNo;
	}
	public Double getTotalAmount() {
		return TotalAmount;
	}
	public void setTotalAmount(Double totalAmount) {
		TotalAmount = totalAmount;
	}
	public Double getTax() {
		return tax;
	}
	public void setTax(Double tax) {
		this.tax = tax;
	}
	public Double getTotal() {
		return total;
	}
	public void setTotal(Double total) {
		this.total = total;
	}
	public Collection<MeterialDescriptionOrm> getObjMeterialDescriptionOrms() {
		return objMeterialDescriptionOrms;
	}
	public void setObjMeterialDescriptionOrms(
			Collection<MeterialDescriptionOrm> objMeterialDescriptionOrms) {
		this.objMeterialDescriptionOrms = objMeterialDescriptionOrms;
	}
}
