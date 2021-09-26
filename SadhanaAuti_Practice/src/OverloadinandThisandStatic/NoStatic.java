package OverloadinandThisandStatic;

public class NoStatic {
	//int count=0;
	static int Stcount=0;
	
	NoStatic()
	{
		//count++; //Increment value
		//System.out.println(Stcount);
		
		Stcount++;  //Incrememt value 
		System.out.println(Stcount);
	}
	public static void main(String[] args) {
		/*NoStatic n = new NoStatic();
		NoStatic n1 = new NoStatic();
		NoStatic n2 = new NoStatic();*/
		
		NoStatic n3 = new NoStatic();
		NoStatic n4 = new NoStatic();
		NoStatic n5 = new NoStatic();
		
	}

}
