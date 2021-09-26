package com.cg.banking.pojos;

public class Nominee {
	int Age,MobileNo,Adharcard;
	String FirstName,LastName, DateOfBirth, Pancard;
	public Nominee(int age, int mobileNo, int adharcard, String firstName, String lastName, String dateOfBirth,
			String pancard) {
		super();
		Age = age;
		MobileNo = mobileNo;
		Adharcard = adharcard;
		FirstName = firstName;
		LastName = lastName;
		DateOfBirth = dateOfBirth;
		Pancard = pancard;
	}
	public Nominee() {
		// TODO Auto-generated constructor stub
	}
	public Nominee(int i, int j, int k, String string, String string2, String string3) {
		// TODO Auto-generated constructor stub
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public int getMobileNo() {
		return MobileNo;
	}
	public void setMobileNo(int mobileNo) {
		MobileNo = mobileNo;
	}
	public int getAdharcard() {
		return Adharcard;
	}
	public void setAdharcard(int adharcard) {
		Adharcard = adharcard;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getDateOfBirth() {
		return DateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		DateOfBirth = dateOfBirth;
	}
	public String getPancard() {
		return Pancard;
	}
	public void setPancard(String pancard) {
		Pancard = pancard;
	}
	
	
}
