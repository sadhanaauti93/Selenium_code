package Firstdaydayassignment;

import java.util.Arrays;

public class ThirdLargestNumber {
	public static int getThirdLargestr(int[]a, int total)
	{
		Arrays.sort(a);
		return a[total-3];
		
	}
	public static void main(String[] args) {
		//int[] a = {1,2,3,4,5,9,24};
		int[] b = {11,33,55,88,77};
		//System.out.println("Third Largest: "+ getThirdLargestr(a,7));
		System.out.println("Third Largest: "+ getThirdLargestr(b,5));
	}
}
	
	




