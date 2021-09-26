package MyAllOperators;

public class Operators {
	
	int a=10;
	
	public void interest()
	{        		
		//                 11     12   13    14    15=65
		System.out.println(a++ + ++a + a++ + a++ + ++a); 
		//                  10    12   12    13    15 =62
	}
	
	public static void main(String[] args) 
	{
		Operators obj = new Operators();
		obj.interest();
	}
}
