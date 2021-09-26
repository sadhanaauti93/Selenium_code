package MyForloop;


public class ReversString {
	public String reverseString(String str){
		   //char c = 'a'; 
		   //char r[]= {'a','b','c','c'};
		   char ch[]=str.toCharArray();   //{'H','e','l','l','o',' ','i','n','d','i','a'}
		   String rev="";  
		  
		   for(int i=ch.length-1;i>=0;i--){  // lenth=11- 10
		       rev+=ch[i];  // 11   rev=rev+ch[i]z/
		       //rev.append(ch[i]);
		   }  
		   return rev;  
		}  
		public static void main(String[] args) {
		ReversString r = new ReversString();
 
		System.out.println("After Reverse it Looks Like \n"+ r.reverseString("poorDanisinaDroop."));
		System.out.println("After Reverse it Looks Like \n"+ r.reverseString("Hello India"));
		}
	}
