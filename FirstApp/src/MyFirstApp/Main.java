package MyFirstApp;

public class Main {

	public static void main(String[] args) {
		int valA = 10;
		int valB = 20;
		int valC = 30;
		int valD = 40;
		
		int result1 = valA - valB / valC;
		int result2 = (valA - valB) /valC;
		
		System.out.println(result1);
		System.out.println(result2);
		
		int result3 = valA / valB * valD + valB;
		int result4 = valA / (valB * (valD + valB));

		System.out.println(result3);
		System.out.println(result4);


	}

}
