package OverloadinandThisandStatic;

public class Student {
	public void Getgrade() {
		System.out.println("Result is reserved");
	}
}
class Ram extends Student{
	public void Getgrade() {
		System.out.println("Distinction");
	}
}
class Radha extends Student{
	public void Getgrade() {
		System.out.println("First class");
	}
}
class Rahul extends Student{
	public void Getgrade() {
		System.out.println("Scond class");
	}
}	
