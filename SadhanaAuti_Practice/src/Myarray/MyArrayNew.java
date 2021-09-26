package Myarray;

public class MyArrayNew {

	public static void main(String[] args) {
		
		float thevals[] = new float[3];
		thevals[0] = 10.2f;
		thevals[1] =20.4f;
		thevals[2] = 30.5f;
		float sum = 0.0f;
		
		for(int index = 0;index < thevals.length; index++)
			sum += thevals[index];
				System.out.println(sum);	
	}
}
