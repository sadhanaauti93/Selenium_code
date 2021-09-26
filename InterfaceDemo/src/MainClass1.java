import java.util.InputMismatchException;
import java.util.Scanner;

public class MainClass1 {

		public static void main(String[] args) {
			try
			{
			Scanner Sc = new Scanner(System.in);
			System.out.println("Enter a num:-");
			int num1 = Sc.nextInt();
			System.out.println("Enter a num:-");
			int num2 = Sc.nextInt();
			System.out.println(num1/num2);
			}
			catch(InputMismatchException e)  					//Will handle only input InputMismatchException
			{		
				System.out.println("Enter number only");
			}
			catch(ArithmeticException e) 						//Will handle onlyArithmeticException
			{		
				System.out.println("Enter second number other than 0");
			}
			catch(Exception e) 												//Will handle only
			{		 
				System.out.println(e.getMessage());
			}
			finally
			{
			}
		}
	}
	


