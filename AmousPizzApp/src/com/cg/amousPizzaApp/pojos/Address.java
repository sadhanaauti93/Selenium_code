package com.cg.amousPizzaApp.pojos;

public class Address {
	String addressLine1 , addressLine2 , city,state,pincode;

	public Address(String addressLine1, String addressLine2, String city, String state, String pincode) {
		super();
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
	}

	public Address() {
		// TODO Auto-generated constructor stub
	}

	public Address(String string, String string2, String string3, String string4, String string5, int i) {
		// TODO Auto-generated constructor stub
	}

	public Address(String string, String string2, int i) {
		// TODO Auto-generated constructor stub
	}

	public Address(String string, String string2, String string3) {
		// TODO Auto-generated constructor stub
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
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

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	

}
