package Stream;

public class Person {
	private String Name;
	private  int Age;
	public Person() {}
	public Person(String name,  int age) {
		this.Name = name;
		this.Age = Age;
	}
	public String getName() {
		return this.Name;
	}
//	public void setName(String name) {
//		Name = name;
//	}
	public int getAge() {
		return this.Age;
	}
//	public void setAge(int age) {
//		this.Age = Age;
//	}
	public String toString(){
	return "Person["+this.Name+ "," + this.Age + "]";
	}
}
