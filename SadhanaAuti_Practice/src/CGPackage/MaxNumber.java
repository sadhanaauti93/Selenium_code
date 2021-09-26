package CGPackage;

//import Myarray.MaxNumber;

public class MaxNumber {
	int arr[]= {10,1,15,18,14,2,4};
	public void test()
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

	/*for(int b=0; b<arr.length-1; b++)
	{
	if(arr[b]>max && arr[b] !=max)
	{
	max2 = arr[b];
	}
	}
	System.out.println(max2);*/
	}

	public static void main(String[] args)
	{
	MaxNumber obj = new MaxNumber();
	obj.test();
	}
}
