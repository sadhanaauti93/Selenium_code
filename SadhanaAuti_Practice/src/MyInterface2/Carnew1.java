package MyInterface2;

	class Maruticelerio implements Car
		{
		public void drive() 
		{
			System.out.println("Maruticelerio");
	    }
		public void price() 
		{
			System.out.println("on road price 5-7L");
	    }
		public void Kilometers() 
		{
			System.out.println("My car mileage per 1 hr 200km");
	    }
	}
//	class Innova implements Car
//	{
//		public void drive() 
//		{
//			System.out.println("Innova car ");
//		}
//	}
		
	class Carnew1{
		public static void main(String[] args) {
		Maruticelerio obj = new Maruticelerio();        //Instance of class
		//Innova i= new Innova();
		 //Maruticelerio M = new  Maruticelerio();
		obj.drive();
		obj.price();
		obj.Kilometers();
		
		}
	}