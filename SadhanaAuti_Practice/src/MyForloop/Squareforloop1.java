package MyForloop;

public class Squareforloop1 {
	
 		int result=1;
		public int getsquare(int i ,int j) {
		for(int x= 1; x<=j; x++) {
			result = result*i;
			
		}
		
		return result;
		}
		public static void main(String[] args) {
		//for(int i =1; i<=10; i++) {
			Squareforloop1 obj= new Squareforloop1();
		
		int result= obj.getsquare(2,4);			///16
		System.out.println("result of is:" +result);//
		//}
	}
}


