package OverloadinandThisandStatic;
public class SadhanaOverloading {
	public int mymethod(int x, int y) {
		return x+y;
	}
	public float mymethod(float a, float b) {
		return a-b;
	}
	public static void main(String[] args) {
		SadhanaOverloading obj = new SadhanaOverloading();
		System.out.println(obj.mymethod(10,20));
		System.out.println(obj.mymethod(20f, 10f));
	}
}
