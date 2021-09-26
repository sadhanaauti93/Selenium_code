package MyAbstraction;

abstract class Village {
	abstract void show();
		public void display(){
			System.out.println("Village is very natural place");
	}
}
class Umapur extends Village {
	void show(){
		System.out.println("Umapur is long distance from pune");
	}
}
class Shevgaon extends Village{
	void show() {
		
		System.out.println("Shevgaon is taluka in nagar distic");
	}
}
public class Village2{
	public static void main(String[] args) {
		Umapur U = new Umapur();
		Village obj = new Umapur();
		U.display();
		U.show();
	}
}