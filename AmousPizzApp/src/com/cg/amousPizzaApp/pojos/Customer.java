package com.cg.amousPizzaApp.pojos;

public class Customer {
	String firstName,lastName,dateOfBirth,mobileNo,email;

	public Customer(String firstName, String lastName, String dateOfBirth, String mobileNo, String email) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.mobileNo = mobileNo;
		this.email = email;
	}

	public Customer() {
	}

	public Customer(String firstName2, String lastName2, String dateOfBirth2, int i, String email2) {
	}

	public Customer(String string, int i, String string2) {
	}

	public Customer(String string, String string2) {
	}

	public Customer(String string, String string2, int i) {
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
