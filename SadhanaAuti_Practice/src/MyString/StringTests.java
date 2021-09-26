package MyString;

public class StringTests {
	void CheckCharat(){
		String s="UMESH";
		System.out.println("Char "+s.charAt(4));
		System.out.println("Length "+s.length());
		StringBuilder sb=new StringBuilder(s);  
		System.out.println("Length "+sb.reverse()); 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringTests s=new StringTests();
		s.CheckCharat();

	}

}
