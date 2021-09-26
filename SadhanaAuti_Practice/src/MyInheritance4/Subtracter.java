package MyInheritance4;

public class Subtracter extends CalculateBase{
	public Subtracter() {}
	public Subtracter( double leftvals , double rightvals) {
		super(leftvals,rightvals);
	}
	@Override
	public void Calculate() {
	double value = getLeftvals() - getRightvals();	
	setResult(value);
	}
}