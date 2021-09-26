package MyIfesle;

import java.util.Scanner;

public class Voting 
{
	public static void main(String[] args)
	{
		Voting v = new Voting();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your age");
		int age = scan.nextInt();
		if(age > 18)
		{
			System.out.println("can applicable for voting");
		}
		else 
		{
			System.out.println("can not applicbale for voting");
		}
	}
}
