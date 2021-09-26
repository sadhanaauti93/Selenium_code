package Myarray;

public class Array {
	int arr[]= {1,2,3,4,5};
	public void Testmethod()
	{
		System.out.println(arr.length);
		
		for(int i=0; i<=arr.length; i++)
		{
			System.out.println(arr[i]);
		}
		/*
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		System.out.println(arr[4]);
		*/
	}
	public static void main(String[] args)
	{
		Array a =new Array();
		a.Testmethod();	
	}
}