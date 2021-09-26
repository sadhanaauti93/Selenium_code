package learning;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner num = new Scanner(System.in);
		System.out.println("Enter no.");
		int x = num.nextInt();
		if (x % 2 == 0)
			System.out.println("number is even");
		else
			System.out.println("number is odd");
	}
}
