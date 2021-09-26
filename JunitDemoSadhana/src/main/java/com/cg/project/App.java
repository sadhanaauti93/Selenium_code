package com.cg.project;


public class App{
    public static void main( String[] args ) {
    	
    	int a =10, b=20,  expectedAns=30;
    	int actualAns=add(a,b);
    	
    	assert(expectedAns==actualAns);   // by default assertion is disable need unable expelictly 
    	
    }
    
    static int add(int n1,int n2){
    		return 0;
    }
}
