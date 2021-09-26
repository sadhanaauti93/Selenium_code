package MyCollection;

import java.util.ArrayList;

public class ArrayList1  {
	public static void main(String[] args) {
	//ArrayList1<String> s =new ArrayList1();
		ArrayList<String> cars = new ArrayList<String>();
	    cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("Mazda");
	    //System.out.println(cars.add("Volvo"));
	    for (int i = 0; i < cars.size(); i++) 
	    {
	       System.out.println(cars.get(i));
	    }
	}
}


