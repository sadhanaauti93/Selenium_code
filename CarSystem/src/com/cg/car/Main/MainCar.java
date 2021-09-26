package com.cg.car.Main;

import java.util.ArrayList;

import com.cg.car.pojos.Cars;

public class MainCar {
	public static void main(String[] args) {
		Cars[] CarsList = new Cars[10];
		CarsList[0] = new Cars(1,100,"Swift", "Petrol");
		CarsList[1] = new Cars(2,102,"Alcazar","Petrol");
		CarsList[2] = new Cars(3,103,"Seltos", "desial");
		CarsList[3] = new Cars(4,104, "Creta", "desial");
		CarsList[4] = new Cars(5,105, "I10", "Petrol");
		CarsList[5] = new Cars(6,106, "I20", "desial");
		CarsList[6] = new Cars(7,107, "Celrio", "desial");
		CarsList[7] = new Cars(8,108, "BMW", "Petrol");
		CarsList[8] = new Cars(9,109, "Mercedes", "Petrol");
		//CarsList[9] = new Cars(10,110, "Ford", "Petrol");
		
		for(int i=0; i<10; i++) 
		{
			if(CarsList[i].getFuleType() == "Petrol") 
			{
				System.out.println(CarsList[i].getId()+ " "+CarsList[i].getName());
			}
		}
		for(int j=0; j<10; j++) 
		{
			if(CarsList[j].getFuleType() == "desial") 
			{
				System.out.println(CarsList[j].getId()+ " "+CarsList[j].getName());
			}
		}
	}
}

