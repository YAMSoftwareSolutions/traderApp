package net.traders.to;

import java.util.ArrayList;
import java.util.Collection;

public class TraderTo {
	//
	private String name;
	private String address;
	private String phoneNumber;
	private String invoiceNumber;
	private String vehicleNumber;
	private String partyTINNo;
	private Double TotalAmount;
	private Double tax;
	private Double total;
	private Collection<MeterialDescriptionTO> objMeterialDescriptionTo=new ArrayList<MeterialDescriptionTO>();
	//
	public String getName() {
		return name;
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
	public Collection<MeterialDescriptionTO> getobjMeterialDescriptionTo() {
		return objMeterialDescriptionTo;
	}
	public void setobjMeterialDescriptionTo(
			Collection<MeterialDescriptionTO> objMeterialDescriptionTo) {
		this.objMeterialDescriptionTo = objMeterialDescriptionTo;
	}
}
