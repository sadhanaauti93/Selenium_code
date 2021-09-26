package MyString;

public class String3 {

	public static void main(String[] args) {         // String Fromat
		/*int irahul = 123651;
		double drahul = 123651.0d;
		
		String S1 = String.format("%d", rahul);
		String S2 = String.format("%,d", rahul);
		String S3 = String.format("%,.2", rahul);

		System.out.println(S1);
		System.out.println(S2);*/
		
		
		int iposval = 123, iNegval = -134;
		String S1  = String.format("%d", iposval);
		String S2 = String.format("%d", iNegval);
		
		String S3 = String.format("% + d", iNegval);		
		String S4 = String.format("% + d", iposval);
		
		//String S5 = String.format("%(d", iposval);		
		String S6 = String.format("%(d", iNegval);
		
		System.out.println(S1);
		System.out.println(S2);
		System.out.println(S3);
		System.out.println(S4);
		//System.out.println(S5);
		System.out.println(S6);
	}
}
