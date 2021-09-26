package OverloadinandThisandStatic;

public class UseofStatic {
	int rollno;
	String name;
	static String college="Mycollege";
	UseofStatic(int r, String n)
	{
		rollno =r;
		name = n;
	}
	void display(){
		System.out.println(rollno+" "+name+" is student of college "+college);
	}

	public static void main(String[] args) {
		
		UseofStatic s1=new UseofStatic(101,"Moni");
		UseofStatic s2=new UseofStatic(102,"Rani");
		
		s1.display();
		s2.display();
	}
}
