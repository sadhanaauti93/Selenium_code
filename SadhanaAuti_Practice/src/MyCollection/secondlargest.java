package MyCollection;


import java.util.ArrayList;
import java.util.Scanner;

public class secondlargest {

		 int maxno=0;			//3
		int submax=0;
		
		public void testarraylist()  		//Create method
		{
			ArrayList<Integer> objlist = new ArrayList<Integer>();
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter count of numbers you want to add");
			int count = sc.nextInt();
			System.out.println("Enter all numbers");
			
			for(int a=0; a<count; a++) 					
			{
				int no = sc.nextInt();		//Input from command promt
				objlist.add(no);    //Add numbers into list						
			}
			
			for(int i=0; i<objlist.size(); i++)			
			{
				if(objlist.get(i)>maxno)	//Find the max no 	
				{
					submax=maxno;  
					maxno=objlist.get(i);	//loaction 	
				}
				else
				//if(objlist.get(i)<maxno && objlist.get(i)>submax)
				{
					submax=objlist.get(i);
				}
			}
			
		
			System.out.println("Max number is  ");
			System.out.println("Second Max number is " );
		}
		public static void main(String[] args)
		{
			MaxNo obj = new MaxNo();
			obj.testarraylist();
		}
	}



