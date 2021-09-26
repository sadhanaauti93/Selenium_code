package MyConstructor;

public class Employee {
	
		int id;
		String name;
		float salary;
		public Employee(int i, String n, float s) {
		id = i;
		name = n;
		salary = s;
		}
		/*public Employee(String n) {
		name = n;
		}
		public Employee(float s) {
		salary = s;
		}*/
		public static void main(String[] args) {
		Employee e = new Employee( 101, " PMG " ,12222f );
		System.out.println("Value Assinged in Esmployee" + e.id + e.name + e.salary);

		}
		}
