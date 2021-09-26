package UnderstandingMrthod;

public class Parameters {
	static void showsum(double d, double e ,int count) {
		double sum = d+e;
		for(int i= 0; i<count; i ++) {
			System.out.println(sum);
		}
	}

	public static void main(String[] args) {
		Parameters obj = new Parameters();
		obj.showsum(2.3d, 5.5d, 6);
		return;

	}

}
