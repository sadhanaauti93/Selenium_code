package MyInheritance4;

public abstract class CalculateBase {
	public double leftvals;
	public double rightvals;
	public double result;

	public double getLeftvals() {return leftvals;}
	public void setLeftvals(double leftvals) {this.leftvals = leftvals;}
	public double getRightvals() {return rightvals;}
	public void setRightvals(double rightvals) {this.rightvals = rightvals;}
	public double getResult() {return result;}
	public void setResult(double result) {this.result = result;}
	
//	public char getOpCodes() {return opCodes;}
//	public void setOpCodes(char opCodes) {this.opCodes = opCodes;}
//	
	public CalculateBase() {}
	public CalculateBase( double leftvals , double rightvals) {
		this.leftvals = leftvals;
		this.rightvals = rightvals;
	}
	public abstract void Calculate();
	
}
