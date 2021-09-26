package MyForloop;

public class UseFunction {
	int i = 20;
	public int add(int a, int b)
	{
		int c = a+b;
		System.out.println(i);
		System.out.println(a);
		return c;
	}
	private int addv(int a,int b,int c) {
		int d = a+b+c;
		System.out.println(i);
		System.out.println(a);
		return d;
	}
	public float div(float a, float b)
	{
		return b;
	}
	public static void main(String[] args)
	{
		UseFunction obj = new UseFunction();
		//obj.UseFunction(10,20);
	}

}
