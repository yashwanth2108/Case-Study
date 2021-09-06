package com.IssueBill.IssueBill;

import java.util.Date;

import org.springframework.data.annotation.Id;

public class IssueBillDetails {
	
	
	@Id
	Long billingNo;
	Integer quantity;
	Double price;
	Double taxes;
	Date dateOfIssueBill;
	String services;
	Integer unit;
		
	public IssueBillDetails() {
		super();
	}

	public IssueBillDetails(Long billingNo, Integer quantity, Double price, Double taxes, Date dateOfIssueBill,
			String services, Integer unit) {
		super();
		this.billingNo = billingNo;
		this.quantity = quantity;
		this.price = price;
		this.taxes = taxes;
		this.dateOfIssueBill = dateOfIssueBill;
		this.services = services;
		this.unit = unit;
	}

	public Long getBillingNo() {
		return billingNo;
	}

	public void setBillingNo(Long billingNo) {
		this.billingNo = billingNo;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Double getTaxes() {
		return taxes;
	}

	public void setTaxes(Double taxes) {
		this.taxes = taxes;
	}

	public Date getDateOfIssueBill() {
		return dateOfIssueBill;
	}

	public void setDateOfIssueBill(Date dateOfIssueBill) {
		this.dateOfIssueBill = dateOfIssueBill;
	}

	public String getServices() {
		return services;
	}

	public void setServices(String services) {
		this.services = services;
	}

	public Integer getUnit() {
		return unit;
	}

	public void setUnit(Integer unit) {
		this.unit = unit;
	}

	@Override
	public String toString() {
		return "IssueBillDetails [billingNo=" + billingNo + ", quantity=" + quantity + ", price=" + price + ", taxes="
				+ taxes + ", dateOfIssueBill=" + dateOfIssueBill + ", services=" + services + ", unit=" + unit + "]";
	}
	


}
