package MyAbstraction;
abstract class God1 {
	abstract void darshan();
		public void display() {
			System.out.println("Take darshan");
	}
}
class Mahadev extends God{
	public void darshan() {
		System.out.println("Mahadev is father of ganesh");
	}
}
class Ganpati extends God {
	public void darshan() {
		System.out.println("Ganpati is To get wish to evrything");
	}
}
public class God{
	public static void main(String[] args) {
		Mahadev M = new Mahadev();
		Ganpati G = new Ganpati();
		God G1 = new Mahadev();
		M.darshan();
		M.darshan();
	}
}
