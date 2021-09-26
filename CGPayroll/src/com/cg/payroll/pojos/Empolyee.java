package com.cg.payroll.pojos;

public class Empolyee {
	
	public static int COUNTER=100;
	
	private static int id;

	private int noOfLeaveTaken;
	private static String firstname;

	private String lastname;

	private String dateofJoining;

	private static String DateofBirth;

	private static String desgination;

	private static String pfno;

	private String pancard;

	private String grad;
	
	
	public Empolyee() {
		
	}
	public Empolyee(int id, String FirstName, String LastName, String DateOfJoining, String DateOfBirth,		//Stack Memory
			String Desgination, String PFno, String Pancard, String Grad) {				//Local to the costructors
		this.id = id;
		this.firstname = FirstName;
		this.lastname = LastName;
		this.dateofJoining = DateOfJoining;
		DateofBirth = DateOfBirth;
		this.desgination = Desgination;				//Heap Memory
		this.pfno = PFno;
		this.pancard = Pancard;
		this.grad = Grad;
	}
	public Empolyee(int i, int j, String string, String string2, String string3, String string4, String string5,
			String string6, String string7, String string8) {
		// TODO Auto-generated constructor stub
	}
	public static int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getNoOfLeaveTaken() {
		return noOfLeaveTaken;
	}
	public void setNoOfLeaveTaken(int noOfLeaveTaken) {
		this.noOfLeaveTaken = noOfLeaveTaken;
	}
	public static String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getDateofJoining() {
		return dateofJoining;
	}
	public void setDateofJoining(String dateofJoining) {
		this.dateofJoining = dateofJoining;
	}
	public static String getDateofBirth() {
		return DateofBirth;
	}
	public void setDateofBirth(String dateofBirth) {
		DateofBirth = dateofBirth;
	}
	public static String getDesgination() {
		return desgination;
	}
	public void setDesgination(String desgination) {
		this.desgination = desgination;
	}
	public static String getPfno() {
		return pfno;
	}
	public void setPfno(String pfno) {
		this.pfno = pfno;
	}
	public String getPancard() {
		return pancard;
	}
	public void setPancard(String pancard) {
		this.pancard = pancard;
	}
	public String getGrad() {
		return grad;
	}
	public void setGrad(String grad) {
		this.grad = grad;
	}
}