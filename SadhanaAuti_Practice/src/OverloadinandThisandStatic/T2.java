package OverloadinandThisandStatic;

public class T2 {
	//int id;
	String name;
	float rent;
	
	T2(String name, float rent){
		this.name  = name;
		this.rent = rent;
	}
	void display() 
	{
		System.out.println(name+" "+rent);
		System.out.println(name+" "+rent);
	}
	public static void main(String[] args) {
		T2 obj = new T2("Pallavi", 100.50f);
		T2 obj1 = new T2("Rutu", 26.22f);
		obj1.display();		
		obj.display();
	}
}
