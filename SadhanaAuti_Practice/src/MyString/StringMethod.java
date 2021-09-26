package MyString;

public class StringMethod {
	void StringCharat(String str)
	{
		char ch=str.charAt(4);//returns the char value at the 4th index 
		int strLength = str.length();  
		System.out.println("CHaracter is " +ch);  
		
		for (int i=0; i<=str.length()-1; i++) {  
            if(i%2!=0) {  
                System.out.println("Char at "+i+" place "+str.charAt(i));  
            }  
		}
		
		String s1="java string";  
		s1.concat("is immutable");  
		System.out.println(s1);  
		s1=s1.concat(" is immutable so assign it explicitly");  
		System.out.println(s1);  
		String name="what do you know about me";  
		System.out.println(name.contains("do you m")); 
		
		StringBuilder sb=new StringBuilder(str);  
	    sb.reverse();  

	}
	void metodCompareTo(){
		String s1="hello";  
		String s2="hello";  
		String s3="meklo";  
		String s4="hemlo";  
		String s5="flag";  
		System.out.println(s1.compareTo(s2));//0 because both are equal  
		System.out.println(s1.compareTo(s3));//-5 because "h" is 5 times lower than "m"  
		System.out.println(s1.compareTo(s4));//-1 because "l" is 1 times lower than "m"  
		System.out.println(s1.compareTo(s5));//2 because "h" is 2 times greater than "f"  

	}
	public static void main(String[] args) {
		StringMethod s=new StringMethod();
		s.StringCharat("STRING");
		s.metodCompareTo();
	}

}
