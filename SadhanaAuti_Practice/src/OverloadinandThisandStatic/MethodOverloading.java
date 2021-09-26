package OverloadinandThisandStatic;

public class MethodOverloading {
	public static void display(int a,int c,int f)
	{
		System.out.println("Argument: " + a + " and " + c + "and " + f);
	}
	public static void display(int a, int b)
	{
		System.out.println("Argument: " + a + " and " + b);
	}
	
	public static void main(String[] args)
	{
		display(4,7,9);
		display(5,6);
	}
}
