package com.cg.pyroll.main;
import com.cg.payroll.pojos.BankDetails;
import com.cg.payroll.pojos.Empolyee;
import com.cg.payroll.pojos.Salary;
public class PayrollMainClass {
	public static void main(String[] args) {
		int num = 367;				//4byte Memory
		
		Empolyee EmpRef = new Empolyee();			//Default Constructor
		Empolyee EmpRef1 = new Empolyee(18, "Sadhana", "Ghadge", "09/05/2021", "01/11/1993", "Sr.Software engineer","PF/IN/304","BRWPA5268G","a");
		Empolyee EmpRef2 = new Empolyee();            
		System.out.println(EmpRef.getFirstname()+" "+EmpRef.getFirstname());
		System.out.println(EmpRef1.getFirstname()+" "+EmpRef1.getFirstname());
		System.out.println(EmpRef2.getFirstname()+" "+EmpRef2.getFirstname());
		//EmpRef1.setFirstname("Sadhana");
		//EmpRef2.setLastname("Ghadge");
		
		Salary S = new Salary();			//Default Constructor
		Salary S1 = new Salary(33005, 62233, 555365, 65666, 300, 77766, 92999);
		Salary S2 = new Salary(66613, 12223, 232344, 23464, 200, 23573, 95783);
		System.out.println(S1.getBasicSalary()+" "+S1.getBasicSalary());
		System.out.println(S2.getMonthlyTax()+" "+S2.getMonthlyTax());
		//S1.setBasicSalary(33355);
		//S2.setMonthlyTax(500);
		

		BankDetails Bd = new BankDetails();			//Default Constructor
		BankDetails Bd1 = new BankDetails(123256578,"CITI bank", "CITI0000005");
		BankDetails Bd2 = new BankDetails(375984759, "SBI bank", "SBIN0001399");
		System.out.println(Bd1.getIfsCode()+" "+Bd1.getIfsCode());
		System.out.println(Bd2.getIfsCode()+" "+Bd1.getIfsCode());
		//Bd1.setIfsCode("CITI0000005");
		//Bd2.setIfsCode("SBIN0001399");

		
	}
}