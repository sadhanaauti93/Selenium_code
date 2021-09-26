package com.cg.project.pojos;

public class Person {
	private int Id;
	private static String FirstName;
	private String LastName;
	private String EmailId;
	
	public Person(int id, String firstName, String lastName, String emailId) {
		super();
		Id = id;
		FirstName = firstName;
		LastName = lastName;
		EmailId = emailId;
	}
	public Person() {
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
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
	public String getEmailId() {
		return EmailId;
	}
	public void setEmailId(String emailId) {
		EmailId = emailId;
	}
//	public String getTotalSalary() {
//		return null;
//	}
//	public String getBasicsalary() {
//		return null;
//	}
	@Override
	public String toString() {
		return super "Person [Id=" + Id + ", LastName=" + LastName + ", EmailId=" + EmailId + "]";
	}
	

}
