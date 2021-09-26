package MyInheritance;

public class B extends A2 {   //Single MyInheritance
	void showB()
	{
	System.out.println("b class method");
	}
	public static void main(String[] args){
		A2 obj1=new A2();
		obj1.showA();//
		//B obj2 = new B();
		//obj2.showB(); //
	}
}

