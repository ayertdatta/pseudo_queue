package com.microservice.service.models;

public class RequestObj {
	
	private String accNo;
	private String type;
	private String ammount;
	private String currency;
	private String accForm;
	public String getAccNo() {
		return accNo;
	}
	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getAmmount() {
		return ammount;
	}
	public void setAmmount(String ammount) {
		this.ammount = ammount;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getAccForm() {
		return accForm;
	}
	public void setAccForm(String accForm) {
		this.accForm = accForm;
	}

}
