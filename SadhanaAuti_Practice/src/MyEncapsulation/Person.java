package MyEncapsulation;

public class Person {
	private int age;				/// private field
	public int getAge() {			// getter method
		return age;
	}

	public void setAge(int age) {		// setter method
		this.age = age;
	}
	public static void main(String[] args) {
		Person p = new  Person();
		p.getAge();
		p.setAge(35);
		System.out.println("My age is " + p.getAge());
	}
}


