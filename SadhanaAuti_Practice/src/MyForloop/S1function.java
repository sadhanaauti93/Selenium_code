package MyForloop;

public class S1function 
	{
	int s = 100;
	int r = 60;
	public void S1function(int f)
	{
		
		if(f%7==0)
		{
			System.out.println("Even num");
		}
		else
		{
			System.out.println("Odd num");
		}
	}

	public static void main(String[] args)
	{
		S1function obj = new S1function();
		
		obj.S1function(20);
		obj.S1function(30);
		obj.S1function(40);
		obj.S1function(50);
		obj.S1function(144);
	}
	}
	
