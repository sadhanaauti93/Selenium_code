package OverloadinandThisandStatic;

public class Varcasting {
	int myInt=25;
	double myDouble = myInt;  //Automatic casting: int to double
	public double mymethod(double x, double y){
		return x*y;
	}
	public double mymethod(double x, double y, double z){
		return x*y*z;
	}
	public int mymethod(int x, int y){
		return x+y;
	}
	public String mymethod(String x,String y)
	{
		return x+y;
	}
	public static void main(String[] args){
		
		Varcasting objV= new Varcasting();
		System.out.println(objV.myInt);
		System.out.println(objV.myDouble);
		System.out.println(objV.mymethod(10,15,0));
		System.out.println(objV.mymethod(17,25));
		//System.out.println(objV.mymethod(10.0,15.0,2.2));
		System.out.println(objV.mymethod("Hello", "GM"));
		
	}
}

