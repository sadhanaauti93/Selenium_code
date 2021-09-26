package Myarray;

class Array1 {
	public int smallest() {

		int[] k = { 9, 3, 4, 2, 5, 6 };
		int small = k[0];
		System.out.println(k.length);
		for (int i = 0; i <= k.length - 1; i++) {
			if (k[i] < small)
				small = k[i];
		}
		return small;
	}

}

class Array2 extends Array1{

	public float largest() {

		float f[] = { 8.1f, 1.5f, 5.5f, 6.2f, 4.5f };

		float max = f[0];

		System.out.println(f.length);

		for (int i = 0; i <= f.length - 1; i++) {
			if (f[i] > max)
				max = f[i];
		}
		return max;
	}

}

class Array3 extends Array2{
	public int smalest() {

		int[] a = { 3, 5, 9, 17, 10, 7, 15 };
		int small = a[0];
		System.out.println(a.length);
		for (int i = 0; i <= a.length - 1; i++) {
			if (a[i] < small)
				small = a[i];
		}
		return small;
	}

	public static void main(String[] args) {
		//Array1 obj = new Array1();
		//Array2 obj1 = new Array2();
		Array3 obj2 = new Array3(); // 1 small->2lar -> 3 (object)  smal  ->   
		Array3 obj4 = new Array3();

		//System.out.println("Smallest in given array is " + obj2.smallest()); // 1 
		//System.out.println("Largest in given array is " + obj2.largest());
		System.out.println("smalestin given array is " + obj2.smalest());   // 

/*		System.out.println(obj1.largest() + obj.smallest());

		System.out.println(obj1.largest() + obj.smallest());
		
		System.out.println(obj.smallest() + obj2.smalest());*/
	}
}
