package MyForloop;

public class SumForloop {
	
	public void showSum(int x, int y,int count){
		int Sum = x+y;
		for(int i = 0; i<count; i++)
			System.out.println(Sum);
	}
	public static void main(String[] args) {
		SumForloop obj = new SumForloop();
		obj.showSum(12, 12,5);
	}

}
