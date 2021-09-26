package MyExceptionHandlling1;

public class Myclass2 {
	int i = 30;
	int j = 20;
	public void addition() {
		try
		{
			System.out.println("My age is "+(j+i));
			//System.out.println("Enter the value");
		}
	catch(Exception e)			//Question
		{
		System.out.println("Remaing");
		}
	}
	public static void main(String[] args) {
		Myclass2 obj = new Myclass2();
		obj.addition();
	}
}
