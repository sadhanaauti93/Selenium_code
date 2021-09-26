package MyExceptionhandling;

public class ExceptionHandling {
	int a = 2022;
	int B = 25;
	//int C = 2021;
	public void test() {
		try
	{
		System.out.println("Before exception");
		System.out.println("My age is "+B);
		System.out.println("Testing");

	}
		catch(Exception e) {
			//e.printStackTrace();
			System.out.println("OOPs! Devision by Zero.... ");
			//System.out.println("Defaulted to: " + a/5);
		}
			System.out.println("Remaning code");
	}
		public static void main(String[] args) {
			ExceptionHandling obj = new ExceptionHandling();
			obj.test();
		}
}
