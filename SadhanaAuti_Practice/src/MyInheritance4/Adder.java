package MyInheritance4;

public class Adder extends CalculateBase{
	public Adder() {}
		public Adder( double leftvals , double rightvals) {
			super(leftvals,rightvals);
	}
		@Override
		public void Calculate() {
		double value = getLeftvals() + getRightvals();	
		setResult(value);
	}
}
