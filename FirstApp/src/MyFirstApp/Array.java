package MyFirstApp;

public class Array {
	public static void main(String[] args) {
		double[] leftvals = {10, 20, 30,40};
		double [] rightvals = {5, 2,1,3};
		char[] opCodes = {'a', 'b', 'c', 'd'};
		double[] results = new double [opCodes.length];
		
			for (int i=0; i < opCodes.length; i++) {
			switch(opCodes[i]){
			case 'a':
				results[i] = leftvals[i] + rightvals[i];
				break;
			case 'b':
				results[i] = leftvals[i] - rightvals[i];
				break;
	 
			case'c':          
				results[i] = leftvals[i] * rightvals[i];
				break;

			case 'd':
				results[i] = rightvals[i] !=0 ? leftvals[i] / rightvals[i]:1;
				break;
					
			default:
				System.out.println(":Invalid opCode: " + opCodes[i]);
				results[i] = 1;
				break;
			}
		}
			for (double currentResult : results)
			System.out.println(results);
		}
	}
	



