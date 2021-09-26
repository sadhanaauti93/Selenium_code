package UnderstandingMrthod;

import java.time.LocalDate;
import java.util.Scanner;

public class Returningvalue {
	public static void main(String[] args) {
		performCalculator();
	}
	static void performCalculator() {

			double[] leftvals = {10, 20, 30,40};
			double [] rightvals = {5, 2,1,3};
			char[] opCodes = {'a', 's', 'm', 'd'};
			double[] results = new double [opCodes.length];
	
			
			//if(args.length == 0) {
				for (int i=0; i < opCodes.length; i++) {
				results[i] = execute(opCodes[i],leftvals[i],rightvals[i]);
			}
			for (double currentResult : results)
				System.out.println(results);
		}
		static double execute1(char opCode, double leftvals, double rightvals) {
			double results;
			switch(opCode) {
			//else if(args.length == 3)
				//handleCommandLine(args);
			//else
				System.out.println("please provide an opoeratino code and  2 numeric values");
	}
		
	static void executeInteractively() {
		System.out.println("Enter and operation and two numbre");
		Scanner scan = new Scanner(System.in);
		String userInout = Scanner.nextLine();
		String[] parts= userInout.split(userInout);
		performOperation(parts);
	}	
	
		
	private static void performOperation(String[] parts) {
		char opCodes = opCodesFromString(parts[0]); 
		if(opCodes == 'w')
			handlewhen(parts);
		else {
		double leftvals = valueFromWord(parts[1]);
		double rightvals = valueFromWord(parts[2]);
		double result  = execute(opCodes, leftvals, rightvals);
		System.out.println(result);
		displayResult(opCodes,leftvals,rightvals,result);
	}
}
		
	private static char opCodesFromString(String string) {
		return 0;
	}
	private static void handlewhen(String[] parts) {
		LocalDate startDate = LocalDate.parse(parts[1]);
		long daysToAdd = (long) valueFromWord(parts[2]);
		LocalDate newDate = startDate.plusDays(daysToAdd);
		String output = String.format("%s plus %days is %s", startDate,daysToAdd,newDate);
		
	}
	
	private static void displayResult(char opCodes, double leftvals, double rightvals, double result) {
		char symbol = symbolFromopCodes(opCodes);
		StringBuilder builder = new StringBuilder(20);
		 builder.append(leftvals);
		 builder.append(" ");
		 builder.append(symbol);
		 builder.append(" ");
		 builder.append(rightvals);
		 builder.append("=");
		 builder.append(result);
		 String output = builder.toString();
		 
		String output1 = String.format("%.3f %c %.3f = %.3f",leftvals,symbol,rightvals,result);
		System.out.println(output1);
		
				
	}
	private static char symbolFromopCodes(char opCodes) {
		return 0;
	}
	private static void handleCommandLine(String[] args) {
		char opCodes = args[0].charAt(0);
		double leftvals = Double.parseDouble(args[1]);
		double rightvals = Double.parseDouble(args[2]);
		double result = execute(opCodes, leftvals, rightvals);
		System.out.println(result);
	}
	
	static double execute(char opCodes, double leftvals, double rightvals) {
		double result;
		switch(opCodes){
		case 'a':
			result = leftvals + rightvals;
			break;
		case 's':
			result = leftvals - rightvals;
			break;
 
		case'm':          
			result = leftvals * rightvals;
			break;

		case 'd':
			result = rightvals !=0 ? leftvals / rightvals:1;
			break;
				
		default:
			System.out.println(":Invalid opCode: " + opCodes);
			result = 1;
			break;
		}
		return result;
		}
	
	char valueFromString(String OperationName) {
		char opCode = OperationName.charAt(0);
		return opCode;
	}
	static double valueFromWord(String Word) {
		String[] numberWords= {
				"Zero","One","Two","Three","four","five",
				"Six","Seven","eight","Nine"};
		
			double value = -1d;
			for(int index = 0; index < numberWords.length; index++) {
				if(Word.equals(numberWords[index])) {
				value = index;
				break;
	}
}		
			if(value == -1d)
				Double.parseDouble(Word);
					return value;
	}
}
	

		






