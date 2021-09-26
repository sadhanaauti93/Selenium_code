package MyInheritance3;
public class Animal {
	public void eat(){
		System.out.println("I am eat");
	}
}
	class Dog extends Animal{
		public String name(){
			String s= "rahu";
			System.out.println("My name is" + "rahu");
			return s;
	}
	public void bark() {
		System.out.println("I can bark");
	}	
}

