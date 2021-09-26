package MyAllOperators;

public class Logicalopraters {

		
	public void chkeligibality()
	{
		int age=21;
		int weight=52;
		String qualification ="HSC";
		if(((age>18)|| (age == 18)) && ((weight>50) || (weight == 50)) 
		&& ((qualification == "HSC") || (qualification == "hsc") || (qualification == "Hsc")))
		{	
			System.out.println("Eligiable");
		}
		else
		{
			System.out.println("Not Eligiable");
		}
	}
	public static void main(String[] args){
		
		Logicalopraters obj =new Logicalopraters();
		obj.chkeligibality();
	}
}

