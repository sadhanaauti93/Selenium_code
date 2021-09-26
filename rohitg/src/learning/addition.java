package learning;

import java.util.Scanner;

public class addition {

	public static void display(int x, int y) {
		int w = x + y;
		System.out.println("Hello " + w);
	}

	public static void main(String[] args) {// static
		String[] rg = { "RAhul", "Rohit" };
		System.out.println(args[0] + " " + args[1] + " "); // String[] abc R
		Scanner S = new Scanner(System.in);
		System.out.println("Enter number x");
		int x = S.nextInt();
		System.out.println("Enter number y");
		float y = S.nextFloat();
		float result = x + y;
		System.out.println(" x=" + x + "\t\n" + " y=" + y + "\n\t result=" + result);

	}

}
