package MyInterface;

public class Triangle implements All {
	public void area(){
		int i= 30;
		System.out.println(i);
	}
	public void vloume(){
		}
	public void add(){
		int i =20; int b=20;
		int s=55;
		System.out.println("Out of implemented"+(i+b+s));
	}
	public static void main(String[] args){
		Triangle obj = new Triangle();
		obj.area();
		obj.vloume();
	}

}
