package MyInheritance2;

public class Father extends Son {
	static int Salary = 200000 ;

	public static void main(String[] args) {
		Father f = new Father();
		System.out.println(" Salary " + Salary);
		//((Daughter) d).Daughter());
	}
}