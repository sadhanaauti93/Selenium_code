package MyFirstApp;

public class Mixvariable {

	public static void main(String[] args) {
		float floatval = 10.56f;
		double doubleval = 4.05d;
		byte byteval = 2;
		short shortval =7;
		long longval = 5;
		
		short result1 = byteval;
		short resulr2 = (short)(byteval - longval);
		float result3 = longval - floatval;
		
		System.out.println("Success");
	}

}
