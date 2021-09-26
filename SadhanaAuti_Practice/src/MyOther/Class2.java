package MyOther;

public class Class2 {
	void showme() {
		showme();
		int q,p;
		q=90;p=82;
		System.out.println("Addition is : "+(p+q));
	}
	public static void main(String[] args) {
		Class2 cobj = new Class2();
		cobj.showme();
	}
}
