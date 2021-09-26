package Myprimative;

public class factorialnumber {

	public static void main(String[] args) {
		int k = 5;
		int factorial = 1;
		while (k>1) {
			factorial*=k;
			k-=1;
		}
		System.out.println(factorial);
	}

}
