package OverloadinandThisandStatic;

public class AdditionMethod {
	
		/*int num1 = 25;
		    int num2 = 15;*/
		public int addNumbers(int a, int b) { // create a method
		   int sum = a + b;
		   return sum;                                      // return value
		 }
		 public static void main(String[] args) {
		   int num1 = 25;
		   int num2 = 15;
		   AdditionMethod obj = new AdditionMethod();
		   int result = obj.addNumbers(num1, num2);            // calling method
		   System.out.println("Sum is: " + result);
		 }
		}


