package MyAbstraction;

abstract class Shape{
	abstract void draw();
}

class Rectangle extends Shape
{
		void draw()
		{
			System.out.println("drawing rectangle");
		}
}
class Circle extends Shape
{
		void draw()
		{
			System.out.println("drawing Circle");
		}
}
		
public class ShapeMain
	{
	public static void main(String[] args) {
		//Shape1 S= new Rectangle();
		Shape S= new Circle();  //
		S.draw();
	}
}
 



