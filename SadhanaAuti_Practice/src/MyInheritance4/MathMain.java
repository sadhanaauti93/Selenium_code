package MyInheritance4;

public class MathMain {
	public static void main(String[] args) {
//		 MathEquation testEquation = new  MathEquation();
//		 testEquation.execute();
//		 System.out.println("test=");
//			System.out.println(testEquation.getResult());
		
		/*double[] leftvals = {100.0d, 25.0d, 225.0d, 11.0d};	
		double[] rightvals = {50.0d, 92.0d, 17.0d, 3.0d};	
		char[] opCodes = {'d','a','s','m'};	
		double[] result = new double[opCodes.length];*/
		MathEquation[] equations = new MathEquation[4];		//Encapulation
		/*equations[0] = create(100.0d, 50.0d, 'd');
		equations[1] = create(25.0d, 92.0d, 'a');
		equations[2] = create(225.0d, 17.0d, 's');
		equations[3] = create(11.0d, 3.0d, 'm');*/
		
		equations[0] = new MathEquation('d',100.0d, 50.0d);      //Constructors 
		equations[1] = new MathEquation('a',25.0d, 92.0d);
		equations[2] = new MathEquation('s',225.0d, 17.0d);
		equations[3] = new MathEquation('m',11.0d, 3.0d);

		for(MathEquation equation: equations) {
			equation.execute();
		//for(double theresult:result) {
			System.out.println("result=");
			System.out.println(equation.getResult());
		}
		System.out.println();
		System.out.println("useing Overloads");
		System.out.println();
		double leftDouble = 9.0d;
		double rightDouble = 4.0d;
		int leftint = 9;
		int rightint = 4;
		
		MathEquation equationOverloads = new MathEquation('d');
		
		equationOverloads.execute();
		System.out.println("result=");
		System.out.println(equationOverloads.getResult());
		
		equationOverloads.execute();
		System.out.println("result=");
		System.out.println(equationOverloads.getResult());
		
		equationOverloads.execute();
		System.out.println("result=");
		System.out.println(equationOverloads.getResult());
	
		System.out.println();
		System.out.println("Useing inheritance");
		System.out.println();
		
		CalculateBase[] Calcualate= {
				//new Divider(100.0d,50.0d),
				new Adder(25.0d,92.0d),
				new Subtracter(225.0d,17.0d),
				//new Multiplier(11.0d,3.0d)
		};
		for(CalculateBase Calculater:Calcualate) {
			 Calculater.Calculate();
			 System.out.println("result=");
			 System.out.println(Calculater.getResult());
		}
	
	}
}
//	public static MathEquation create (double leftvals, double rightvals, char opCodes) {
//		MathEquation equation = new MathEquation();
//		equation.setLeftvals(leftvals);
//		equation.setRightvals(rightvals);
//		equation.setOpCodes(opCodes);
//		
//		return equation;
//		         
//	}
//}
