package MyExceptionhandling;

public class ThrowsTest {
	int a = 10;
	public void divide()
	{
		System.out.println(a/0);				//Arithmetic exception
	}
	public void test()
	{
		System.out.println("Remaning");
	}
	public static void main(String[] args) {
		ThrowsTest obj = new ThrowsTest();
		obj.divide();
		obj.test();
	}
}

