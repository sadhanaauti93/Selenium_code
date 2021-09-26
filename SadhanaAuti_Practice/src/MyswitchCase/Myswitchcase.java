package MyswitchCase;

public class Myswitchcase {
	public static void main(String[] args) {
		double value1 = 10d;
		double value2 = 5d;
		double result = 1d;
		char opCode = 'd';
		
		switch(opCode) {
		case 'a':
			result = value1 + value2;
			break;
		case 'b':
			result = value1 - value2;
			break;
 
		case'c':          
			result = value1 * value2;
			break;

		case 'd':
			result = value1 / value2;
			if (value2 != 0)
				result  = value1/value2;
			break;
				
		default:
			System.out.println(":Invalid opCode: " + opCode);
			result = 1d;
			break;
		}
		System.out.println(result);
	}
}

