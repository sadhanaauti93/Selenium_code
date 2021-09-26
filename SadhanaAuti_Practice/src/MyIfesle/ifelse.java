package MyIfesle;

public class ifelse {
		int a;
		public int Add(int x,int y){
			return x+y;
		}
		public void Subs(int x,int y){
			System.out.println("Answer is " + (x-y));
			
		}
		public static void main(String[] args) 
		{
			ifelse obj = new ifelse();
			//obj.test(7,8);
			obj.Subs(10,6);
			System.out.println("Answer is" + obj.Add(7,9));
		}
	}


