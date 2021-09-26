package MyIfesle;

public class OddEven {
	
	public int n = 0;
	public int m = 35;
	//String s = "Sunday";
//	public void OddEven(int i){  //Declaring and defined method
//		if(i%2==0){
//			System.out.println("Odd no.");
//		}
//		else
//			
//		{
//			System.out.println("Even no");
//		}
//	}
	public static void main(String[] ars)
	{
		OddEven obj = new OddEven(); 
		//calling method
//		obj.OddEven(23);
//		obj.OddEven(22);
//		obj.OddEven(21);
//		obj.OddEven(44);
		/*
		 * if(obj.s == "Sunday")
		{
			System.out.println("day is not sunday");
		*/
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
/*
int i=10;
while(i < 5){
System.out.println(i);
i++;
}


int i=0;
do
{
System.out.println(i);
i++;
}
while(i < 5);

*/