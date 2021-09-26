package MyOther;

public class IntoroVar {
	int i=2021;
	double d=56.35;
	String s="Java";
	public static void main(String[] args){
		IntoroVar obj = new IntoroVar();
		System.out.println("I am integer and my value is " + obj.i);
		System.out.println("I am string and my value is " + obj.s);
		System.out.println("I am integer and my value is " + obj.i + obj.d);
		System.out.println(obj.i + obj.d + " This is a integer value ");
		System.out.println("Hello Java");
	}
}
