package MyString;

public class StrCharat {
	void StringCharat(String str,int p)
	{
		char ch=str.charAt(p);//returns the char value at the i th index 
		  
		System.out.println("Character is " +ch);  
		System.out.println(str.contains("yess")); 
		System.out.println("Length "+ str.length()); 
		System.out.println(str.compareTo("YEss"));
		/*for (int i=0; i<=str.length()-1; i++) {  
            //if(i%2!=0) {  
                System.out.println("Char at "+i+" place "+str.charAt(i));  
            //}  
		}*/
	}
	public static void main(String[] args) {
		StrCharat Sobj=new StrCharat();
		Sobj.StringCharat("YEss",0);

	}

}
