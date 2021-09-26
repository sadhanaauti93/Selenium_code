package Firstdaydayassignment;


public class LargestNumber {
	int arr[]={55,66,77,100,75}; // 
	public int largest()
	{
		int max = arr[0]; //55
		//arr21 = [51];
		for(int j=1; j<=arr.length-1; j++)
		{
			if(arr[j]>max) // 66>55  77>66 100>77 75>100
				max= arr[j]; // 66 77 100
		}
		return max;
	} 
		public static void main(String[] args)
	{
			LargestNumber obj = new LargestNumber();
			System.out.println("Largest in given array is " + obj.largest());
			//obj.largest();
	}
}



