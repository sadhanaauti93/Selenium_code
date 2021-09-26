package Firstdaydayassignment;

//import MyIfesle.OddEven;

public class OddEvenNumber {
	
	public int n = 0;
	public int m = 35;

	public static void main(String[] ars)
	{
		OddEvenNumber obj = new OddEvenNumber(); 
	
		if(obj.n%2==0)
		{
			System.out.println("Even no.");
		}
		else
		{
		System.out.println("Odd no.");
		}	
		obj.n=35;
		if(obj.m > obj.n)
		{
			System.out.println("m is greater than n");
		}
		else if(obj.m == obj.n)
		{
			System.out .println("m and n are equal");
		}
		else
		{
			System.out.println("m is less then n");
		}
     }
}

