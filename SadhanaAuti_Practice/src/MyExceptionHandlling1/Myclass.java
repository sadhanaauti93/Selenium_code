package MyExceptionHandlling1;

public class Myclass {
	int i = 50;
	int j = 5;
	public void addition() {
		System.out.println(i+25);
		System.out.println(j+25);
	}
	public void substraction() {
		System.out.println(i*25);
	}
	public void multiplication() {
		System.out.println(i-25);
	}
	public void divide() {
		System.out.println(i/25);
	}
	public static void main(String[] args) {
		Myclass obj = new Myclass();
		obj.addition();
		obj.substraction();
		obj.multiplication();
		obj.divide();
	}

}
