package Myarray;

public class ArrayLargestNumber {
	String[] S={"Priya", "Rani", "Rina", "Pooja"}; 
	public void Name(){
		System.out.println(S.length);
		
		for(int i=0; i<=S.length; i++)
		{
			System.out.println(S[i]);
		}
		/*
		System.out.println(S[0]);
		System.out.println(S[1]);
		System.out.println(S[2]);
		System.out.println(S[3]);
		*/
	}
	public static void main(String[] args)
		{
			ArrayLargestNumber obj = new ArrayLargestNumber();
			obj.Name();
		}
	}

