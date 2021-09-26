package com.cg.banking.pojos;

public class Address {
	int pincode;
	String addresLine1,addresLine2,city,state,country;
	public Address(int pincode, String addresLine1, String addresLine2, String city, String state, String country) {
		super();
		this.pincode = pincode;
		this.addresLine1 = addresLine1;
		this.addresLine2 = addresLine2;
		this.city = city;
		this.state = state;
		this.country = country;
	}
	public Address() {
		// TODO Auto-generated constructor stub
	}
	public Address(int i, String string, String string2, String string3, String string4, String string5,
			String string6) {
		// TODO Auto-generated constructor stub
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getAddresLine1() {
		return addresLine1;
	}
	public void setAddresLine1(String addresLine1) {
		this.addresLine1 = addresLine1;
	}
	public String getAddresLine2() {
		return addresLine2;
	}
	public void setAddresLine2(String addresLine2) {
		this.addresLine2 = addresLine2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
}
