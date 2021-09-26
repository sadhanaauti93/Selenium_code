package MyInterface3;
class Activa implements Person {
	 public void user() {
		 System.out.println("Activa is good gadi");	 
	 }
	 public void price() {
		 System.out.println("Activa price is 70k");
	 }
}
 /*class Access125 implements Person{
	public void user() {
		System.out.println("Access125 is weight less gadi");
	}
	public void price() {
		System.out.println("Access125 price is 75k");
	}
}
 class Hondadio implements Person{
	 public void user() {
		 System.out.println("Hondadio is looking smart gadi");
	 }
	 public void price() {
		 System.out.println("Hondadio price is 80k");
	 }
 }*/
class PersonNew{
	public static void main(String[] args) {
		Activa obj = new Activa();
		//Access125 obj1 = new Access125();
		//Hondadio obj2 = new Hondadio ();
		obj.user();
		obj.price();
		/*obj1.user();
		obj1.price();
		obj2.user();
		obj2.price();*/
	}
}