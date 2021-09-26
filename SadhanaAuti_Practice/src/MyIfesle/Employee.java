package MyIfesle;

public class Employee 
	{
		int i=10;
		public int add(int p,int q)
		{
			return p+q;
		}
	public static void main(String[] args) 
		{
			Employee E = new Employee();
			E.i= E.i+3;
			System.out.println(E.i*5);
			System.out.println(E.add(5, 6));
		}
	}



