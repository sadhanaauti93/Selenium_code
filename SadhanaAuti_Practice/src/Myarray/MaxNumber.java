package Myarray;

public class MaxNumber {
	int arr[]= {10,1,15,18,14,2,4};		//Array List
	public void test()  //Craet Method Test Name
	{
		int max = arr[0];
		for(int a=0; a<arr.length-1; a++)//****
		{
			if(arr[a+1]>arr[a])//****
			{
				max=arr[a+1];
			}
		}
		System.out.println(max);
	}
	public static void main(String[] args)
	{
		MaxNumber obj = new MaxNumber();
		obj.test();
	}
}


