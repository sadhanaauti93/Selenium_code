package MyCollection;

import java.util.ArrayList;
import java.util.Scanner;

// This program is for calculate max and second max number 

public class MaxNo {
	int maxno=0;			//3
	int submax=0;

	public void testarraylist()  		//Create method
	{
		ArrayList<Integer> objlist = new ArrayList<Integer>();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter count of numbers you want to add");
		int count = sc.nextInt();
		System.out.println("Enter all numbers");

		for(int a=0; a<count; a++) 					//Given the count number 4			
		{
			int no = sc.nextInt();					//Input from command prompt means 
			objlist.add(no);    					//Add numbers into list		
		}

		for(int i=0; i<objlist.size(); i++)			
		{
			if(objlist.get(i)>maxno)	
			{
				maxno = objlist.get(i);				//location 	
			}                                        
		}

		for(int i=0; i<objlist.size(); i++)			
		{
			if(objlist.get(i)>submax && objlist.get(i)!=maxno )  
			{
				submax = objlist.get(i);   				//Find the location in array list
			}
		}
		System.out.println("Max number is : " +maxno);
		System.out.println("Second Max number is : " +submax);
	}
	public static void main(String[] args)
	{
		MaxNo obj = new MaxNo();
		obj.testarraylist();
	}
}



