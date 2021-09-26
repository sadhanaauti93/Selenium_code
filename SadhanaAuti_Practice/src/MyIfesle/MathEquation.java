package MyIfesle;

public class MathEquation {
	double leftvals;
	double rightvals;
	char opCodes;
	double result;
	
	void execute(){
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
	}
}
	
	
	
	
	
	
	
	

