package MyExceptionhandling;

public class Bank {
	
		int Id = 109;
		String S = " FName ";
		String S1 = " LName ";
		
		void Bankdetials() 
		{
		try
		{
			System.out.println(" Enter the given id " + (Id/5));
			//System.out.println(" Enter the given name " + " Rahul "  +  " Auti ");
			System.out.println(" Enter the given name " + "FName + LName");

		}
		catch(Exception e)
		{
			System.out.println("Enter the given id " + 109);
			System.out.println("Enter the given name " + " Rahul "  +  " Auti ");

		}
	}
		public static void main(String[] args) {
			Bank obj = new Bank();
			obj.Bankdetials();
		}
	}


