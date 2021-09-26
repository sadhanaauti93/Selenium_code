package Myperpost;

public class SwapNumber {
	int Z;
	public void SwapNumber(int X, int Y)
	{
		System.out.println("Value of before "+X);
		System.out.println("value of before "+Y);
		X=Z;
		Z=Y;
		Y=X;
		/*
		X=Y-Z;
		Z=Y-X;
		Y=X-Y;
		*/
		
		System.out.println("value of aftre" +X);
		System.out.println("value of after" +Y);
	}
	public static void main(String[] args)
	{
		SwapNumber obj= new SwapNumber();
		obj.SwapNumber(10, 30);
		//obj.SwapNumber(55, 30);
			
	}
}
	


