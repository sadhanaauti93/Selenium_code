package MyExceptionHandlling1;

import java.util.Scanner;

public class CheckAge {
	void chkAge(int DOB){
		int a = 2021;
		int Age = a-DOB;
		if(Age>1) 
		{
			throw new ArithmeticException("Birth year Should be less then current year");
		}
		else
		{
			System.out.println("You are the eligibale for vaccination age is " + Age);
		}
	}
		public static void main(String[] args) {
			CheckAge obj = new CheckAge();
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter your age");
			int count = sc.nextInt();
			obj.chkAge(count);
		}
	}


