package OverloadinandThisandStatic;

public class This1 {
	int rollnumber;               //Instance variable
	String name;
	float bill;
	
	This1(int id, String name, float bill)
	{
		rollnumber = this.rollnumber;
		name=this.name;
		bill=this.bill;
	}
	void display()
	{
		System.out.println(rollnumber+" "+name+", "+bill);
	}
	public static void main(String[] args){
		This1 s1=new This1(101,"Rahul", 504.20f);
		This1 s2=new This1(102,"Rani", 604.20f);
		s1.display();
		s2.display();
	}
}