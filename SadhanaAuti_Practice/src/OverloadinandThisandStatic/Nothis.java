package OverloadinandThisandStatic;

public class Nothis {
	int rollno;
	String name;
	float fee;
	Nothis(int rollno, String name, float fee){
	this.rollno=rollno;
	this.name=name;
	this.fee=fee;
	}
	void display(){System.out.println(rollno+" "+name+" "+fee);}
	
	public static void main(String[] args)
	{
		Nothis s1=new Nothis(111, "Suresh", 5000.00f);
		Nothis s2 =new Nothis(112, "Ramesh", 6000.00f);
		s1.display();
		s2.display();
	}
}
