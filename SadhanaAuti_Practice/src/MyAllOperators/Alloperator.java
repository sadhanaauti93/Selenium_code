package MyAllOperators;

public class Alloperator {
	public int testoperator(int x)
	{
		 int c=0;
		//Logical &&
		if(x > 3 && x < 10){
			c=10+3+x;
		}
		//Logical or
		if (x > 3 || x < 4){
			c=4+3+x;
		}
		//Logical not
		if(!(x >3 && x < 10)){
			c=10+3+x;
		}
		if(x != 10){
			//if(!(x==10)){
				c=x+3+5;
			}
		return c;
	}
	public static void main(String[] args){
	Alloperator obj = new Alloperator();
	obj.testoperator(10);
	}
}
