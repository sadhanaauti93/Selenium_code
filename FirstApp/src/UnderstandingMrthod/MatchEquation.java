package UnderstandingMrthod;

public class MatchEquation {
	//performCalculator(); 
	
	private String result;
	private double leftvals;
	private double rightvals;
	private char opCodes;
	
	static void performCalculator1() {
		int[] leftvals = {10, 20, 30,40};
		int[] rightvals = {5, 2,1,3};
		char[] opCodes = {'a', 's', 'm', 'd'};
		double[] results = new double [opCodes.length];

		MatchEquation[] equations = new MatchEquation[4];
		equations[0] = create (leftvals: 10, rightvals:5, opCodes:a); 
		equations[1] = create (leftvals: 20, rightvals:2, opCodes:s);
		equations[2] = create (leftvals: 30, rightvals:1, opCodes:m);
		equations[3] = create (leftvals: 40, rightvals:3, opCodes:d);
			
		for(MatchEquation equation : equations) {
			equation.execute("result= " + equation.result);
			
		}
	}
	private void execute(String string) {
  }
	private static MathEquations create (int leftvals, int rightvals,char opCodes) {
		MathEquation equations = new MathEquation();
		equations.leftvals = leftvals;
		equations.rightvals = rightvals;
		equations.opCodes = opCodes;
		return equations;
	}
	public static void main(String[] args) {
}
}              
