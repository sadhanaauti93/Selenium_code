package MyInheritance;
		//	 Child class         Parent class Single
public class Programmer extends Inheritance{
	float bonus=14000;
	public static void main(String[] args){
		Programmer p=new Programmer();
		System.out.println("Porgrammer salary is:"+p.salary);
		System.out.println("bonus of Porgrammer is:"+p.bonus);
		System.out.println("Total salary for Programmer is:"+(p.bonus+p.salary));
	
	}
}
