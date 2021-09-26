package Myprimative;

public class Flight {
	int flightNumber;
	int flightclass;
	//@Override
	public String ToString() {
		if(flightNumber > 0) {
			return "Flight #" + flightNumber;
		}
		else
		{
			return "flightclass" + flightclass;
		}
	}
	public static void main(String[] args) {
		Flight obj = new Flight();
		obj.ToString();
	}

}
