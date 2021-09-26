package MyConstructor;

import java.awt.geom.Arc2D.Float;

public class ConstructorMain {
	int id;
	String name;
	float amount;
	public ConstructorMain(int i, String s, float f) {
		id = i;
		name= s;
		amount=f;
		
	}

	public static void main(String[] args) {
		ConstructorMain obj = new ConstructorMain(122 , " Vidhi " , 1236532);
		System.out.println("Value provide : " +  obj.id  +  obj.name  +  obj.amount);
		
		
		
		
	}

}
