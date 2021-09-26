package MyExceptionHandlling1;

public class ArrayException {
	void chekArray() {
	String s = null;
	int arr[] = {1, 25, 23, 5, 17, 9, 4, 21};
	//System.out.println("print length " + s.length());
	System.out.println("printl array element " +arr[10]);
	}
	public static void main(String[] args) {
		ArrayException obj = new ArrayException();	
		try {
			obj.chekArray();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
}
