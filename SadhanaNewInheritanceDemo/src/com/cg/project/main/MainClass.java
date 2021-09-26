package com.cg.project.main;

import com.cg.project.pojos.ContractEmployee;
import com.cg.project.pojos.Employee;
import com.cg.project.pojos.PEmployee;
import com.cg.project.pojos.Person;

public class MainClass {

	public static void main(String[] args) {
		
		//Employee employee;
		
		Person Person = new Person(101,"Sadhana","Auti","sadhanaauti93@gmail.com");
		Employee employee;
		System.out.println(Person.getFirstName()+ " "+Person.getLastName());			//+" "+Person.getBasicsalary()+" "+Person.getTotalSalary());

		
		employee = new PEmployee(102,"Sadhana","Auti","sadhanaauti93@gmail.com", 20000);
		employee.calculateSalary();
		System.out.println(employee.getFirstName()+ " "+employee.getLastName()+" "+employee.getBasicsalary()+" "+employee.getTotalSalary());
		
		ContractEmployee emp = new ContractEmployee();				
		emp.CalculateSalary();
		System.out.println(employee.getFirstName()+ " "+employee.getLastName()+" "+employee.getBasicsalary()+" "+employee.getTotalSalary());

		//System.out.println(emp.getta()+" "+emp.gethra()+" "+emp.getda());		//+" "+emp.getTotalSalary()
		ContractEmployee Ce = new ContractEmployee();

		ContractEmployee Ce2 = new ContractEmployee(3000,120);
		System.out.println(Ce2.CalculateSalary());    //360000
	
}
	

} 	
