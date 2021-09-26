package MyIfesle;

public class MainIfElse {

	public static void main(String[] args) {
		double value1 = 100.0d;
		double value2 = 50.0d;
		double result = 0.0d;
		char opCode = 'd';
		
		if(opCode == 'a')
			result = value1 + value2;
		else if(opCode == 'b')
			result = value1 - value2;

		else if(opCode == 'c')
			result = value1 * value2;

		else if(opCode == 'd') {
			result = value1 / value2;
			if (value2 != 0)
				result  = value1/value2;
			}
				
		else {
			System.out.println(":Invalid opCode: " + opCode);
			result = 0.0d;
		}
		System.out.println(result);
	}

}
