package MyInheritance;

public class Dog extends Domestic{
	void bark(){System.out.println("I am dog I BArk...");}
	public static void amin(String[] args){
		Dog d = new Dog();
		d.bark();
		d.whoami();
		d.imdomestic();
		System.out.println(d.salary);
	}
}
