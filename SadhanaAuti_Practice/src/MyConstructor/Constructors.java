package MyConstructor;

public class Constructors {
	int i;
	String S;
	//float M;
	public Constructors(){				
		i=10;
	}
	public Constructors(String g){
		S="Rahul";
	}
	/*
	public Constructors(float f)
	{
		M =(float)1.5;
	}*/
	/*public void add(){
		int a=17,b=17,c=17;
		int i=17;
		System.out.println(a+b+c);
	}
	public int add(int i, int b){return i+b;}*/
	
		public static void main(String[] args){
			Constructors myobj=new Constructors();
			//myobj.add();
			System.out.println("Value assinged in Constructors is "+ myobj.i);
			Constructors myobj1=new Constructors();
			//System.out.println(myobj1.add(10,20));
			System.out.println("Value assinged in Constructors is "+ myobj1.S);
			//Constructors myobj2=new Constructors();
			//System.out.println("Value assinged in Constructors is "+ myobj2.M);
	}
}
