package Firstdaydayassignment;

public class ArmstrongNumber {
	
	public static void main(String[] args) {
		int x= 153;			//153,407,371,1634
		int y ;
		//int z;
		int S1,S2,S3,S4;
		S1 = x%10;
			y = x/10;
		S2 = y%10;
			y = y/10;
		S4 = y%10;
			y = y/10;
		S3 = y;
		int result;
		result = (S1*S1*S1) + (S2*S2*S2) + (S3*S3*S3) + (S4*S4*S4);
		System.out.println(result);
		if(x == result) {
			System.out.println("This is Armstrong Number");
		}
		else
		{
			System.out.println("This is not Armstrong Number");
		}
	}

}
