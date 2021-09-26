package Task;

import com.cg.payroll.pojos.Empolyee;

public class Array {
	public static void main(String[] args) {
		Empolyee Emp1 = new Empolyee(101, 1,"Sadhana", "Ghadge", "09/05/2021", "01/11/1993", "Sr.Software engineer","PF/IN/304","BRWPA5268G","a");
		Empolyee Emp2 = new Empolyee(121, 2,"Varsha", "Auti", "09/05/2021", "01/11/1993", "Sr.Software engineer","PF/IN/304","BRWPA5268G","a");
		Empolyee Emp3 = new Empolyee(132, 0,"Priya", "Ghadge", "09/05/2021", "01/11/1993", "Sr.Software engineer","PF/IN/304","BRWPA5268G","a");

		Empolyee[] empolyeeList= new Empolyee[3];
		
		empolyeeList[0]  = new Empolyee(101, "Sadhana", "Ghadge", "09/05/2021", "01/11/1993", "Sr.Software engineer","PF/IN/304","BRWPA5268G","a");
		empolyeeList[1]  = new Empolyee(121,2,"Sadhana","Ghadge", "09/05/2021", "01/11/1993", "Sr.Software engineer","PF/IN/304","BRWPA5268G","a");
		empolyeeList[2] = new Empolyee(132,0, "Sadhana","Ghadge", "09/05/2021", "01/11/1993", "Sr.Software engineer","PF/IN/304","BRWPA5268G","a");

		for(Empolyee employee : empolyeeList) {
			System.out.println(Empolyee.getFirstname()+ " "+EmpolyeeLastName());
		}
		for(Empolyee employee : empolyeeList) {
			System.out.println(Empolyee.getPfno()+ " " +Empolyee.getDateofBirth());
		}
		for(Empolyee employeeEmp2 : empolyeeList) {
			System.out.println(empolyeeList[1].getId()+ " " +Empolyee.getDesgination());
		}
			if(empolyeeList == empolyeeList)
		{
			System.out.println("Empolyee Emp2 and empolyeeList[1] id only 121");
		}
		else
		{
			System.out.println("Empolyee other");
		}
	}
	private static String EmpolyeeLastName() {
		return null;
	}
}
