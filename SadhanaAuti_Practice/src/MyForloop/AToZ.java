package MyForloop;

public class AToZ {
	  char c;
	public static void main(String[] args) {
		AToZ obj = new AToZ();
		
		for (obj.c = 'A' ; obj.c<= 'z'; obj.c++) 
		//for ( c = 65 ; c < 122; c++)
		{
			System.out.println(obj.c);
		}
	}
}
