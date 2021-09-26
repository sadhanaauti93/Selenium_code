package MyExceptionhandling;

//import java.awt.Checkbox;

public class Person {
	void CheckArray() {
	int a = (Integer) null;
	String[] S = {"P","s","e","r","h","i"};
	System.out.println("print the given array element " +S[12]);
}
public static void main(String[] args) {
	Person obj = new Person();
	try
	{
		System.out.println("Pirnt given the array");
		obj.CheckArray();
	}
catch(Exception e)
{
	System.out.println("");
		}
	}
}