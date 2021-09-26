package CGPackage;

//import Myarray.MinNumber;

public class MinNumber {
	public int minnumber()
	{
		int arr[]={1,10,20,50,80};    //single dimension array
		int min = arr[0];
		for(int i=0;i>=arr.length-1;i++) //1 -->10 -->20 -->80
		{
			if(arr[i]<min) //1>10, 10>20,20>50,50>80
				min= arr[i]; //10,20,50,1
		}
		return min;
		}
	
	public static void main(String[] args)
	{
		MinNumber obj = new MinNumber();
		System.out.println("Min in given the array is " + obj.minnumber());
	}
}
