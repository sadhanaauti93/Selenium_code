package teaching;

import learning.addition;
public class somethimg {

	public static void main(String[] args) {
	// static method (object / class name)  / no static (object)
		
		
		//indax obj
		addition a = new addition(); //
		String[] rg = {"RAhul","Rohit"}; //Strign rray 
		a.main(rg);
		
		//called from additoin main
		//addition.main(null);// as main has static heance it can call using class name
		
		//call from addition class
		addition.display(10,91); // class 
		
	}

}
