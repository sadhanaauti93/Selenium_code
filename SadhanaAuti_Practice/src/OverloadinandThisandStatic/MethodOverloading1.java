package OverloadinandThisandStatic;
public class MethodOverloading1 {
	public float mymethod(float x,float y){
		return x*y;
	}
	public float mymethod(float a,float b, float c){
		return a*b*c;
	}
	public int mymethod(int d, int f)
	{
		return d+f;
	}
	public String mymethod(String Rahul, String Ghadge)
	{		return Rahul+Ghadge;
	}
	public static void main(String[] args){
		MethodOverloading1 objM = new MethodOverloading1();
		
		System.out.println(objM.mymethod(1.2f,2.5f));
		System.out.println(objM.mymethod(1.2f,2.5f,3.5f));
		System.out.println(objM.mymethod(5,10));
		System.out.println(objM.mymethod("Rahul " , "Ghadge "));
		}
	}

