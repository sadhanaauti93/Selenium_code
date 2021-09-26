package MyOther;

//import UnderstandingMrthod.MathEquations;

public class Classnew1 {
	private double result;
	private double leftvals;
	private double rightvals;
	private char opCodes;
	
	private static int numberOfCalculation;
	private static double sumOfResults;
	
	public void MathEquation() {}
	//public void MathEquation(char opCodes) {this.opCodes = opCodes};
	
	public void MathEquation (int leftvals, int rightvals, char opCodes) {
		//this.(opCodes);
		this.leftvals = leftvals;
		this.rightvals = rightvals;
		
		//void execute() {
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
	
		
		numberOfCalculation++;
		sumOfResults += result;
	}
		
}
