package Myprimative;

public class ASMDClass {

	public static void main(String[] args) {
		int A = 21;
		int B = 6;
		int C = 3;
		int D = 1;
		
		int result1 = A-B/C;
		int result2 = (A-B)/C;
		
		System.out.println(result1);
		System.out.println(result2);
		int result3 = A/C*B+D;
		int result4 = A/(C*(B+D));
		System.out.println(result3);
		System.out.println(result4);
	}
}
