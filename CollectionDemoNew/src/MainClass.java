public class MainClass {
	public static void main(String[] args) {
		
		GenClass<Integer,String> ref1 = new GenClass<Integer,String>(101,"Sadhana");
		System.out.println(ref1.getVar1());
		System.out.println(ref1.getVar2());

		GenClass<String,Float> ref2 = new GenClass<String,Float>("Sadhana",32.44f);
		System.out.println(ref2.getVar1());
		System.out.println(ref2.getVar2());
	}
}

        /*
		int num = 100;
		Integer iob1 = num;		//JVM is creating the instance class and num will be warped inside that instant this process is call
		int num2 = iob1; //JVM is pulling the value from instance and to num2 variable ,this process is call UnBoxing
		//Convert object to Value
		//Auto Unboxing
		Integer iob2 = num2+iob1+iob1+num2;
		System.out.println(iob2.toString());
		*/
