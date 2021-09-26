package com.cg.project.collections;
import java.util.HashMap;
import java.util.Set;
import com.cg.project.pojos.Employee;

	public class MapClassesDemo {
		public static void hashMapClassWork() {
			HashMap<Integer, Employee> employeeData = new HashMap<>();
			
			
			//insertion
			employeeData.put(102,new Employee(102, "Satish", "Mahajan"));    // ----->    put(key , value)
			employeeData.put(103,new Employee(103, "Rakesh", "Sharma"));  
			employeeData.put(101,new Employee(101, "Kumar", "Rao"));  
			employeeData.put(105,new Employee(105, "Sanjay", "Patil"));  
			employeeData.put(104,new Employee(104, "Jay", "Mahajan"));
			
			// search
			System.out.println(employeeData.get(10334));        // ---> get(key)  return value     
			System.out.println(employeeData.get(105));      
			
			System.out.println("============================");
			Set<Integer> keySet = employeeData.keySet();
			
			for (Integer key : keySet) {
				System.out.println(employeeData.get(key));
			}
		}
	}



