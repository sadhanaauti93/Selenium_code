package Firstdaydayassignment;

import java.util.Arrays;

public class BinaryAndSequentialSearch {
	public static void main(String[] args) {
		int[] arr = {10,20,30,40,50};
		int key = 30;
		
		int result = Arrays.binarySearch(arr,key);
		
		if(result < 0) {
			System.out.println("Element is not foune");
		}
		else
		{
			System.out.println("Element is found in index: " + result);
		}
	
	}

}
