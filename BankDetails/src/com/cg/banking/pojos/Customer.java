package com.cg.banking.pojos;

public class Customer {
	int mobileNo,age;
	String No;
	String FirstName,LastName,DateOfBirth,Pancard,Email,Gender,Occupation;
	public Customer(int mobileNo, int age, int no, String firstName, String lastName, String dateOfBirth,
			String pancard, String email, String gender, String occupation) {
		super();
		this.mobileNo = mobileNo;
		this.age = age;
		No = No;
		FirstName = firstName;
		LastName = lastName;
		DateOfBirth = dateOfBirth;
		Pancard = pancard;
		Email = email;
		Gender = gender;
		Occupation = occupation;
	}
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	public int getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(int mobileNo) {
		this.mobileNo = mobileNo;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getNo() {
		return No;
	}
	public void setNo(String no) {
		No = no;
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
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public String getOccupation() {
		return Occupation;
	}
	public void setOccupation(String occupation) {
		Occupation = occupation;
	}
	 


}
