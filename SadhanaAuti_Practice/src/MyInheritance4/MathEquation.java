package MyInheritance4;

public class MathEquation {
	private double leftvals;
	private double rightvals; 	
	private char opCodes; 	
	private double result; 
	
	public double getLeftvals() {return leftvals;}
	public void setLeftvals(double leftvals) {this.leftvals = leftvals;}
	public double getRightvals() {return rightvals;}
	public void setRightvals(double rightvals) {this.rightvals = rightvals;}
	public char getOpCodes() {return opCodes;}
	public void setOpCodes(char opCodes) {this.opCodes = opCodes;}
	
	public double getResult() {return result;}
	public void setResult(double result) {this.result = result;}
	public MathEquation() {}
	
	public MathEquation(char opCodes) {
	this.opCodes = opCodes;
	}
	
	public MathEquation(char opCodes,double leftvals, double rightvals) {
		this(opCodes);
		this.leftvals = leftvals;
		this.rightvals = rightvals;
	}
	public MathEquation(double leftvals, double rightvals) {
		this.leftvals = leftvals;
		this.rightvals = rightvals;
		execute();
	}
	public void execute() {
		switch(opCodes) {
		case 'a':
			result = leftvals + rightvals;
			break;

		case 's':
			result = leftvals - rightvals;
			break;
		case 'd':
			result = rightvals !=0.0d ? leftvals / rightvals : 0.0d;
			break;
		case 'm':
			result = leftvals * rightvals;
			break;
		default:
			System.out.println("Error - invalid code");
			result = 0.0d;
			break;

		}
	}
}





