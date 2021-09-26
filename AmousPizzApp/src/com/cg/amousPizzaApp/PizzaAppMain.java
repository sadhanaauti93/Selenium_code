package com.cg.amousPizzaApp;

import com.cg.amousPizzaApp.pojos.Address;
import com.cg.amousPizzaApp.pojos.Customer;
import com.cg.amousPizzaApp.pojos.Order;
import com.cg.amousPizzaApp.pojos.Pizza;

public class PizzaAppMain {
	public static void main(String[] args)
	{
		Customer C = new Customer();
		Customer C3 = new Customer("Sadhana","Auti" , 5);  //"01/11/1993",983417496,"sadhanaauti93@gmail.com"
		Customer C4 = new Customer("Sadhana","Auti");
		
		Customer[] C1 = new Customer[3];
		
		C1[0] = new Customer("Sadhana", "Auti", 5);
		C1[1] = new Customer("Rahul" , "Ghadge", 6);
		C1[2] = new Customer("Sai"," Jadhav", 7);
		
		for(int i = 0; i<3; i++) {
			if(C1[i].getLastName().equals("Sadhana"))
			{
				System.out.println(C1[i].getFirstName()+ " "+ C1[i].getLastName());
			}
			else 
			{
				System.out.println("Fake Name");
			}
		}
	}
}
		
		
//		int sum = 333;
//		
//		Customer C = new Customer();
//		Customer C3 = new Customer("01/11/1993",983417496,"sadhanaauti93@gmail.com");
//		Customer C4 = new Customer("Sadhana","Auti");
//		System.out.println(C3.getDateOfBirth()+" "+C3.getEmail());
//		System.out.println(C4.getFirstName()+" "+C4.getLastName());
//		//System.out.println(C4.getFirstName()+" "+C4.getFirstName());
//		
//		Order O = new Order(1020,580);
//		Order O1 = new Order(2,sum);
//		System.out.println(O.getAmount()+" "+O.getCode());
//		System.out.println(O1.getTimestamp()+" "+O1.getStatus());
//		
//		Address a = new Address();
//		Address a1 = new Address("Pune","Maharashtra",411028);
//		Address a2 = new Address("Satawadi","Sr.no13","ChaurangRencedenc");
//		System.out.println(a1.getCity()+" "+a1.getPincode());
//		System.out.println(a2.getAddressLine1()+" "+a2.getAddressLine2());
//
//		Pizza P = new Pizza(sum,499);
//		Pizza P1 = new Pizza(50,a1,2);
//		System.out.println(P.getSize()+" "+P.getPrice());
//		System.out.println(P1.getCategory()+" "+P1.getQuantity());

	

