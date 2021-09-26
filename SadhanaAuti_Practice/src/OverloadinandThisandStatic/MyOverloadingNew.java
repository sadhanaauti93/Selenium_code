package OverloadinandThisandStatic;

public class MyOverloadingNew {
	
	public void addPassenger2(int i) {
		System.out.println(i);      //Passenger = 1;
		//if(hasSeating())
			//Passenger +=1;
	}
	public void hasSeating(int b , int s) {
		System.out.println("Arguments: " + b + " ans " + s);
	}
	
	public void add1Passenger(int c) {
		System.out.println("Arguments: " + c );
		//add1Passenger();
		//int TotalCheckBags = bags;
	}
	
	public static void main(String[] args) {
		MyOverloadingNew obj = new MyOverloadingNew();
		obj.addPassenger2(1);
		obj.add1Passenger(12);
		obj.hasSeating(12,26);
		
	
	}
}
