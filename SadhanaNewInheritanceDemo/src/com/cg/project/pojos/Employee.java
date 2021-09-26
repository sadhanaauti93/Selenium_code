package com.cg.project.pojos;

public abstract class Employee extends Person{
	String basicsalary;
	public String TotalSalary;
	public Employee() {
		super();
	}
	
public Employee(int id, String firstName, String lastName, String emailId, String basicsalary) {
	super(id, firstName, lastName, emailId);
	this.basicsalary = basicsalary;
		}
public String getBasicsalary() {
	return basicsalary;
}
public void setBasicsalary(String basicsalary) {
	this.basicsalary = basicsalary;
	
}public String getTotalSalary() {
	return TotalSalary;
}

public void setTotalSalary(String totalSalary) {
	TotalSalary = totalSalary;
}
public abstract void calculateSalary();
@Override
public String toString() {
	return super.toString()+ "Employee [basicsalary=" + basicsalary + ", TotalSalary=" + TotalSalary + "]";
}


//public int gethra() {
//	return hra;
//}
//
//public int getta() {
//	return ta;
//}
//
//public int getda() {
//	return da;
//}
}
