package com.cg.project.collections;
import java.util.ArrayList;
import java.util.LinkedList;

import com.cg.project.pojos.Employee;
public class ListClassDemo {
	public static void listClassWork() {
		
		/*
		ArrayList<String> strList = new ArrayList<>();
		
		// insertion
		strList.add("Satish");
		strList.add("Kumar");
		strList.add("Satish");
		strList.add("Nilesh");
		strList.add("Rakesh");
		strList.add("Rajesh");
		strList.add("Amol");
		strList.add("Jay");
			
		//search
		String nameToBeSearch ="Rajesh";
		System.out.println(strList.contains(nameToBeSearch));      // ------>  equals()  --->   String.class
		
		// index 
		System.out.println(strList.indexOf(nameToBeSearch));    //  ------->  equals()  -----> String.class
		
		//Removal 
		System.out.println(strList.remove(nameToBeSearch));   //  ------->   equals()   -----> String.class 
		
		// iteration
		for (String name : strList) 
			System.out.println(name);
		*/
		
	/*	ArrayList<Integer> intList = new ArrayList<>();
		
		//Insertion
		intList.add(new Integer(100)) ;    //----> before jdk 1.4
		intList.add(342);
		intList.add(342);
		intList.add(342);
		intList.add(543);
		intList.add(633);
		intList.add(234);
		intList.add(432);
		intList.add(342);
	
		//Search
		System.out.println(intList.contains(543));   // -----> equals()   ---> Integer.class
		
		//index
		System.out.println(intList.indexOf(new Integer(543)));  // ----> equals()  ---- >  Integer.class
	
		//removal
		System.out.println(intList.remove(new Integer(543)));   // ----> equals()  ---->  Integer.class          
		
		//iteration
		for (Integer num : intList) {
			System.out.println(num);
		}
	*/
		
		ArrayList<Employee> employeeList = new ArrayList<>();
		
		//Insertion
		employeeList.add(new Employee(103, "Satish", "Mahajan"));
		employeeList.add(new Employee(102, "Kmar", "Rao"));
		employeeList.add(new Employee(101, "Jay", "Mahajan"));
		employeeList.add(new Employee(102, "Nilesh", "Rao"));
			
		//search
		Employee employeeToBeSearch = new Employee(101, "Jay", "Mahajan");
		System.out.println(employeeList.contains(employeeToBeSearch));   // ----> equals()   ----> Employee.class
		
		//index
		System.out.println(employeeList.indexOf(employeeToBeSearch));   //  -----> equals()  ----> Employee.class
		
		//remove
		System.out.println(employeeList.remove(employeeToBeSearch));   //  -----> equals()  ---->Employee.class
		
		//iteration
		for (Employee employee : employeeList) {
			System.out.println(employee);
		}
	
	}
	
public static void linkedListClassWork() {
	
		LinkedList<Employee> employeeList = new LinkedList<>();
		
		//Insertion
		employeeList.add(new Employee(103, "Satish", "Mahajan"));
		employeeList.add(new Employee(102, "Kmar", "Rao"));
		employeeList.add(new Employee(101, "Jay", "Mahajan"));
		employeeList.add(new Employee(102, "Nilesh", "Rao"));
			
		//search
		Employee employeeToBeSearch = new Employee(101, "Jay", "Mahajan");
		System.out.println(employeeList.contains(employeeToBeSearch));   // ----> equals()   ----> Employee.class
		
		//index
		System.out.println(employeeList.indexOf(employeeToBeSearch));   //  -----> equals()  ----> Employee.class
		
		//remove
		System.out.println(employeeList.remove(employeeToBeSearch));   //  -----> equals()  ---->Employee.class
		
		//iteration
		for (Employee employee : employeeList) {
			System.out.println(employee);
		}
	
	}

	public static void main(String[] args) {
		ListClassDemo obj = new ListClassDemo();
		//obj.listclasswork();
		//obj.listclassrange();
		//obj.Employee();
	}
}

