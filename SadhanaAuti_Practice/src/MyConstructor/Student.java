package MyConstructor;

public class Student {
	int i;
	String S;
	float f;
	public Student(){
		i = 14;
	}
	public Student(String h){
		S = "Rushi";
	}
	public Student(float f){
		f = 4.5f;
	}
	public static void main(String[] args){
		Student S = new Student();
		System.out.println("Value Assinged is Constructors" + S.i);
		Student S1 = new Student();
		System.out.println("Value Assinged is Constructors" + S1.S);
		Student S2 = new Student();
		System.out.println("Value Assinged is Constructors" + S2.f);
	}
}
