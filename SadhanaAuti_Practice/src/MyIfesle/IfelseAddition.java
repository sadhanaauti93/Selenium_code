package MyIfesle;

import java.util.Scanner;

public class IfelseAddition {
	/*
	int a=10;
	int b=11;
	int c=44;
	int d=55;
	*/
	public static void main(String[] args)
	{
		IfelseAddition obj = new IfelseAddition();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your no");
		int no = scan.nextInt();
		if(no<=100)
		{
			System.out.println("can applicable addition");
		}
		else
		{
			System.out.println("can not applicable for addition");
		}
	}
}
