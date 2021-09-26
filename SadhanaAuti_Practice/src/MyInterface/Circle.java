package MyInterface;

//import java.awt.Shape;

public class Circle implements Shapes, Shape2  {
		public void area()
		{
			System.out.println("Area Method");
		}
		public void vloume()
		{
			System.out.println("it's volume");
		}
		/*public void square()
		{
			System.out.println("Draw the square");
		}*/
		
		
		public void allshapemethod() 
		{
			System.out.println("it is all shaped method ");
			
		}
		public static void main(String[] args) {
			Circle obj = new Circle();
				obj.area();
				obj.vloume();
				//obj.square();
		}

}
