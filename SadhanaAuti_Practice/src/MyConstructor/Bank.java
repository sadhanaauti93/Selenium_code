package MyConstructor;

public class Bank {
	
		int id;
		String holdername;
		float amount;

		public Bank(int i) {
		id=i;
		}
		public Bank(String h){
		holdername = h;
		}
		public Bank(float a) {
		amount= a;
		}
		public static void main(String[] args) {
		Bank b = new Bank(1111000222);
		System.out.println("Value assigned in Bank" + b.id);
		Bank b1 = new Bank("SRG");
		System.out.println("Value assigned in Bank" + b1.holdername);
		Bank b2 = new Bank(100.0f);
		System.out.println("Value assigned in Bank" + b2.amount);
		}
		}


