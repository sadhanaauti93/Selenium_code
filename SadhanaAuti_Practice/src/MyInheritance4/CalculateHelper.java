package MyInheritance4;

public class CalculateHelper {
	MathCommand command;
	double Leftvals;
	double Rightvals;
	double  result;
	public void process(String statement)
	{
		String[] parts = statement.split(" ");
		String commandString =parts[0];  	//add
		Leftvals = Double.parseDouble(parts[1]);
		Rightvals = Double.parseDouble(parts[2]);
	}
	private void setCommandFromString(String commandString) {
//		if(commandString.equalsIgnoreCase(MathCommand.Add.toString()));
//		command = MathCommand.Add;
//		
//		else if((commandString.equalsIgnoreCase(MathCommand.Subtracter.toString()));
//		command = MathCommand.Subtracter;
//		
//		else if((commandString.equalsIgnoreCase(MathCommand.Multiplier.toString()));
//		command = MathCommand.Multiplier;
//		
//		else if((commandString.equalsIgnoreCase(MathCommand.Divider.toString()));
//		command = MathCommand.Divider;
//		
		
	}

}
