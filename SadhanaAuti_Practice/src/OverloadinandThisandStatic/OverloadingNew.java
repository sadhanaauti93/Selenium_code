package OverloadinandThisandStatic;

public class OverloadingNew {
	public int mymethod(int a ,int b) 
	{
		return a+b;
	}
	public float mymethpd(float c, float d) 
	{
		return c-d;
	}
	public int mymethod(int e, int f, int g) 
	{
		return e*f*g; 
	}
	public float mymethod(float h,float k) 
	{
		return h/k;
	}
	public static void main(String[] args) 
	{
		OverloadingNew obj = new OverloadingNew();
		System.out.println(obj.mymethod(10, 20));
		System.out.println(obj.mymethod(10.4f, 20.6f));
		System.out.println(obj.mymethod(44, 26,88));
		System.out.println(obj.mymethod(30, 40));
	}
}

