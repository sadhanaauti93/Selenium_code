package com.cg.project.collections;

import java.util.HashSet;
import com.cg.project.pojos.Employee;

public class SetClassDemo {
public static void hashSetClassWork() {
			HashSet<Employee> employeeSet= new HashSet<>();	
			//insertion
			employeeSet.add(new Employee(102, "Satish", "Mahajan"));
			employeeSet.add(new Employee(103, "Kumar", "Rao"));
			employeeSet.add(new Employee(101, "Nilesh", "Rao"));
			employeeSet.add(new Employee(104, "Rakesh", "Rao"));
			employeeSet.add(new Employee(104, "Rakesh", "Rao"));
			
			//search
			Employee employeeToBeSearch = new Employee(101, "Nilesh", "Rao");
			System.out.println(employeeSet.contains(employeeToBeSearch));
			
			//remove
			System.out.println(employeeSet.remove(employeeToBeSearch));
			
			//iteration
			
			for (Employee employee : employeeSet) {
				System.out.println(employee);
			}
		}
	}


