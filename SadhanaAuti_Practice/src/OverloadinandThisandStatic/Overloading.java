package OverloadinandThisandStatic;

public class Overloading {
//	public String mymethod(String x, String y) {
//		return x+y;
//	}
	public int mymethod(int a, int b, int c) {
		return a*b*c;
	}
	public float mymethod(float e, float h)
	{
		return e-h;
	}
	public int mymethod(int g, int m , int f, int k) {
		return g+m;
	}
	public char mymethod(char a) {
		return a;
	}
	public int mymethod(int c, int b) {
		return c/b;
	}
	//public boolean mymethod(boolean "true" , boolan "false") {
		//return "true" + "false";
	//}
	
	public static void main(String[] args) {
		Overloading obj = new Overloading();
		//System.out.println(obj.mymethod("Rahul" , "sadhana"));
		System.out.println(obj.mymethod(5,6,7));
		System.out.println(obj.mymethod(20f,15f));
		System.out.println(obj.mymethod(10, 15));
		System.out.println(obj.mymethod('a'));
		System.out.println(obj.mymethod(15,55));
	}
}
