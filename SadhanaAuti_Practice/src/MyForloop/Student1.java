package MyForloop;

public class Student1 
{
	//Method with outArguments/Parameters
	public void forloop()
	{
		int k;
		for(k=20;k>=1;k=k-1) {
		System.out.println("value of variable is: "+k);
	}
		
		/*if(k==11){
			System.out.println("Target Achived: "+k);
			break;
		}
		*/
	}
	public void forloopwithParam(int s, int e)
	{
		int k;
		for(k=s;k<e;k++)
		{
			System.out.println("value of variable is: "+k);
		}
	}
	public void forloopDecending(){
		int k;
		for(k=30;k>=20;k--)
		{
			System.out.println("value of varible Decending: "+k);
		
			if(k==25)
			{
				System.out.println("Target Achived: "+k);
				break;
			}
	}
}
public static void main(String[] args)
	{
		Student1 obj = new Student1();
		obj.forloop();
		//obj.forloopDecending();
		//obj.forloopwithParam(10,15);
		//obj.forloopwithParam(4, 5);
		
	}
}
