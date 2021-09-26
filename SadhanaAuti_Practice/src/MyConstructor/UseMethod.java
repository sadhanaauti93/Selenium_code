package MyConstructor;

public class UseMethod {
	int i=10;
	public int add(int a, int b) {
	int c = a + b;
	System.out.println(i);
	System.out.println(a);
	return c;
	}
	public int addv(int a, int b,int c) {
	int d = a + b+c;
	System.out.println(i);
	System.out.println(a);
	return d;
	}
	public float div(float t, float b) {
		//System.out.println(i);
	return b;
	    }
	public String str(String s, String c){
		return s +" " +c;
	    }
	public static void main(String[] args) {
	UseMethod su = new UseMethod();
	System.out.println("Addition is = " + su.add(17, 5) + "\n");
	//System.out.println("Addition is = " + su.addv(17, 5,-7) + "\n");
	//System.out.println("Division by= " + su.div(70, 14)+ "\n");
	//System.out.println("String link together = " + su.str("Umesh", "S")+ "\n");
	    }
	}
		
