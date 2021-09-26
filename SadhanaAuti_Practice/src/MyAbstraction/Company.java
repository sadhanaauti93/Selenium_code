package MyAbstraction;
abstract class Company1 {
	abstract void details();
public void display()
{
	System.out.println("We are Mnc");
	}	
}
class IBM extends Company1{
	void details(){
		System.out.println("IBM is a MNC ");
	}
}
abstract class TCS extends Company1{
	void deatils(){
		System.out.println("TCS is work on Aadhar car and pancard");
	}
}
public class Company{
	public static void main(String[] args){
	IBM obj = new IBM();   		//Can not create abstract calss obj.But,we can take Ref 
	Company1 c1 = new IBM();
	obj.details();
	obj.display();
	}
}


