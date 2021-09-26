package MyAbstraction;

  abstract class Bank {
	  abstract void show();
	  	public void display()
	{
		System.out.println("I Am RBI");
	}
}
 
class SBI extends Bank{
	void show(){
		System.out.println("SBI Rate of interest:" +8);
	}
}
class HDFC extends Bank{
	void show(){
		System.out.println("HDFC Rate of interest:" +6.5);
	}
}

public class BankMain{
public static void main(String[] args){
	HDFC obj =new HDFC(); // 
	//Bank b = new Bank(); // We can not make object of Abstract class Bank 
	Bank b1 = new SBI(); // referance variable b1 of abstrct class Bank and  
	obj.display();
	obj.show();
	}
}