package MyExceptionHandlling1;

public class XYZ {
	//int a = 27
	public static void main(String[] args) {
		try
		{
			 int divideByZero = 5/0;
		}
		catch(Exception e)
		{
			System.out.println("Arthmatic exception => " +e.getMessage());

		}
		finally
		{
			System.out.println("This is final block");
		}
	}
 }
