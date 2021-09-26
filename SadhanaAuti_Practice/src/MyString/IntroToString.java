package MyString;

public class IntroToString {
	String p=" JAVA";
	String q="127";
	 
	void ChkStingMethods(String h){
		//StringBuilder sb=new StringBuilder(h);
		System.out.println("Length of STring in Method is "+ h.length());
		//System.out.println("Reverse String "+ sb.reverse());
		//System.out.println("Concat of STring is "+ h.concat(p));
		
	}
	public static void main(String[] args) {
		IntroToString i=new IntroToString();
	//	System.out.println("First STring "+ i.q);
		//System.out.println("Length of STring is "+ i.q.length());
		i.ChkStingMethods("23568");
	}

}


