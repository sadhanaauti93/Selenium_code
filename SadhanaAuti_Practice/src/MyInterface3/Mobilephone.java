package MyInterface3;

	class Oppo implements Phone
	{
		public void user()
		{
			System.out.println("Oppo is good phone ");
		}  
//		public void price()
//		{
//			System.out.println("F1 price is 14-16 k");
//		}
//		public void battery()
//		{
//			System.out.println("Full use 24hr ");
//		}
	}
//	class Mi implements Phone
//	{
//		public void user() 
//		{
//			System.out.println("Mi is good phone ");
//		}
//	}
	class MobilePhone{
		public static void main(String[] args) {
			Oppo Obj = new Oppo();
//			Obj.battery();
//			Obj.price();
			Obj.user();
		}
}
