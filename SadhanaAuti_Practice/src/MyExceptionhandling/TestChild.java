package MyExceptionhandling;

public class TestChild {
	ThrowsTest obj = new ThrowsTest();
	public void test()
	{
		obj.divide();
	}
	public static void main(String[] args) {
		TestChild obj = new TestChild();
		obj.test();
	}
}
