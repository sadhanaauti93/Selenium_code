package OverloadinandThisandStatic;

public class MethodCreate {
	     int rollno;  
	     String name;  
	     static String college = "ITS"; 
	     
	     static void change()
	     {  
	     college = "BBDIT";  
	     }  
	     MethodCreate(int r, String n){  
	     rollno = r;  
	     name = n;  
	     }  
	     void display()
	     {
	    	 System.out.println(rollno+" "+name+" "+college);
	     }  
	    public static void main(String args[]){  
	    MethodCreate.change();
	     
	    MethodCreate s1 = new MethodCreate(111,"Karan");  
	    MethodCreate s2 = new MethodCreate(222,"Aryan");  
	    MethodCreate s3 = new MethodCreate(333,"Sonoo");  
	     
	    s1.display();  
	    s2.display();  
	    s3.display();  
	    }  

}
