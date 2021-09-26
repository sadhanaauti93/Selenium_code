package MyString;

public class StringArguments {

	public static void main(String[] args) {
		int valA = 100; int valB = 200; int valC = 300;


		String S1 = String.format("%d %d %d",valA, valB, valC);
		String S2 = String.format("%3$d %1$d %2$d",valA, valB, valC);
		String S3 = String.format("%2$d %3$d %1$d",valA, valB, valC);
		String S4 = String.format("%2$d %<d %1$d",valA, valB, valC);
		
		System.out.println(S1);
		System.out.println(S2);
		System.out.println(S3);
		System.out.println(S4);
	}

}
