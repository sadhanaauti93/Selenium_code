package MyForloop;

public class SwapNumber {
	int Z;
	public void swap(int X ,int Y )
	{
	System.out.println("value of a before " +X);
	System.out.println("value of a before " +Y);
	X=Y;
	Y=Z;
	Z=X;
	
	
	System.out.println("value of the after" +X );
	System.out.println("value of the after" +Y);
}
	
	
	public static void main(String[] args)
	{
		SwapNumber obj = new SwapNumber();
		obj.swap(44,55);
	}
}
