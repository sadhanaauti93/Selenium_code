package MyAbstraction;

abstract class Language1 {
	abstract void speak();			//Abstract method 
	
	public void display() 				//method
	{
		System.out.println("language");
	}
}
class English extends Language{
	void speak() {
		System.out.println("English is very easy to speak");
	}
}
class Hindi extends Language{
	void speak() {
		System.out.println("Hindi is very nice lang");
	}
}
class Marathi extends Language{
	void speak() {
		System.out.println("Marath is my neative lang");

	}
}
public class Language{
public static void main(String[] args) {
	English e =new English();
	e.speak();
	//e.display();
		}
	}


