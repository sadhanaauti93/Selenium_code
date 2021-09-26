package MyInheritance;

	public class Bank {
	double getRateofInterest()
	{
		return 2;
	}
}
	class SBI extends Bank{
		double getRateofInterest()
		{
			return 9;
		}	
	}
	class HDFC extends Bank{
		double getRateofInterest()
		{
			return 8.0;
		}
	}
	class CITI extends Bank{
		double getRateofInterest()
		{
			return 6;
		}
	}