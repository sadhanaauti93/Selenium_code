package OverloadinandThisandStatic;

public class MultiMethod {
	public static int square(int num) {
		 return num * num;
	 }
	 public static void main(String[] args) {
	   int result = 10;
	   result = square(10);
	   System.out.println("Squared value of 10 is: " + result);
	 }
	}


