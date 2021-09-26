package MyExceptionHandlling1;

public class MultipalCatchblock {
	public static void main(String[] args) {
		try
		{
			int[] a = new int[2];
			System.out.println("Access element three " +a[3]);
		}
		catch(Exception e)						//ArrayIndexOutOfBound
		{
			System.out.println("Exception throen " + e);
		}
		System.out.println("Out of the block");
	}
//	catch(Exception e)
//	{
//		System.out.println("IOException i");
//		i.printlStackTrace();
//		return -1;
	}


