package MyInterface2;
	class Tiger implements AnimalInterface{
		public void animalsound(){
			System.out.println("The tiger is growl,roar");
		}

	public void sleep() {
		System.out.println("Hmmmm");
	}
}
	class Animal{
		public static void main(String[] args) {
			Tiger T = new Tiger();
			T.animalsound();
			T.sleep();
		}
	}