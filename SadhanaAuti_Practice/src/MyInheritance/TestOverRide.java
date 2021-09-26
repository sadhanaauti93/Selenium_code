package MyInheritance;

public class TestOverRide extends Bank{
	public static void main(String[] args){
		
		SBI s = new SBI();
		HDFC h = new HDFC();
		CITI c = new CITI();
		System.out.println("SBI Rate of Interest:"+s.getRateofInterest());
		//System.out.println("HDFC Rate of Interest:"+h.getRateofInterest());
		//System.out.println("CITI Rate of Interest:"+c.getRateofInterest());
	}
}
